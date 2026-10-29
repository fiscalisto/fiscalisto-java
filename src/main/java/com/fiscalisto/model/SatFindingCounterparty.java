// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * SatFindingCounterparty: Un proveedor o cliente con hallazgos sin revisar en los CFDI del emisor: cuántos CFDI, cuánto suman y qué tipos de hallazgo tiene.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatFindingCounterparty {
    /**
     * Su RFC (el mismo que rfc). Sirve como starting_after.
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
     * El RFC del proveedor (en recibidos) o del cliente (en emitidos).
     */
    @JsonProperty("rfc")
    private String rfc;

    /**
     * Su nombre como viene en el CFDI, o null.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su hallazgo más grave: critical, warning o info.
     * <p>
     * Valores: critical, warning, info.
     */
    @JsonProperty("severity")
    private String severity;

    /**
     * Cuántos de sus CFDI tienen algún hallazgo sin revisar.
     */
    @JsonProperty("invoices")
    private Long invoices;

    /**
     * La suma de los totales de esos CFDI, en pesos, cada uno una vez aunque tenga varios hallazgos.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * La fecha del más reciente de esos CFDI (AAAA-MM-DD).
     */
    @JsonProperty("last_date")
    private String lastDate;

    /**
     * Sus tipos de hallazgo, del más grave al más leve.
     */
    @JsonProperty("findings")
    private List<SatFindingCounterpartyFinding> findings;

    /**
     * Su RFC (el mismo que rfc). Sirve como starting_after.
     */
    public String getId() {
        return id;
    }

    public SatFindingCounterparty setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public SatFindingCounterparty setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public SatFindingCounterparty setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public SatFindingCounterparty setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El RFC del proveedor (en recibidos) o del cliente (en emitidos).
     */
    public String getRfc() {
        return rfc;
    }

    public SatFindingCounterparty setRfc(String rfc) {
        this.rfc = rfc;
        return this;
    }

    /**
     * Su nombre como viene en el CFDI, o null.
     */
    public String getName() {
        return name;
    }

    public SatFindingCounterparty setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su hallazgo más grave: critical, warning o info.
     * <p>
     * Valores: critical, warning, info.
     */
    public String getSeverity() {
        return severity;
    }

    public SatFindingCounterparty setSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Cuántos de sus CFDI tienen algún hallazgo sin revisar.
     */
    public Long getInvoices() {
        return invoices;
    }

    public SatFindingCounterparty setInvoices(Long invoices) {
        this.invoices = invoices;
        return this;
    }

    @JsonIgnore
    public SatFindingCounterparty setInvoices(long invoices) {
        return setInvoices(Long.valueOf(invoices));
    }

    /**
     * La suma de los totales de esos CFDI, en pesos, cada uno una vez aunque tenga varios hallazgos.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public SatFindingCounterparty setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public SatFindingCounterparty setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * La fecha del más reciente de esos CFDI (AAAA-MM-DD).
     */
    public String getLastDate() {
        return lastDate;
    }

    public SatFindingCounterparty setLastDate(String lastDate) {
        this.lastDate = lastDate;
        return this;
    }

    /**
     * Sus tipos de hallazgo, del más grave al más leve.
     */
    public List<SatFindingCounterpartyFinding> getFindings() {
        return findings;
    }

    public SatFindingCounterparty setFindings(List<SatFindingCounterpartyFinding> findings) {
        this.findings = findings;
        return this;
    }
}
