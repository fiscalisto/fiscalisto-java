// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MarkPayrollCalendarEventParams: los campos de «Marcar un pago de nómina como pagado».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarkPayrollCalendarEventParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * imss, rcv_infonavit, isn, aguinaldo, ptu, prima_riesgo, ajuste_anual, icsoe, sisub o renovacion_repse.
     * <p>
     * Valores: imss, rcv_infonavit, isn, aguinaldo, ptu, prima_riesgo, ajuste_anual, icsoe, sisub, renovacion_repse.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("obligation")
    private String obligation;

    /**
     * Como lo da GET /v1/payroll_calendar: 2026-11, 2026-B6, 2026-C3, 2026, 2026-11:CMX.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("key")
    private String key;

    /**
     * true lo marca pagado; false lo desmarca.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("paid")
    private Boolean paid;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public MarkPayrollCalendarEventParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * imss, rcv_infonavit, isn, aguinaldo, ptu, prima_riesgo, ajuste_anual, icsoe, sisub o renovacion_repse.
     * <p>
     * Valores: imss, rcv_infonavit, isn, aguinaldo, ptu, prima_riesgo, ajuste_anual, icsoe, sisub, renovacion_repse.
     * <p>
     * Obligatorio.
     */
    public String getObligation() {
        return obligation;
    }

    public MarkPayrollCalendarEventParams setObligation(String obligation) {
        this.obligation = obligation;
        return this;
    }

    /**
     * Como lo da GET /v1/payroll_calendar: 2026-11, 2026-B6, 2026-C3, 2026, 2026-11:CMX.
     * <p>
     * Obligatorio.
     */
    public String getKey() {
        return key;
    }

    public MarkPayrollCalendarEventParams setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * true lo marca pagado; false lo desmarca.
     * <p>
     * Obligatorio.
     */
    public Boolean getPaid() {
        return paid;
    }

    public MarkPayrollCalendarEventParams setPaid(Boolean paid) {
        this.paid = paid;
        return this;
    }
}
