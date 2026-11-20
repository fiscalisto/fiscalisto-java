// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ConsolidationElimination: Una eliminación de consolidación: lo que el consolidado de varios RFC resta al cierre de un mes (ventas, saldos o inversiones entre ellos). Nunca cambia los libros de un RFC.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsolidationElimination {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El mes (AAAA-MM) a cuyo cierre se elimina.
     */
    @JsonProperty("month")
    private String month;

    /**
     * Su concepto.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Los RFC entre los que es: se aplica cuando todos están en el consolidado.
     */
    @JsonProperty("rfcs")
    private List<String> rfcs;

    /**
     * Sus renglones de cargo y abono.
     */
    @JsonProperty("lines")
    private List<ConsolidationEliminationLine> lines;

    /**
     * Cuándo se cambió por última vez.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public ConsolidationElimination setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public ConsolidationElimination setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ConsolidationElimination setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public ConsolidationElimination setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El mes (AAAA-MM) a cuyo cierre se elimina.
     */
    public String getMonth() {
        return month;
    }

    public ConsolidationElimination setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Su concepto.
     */
    public String getDescription() {
        return description;
    }

    public ConsolidationElimination setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Los RFC entre los que es: se aplica cuando todos están en el consolidado.
     */
    public List<String> getRfcs() {
        return rfcs;
    }

    public ConsolidationElimination setRfcs(List<String> rfcs) {
        this.rfcs = rfcs;
        return this;
    }

    /**
     * Sus renglones de cargo y abono.
     */
    public List<ConsolidationEliminationLine> getLines() {
        return lines;
    }

    public ConsolidationElimination setLines(List<ConsolidationEliminationLine> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * Cuándo se cambió por última vez.
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public ConsolidationElimination setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
