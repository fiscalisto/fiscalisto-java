// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * NetToGrossParams: los campos de «Neto a bruto».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class NetToGrossParams {
    /**
     * El neto que quiere pagar por un periodo completo, en pesos.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("net")
    private BigDecimal net;

    /**
     * Un empleado (emp_…): toma su periodicidad, zona y prestaciones (aguinaldo, prima vacacional, antigüedad, vales y fondo de ahorro), y su factor SDI ÷ salario si los tiene.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * 02 semanal, 03 catorcenal, 04 quincenal o 05 mensual. Sin employee, obligatoria.
     * <p>
     * Valores: 02, 03, 04, 05.
     */
    @JsonProperty("periodicity")
    private String periodicity;

    /**
     * En la zona libre de la frontera norte (su salario mínimo).
     */
    @JsonProperty("border_zone")
    private Boolean borderZone;

    /**
     * Fecha de ingreso: los días de vacaciones de su antigüedad.
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * Días de aguinaldo al año (al menos 15).
     */
    @JsonProperty("aguinaldo_days")
    private Long aguinaldoDays;

    /**
     * Prima vacacional como fracción (al menos 0.25).
     */
    @JsonProperty("vacation_premium")
    private BigDecimal vacationPremium;

    /**
     * Vales de despensa al mes.
     */
    @JsonProperty("pantry_vouchers")
    private BigDecimal pantryVouchers;

    /**
     * Fondo de ahorro como fracción del salario (hasta 0.13).
     */
    @JsonProperty("savings_fund_rate")
    private BigDecimal savingsFundRate;

    /**
     * El neto que quiere pagar por un periodo completo, en pesos.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getNet() {
        return net;
    }

    public NetToGrossParams setNet(BigDecimal net) {
        this.net = net;
        return this;
    }

    @JsonIgnore
    public NetToGrossParams setNet(double net) {
        return setNet(BigDecimal.valueOf(net));
    }

    /**
     * Un empleado (emp_…): toma su periodicidad, zona y prestaciones (aguinaldo, prima vacacional, antigüedad, vales y fondo de ahorro), y su factor SDI ÷ salario si los tiene.
     */
    public String getEmployee() {
        return employee;
    }

    public NetToGrossParams setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * 02 semanal, 03 catorcenal, 04 quincenal o 05 mensual. Sin employee, obligatoria.
     * <p>
     * Valores: 02, 03, 04, 05.
     */
    public String getPeriodicity() {
        return periodicity;
    }

    public NetToGrossParams setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
        return this;
    }

    /**
     * En la zona libre de la frontera norte (su salario mínimo).
     */
    public Boolean getBorderZone() {
        return borderZone;
    }

    public NetToGrossParams setBorderZone(Boolean borderZone) {
        this.borderZone = borderZone;
        return this;
    }

    /**
     * Fecha de ingreso: los días de vacaciones de su antigüedad.
     */
    public String getStartDate() {
        return startDate;
    }

    public NetToGrossParams setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Días de aguinaldo al año (al menos 15).
     */
    public Long getAguinaldoDays() {
        return aguinaldoDays;
    }

    public NetToGrossParams setAguinaldoDays(Long aguinaldoDays) {
        this.aguinaldoDays = aguinaldoDays;
        return this;
    }

    @JsonIgnore
    public NetToGrossParams setAguinaldoDays(long aguinaldoDays) {
        return setAguinaldoDays(Long.valueOf(aguinaldoDays));
    }

    /**
     * Prima vacacional como fracción (al menos 0.25).
     */
    public BigDecimal getVacationPremium() {
        return vacationPremium;
    }

    public NetToGrossParams setVacationPremium(BigDecimal vacationPremium) {
        this.vacationPremium = vacationPremium;
        return this;
    }

    @JsonIgnore
    public NetToGrossParams setVacationPremium(double vacationPremium) {
        return setVacationPremium(BigDecimal.valueOf(vacationPremium));
    }

    /**
     * Vales de despensa al mes.
     */
    public BigDecimal getPantryVouchers() {
        return pantryVouchers;
    }

    public NetToGrossParams setPantryVouchers(BigDecimal pantryVouchers) {
        this.pantryVouchers = pantryVouchers;
        return this;
    }

    @JsonIgnore
    public NetToGrossParams setPantryVouchers(double pantryVouchers) {
        return setPantryVouchers(BigDecimal.valueOf(pantryVouchers));
    }

    /**
     * Fondo de ahorro como fracción del salario (hasta 0.13).
     */
    public BigDecimal getSavingsFundRate() {
        return savingsFundRate;
    }

    public NetToGrossParams setSavingsFundRate(BigDecimal savingsFundRate) {
        this.savingsFundRate = savingsFundRate;
        return this;
    }

    @JsonIgnore
    public NetToGrossParams setSavingsFundRate(double savingsFundRate) {
        return setSavingsFundRate(BigDecimal.valueOf(savingsFundRate));
    }
}
