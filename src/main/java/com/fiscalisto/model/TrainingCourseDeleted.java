// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TrainingCourseDeleted: Un curso borrado o cancelado.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrainingCourseDeleted {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true si se borró.
     */
    @JsonProperty("deleted")
    private Boolean deleted;

    /**
     * true si se canceló porque tenía constancias emitidas.
     */
    @JsonProperty("canceled")
    private Boolean canceled;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public TrainingCourseDeleted setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public TrainingCourseDeleted setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true si se borró.
     */
    public Boolean getDeleted() {
        return deleted;
    }

    public TrainingCourseDeleted setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * true si se canceló porque tenía constancias emitidas.
     */
    public Boolean getCanceled() {
        return canceled;
    }

    public TrainingCourseDeleted setCanceled(Boolean canceled) {
        this.canceled = canceled;
        return this;
    }
}
