// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * VatRefundReviewCheck: VatRefundReviewCheck.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VatRefundReviewCheck {
    /**
     * Qué se revisó, estable para su código.
     */
    @JsonProperty("key")
    private String key;

    /**
     * ok, warning (conviene revisar), blocking (el SAT la rechazaría) o pending (falta un dato).
     * <p>
     * Valores: ok, warning, blocking, pending.
     */
    @JsonProperty("result")
    private String result;

    /**
     * La revisión, en una línea.
     */
    @JsonProperty("title")
    private String title;

    /**
     * Qué encontró y qué hacer.
     */
    @JsonProperty("detail")
    private String detail;

    /**
     * Los pesos que toca, como el IVA en riesgo, o null.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Qué se revisó, estable para su código.
     */
    public String getKey() {
        return key;
    }

    public VatRefundReviewCheck setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * ok, warning (conviene revisar), blocking (el SAT la rechazaría) o pending (falta un dato).
     * <p>
     * Valores: ok, warning, blocking, pending.
     */
    public String getResult() {
        return result;
    }

    public VatRefundReviewCheck setResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * La revisión, en una línea.
     */
    public String getTitle() {
        return title;
    }

    public VatRefundReviewCheck setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Qué encontró y qué hacer.
     */
    public String getDetail() {
        return detail;
    }

    public VatRefundReviewCheck setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Los pesos que toca, como el IVA en riesgo, o null.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public VatRefundReviewCheck setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public VatRefundReviewCheck setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
