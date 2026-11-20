// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * ApproveVacationRequestParams: los campos de «Aprobar una solicitud de vacaciones».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApproveVacationRequestParams {
    /**
     * Los días que descuenta de sus vacaciones, si no son los que se calcularon (sin domingos ni festivos), por ejemplo sin los sábados de quien descansa.
     */
    @JsonProperty("days")
    private BigDecimal days;

    /**
     * Una nota que el empleado ve en su enlace.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Los días que descuenta de sus vacaciones, si no son los que se calcularon (sin domingos ni festivos), por ejemplo sin los sábados de quien descansa.
     */
    public BigDecimal getDays() {
        return days;
    }

    public ApproveVacationRequestParams setDays(BigDecimal days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public ApproveVacationRequestParams setDays(double days) {
        return setDays(BigDecimal.valueOf(days));
    }

    /**
     * Una nota que el empleado ve en su enlace.
     */
    public String getNote() {
        return note;
    }

    public ApproveVacationRequestParams setNote(String note) {
        this.note = note;
        return this;
    }
}
