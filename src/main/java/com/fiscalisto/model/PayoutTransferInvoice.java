// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayoutTransferInvoice: PayoutTransferInvoice.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayoutTransferInvoice {
    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * Importe.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Moneda, clave ISO 4217 de c_Moneda (MXN, USD, EUR…). Por omisión MXN.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * true si es un pago sin factura (anticipo, depósito…).
     */
    @JsonProperty("without_invoice")
    private Boolean withoutInvoice;

    /**
     * Descripción.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    public String getUuid() {
        return uuid;
    }

    public PayoutTransferInvoice setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Importe.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public PayoutTransferInvoice setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public PayoutTransferInvoice setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Moneda, clave ISO 4217 de c_Moneda (MXN, USD, EUR…). Por omisión MXN.
     */
    public String getCurrency() {
        return currency;
    }

    public PayoutTransferInvoice setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * true si es un pago sin factura (anticipo, depósito…).
     */
    public Boolean getWithoutInvoice() {
        return withoutInvoice;
    }

    public PayoutTransferInvoice setWithoutInvoice(Boolean withoutInvoice) {
        this.withoutInvoice = withoutInvoice;
        return this;
    }

    /**
     * Descripción.
     */
    public String getDescription() {
        return description;
    }

    public PayoutTransferInvoice setDescription(String description) {
        this.description = description;
        return this;
    }
}
