// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CompanyReport: El Reporte de la empresa de un emisor en un periodo: su salud fiscal, sus indicadores de riesgo, sus años, sus clientes y proveedores, sus socios y los avisos de sus contrapartes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyReport {
    /**
     * Siempre company_report.
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Su RFC.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Su razón social, o null si Fiscalisto no la conoce.
     */
    @JsonProperty("name")
    private String name;

    /**
     * El primer día del periodo (AAAA-MM-DD).
     */
    @JsonProperty("date_gte")
    private String dateGte;

    /**
     * El último día del periodo (AAAA-MM-DD), hoy a lo más.
     */
    @JsonProperty("date_lte")
    private String dateLte;

    /**
     * full: todo; executive: los indicadores principales y 5 clientes y proveedores.
     * <p>
     * Valores: full, executive.
     */
    @JsonProperty("version")
    private String version;

    /**
     * La salud fiscal: una calificación de 0 a 1,000 que explica cada punto.
     */
    @JsonProperty("fiscal_health")
    private CompanyReportFiscalHealth fiscalHealth;

    /**
     * Los indicadores de riesgo, cada uno contra su umbral.
     */
    @JsonProperty("indicators")
    private List<CompanyReportIndicator> indicators;

    /**
     * Los años lado a lado: este y al menos los dos anteriores.
     */
    @JsonProperty("years")
    private List<CompanyReportYear> years;

    /**
     * Totales del periodo, en pesos.
     */
    @JsonProperty("totals")
    private CompanyReportTotals totals;

    /**
     * Sus clientes del periodo.
     */
    @JsonProperty("customers")
    private CompanyReportCustomers customers;

    /**
     * Sus proveedores del periodo.
     */
    @JsonProperty("suppliers")
    private CompanyReportSuppliers suppliers;

    /**
     * De los CFDI de retenciones por dividendos (clave 14), hasta 20 de cada lado; null en executive.
     */
    @JsonProperty("shareholders")
    private CompanyReportShareholders shareholders;

    /**
     * Clientes y proveedores que publicaron en los últimos 13 meses su liquidación, fusión, escisión, transformación o reducción de capital en las Publicaciones de Sociedades Mercantiles de la Secretaría de Economía; null en executive.
     */
    @JsonProperty("counterparty_notices")
    private List<CompanyReportCounterpartyNotice> counterpartyNotices;

    /**
     * Siempre company_report.
     */
    public String getObject() {
        return object;
    }

    public CompanyReport setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public CompanyReport setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public CompanyReport setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Su RFC.
     */
    public String getTaxId() {
        return taxId;
    }

    public CompanyReport setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Su razón social, o null si Fiscalisto no la conoce.
     */
    public String getName() {
        return name;
    }

    public CompanyReport setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * El primer día del periodo (AAAA-MM-DD).
     */
    public String getDateGte() {
        return dateGte;
    }

    public CompanyReport setDateGte(String dateGte) {
        this.dateGte = dateGte;
        return this;
    }

    /**
     * El último día del periodo (AAAA-MM-DD), hoy a lo más.
     */
    public String getDateLte() {
        return dateLte;
    }

    public CompanyReport setDateLte(String dateLte) {
        this.dateLte = dateLte;
        return this;
    }

    /**
     * full: todo; executive: los indicadores principales y 5 clientes y proveedores.
     * <p>
     * Valores: full, executive.
     */
    public String getVersion() {
        return version;
    }

    public CompanyReport setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * La salud fiscal: una calificación de 0 a 1,000 que explica cada punto.
     */
    public CompanyReportFiscalHealth getFiscalHealth() {
        return fiscalHealth;
    }

    public CompanyReport setFiscalHealth(CompanyReportFiscalHealth fiscalHealth) {
        this.fiscalHealth = fiscalHealth;
        return this;
    }

    /**
     * Los indicadores de riesgo, cada uno contra su umbral.
     */
    public List<CompanyReportIndicator> getIndicators() {
        return indicators;
    }

    public CompanyReport setIndicators(List<CompanyReportIndicator> indicators) {
        this.indicators = indicators;
        return this;
    }

    /**
     * Los años lado a lado: este y al menos los dos anteriores.
     */
    public List<CompanyReportYear> getYears() {
        return years;
    }

    public CompanyReport setYears(List<CompanyReportYear> years) {
        this.years = years;
        return this;
    }

    /**
     * Totales del periodo, en pesos.
     */
    public CompanyReportTotals getTotals() {
        return totals;
    }

    public CompanyReport setTotals(CompanyReportTotals totals) {
        this.totals = totals;
        return this;
    }

    /**
     * Sus clientes del periodo.
     */
    public CompanyReportCustomers getCustomers() {
        return customers;
    }

    public CompanyReport setCustomers(CompanyReportCustomers customers) {
        this.customers = customers;
        return this;
    }

    /**
     * Sus proveedores del periodo.
     */
    public CompanyReportSuppliers getSuppliers() {
        return suppliers;
    }

    public CompanyReport setSuppliers(CompanyReportSuppliers suppliers) {
        this.suppliers = suppliers;
        return this;
    }

    /**
     * De los CFDI de retenciones por dividendos (clave 14), hasta 20 de cada lado; null en executive.
     */
    public CompanyReportShareholders getShareholders() {
        return shareholders;
    }

    public CompanyReport setShareholders(CompanyReportShareholders shareholders) {
        this.shareholders = shareholders;
        return this;
    }

    /**
     * Clientes y proveedores que publicaron en los últimos 13 meses su liquidación, fusión, escisión, transformación o reducción de capital en las Publicaciones de Sociedades Mercantiles de la Secretaría de Economía; null en executive.
     */
    public List<CompanyReportCounterpartyNotice> getCounterpartyNotices() {
        return counterpartyNotices;
    }

    public CompanyReport setCounterpartyNotices(List<CompanyReportCounterpartyNotice> counterpartyNotices) {
        this.counterpartyNotices = counterpartyNotices;
        return this;
    }
}
