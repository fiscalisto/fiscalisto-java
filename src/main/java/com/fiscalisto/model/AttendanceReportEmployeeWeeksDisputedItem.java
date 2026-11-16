// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AttendanceReportEmployeeWeeksDisputedItem: AttendanceReportEmployeeWeeksDisputedItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttendanceReportEmployeeWeeksDisputedItem {
    /**
     * El lunes de la semana, AAAA-MM-DD.
     */
    @JsonProperty("week")
    private String week;

    /**
     * Lo que el empleado dijo que no coincide.
     */
    @JsonProperty("text")
    private String text;

    /**
     * El lunes de la semana, AAAA-MM-DD.
     */
    public String getWeek() {
        return week;
    }

    public AttendanceReportEmployeeWeeksDisputedItem setWeek(String week) {
        this.week = week;
        return this;
    }

    /**
     * Lo que el empleado dijo que no coincide.
     */
    public String getText() {
        return text;
    }

    public AttendanceReportEmployeeWeeksDisputedItem setText(String text) {
        this.text = text;
        return this;
    }
}
