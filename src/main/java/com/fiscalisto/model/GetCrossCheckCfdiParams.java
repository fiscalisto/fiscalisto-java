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
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
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
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetCrossCheckCfdiParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
