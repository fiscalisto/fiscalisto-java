// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SatDeclarationCalendarMonth: SatDeclarationCalendarMonth.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatDeclarationCalendarMonth {
    /**
     * El mes (1 a 12), o null para la anual.
     */
    @JsonProperty("month")
    private Long month;

    /**
     * El último día para presentarla (AAAA-MM-DD).
     */
    @JsonProperty("due_on")
    private String dueOn;

    /**
     * Las obligaciones del mes.
     */
    @JsonProperty("obligations")
    private List<SatDeclarationCalendarMonthObligation> obligations;

    /**
     * El mes (1 a 12), o null para la anual.
     */
    public Long getMonth() {
        return month;
    }

    public SatDeclarationCalendarMonth setMonth(Long month) {
        this.month = month;
        return this;
    }

    @JsonIgnore
    public SatDeclarationCalendarMonth setMonth(long month) {
        return setMonth(Long.valueOf(month));
    }

    /**
     * El último día para presentarla (AAAA-MM-DD).
     */
    public String getDueOn() {
        return dueOn;
    }

    public SatDeclarationCalendarMonth setDueOn(String dueOn) {
        this.dueOn = dueOn;
        return this;
    }

    /**
     * Las obligaciones del mes.
     */
    public List<SatDeclarationCalendarMonthObligation> getObligations() {
        return obligations;
    }

    public SatDeclarationCalendarMonth setObligations(List<SatDeclarationCalendarMonthObligation> obligations) {
        this.obligations = obligations;
        return this;
    }
}
