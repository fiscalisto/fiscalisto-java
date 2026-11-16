// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MaterialitySupplierSatList: Una página de la lista.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MaterialitySupplierSatList {
    /**
     * definitive (69-B definitivo) o presumed (69-B presunto).
     * <p>
     * Valores: definitive, presumed.
     */
    @JsonProperty("status")
    private String status;

    /**
     * El día que el SAT lo publicó como definitivo (AAAA-MM-DD), o null.
     */
    @JsonProperty("published_on")
    private String publishedOn;

    /**
     * El último de los 30 días hábiles para acreditar las operaciones o corregir (AAAA-MM-DD), o null.
     */
    @JsonProperty("deadline")
    private String deadline;

    /**
     * Días hábiles que quedan, sin contar hoy; negativo si ya venció. null si no es definitivo.
     */
    @JsonProperty("business_days_left")
    private Long businessDaysLeft;

    /**
     * definitive (69-B definitivo) o presumed (69-B presunto).
     * <p>
     * Valores: definitive, presumed.
     */
    public String getStatus() {
        return status;
    }

    public MaterialitySupplierSatList setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * El día que el SAT lo publicó como definitivo (AAAA-MM-DD), o null.
     */
    public String getPublishedOn() {
        return publishedOn;
    }

    public MaterialitySupplierSatList setPublishedOn(String publishedOn) {
        this.publishedOn = publishedOn;
        return this;
    }

    /**
     * El último de los 30 días hábiles para acreditar las operaciones o corregir (AAAA-MM-DD), o null.
     */
    public String getDeadline() {
        return deadline;
    }

    public MaterialitySupplierSatList setDeadline(String deadline) {
        this.deadline = deadline;
        return this;
    }

    /**
     * Días hábiles que quedan, sin contar hoy; negativo si ya venció. null si no es definitivo.
     */
    public Long getBusinessDaysLeft() {
        return businessDaysLeft;
    }

    public MaterialitySupplierSatList setBusinessDaysLeft(Long businessDaysLeft) {
        this.businessDaysLeft = businessDaysLeft;
        return this;
    }

    @JsonIgnore
    public MaterialitySupplierSatList setBusinessDaysLeft(long businessDaysLeft) {
        return setBusinessDaysLeft(Long.valueOf(businessDaysLeft));
    }
}
