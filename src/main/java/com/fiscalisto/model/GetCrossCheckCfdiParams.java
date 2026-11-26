// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetCrossCheckCfdiParams: los campos de «Ver los CFDI de una cifra del cruce».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetCrossCheckCfdiParams {
    /**
     * El mes (AAAA-MM), cuya declaración ya venció.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("month")
    private String month;

    /**
     * La cifra: vat_charged, vat_creditable, vat_withheld, isr_income, isr_withheld_salaries, isr_withheld_suppliers o vat_withheld_suppliers.
     * <p>
     * Valores: vat_charged, vat_creditable, vat_withheld, isr_income, isr_withheld_salaries, isr_withheld_suppliers, vat_withheld_suppliers.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("key")
    private String key;

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El mes (AAAA-MM), cuya declaración ya venció.
     * <p>
     * Obligatorio.
     */
    public String getMonth() {
        return month;
    }

    public GetCrossCheckCfdiParams setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * La cifra: vat_charged, vat_creditable, vat_withheld, isr_income, isr_withheld_salaries, isr_withheld_suppliers o vat_withheld_suppliers.
     * <p>
     * Valores: vat_charged, vat_creditable, vat_withheld, isr_income, isr_withheld_salaries, isr_withheld_suppliers, vat_withheld_suppliers.
     * <p>
     * Obligatorio.
     */
    public String getKey() {
        return key;
    }

    public GetCrossCheckCfdiParams setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetCrossCheckCfdiParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
