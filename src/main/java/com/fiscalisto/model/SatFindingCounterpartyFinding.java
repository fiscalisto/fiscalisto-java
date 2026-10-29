// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SatFindingCounterpartyFinding: SatFindingCounterpartyFinding.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatFindingCounterpartyFinding {
    /**
     * El código del hallazgo (el code de GET /v1/sat_findings).
     */
    @JsonProperty("code")
    private String code;

    /**
     * critical (grave), warning (revisar) o info.
     * <p>
     * Valores: critical, warning, info.
     */
    @JsonProperty("severity")
    private String severity;

    /**
     * Qué es, en palabras.
     */
    @JsonProperty("title")
    private String title;

    /**
     * En cuántos de sus CFDI está, sin revisar.
     */
    @JsonProperty("invoices")
    private Long invoices;

    /**
     * El código del hallazgo (el code de GET /v1/sat_findings).
     */
    public String getCode() {
        return code;
    }

    public SatFindingCounterpartyFinding setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * critical (grave), warning (revisar) o info.
     * <p>
     * Valores: critical, warning, info.
     */
    public String getSeverity() {
        return severity;
    }

    public SatFindingCounterpartyFinding setSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Qué es, en palabras.
     */
    public String getTitle() {
        return title;
    }

    public SatFindingCounterpartyFinding setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * En cuántos de sus CFDI está, sin revisar.
     */
    public Long getInvoices() {
        return invoices;
    }

    public SatFindingCounterpartyFinding setInvoices(Long invoices) {
        this.invoices = invoices;
        return this;
    }

    @JsonIgnore
    public SatFindingCounterpartyFinding setInvoices(long invoices) {
        return setInvoices(Long.valueOf(invoices));
    }
}
