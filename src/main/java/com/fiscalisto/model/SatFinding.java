// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SatFinding: Un tipo de hallazgo en los CFDI del emisor (un proveedor en la lista 69-B, un CFDI cancelado, un pago en efectivo de más de $2,000…), con cuántos CFDI lo tienen.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatFinding {
    /**
     * El código del hallazgo (el mismo que code).
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
     * El código del hallazgo, estable (por ejemplo efos_definitivo).
     */
    @JsonProperty("code")
    private String code;

    /**
     * critical (grave), warning (revisar) o info.
     * <p>
     * Valores: critical, warning, info.
     */
    @JsonProperty("severity")
    private String severity;

    /**
     * Qué es, en palabras.
     */
    @JsonProperty("title")
    private String title;

    /**
     * Por qué importa y qué hacer, o null.
     */
    @JsonProperty("explanation")
    private String explanation;

    /**
     * Cuántos CFDI lo tienen, sin revisar.
     */
    @JsonProperty("invoices")
    private Long invoices;

    /**
     * La suma de sus totales.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * El código del hallazgo (el mismo que code).
     */
    public String getId() {
        return id;
    }

    public SatFinding setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public SatFinding setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public SatFinding setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public SatFinding setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El código del hallazgo, estable (por ejemplo efos_definitivo).
     */
    public String getCode() {
        return code;
    }

    public SatFinding setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * critical (grave), warning (revisar) o info.
     * <p>
     * Valores: critical, warning, info.
     */
    public String getSeverity() {
        return severity;
    }

    public SatFinding setSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Qué es, en palabras.
     */
    public String getTitle() {
        return title;
    }

    public SatFinding setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Por qué importa y qué hacer, o null.
     */
    public String getExplanation() {
        return explanation;
    }

    public SatFinding setExplanation(String explanation) {
        this.explanation = explanation;
        return this;
    }

    /**
     * Cuántos CFDI lo tienen, sin revisar.
     */
    public Long getInvoices() {
        return invoices;
    }

    public SatFinding setInvoices(Long invoices) {
        this.invoices = invoices;
        return this;
    }

    @JsonIgnore
    public SatFinding setInvoices(long invoices) {
        return setInvoices(Long.valueOf(invoices));
    }

    /**
     * La suma de sus totales.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public SatFinding setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public SatFinding setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
