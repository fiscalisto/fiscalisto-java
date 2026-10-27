// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * StockAdjustment: Un ajuste de existencias: lo que entró o salió de un almacén por inventario inicial, merma, robo, conteo…
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StockAdjustment {
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
     * El almacén (whs_…).
     */
    @JsonProperty("warehouse")
    private String warehouse;

    /**
     * El motivo (ver POST /v1/stock_adjustments).
     * <p>
     * Valores: shrinkage, theft, damage, expiration, internal_use, gift, initial, surplus, count, other.
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * Su nota, o null.
     */
    @JsonProperty("note")
    private String note;

    /**
     * applied (ya movió existencias), pending (espera aprobación en la app), rejected o reversed (se deshizo).
     * <p>
     * Valores: applied, pending, rejected, reversed.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Lo que vale lo que movió, en pesos sin IVA.
     */
    @JsonProperty("value")
    private BigDecimal value;

    /**
     * Lo que entró o salió de cada producto.
     */
    @JsonProperty("lines")
    private List<StockAdjustmentLine> lines;

    /**
     * Cuándo se hizo.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public StockAdjustment setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public StockAdjustment setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public StockAdjustment setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public StockAdjustment setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El almacén (whs_…).
     */
    public String getWarehouse() {
        return warehouse;
    }

    public StockAdjustment setWarehouse(String warehouse) {
        this.warehouse = warehouse;
        return this;
    }

    /**
     * El motivo (ver POST /v1/stock_adjustments).
     * <p>
     * Valores: shrinkage, theft, damage, expiration, internal_use, gift, initial, surplus, count, other.
     */
    public String getReason() {
        return reason;
    }

    public StockAdjustment setReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Su nota, o null.
     */
    public String getNote() {
        return note;
    }

    public StockAdjustment setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * applied (ya movió existencias), pending (espera aprobación en la app), rejected o reversed (se deshizo).
     * <p>
     * Valores: applied, pending, rejected, reversed.
     */
    public String getStatus() {
        return status;
    }

    public StockAdjustment setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Lo que vale lo que movió, en pesos sin IVA.
     */
    public BigDecimal getValue() {
        return value;
    }

    public StockAdjustment setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    @JsonIgnore
    public StockAdjustment setValue(double value) {
        return setValue(BigDecimal.valueOf(value));
    }

    /**
     * Lo que entró o salió de cada producto.
     */
    public List<StockAdjustmentLine> getLines() {
        return lines;
    }

    public StockAdjustment setLines(List<StockAdjustmentLine> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * Cuándo se hizo.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public StockAdjustment setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
