// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SaveAnnualReturnParams: los campos de «Capturar lo que los libros no dicen de la declaración anual».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveAnnualReturnParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Las pérdidas fiscales de ejercicios anteriores pendientes de aplicar (artículo 57), una por ejercicio. Reemplaza las capturadas.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("losses")
    private List<SaveAnnualReturnParamsLoss> losses;

    /**
     * Desde 2027: las deducciones que el límite del artículo 78-B dejó para los 20 ejercicios siguientes.
     */
    @JsonProperty("pending_deductions")
    private List<SaveAnnualReturnParamsPendingDeduction> pendingDeductions;

    /**
     * Las partidas de la conciliación que los libros, los CFDI y la nómina no dicen.
     */
    @JsonProperty("items")
    private List<SaveAnnualReturnParamsItem> items;

    /**
     * true si está en una de las excepciones del artículo 78-E: no le aplican los límites de los artículos 78-A a 78-D.
     */
    @JsonProperty("exception_78e")
    private Boolean exception78e;

    /**
     * El primer mes del ejercicio: 1, o el mes en que empezó si fue en el año.
     */
    @JsonProperty("from_month")
    private Long fromMonth;

    /**
     * La CUFIN y la CUCA (artículos 77 y 78): saldos iniciales y movimientos del año. Sin este campo se quedan los guardados.
     */
    @JsonProperty("tax_accounts")
    private SaveAnnualReturnParamsTaxAccounts taxAccounts;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public SaveAnnualReturnParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Las pérdidas fiscales de ejercicios anteriores pendientes de aplicar (artículo 57), una por ejercicio. Reemplaza las capturadas.
     * <p>
     * Obligatorio.
     */
    public List<SaveAnnualReturnParamsLoss> getLosses() {
        return losses;
    }

    public SaveAnnualReturnParams setLosses(List<SaveAnnualReturnParamsLoss> losses) {
        this.losses = losses;
        return this;
    }

    /**
     * Desde 2027: las deducciones que el límite del artículo 78-B dejó para los 20 ejercicios siguientes.
     */
    public List<SaveAnnualReturnParamsPendingDeduction> getPendingDeductions() {
        return pendingDeductions;
    }

    public SaveAnnualReturnParams setPendingDeductions(List<SaveAnnualReturnParamsPendingDeduction> pendingDeductions) {
        this.pendingDeductions = pendingDeductions;
        return this;
    }

    /**
     * Las partidas de la conciliación que los libros, los CFDI y la nómina no dicen.
     */
    public List<SaveAnnualReturnParamsItem> getItems() {
        return items;
    }

    public SaveAnnualReturnParams setItems(List<SaveAnnualReturnParamsItem> items) {
        this.items = items;
        return this;
    }

    /**
     * true si está en una de las excepciones del artículo 78-E: no le aplican los límites de los artículos 78-A a 78-D.
     */
    public Boolean getException78e() {
        return exception78e;
    }

    public SaveAnnualReturnParams setException78e(Boolean exception78e) {
        this.exception78e = exception78e;
        return this;
    }

    /**
     * El primer mes del ejercicio: 1, o el mes en que empezó si fue en el año.
     */
    public Long getFromMonth() {
        return fromMonth;
    }

    public SaveAnnualReturnParams setFromMonth(Long fromMonth) {
        this.fromMonth = fromMonth;
        return this;
    }

    @JsonIgnore
    public SaveAnnualReturnParams setFromMonth(long fromMonth) {
        return setFromMonth(Long.valueOf(fromMonth));
    }

    /**
     * La CUFIN y la CUCA (artículos 77 y 78): saldos iniciales y movimientos del año. Sin este campo se quedan los guardados.
     */
    public SaveAnnualReturnParamsTaxAccounts getTaxAccounts() {
        return taxAccounts;
    }

    public SaveAnnualReturnParams setTaxAccounts(SaveAnnualReturnParamsTaxAccounts taxAccounts) {
        this.taxAccounts = taxAccounts;
        return this;
    }
}
