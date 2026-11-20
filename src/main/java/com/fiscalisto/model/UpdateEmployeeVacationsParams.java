// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * UpdateEmployeeVacationsParams: los campos de «Saldo de vacaciones antes de Fiscalisto».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateEmployeeVacationsParams {
    /**
     * El día del saldo, según sus registros de antes de Fiscalisto; null lo quita. Los recibos timbrados antes de ese día no se cuentan.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("opening_date")
    private String openingDate;

    /**
     * Los días que ese día le quedaban de años de servicio cumplidos.
     */
    @JsonProperty("opening_pending_days")
    private BigDecimal openingPendingDays;

    /**
     * Los días del año de servicio en curso que ya había tomado ese día.
     */
    @JsonProperty("opening_taken_days")
    private BigDecimal openingTakenDays;

    /**
     * El día del saldo, según sus registros de antes de Fiscalisto; null lo quita. Los recibos timbrados antes de ese día no se cuentan.
     * <p>
     * Obligatorio.
     */
    public String getOpeningDate() {
        return openingDate;
    }

    public UpdateEmployeeVacationsParams setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
        return this;
    }

    /**
     * Los días que ese día le quedaban de años de servicio cumplidos.
     */
    public BigDecimal getOpeningPendingDays() {
        return openingPendingDays;
    }

    public UpdateEmployeeVacationsParams setOpeningPendingDays(BigDecimal openingPendingDays) {
        this.openingPendingDays = openingPendingDays;
        return this;
    }

    @JsonIgnore
    public UpdateEmployeeVacationsParams setOpeningPendingDays(double openingPendingDays) {
        return setOpeningPendingDays(BigDecimal.valueOf(openingPendingDays));
    }

    /**
     * Los días del año de servicio en curso que ya había tomado ese día.
     */
    public BigDecimal getOpeningTakenDays() {
        return openingTakenDays;
    }

    public UpdateEmployeeVacationsParams setOpeningTakenDays(BigDecimal openingTakenDays) {
        this.openingTakenDays = openingTakenDays;
        return this;
    }

    @JsonIgnore
    public UpdateEmployeeVacationsParams setOpeningTakenDays(double openingTakenDays) {
        return setOpeningTakenDays(BigDecimal.valueOf(openingTakenDays));
    }
}
