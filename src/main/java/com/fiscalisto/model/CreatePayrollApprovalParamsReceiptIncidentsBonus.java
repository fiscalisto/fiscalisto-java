// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreatePayrollApprovalParamsReceiptIncidentsBonus: CreatePayrollApprovalParamsReceiptIncidentsBonus.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePayrollApprovalParamsReceiptIncidentsBonus {
    /**
     * 010 premio de puntualidad, 049 premio de asistencia, 028 comisiones, 038 otro bono (c_TipoPercepcion).
     * <p>
     * Valores: 010, 049, 028, 038.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Importe.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Concepto del pago (ConceptoPago), c_TipoContribuyenteSujetoRetencion.
     */
    @JsonProperty("concept")
    private String concept;

    /**
     * 010 premio de puntualidad, 049 premio de asistencia, 028 comisiones, 038 otro bono (c_TipoPercepcion).
     * <p>
     * Valores: 010, 049, 028, 038.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public CreatePayrollApprovalParamsReceiptIncidentsBonus setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Importe.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CreatePayrollApprovalParamsReceiptIncidentsBonus setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CreatePayrollApprovalParamsReceiptIncidentsBonus setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Concepto del pago (ConceptoPago), c_TipoContribuyenteSujetoRetencion.
     */
    public String getConcept() {
        return concept;
    }

    public CreatePayrollApprovalParamsReceiptIncidentsBonus setConcept(String concept) {
        this.concept = concept;
        return this;
    }
}
