package com.fiscalisto;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import java.io.IOException;

/**
 * Un campo que llega (o se manda) como un id ("cus_…") o como el objeto completo. Mándelo con
 * {@link #id(String)} o {@link #of(Object)}; léalo con {@link #getId()} y {@link #getObject()}.
 */
@JsonSerialize(using = StringOr.Serializer.class)
@JsonDeserialize(using = StringOr.Deserializer.class)
public final class StringOr<T> {
    private final String id;
    private final T object;

    private StringOr(String id, T object) {
        this.id = id;
        this.object = object;
    }

    /** Solo el id. */
    public static <T> StringOr<T> id(String id) {
        return new StringOr<>(id, null);
    }

    /** El objeto completo. */
    public static <T> StringOr<T> of(T object) {
        return new StringOr<>(null, object);
    }

    /** El id: el que llegó solo, o el "id" del objeto. */
    public String getId() {
        if (id != null || object == null) return id;
        JsonNode v = ApiClient.MAPPER.valueToTree(object).get("id");
        return v != null && v.isTextual() ? v.asText() : null;
    }

    /** El objeto, o null si llegó solo el id. */
    public T getObject() {
        return object;
    }

    static final class Serializer extends JsonSerializer<StringOr<?>> {
        @Override
        public void serialize(StringOr<?> value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
            if (value.object != null) serializers.defaultSerializeValue(value.object, gen);
            else gen.writeString(value.id);
        }
    }

    static final class Deserializer extends JsonDeserializer<StringOr<?>> implements ContextualDeserializer {
        private final JavaType inner;

        Deserializer() {
            this(null);
        }

        private Deserializer(JavaType inner) {
            this.inner = inner;
        }

        @Override
        public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) {
            JavaType type = property != null ? property.getType() : ctxt.getContextualType();
            if (type != null && type.isReferenceType()) type = type.getReferencedType();
            JavaType t = type == null ? null : type.containedType(0);
            return new Deserializer(t);
        }

        @Override
        public StringOr<?> deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            if (p.currentToken() == JsonToken.VALUE_STRING) return new StringOr<>(p.getText(), null);
            Object value = inner == null ? ctxt.readTree(p) : ctxt.readValue(p, inner);
            return new StringOr<>(null, value);
        }
    }
}
