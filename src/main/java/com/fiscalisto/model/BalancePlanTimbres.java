// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BalancePlanTimbres: BalancePlanTimbres.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BalancePlanTimbres {
    /**
     * El plan de la empresa (despacho, negocio…).
     */
    @JsonProperty("plan")
    private String plan;

    /**
     * Los que le quedan este mes.
     */
    @JsonProperty("remaining")
    private Long remaining;

    /**
     * Los que trae el plan cada mes.
     */
    @JsonProperty("included")
    private Long included;

    /**
     * El día en que vuelven a estar completos (AAAA-MM-DD).
     */
    @JsonProperty("resets_on")
    private String resetsOn;

    /**
     * El plan de la empresa (despacho, negocio…).
     */
    public String getPlan() {
        return plan;
    }

    public BalancePlanTimbres setPlan(String plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Los que le quedan este mes.
     */
    public Long getRemaining() {
        return remaining;
    }

    public BalancePlanTimbres setRemaining(Long remaining) {
        this.remaining = remaining;
        return this;
    }

    @JsonIgnore
    public BalancePlanTimbres setRemaining(long remaining) {
        return setRemaining(Long.valueOf(remaining));
    }

    /**
     * Los que trae el plan cada mes.
     */
    public Long getIncluded() {
        return included;
    }

    public BalancePlanTimbres setIncluded(Long included) {
        this.included = included;
        return this;
    }

    @JsonIgnore
    public BalancePlanTimbres setIncluded(long included) {
        return setIncluded(Long.valueOf(included));
    }

    /**
     * El día en que vuelven a estar completos (AAAA-MM-DD).
     */
    public String getResetsOn() {
        return resetsOn;
    }

    public BalancePlanTimbres setResetsOn(String resetsOn) {
        this.resetsOn = resetsOn;
        return this;
    }
}
