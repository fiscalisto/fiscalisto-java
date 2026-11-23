// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * AttendanceMark: Una marca de entrada o salida de Asistencia (registro electrónico de jornada, LFT art. 132).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttendanceMark {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El empleado (emp_…).
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * in: entrada; out: salida.
     * <p>
     * Valores: in, out.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Cuándo marcó (UTC).
     */
    @JsonProperty("at")
    private String at;

    /**
     * El día al que cuenta, AAAA-MM-DD en la hora del lugar.
     */
    @JsonProperty("date")
    private String date;

    /**
     * La hora en el lugar, HH:MM.
     */
    @JsonProperty("time")
    private String time;

    /**
     * Cómo marcó: kiosk_qr (el código del checador), kiosk_pin (número y NIP en el checador), printed_qr (el QR impreso), remote (fuera de la sucursal, con su ubicación), manual (corrección en la app), api.
     * <p>
     * Valores: kiosk_qr, kiosk_pin, printed_qr, remote, manual, api.
     */
    @JsonProperty("method")
    private String method;

    /**
     * El lugar donde marcó, o null.
     */
    @JsonProperty("place")
    private String place;

    /**
     * A cuántos metros del lugar estaba, si dio su ubicación; si no, null.
     */
    @JsonProperty("distance_m")
    private BigDecimal distanceM;

    /**
     * Notas para revisar (la marca nunca se rechaza por ellas): no_location (no dio su ubicación), far (lejos del lugar), imprecise (ubicación imprecisa), remote (fuera de la sucursal), new_device (un celular nuevo), offline (se hizo sin conexión y llegó después; at es la hora en que se hizo, corregida por el reloj del celular), code_time (sin conexión, con un código del checador de otra hora).
     */
    @JsonProperty("flags")
    private List<String> flags;

    /**
     * Por qué se agregó, en una corrección o desde la API (el empleado lo ve); null si la hizo él.
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * Quién la agregó, en una corrección; null si la hizo él.
     */
    @JsonProperty("created_by")
    private String createdBy;

    /**
     * true si se quitó: queda tachada, no cuenta, y se ve con su motivo.
     */
    @JsonProperty("voided")
    private Boolean voided;

    /**
     * Por qué se quitó, o null.
     */
    @JsonProperty("void_reason")
    private String voidReason;

    /**
     * Quién la quitó, o null.
     */
    @JsonProperty("voided_by")
    private String voidedBy;

    /**
     * Cuándo se quitó, o null.
     */
    @JsonProperty("voided_at")
    private String voidedAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public AttendanceMark setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public AttendanceMark setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public AttendanceMark setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El empleado (emp_…).
     */
    public String getEmployee() {
        return employee;
    }

    public AttendanceMark setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * in: entrada; out: salida.
     * <p>
     * Valores: in, out.
     */
    public String getKind() {
        return kind;
    }

    public AttendanceMark setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Cuándo marcó (UTC).
     */
    public String getAt() {
        return at;
    }

    public AttendanceMark setAt(String at) {
        this.at = at;
        return this;
    }

    /**
     * El día al que cuenta, AAAA-MM-DD en la hora del lugar.
     */
    public String getDate() {
        return date;
    }

    public AttendanceMark setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * La hora en el lugar, HH:MM.
     */
    public String getTime() {
        return time;
    }

    public AttendanceMark setTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * Cómo marcó: kiosk_qr (el código del checador), kiosk_pin (número y NIP en el checador), printed_qr (el QR impreso), remote (fuera de la sucursal, con su ubicación), manual (corrección en la app), api.
     * <p>
     * Valores: kiosk_qr, kiosk_pin, printed_qr, remote, manual, api.
     */
    public String getMethod() {
        return method;
    }

    public AttendanceMark setMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * El lugar donde marcó, o null.
     */
    public String getPlace() {
        return place;
    }

    public AttendanceMark setPlace(String place) {
        this.place = place;
        return this;
    }

    /**
     * A cuántos metros del lugar estaba, si dio su ubicación; si no, null.
     */
    public BigDecimal getDistanceM() {
        return distanceM;
    }

    public AttendanceMark setDistanceM(BigDecimal distanceM) {
        this.distanceM = distanceM;
        return this;
    }

    @JsonIgnore
    public AttendanceMark setDistanceM(double distanceM) {
        return setDistanceM(BigDecimal.valueOf(distanceM));
    }

    /**
     * Notas para revisar (la marca nunca se rechaza por ellas): no_location (no dio su ubicación), far (lejos del lugar), imprecise (ubicación imprecisa), remote (fuera de la sucursal), new_device (un celular nuevo), offline (se hizo sin conexión y llegó después; at es la hora en que se hizo, corregida por el reloj del celular), code_time (sin conexión, con un código del checador de otra hora).
     */
    public List<String> getFlags() {
        return flags;
    }

    public AttendanceMark setFlags(List<String> flags) {
        this.flags = flags;
        return this;
    }

    /**
     * Por qué se agregó, en una corrección o desde la API (el empleado lo ve); null si la hizo él.
     */
    public String getReason() {
        return reason;
    }

    public AttendanceMark setReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Quién la agregó, en una corrección; null si la hizo él.
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public AttendanceMark setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * true si se quitó: queda tachada, no cuenta, y se ve con su motivo.
     */
    public Boolean getVoided() {
        return voided;
    }

    public AttendanceMark setVoided(Boolean voided) {
        this.voided = voided;
        return this;
    }

    /**
     * Por qué se quitó, o null.
     */
    public String getVoidReason() {
        return voidReason;
    }

    public AttendanceMark setVoidReason(String voidReason) {
        this.voidReason = voidReason;
        return this;
    }

    /**
     * Quién la quitó, o null.
     */
    public String getVoidedBy() {
        return voidedBy;
    }

    public AttendanceMark setVoidedBy(String voidedBy) {
        this.voidedBy = voidedBy;
        return this;
    }

    /**
     * Cuándo se quitó, o null.
     */
    public String getVoidedAt() {
        return voidedAt;
    }

    public AttendanceMark setVoidedAt(String voidedAt) {
        this.voidedAt = voidedAt;
        return this;
    }
}
