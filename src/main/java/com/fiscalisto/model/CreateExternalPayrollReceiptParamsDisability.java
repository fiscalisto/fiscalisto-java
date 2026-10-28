// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateExternalPayrollReceiptParamsDisability: CreateExternalPayrollReceiptParamsDisability.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateExternalPayrollReceiptParamsDisability {
    /**
     * Días pagados (NumDiasPagados). Por omisión, todos los del periodo que le tocan.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("days")
    private BigDecimal days;

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Días pagados (NumDiasPagados). Por omisión, todos los del periodo que le tocan.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getDays() {
        return days;
    }

    public CreateExternalPayrollReceiptParamsDisability setDays(BigDecimal days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public CreateExternalPayrollReceiptParamsDisability setDays(double days) {
        return setDays(BigDecimal.valueOf(days));
    }

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public CreateExternalPayrollReceiptParamsDisability setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Pesos con hasta 2 decimales, como se timbran: Fiscalisto no los redondea.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CreateExternalPayrollReceiptParamsDisability setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CreateExternalPayrollReceiptParamsDisability setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
