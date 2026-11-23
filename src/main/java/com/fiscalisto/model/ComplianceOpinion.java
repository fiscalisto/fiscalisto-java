// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ComplianceOpinion: La opinión de cumplimiento de obligaciones fiscales (32-D) más reciente del emisor, como la dio el SAT.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ComplianceOpinion {
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
     * positive, negative, no_obligations (inscrito sin obligaciones) o suspended (en suspensión de actividades); null si no se ha consultado.
     * <p>
     * Valores: positive, negative, no_obligations, suspended.
     */
    @JsonProperty("result")
    private String result;

    /**
     * El día que la emitió el SAT (AAAA-MM-DD), o null.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Su folio, o null.
     */
    @JsonProperty("folio")
    private String folio;

    /**
     * Si es negativa, lo que el SAT marca como pendiente.
     */
    @JsonProperty("reasons")
    private List<String> reasons;

    /**
     * true si su PDF está en GET /v1/issuers/{id}/compliance_opinion/pdf.
     */
    @JsonProperty("pdf")
    private Boolean pdf;

    /**
     * Cuándo se consultó por última vez, o null.
     */
    @JsonProperty("checked_at")
    private String checkedAt;

    /**
     * Por qué falló la última consulta, o null.
     */
    @JsonProperty("last_error")
    private String lastError;

    /**
     * De quién es la falla de last_error, para decidir sin leer el texto. sat_unavailable: el servicio del SAT no está disponible o no respondió (es del SAT; se vuelve a pedir solo). sat_refused: el SAT respondió que no, con su motivo en el mensaje. account: le toca a su cliente (e.firma vencida, sin autorización, su plan). internal: ni lo uno ni lo otro; se vuelve a intentar. null si no falló.
     * <p>
     * Valores: sat_unavailable, sat_refused, account, internal.
     */
    @JsonProperty("last_error_cause")
    private String lastErrorCause;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ComplianceOpinion setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public ComplianceOpinion setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public ComplianceOpinion setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * positive, negative, no_obligations (inscrito sin obligaciones) o suspended (en suspensión de actividades); null si no se ha consultado.
     * <p>
     * Valores: positive, negative, no_obligations, suspended.
     */
    public String getResult() {
        return result;
    }

    public ComplianceOpinion setResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * El día que la emitió el SAT (AAAA-MM-DD), o null.
     */
    public String getDate() {
        return date;
    }

    public ComplianceOpinion setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Su folio, o null.
     */
    public String getFolio() {
        return folio;
    }

    public ComplianceOpinion setFolio(String folio) {
        this.folio = folio;
        return this;
    }

    /**
     * Si es negativa, lo que el SAT marca como pendiente.
     */
    public List<String> getReasons() {
        return reasons;
    }

    public ComplianceOpinion setReasons(List<String> reasons) {
        this.reasons = reasons;
        return this;
    }

    /**
     * true si su PDF está en GET /v1/issuers/{id}/compliance_opinion/pdf.
     */
    public Boolean getPdf() {
        return pdf;
    }

    public ComplianceOpinion setPdf(Boolean pdf) {
        this.pdf = pdf;
        return this;
    }

    /**
     * Cuándo se consultó por última vez, o null.
     */
    public String getCheckedAt() {
        return checkedAt;
    }

    public ComplianceOpinion setCheckedAt(String checkedAt) {
        this.checkedAt = checkedAt;
        return this;
    }

    /**
     * Por qué falló la última consulta, o null.
     */
    public String getLastError() {
        return lastError;
    }

    public ComplianceOpinion setLastError(String lastError) {
        this.lastError = lastError;
        return this;
    }

    /**
     * De quién es la falla de last_error, para decidir sin leer el texto. sat_unavailable: el servicio del SAT no está disponible o no respondió (es del SAT; se vuelve a pedir solo). sat_refused: el SAT respondió que no, con su motivo en el mensaje. account: le toca a su cliente (e.firma vencida, sin autorización, su plan). internal: ni lo uno ni lo otro; se vuelve a intentar. null si no falló.
     * <p>
     * Valores: sat_unavailable, sat_refused, account, internal.
     */
    public String getLastErrorCause() {
        return lastErrorCause;
    }

    public ComplianceOpinion setLastErrorCause(String lastErrorCause) {
        this.lastErrorCause = lastErrorCause;
        return this;
    }
}
