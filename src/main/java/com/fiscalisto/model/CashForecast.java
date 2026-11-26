// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.math.BigDecimal;
import java.util.List;

/**
 * CashForecast: El flujo de efectivo de las próximas 13 semanas: lo que le deben (con lo que cada cliente suele tardar), lo que debe a proveedores, la nómina, las declaraciones, las facturas recurrentes y sus movimientos previstos, desde el saldo que usted dio. Una estimación: no cambia nada.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CashForecast {
    /**
     * Siempre cash_forecast.
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private StringOr<Issuer> issuer;

    /**
     * Hoy en la Ciudad de México (AAAA-MM-DD): el inicio.
     */
    @JsonProperty("today")
    private String today;

    /**
     * El último día de la semana 13.
     */
    @JsonProperty("end")
    private String end;

    /**
     * Todo en pesos: lo de otra moneda, a su tipo de cambio.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * El saldo de hoy que usted dio; null si no lo ha dado (el flujo parte de 0).
     */
    @JsonProperty("starting_balance")
    private CashForecastStartingBalance startingBalance;

    /**
     * Lo menos que quiere tener; cada semana debajo trae un aviso. 0 si no lo dio.
     */
    @JsonProperty("minimum_balance")
    private BigDecimal minimumBalance;

    /**
     * El saldo de sus últimos estados de cuenta en Conciliación (60 días), solo como sugerencia; null sin ellos.
     */
    @JsonProperty("suggested_starting_balance")
    private CashForecastSuggestedStartingBalance suggestedStartingBalance;

    /**
     * El escenario con que se calculó: el de los parámetros de la consulta.
     */
    @JsonProperty("scenario")
    private CashForecastScenario scenario;

    /**
     * Las 13 semanas juntas.
     */
    @JsonProperty("totals")
    private CashForecastTotals totals;

    /**
     * Las 13 semanas, en orden.
     */
    @JsonProperty("weeks")
    private List<CashForecastWeek> weeks;

    /**
     * Cada cosa que entra o sale, de la que se suman las semanas.
     */
    @JsonProperty("lines")
    private List<CashForecastLine> lines;

    /**
     * Avisos con lo que puede hacer; usted decide.
     */
    @JsonProperty("warnings")
    private List<CashForecastWarning> warnings;

    /**
     * Sus movimientos previstos.
     */
    @JsonProperty("planned_items")
    private List<CashForecastItem> plannedItems;

    /**
     * Lo que no se pudo estimar y por qué.
     */
    @JsonProperty("notes")
    private List<String> notes;

    /**
     * Siempre cash_forecast.
     */
    public String getObject() {
        return object;
    }

    public CashForecast setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public CashForecast setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public CashForecast setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public CashForecast setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public CashForecast setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * Hoy en la Ciudad de México (AAAA-MM-DD): el inicio.
     */
    public String getToday() {
        return today;
    }

    public CashForecast setToday(String today) {
        this.today = today;
        return this;
    }

    /**
     * El último día de la semana 13.
     */
    public String getEnd() {
        return end;
    }

    public CashForecast setEnd(String end) {
        this.end = end;
        return this;
    }

    /**
     * Todo en pesos: lo de otra moneda, a su tipo de cambio.
     */
    public String getCurrency() {
        return currency;
    }

    public CashForecast setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * El saldo de hoy que usted dio; null si no lo ha dado (el flujo parte de 0).
     */
    public CashForecastStartingBalance getStartingBalance() {
        return startingBalance;
    }

    public CashForecast setStartingBalance(CashForecastStartingBalance startingBalance) {
        this.startingBalance = startingBalance;
        return this;
    }

    /**
     * Lo menos que quiere tener; cada semana debajo trae un aviso. 0 si no lo dio.
     */
    public BigDecimal getMinimumBalance() {
        return minimumBalance;
    }

    public CashForecast setMinimumBalance(BigDecimal minimumBalance) {
        this.minimumBalance = minimumBalance;
        return this;
    }

    @JsonIgnore
    public CashForecast setMinimumBalance(double minimumBalance) {
        return setMinimumBalance(BigDecimal.valueOf(minimumBalance));
    }

    /**
     * El saldo de sus últimos estados de cuenta en Conciliación (60 días), solo como sugerencia; null sin ellos.
     */
    public CashForecastSuggestedStartingBalance getSuggestedStartingBalance() {
        return suggestedStartingBalance;
    }

    public CashForecast setSuggestedStartingBalance(CashForecastSuggestedStartingBalance suggestedStartingBalance) {
        this.suggestedStartingBalance = suggestedStartingBalance;
        return this;
    }

    /**
     * El escenario con que se calculó: el de los parámetros de la consulta.
     */
    public CashForecastScenario getScenario() {
        return scenario;
    }

    public CashForecast setScenario(CashForecastScenario scenario) {
        this.scenario = scenario;
        return this;
    }

    /**
     * Las 13 semanas juntas.
     */
    public CashForecastTotals getTotals() {
        return totals;
    }

    public CashForecast setTotals(CashForecastTotals totals) {
        this.totals = totals;
        return this;
    }

    /**
     * Las 13 semanas, en orden.
     */
    public List<CashForecastWeek> getWeeks() {
        return weeks;
    }

    public CashForecast setWeeks(List<CashForecastWeek> weeks) {
        this.weeks = weeks;
        return this;
    }

    /**
     * Cada cosa que entra o sale, de la que se suman las semanas.
     */
    public List<CashForecastLine> getLines() {
        return lines;
    }

    public CashForecast setLines(List<CashForecastLine> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * Avisos con lo que puede hacer; usted decide.
     */
    public List<CashForecastWarning> getWarnings() {
        return warnings;
    }

    public CashForecast setWarnings(List<CashForecastWarning> warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     * Sus movimientos previstos.
     */
    public List<CashForecastItem> getPlannedItems() {
        return plannedItems;
    }

    public CashForecast setPlannedItems(List<CashForecastItem> plannedItems) {
        this.plannedItems = plannedItems;
        return this;
    }

    /**
     * Lo que no se pudo estimar y por qué.
     */
    public List<String> getNotes() {
        return notes;
    }

    public CashForecast setNotes(List<String> notes) {
        this.notes = notes;
        return this;
    }
}
