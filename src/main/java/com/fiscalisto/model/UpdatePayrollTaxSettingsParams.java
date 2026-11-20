// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * UpdatePayrollTaxSettingsParams: los campos de «Qué no grava el impuesto sobre nómina».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdatePayrollTaxSettingsParams {
    /**
     * El emisor (iss_…); por omisión, el único de la cuenta.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Las percepciones (c_TipoPercepcion) que no suman a la base, como las deja fuera la ley de su estado. Reemplaza la lista entera.
     */
    @JsonProperty("excluded_perception_types")
    private List<String> excludedPerceptionTypes;

    /**
     * La opción de tasa de cada estado que la tiene, por su c_Estado: {"BCN": "hasta50"}.
     */
    @JsonProperty("state_options")
    private Map<String, String> stateOptions;

    /**
     * El día del mes siguiente en que se paga el impuesto de cada estado, por su c_Estado: {"NLE": 17}. null vuelve al día de su ley (Ciudad de México 17, Jalisco 12, Estado de México 10); los demás estados, sin día, salen por confirmar en GET /v1/payroll_calendar. Solo cambia los estados que mande.
     */
    @JsonProperty("due_days")
    private Map<String, Object> dueDays;

    /**
     * El emisor (iss_…); por omisión, el único de la cuenta.
     */
    public String getIssuer() {
        return issuer;
    }

    public UpdatePayrollTaxSettingsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Las percepciones (c_TipoPercepcion) que no suman a la base, como las deja fuera la ley de su estado. Reemplaza la lista entera.
     */
    public List<String> getExcludedPerceptionTypes() {
        return excludedPerceptionTypes;
    }

    public UpdatePayrollTaxSettingsParams setExcludedPerceptionTypes(List<String> excludedPerceptionTypes) {
        this.excludedPerceptionTypes = excludedPerceptionTypes;
        return this;
    }

    /**
     * La opción de tasa de cada estado que la tiene, por su c_Estado: {"BCN": "hasta50"}.
     */
    public Map<String, String> getStateOptions() {
        return stateOptions;
    }

    public UpdatePayrollTaxSettingsParams setStateOptions(Map<String, String> stateOptions) {
        this.stateOptions = stateOptions;
        return this;
    }

    /**
     * El día del mes siguiente en que se paga el impuesto de cada estado, por su c_Estado: {"NLE": 17}. null vuelve al día de su ley (Ciudad de México 17, Jalisco 12, Estado de México 10); los demás estados, sin día, salen por confirmar en GET /v1/payroll_calendar. Solo cambia los estados que mande.
     */
    public Map<String, Object> getDueDays() {
        return dueDays;
    }

    public UpdatePayrollTaxSettingsParams setDueDays(Map<String, Object> dueDays) {
        this.dueDays = dueDays;
        return this;
    }
}
