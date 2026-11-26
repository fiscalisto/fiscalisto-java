// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.util.List;
import java.util.Map;

/**
 * PayrollTaxSettings: Qué no grava el impuesto sobre nómina del emisor y sus opciones de tasa.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollTaxSettings {
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
     * Las percepciones que no suman a la base; null, las comunes.
     */
    @JsonProperty("excluded_perception_types")
    private List<String> excludedPerceptionTypes;

    /**
     * La opción de tasa de cada estado, por su c_Estado.
     */
    @JsonProperty("state_options")
    private Map<String, String> stateOptions;

    /**
     * El día del mes siguiente en que se paga el impuesto de cada estado que lo indicó, por su c_Estado; los demás, el de su ley.
     */
    @JsonProperty("due_days")
    private Map<String, Object> dueDays;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PayrollTaxSettings setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public PayrollTaxSettings setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public PayrollTaxSettings setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public PayrollTaxSettings setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public PayrollTaxSettings setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * Las percepciones que no suman a la base; null, las comunes.
     */
    public List<String> getExcludedPerceptionTypes() {
        return excludedPerceptionTypes;
    }

    public PayrollTaxSettings setExcludedPerceptionTypes(List<String> excludedPerceptionTypes) {
        this.excludedPerceptionTypes = excludedPerceptionTypes;
        return this;
    }

    /**
     * La opción de tasa de cada estado, por su c_Estado.
     */
    public Map<String, String> getStateOptions() {
        return stateOptions;
    }

    public PayrollTaxSettings setStateOptions(Map<String, String> stateOptions) {
        this.stateOptions = stateOptions;
        return this;
    }

    /**
     * El día del mes siguiente en que se paga el impuesto de cada estado que lo indicó, por su c_Estado; los demás, el de su ley.
     */
    public Map<String, Object> getDueDays() {
        return dueDays;
    }

    public PayrollTaxSettings setDueDays(Map<String, Object> dueDays) {
        this.dueDays = dueDays;
        return this;
    }
}
