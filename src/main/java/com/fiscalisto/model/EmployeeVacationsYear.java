// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * EmployeeVacationsYear: EmployeeVacationsYear.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeeVacationsYear {
    /**
     * El año de servicio; 0 es el saldo de antes de Fiscalisto.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * El aniversario que lo cumple.
     */
    @JsonProperty("owed_from")
    private String owedFrom;

    /**
     * Los días que le tocan (artículo 76).
     */
    @JsonProperty("days")
    private BigDecimal days;

    /**
     * Los que ya tomó.
     */
    @JsonProperty("taken_days")
    private BigDecimal takenDays;

    /**
     * Los que le quedan.
     */
    @JsonProperty("remaining_days")
    private BigDecimal remainingDays;

    /**
     * El último día para dárselos (artículo 81).
     */
    @JsonProperty("grant_by")
    private String grantBy;

    /**
     * El día en que prescriben (artículo 516).
     */
    @JsonProperty("prescribes_on")
    private String prescribesOn;

    /**
     * taken, disfrutadas; pending, por disfrutar; late, pasó el plazo para darlas y no han prescrito; prescribed, prescritas.
     * <p>
     * Valores: taken, pending, late, prescribed.
     */
    @JsonProperty("status")
    private String status;

    /**
     * El año de servicio; 0 es el saldo de antes de Fiscalisto.
     */
    public Long getYear() {
        return year;
    }

    public EmployeeVacationsYear setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public EmployeeVacationsYear setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * El aniversario que lo cumple.
     */
    public String getOwedFrom() {
        return owedFrom;
    }

    public EmployeeVacationsYear setOwedFrom(String owedFrom) {
        this.owedFrom = owedFrom;
        return this;
    }

    /**
     * Los días que le tocan (artículo 76).
     */
    public BigDecimal getDays() {
        return days;
    }

    public EmployeeVacationsYear setDays(BigDecimal days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public EmployeeVacationsYear setDays(double days) {
        return setDays(BigDecimal.valueOf(days));
    }

    /**
     * Los que ya tomó.
     */
    public BigDecimal getTakenDays() {
        return takenDays;
    }

    public EmployeeVacationsYear setTakenDays(BigDecimal takenDays) {
        this.takenDays = takenDays;
        return this;
    }

    @JsonIgnore
    public EmployeeVacationsYear setTakenDays(double takenDays) {
        return setTakenDays(BigDecimal.valueOf(takenDays));
    }

    /**
     * Los que le quedan.
     */
    public BigDecimal getRemainingDays() {
        return remainingDays;
    }

    public EmployeeVacationsYear setRemainingDays(BigDecimal remainingDays) {
        this.remainingDays = remainingDays;
        return this;
    }

    @JsonIgnore
    public EmployeeVacationsYear setRemainingDays(double remainingDays) {
        return setRemainingDays(BigDecimal.valueOf(remainingDays));
    }

    /**
     * El último día para dárselos (artículo 81).
     */
    public String getGrantBy() {
        return grantBy;
    }

    public EmployeeVacationsYear setGrantBy(String grantBy) {
        this.grantBy = grantBy;
        return this;
    }

    /**
     * El día en que prescriben (artículo 516).
     */
    public String getPrescribesOn() {
        return prescribesOn;
    }

    public EmployeeVacationsYear setPrescribesOn(String prescribesOn) {
        this.prescribesOn = prescribesOn;
        return this;
    }

    /**
     * taken, disfrutadas; pending, por disfrutar; late, pasó el plazo para darlas y no han prescrito; prescribed, prescritas.
     * <p>
     * Valores: taken, pending, late, prescribed.
     */
    public String getStatus() {
        return status;
    }

    public EmployeeVacationsYear setStatus(String status) {
        this.status = status;
        return this;
    }
}
