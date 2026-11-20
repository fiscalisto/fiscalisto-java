// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BooksLogEntryActor: Quién: un usuario del panel (user, con su nombre), una llave de la API (api_key, con su nombre en label) o un asistente por MCP (assistant: su nombre en label y el del usuario en name).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BooksLogEntryActor {
    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Valores: user, api_key, assistant.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * El nombre y el id de la llave de la API, o el del asistente («ChatGPT»); null para un usuario del panel.
     */
    @JsonProperty("label")
    private String label;

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Valores: user, api_key, assistant.
     */
    public String getType() {
        return type;
    }

    public BooksLogEntryActor setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public BooksLogEntryActor setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * El nombre y el id de la llave de la API, o el del asistente («ChatGPT»); null para un usuario del panel.
     */
    public String getLabel() {
        return label;
    }

    public BooksLogEntryActor setLabel(String label) {
        this.label = label;
        return this;
    }
}
