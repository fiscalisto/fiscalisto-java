// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * UpdateImssMovementParams: los campos de «Cambiar un movimiento del IMSS».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateImssMovementParams {
    /**
     * alta (o reingreso): tipo 08; modificacion: cambio de salario, tipo 07; baja: tipo 02.
     * <p>
     * Valores: alta, reingreso, modificacion, baja.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * El día en que surte efecto (AAAA-MM-DD, hora de México). El IMSS no acepta más de unos días de anticipación.
     */
    @JsonProperty("date")
    private String date;

    /**
     * El salario diario integrado que se declara (en altas, reingresos y modificaciones). El archivo lo topa a 25 UMA y nunca baja del salario mínimo.
     */
    @JsonProperty("integrated_daily_salary")
    private BigDecimal integratedDailySalary;

    /**
     * Solo en bajas: 1 término de contrato, 2 separación voluntaria, 3 abandono, 4 defunción, 5 clausura, 6 otras, 7 ausentismo, 8 rescisión, 9 jubilación, A pensión.
     * <p>
     * Valores: 1, 2, 3, 4, 5, 6, 7, 8, 9, A.
     */
    @JsonProperty("exit_reason")
    private String exitReason;

    /**
     * alta (o reingreso): tipo 08; modificacion: cambio de salario, tipo 07; baja: tipo 02.
     * <p>
     * Valores: alta, reingreso, modificacion, baja.
     */
    public String getKind() {
        return kind;
    }

    public UpdateImssMovementParams setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * El día en que surte efecto (AAAA-MM-DD, hora de México). El IMSS no acepta más de unos días de anticipación.
     */
    public String getDate() {
        return date;
    }

    public UpdateImssMovementParams setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * El salario diario integrado que se declara (en altas, reingresos y modificaciones). El archivo lo topa a 25 UMA y nunca baja del salario mínimo.
     */
    public BigDecimal getIntegratedDailySalary() {
        return integratedDailySalary;
    }

    public UpdateImssMovementParams setIntegratedDailySalary(BigDecimal integratedDailySalary) {
        this.integratedDailySalary = integratedDailySalary;
        return this;
    }

    @JsonIgnore
    public UpdateImssMovementParams setIntegratedDailySalary(double integratedDailySalary) {
        return setIntegratedDailySalary(BigDecimal.valueOf(integratedDailySalary));
    }

    /**
     * Solo en bajas: 1 término de contrato, 2 separación voluntaria, 3 abandono, 4 defunción, 5 clausura, 6 otras, 7 ausentismo, 8 rescisión, 9 jubilación, A pensión.
     * <p>
     * Valores: 1, 2, 3, 4, 5, 6, 7, 8, 9, A.
     */
    public String getExitReason() {
        return exitReason;
    }

    public UpdateImssMovementParams setExitReason(String exitReason) {
        this.exitReason = exitReason;
        return this;
    }
}
