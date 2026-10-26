// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SatDeclarationCalendar: El ejercicio del emisor mes por mes: qué obligaciones presentó, cuáles parecen faltar y cuáles aún no vencen.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatDeclarationCalendar {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El ejercicio.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Cuántas obligaciones ya vencidas no encontramos presentadas en el SAT.
     */
    @JsonProperty("missing")
    private Long missing;

    /**
     * Los 12 meses y, en persona moral, la anual (month null). Las obligaciones se deducen de lo que el emisor presenta: ISR e IVA cada mes desde el primero que presentó; una retención si la presentó en 2 de los 3 meses anteriores o antes y después. La opinión de cumplimiento del SAT es la que manda.
     */
    @JsonProperty("months")
    private List<SatDeclarationCalendarMonth> months;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public SatDeclarationCalendar setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public SatDeclarationCalendar setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public SatDeclarationCalendar setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El ejercicio.
     */
    public Long getYear() {
        return year;
    }

    public SatDeclarationCalendar setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public SatDeclarationCalendar setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Cuántas obligaciones ya vencidas no encontramos presentadas en el SAT.
     */
    public Long getMissing() {
        return missing;
    }

    public SatDeclarationCalendar setMissing(Long missing) {
        this.missing = missing;
        return this;
    }

    @JsonIgnore
    public SatDeclarationCalendar setMissing(long missing) {
        return setMissing(Long.valueOf(missing));
    }

    /**
     * Los 12 meses y, en persona moral, la anual (month null). Las obligaciones se deducen de lo que el emisor presenta: ISR e IVA cada mes desde el primero que presentó; una retención si la presentó en 2 de los 3 meses anteriores o antes y después. La opinión de cumplimiento del SAT es la que manda.
     */
    public List<SatDeclarationCalendarMonth> getMonths() {
        return months;
    }

    public SatDeclarationCalendar setMonths(List<SatDeclarationCalendarMonth> months) {
        this.months = months;
        return this;
    }
}
