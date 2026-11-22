// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ReviewCycleRulesScale: La escala.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewCycleRulesScale {
    /**
     * Se califica de 1 a max.
     */
    @JsonProperty("max")
    private Long max;

    /**
     * El nombre de cada punto, del 1 al max; vacío: solo los números.
     */
    @JsonProperty("labels")
    private List<String> labels;

    /**
     * Se califica de 1 a max.
     */
    public Long getMax() {
        return max;
    }

    public ReviewCycleRulesScale setMax(Long max) {
        this.max = max;
        return this;
    }

    @JsonIgnore
    public ReviewCycleRulesScale setMax(long max) {
        return setMax(Long.valueOf(max));
    }

    /**
     * El nombre de cada punto, del 1 al max; vacío: solo los números.
     */
    public List<String> getLabels() {
        return labels;
    }

    public ReviewCycleRulesScale setLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }
}
