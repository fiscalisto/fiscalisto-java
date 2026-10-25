// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TestClock: El reloj de prueba de un emisor de pruebas: su «hoy», que solo avanza cuando usted lo adelanta, haciendo día por día lo que toca.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestClock {
    /**
     * clk_ y la clave del emisor.
     */
    @JsonProperty("id")
    private String id;

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
     * El emisor de pruebas que vive en esta hora.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * La hora del reloj: el «hoy» del emisor para sus facturas recurrentes, cotizaciones, cuentas por cobrar y tickets.
     */
    @JsonProperty("frozen_time")
    private String frozenTime;

    /**
     * advancing mientras una solicitud lo adelanta; ready en cualquier otro momento.
     * <p>
     * Valores: ready, advancing.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Al adelantarlo: lo que se hizo en el camino.
     */
    @JsonProperty("advanced")
    private TestClockAdvanced advanced;

    /**
     * true si se detuvo antes de requested_time porque ya timbró 25 comprobantes en esta solicitud: adelántelo otra vez para seguir.
     */
    @JsonProperty("stopped_early")
    private Boolean stoppedEarly;

    /**
     * A dónde se pidió adelantarlo (con stopped_early).
     */
    @JsonProperty("requested_time")
    private String requestedTime;

    /**
     * Siempre true.
     */
    @JsonProperty("deleted")
    private Boolean deleted;

    /**
     * clk_ y la clave del emisor.
     */
    public String getId() {
        return id;
    }

    public TestClock setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public TestClock setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public TestClock setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor de pruebas que vive en esta hora.
     */
    public String getIssuer() {
        return issuer;
    }

    public TestClock setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * La hora del reloj: el «hoy» del emisor para sus facturas recurrentes, cotizaciones, cuentas por cobrar y tickets.
     */
    public String getFrozenTime() {
        return frozenTime;
    }

    public TestClock setFrozenTime(String frozenTime) {
        this.frozenTime = frozenTime;
        return this;
    }

    /**
     * advancing mientras una solicitud lo adelanta; ready en cualquier otro momento.
     * <p>
     * Valores: ready, advancing.
     */
    public String getStatus() {
        return status;
    }

    public TestClock setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public TestClock setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Al adelantarlo: lo que se hizo en el camino.
     */
    public TestClockAdvanced getAdvanced() {
        return advanced;
    }

    public TestClock setAdvanced(TestClockAdvanced advanced) {
        this.advanced = advanced;
        return this;
    }

    /**
     * true si se detuvo antes de requested_time porque ya timbró 25 comprobantes en esta solicitud: adelántelo otra vez para seguir.
     */
    public Boolean getStoppedEarly() {
        return stoppedEarly;
    }

    public TestClock setStoppedEarly(Boolean stoppedEarly) {
        this.stoppedEarly = stoppedEarly;
        return this;
    }

    /**
     * A dónde se pidió adelantarlo (con stopped_early).
     */
    public String getRequestedTime() {
        return requestedTime;
    }

    public TestClock setRequestedTime(String requestedTime) {
        this.requestedTime = requestedTime;
        return this;
    }

    /**
     * Siempre true.
     */
    public Boolean getDeleted() {
        return deleted;
    }

    public TestClock setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
}
