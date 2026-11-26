// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

/**
 * ClimateComplaint: Una queja del buzón (numeral 8.1 b)).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimateComplaint {
    /**
     * La queja (clq_…).
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
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private StringOr<Issuer> issuer;

    /**
     * violencia, entorno u otro.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Lo que escribió.
     */
    @JsonProperty("body")
    private String body;

    /**
     * Solo si quien la mandó la firmó.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Cuándo llegó.
     */
    @JsonProperty("received_on")
    private String receivedOn;

    /**
     * nueva, en_atencion o atendida.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Qué se hizo.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Cuándo se atendió.
     */
    @JsonProperty("closed_on")
    private String closedOn;

    /**
     * La queja (clq_…).
     */
    public String getId() {
        return id;
    }

    public ClimateComplaint setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ClimateComplaint setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public ClimateComplaint setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public ClimateComplaint setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public ClimateComplaint setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public ClimateComplaint setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * violencia, entorno u otro.
     */
    public String getKind() {
        return kind;
    }

    public ClimateComplaint setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Lo que escribió.
     */
    public String getBody() {
        return body;
    }

    public ClimateComplaint setBody(String body) {
        this.body = body;
        return this;
    }

    /**
     * Solo si quien la mandó la firmó.
     */
    public String getEmployee() {
        return employee;
    }

    public ClimateComplaint setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public ClimateComplaint setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Cuándo llegó.
     */
    public String getReceivedOn() {
        return receivedOn;
    }

    public ClimateComplaint setReceivedOn(String receivedOn) {
        this.receivedOn = receivedOn;
        return this;
    }

    /**
     * nueva, en_atencion o atendida.
     */
    public String getStatus() {
        return status;
    }

    public ClimateComplaint setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Qué se hizo.
     */
    public String getNote() {
        return note;
    }

    public ClimateComplaint setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * Cuándo se atendió.
     */
    public String getClosedOn() {
        return closedOn;
    }

    public ClimateComplaint setClosedOn(String closedOn) {
        this.closedOn = closedOn;
        return this;
    }
}
