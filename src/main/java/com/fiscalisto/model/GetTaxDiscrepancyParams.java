// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * GetTaxDiscrepancyParams: los campos de «Calcular la discrepancia fiscal».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetTaxDiscrepancyParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El ejercicio (por omisión, el año pasado).
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Los ingresos de su declaración anual, si tiene ingresos que Fiscalisto no ve (rentas, intereses, otro patrón): reemplazan los que calcula.
     */
    @JsonProperty("declared_income")
    private BigDecimal declaredIncome;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetTaxDiscrepancyParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El ejercicio (por omisión, el año pasado).
     */
    public Long getYear() {
        return year;
    }

    public GetTaxDiscrepancyParams setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public GetTaxDiscrepancyParams setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Los ingresos de su declaración anual, si tiene ingresos que Fiscalisto no ve (rentas, intereses, otro patrón): reemplazan los que calcula.
     */
    public BigDecimal getDeclaredIncome() {
        return declaredIncome;
    }

    public GetTaxDiscrepancyParams setDeclaredIncome(BigDecimal declaredIncome) {
        this.declaredIncome = declaredIncome;
        return this;
    }

    @JsonIgnore
    public GetTaxDiscrepancyParams setDeclaredIncome(double declaredIncome) {
        return setDeclaredIncome(BigDecimal.valueOf(declaredIncome));
    }
}
