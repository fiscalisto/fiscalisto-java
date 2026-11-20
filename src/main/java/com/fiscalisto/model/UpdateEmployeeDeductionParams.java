// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * UpdateEmployeeDeductionParams: los campos de «Cambiar un descuento».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateEmployeeDeductionParams {
    /**
     * infonavit (deducción 010), fonacot (011), pension (pensión alimenticia, 007), prestamo (préstamo del patrón, 004), anticipo (anticipo de salarios, 012), caja (caja de ahorro, 018) o sindical (cuota sindical, 019).
     * <p>
     * Valores: infonavit, fonacot, pension, prestamo, anticipo, caja, sindical.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Cómo se calcula. infonavit: percent_sbc (porcentaje del SBC por día), fixed_month (cuota fija al mes) o vsm (factor de VSM al mes, por la UMI de 100.81), como dice el aviso de retención. fonacot: fixed_month (la retención mensual de la cédula). pension: percent_net (del neto después de ISR e IMSS), percent_gross (de todas las percepciones) o fixed_month. prestamo, anticipo y caja: fixed_period (monto por recibo). sindical: percent_salary (del sueldo) o fixed_period.
     * <p>
     * Valores: percent_sbc, fixed_month, vsm, percent_net, percent_gross, fixed_period, percent_salary.
     */
    @JsonProperty("mode")
    private String mode;

    /**
     * El porcentaje (de más de 0 a 100), el factor de VSM o el monto en pesos, según mode.
     */
    @JsonProperty("value")
    private BigDecimal value;

    /**
     * Solo prestamo y anticipo: el monto prestado. Se descuenta hasta pagarlo; no puede pasar de un mes de salario (artículo 110 de la LFT).
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * El número de crédito de Infonavit o Fonacot, el expediente o una nota.
     */
    @JsonProperty("reference")
    private String reference;

    /**
     * Solo pension, y obligatorio: a quién se paga.
     */
    @JsonProperty("beneficiary")
    private String beneficiary;

    /**
     * Desde qué día se descuenta (AAAA-MM-DD).
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * Hasta qué día (incluido). Sin él, hasta que se borre (o se pague el préstamo).
     */
    @JsonProperty("end_date")
    private String endDate;

    /**
     * Solo pension: también se descuenta del aguinaldo, la PTU y el finiquito (por omisión, true).
     */
    @JsonProperty("extraordinary")
    private Boolean extraordinary;

    /**
     * infonavit (deducción 010), fonacot (011), pension (pensión alimenticia, 007), prestamo (préstamo del patrón, 004), anticipo (anticipo de salarios, 012), caja (caja de ahorro, 018) o sindical (cuota sindical, 019).
     * <p>
     * Valores: infonavit, fonacot, pension, prestamo, anticipo, caja, sindical.
     */
    public String getKind() {
        return kind;
    }

    public UpdateEmployeeDeductionParams setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Cómo se calcula. infonavit: percent_sbc (porcentaje del SBC por día), fixed_month (cuota fija al mes) o vsm (factor de VSM al mes, por la UMI de 100.81), como dice el aviso de retención. fonacot: fixed_month (la retención mensual de la cédula). pension: percent_net (del neto después de ISR e IMSS), percent_gross (de todas las percepciones) o fixed_month. prestamo, anticipo y caja: fixed_period (monto por recibo). sindical: percent_salary (del sueldo) o fixed_period.
     * <p>
     * Valores: percent_sbc, fixed_month, vsm, percent_net, percent_gross, fixed_period, percent_salary.
     */
    public String getMode() {
        return mode;
    }

    public UpdateEmployeeDeductionParams setMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * El porcentaje (de más de 0 a 100), el factor de VSM o el monto en pesos, según mode.
     */
    public BigDecimal getValue() {
        return value;
    }

    public UpdateEmployeeDeductionParams setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    @JsonIgnore
    public UpdateEmployeeDeductionParams setValue(double value) {
        return setValue(BigDecimal.valueOf(value));
    }

    /**
     * Solo prestamo y anticipo: el monto prestado. Se descuenta hasta pagarlo; no puede pasar de un mes de salario (artículo 110 de la LFT).
     */
    public BigDecimal getTotal() {
        return total;
    }

    public UpdateEmployeeDeductionParams setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public UpdateEmployeeDeductionParams setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * El número de crédito de Infonavit o Fonacot, el expediente o una nota.
     */
    public String getReference() {
        return reference;
    }

    public UpdateEmployeeDeductionParams setReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Solo pension, y obligatorio: a quién se paga.
     */
    public String getBeneficiary() {
        return beneficiary;
    }

    public UpdateEmployeeDeductionParams setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
        return this;
    }

    /**
     * Desde qué día se descuenta (AAAA-MM-DD).
     */
    public String getStartDate() {
        return startDate;
    }

    public UpdateEmployeeDeductionParams setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Hasta qué día (incluido). Sin él, hasta que se borre (o se pague el préstamo).
     */
    public String getEndDate() {
        return endDate;
    }

    public UpdateEmployeeDeductionParams setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Solo pension: también se descuenta del aguinaldo, la PTU y el finiquito (por omisión, true).
     */
    public Boolean getExtraordinary() {
        return extraordinary;
    }

    public UpdateEmployeeDeductionParams setExtraordinary(Boolean extraordinary) {
        this.extraordinary = extraordinary;
        return this;
    }
}
