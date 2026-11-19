// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateFixedAssetParams: los campos de «Agregar un activo fijo sin factura».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateFixedAssetParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Qué es.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("description")
    private String description;

    /**
     * El tipo de activo por su uso CFDI: I01 construcciones, I02 mobiliario, I03 transporte, I04 cómputo, I05 dados y troqueles, I06 telefonía, I07 satelital, I08 otra maquinaria. Da su tasa de depreciación.
     * <p>
     * Valores: I01, I02, I03, I04, I05, I06, I07, I08.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("cfdi_use")
    private String cfdiUse;

    /**
     * El monto original sin IVA.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("cost")
    private BigDecimal cost;

    /**
     * La fecha de compra.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("acquired_on")
    private String acquiredOn;

    /**
     * Desde cuándo se usa (se deprecia desde el mes siguiente); por omisión, la de compra.
     */
    @JsonProperty("in_use_since")
    private String inUseSince;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateFixedAssetParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Qué es.
     * <p>
     * Obligatorio.
     */
    public String getDescription() {
        return description;
    }

    public CreateFixedAssetParams setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * El tipo de activo por su uso CFDI: I01 construcciones, I02 mobiliario, I03 transporte, I04 cómputo, I05 dados y troqueles, I06 telefonía, I07 satelital, I08 otra maquinaria. Da su tasa de depreciación.
     * <p>
     * Valores: I01, I02, I03, I04, I05, I06, I07, I08.
     * <p>
     * Obligatorio.
     */
    public String getCfdiUse() {
        return cfdiUse;
    }

    public CreateFixedAssetParams setCfdiUse(String cfdiUse) {
        this.cfdiUse = cfdiUse;
        return this;
    }

    /**
     * El monto original sin IVA.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getCost() {
        return cost;
    }

    public CreateFixedAssetParams setCost(BigDecimal cost) {
        this.cost = cost;
        return this;
    }

    @JsonIgnore
    public CreateFixedAssetParams setCost(double cost) {
        return setCost(BigDecimal.valueOf(cost));
    }

    /**
     * La fecha de compra.
     * <p>
     * Obligatorio.
     */
    public String getAcquiredOn() {
        return acquiredOn;
    }

    public CreateFixedAssetParams setAcquiredOn(String acquiredOn) {
        this.acquiredOn = acquiredOn;
        return this;
    }

    /**
     * Desde cuándo se usa (se deprecia desde el mes siguiente); por omisión, la de compra.
     */
    public String getInUseSince() {
        return inUseSince;
    }

    public CreateFixedAssetParams setInUseSince(String inUseSince) {
        this.inUseSince = inUseSince;
        return this;
    }
}
