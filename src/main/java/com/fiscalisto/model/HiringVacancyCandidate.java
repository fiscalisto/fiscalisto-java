// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HiringVacancyCandidate: HiringVacancyCandidate.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class HiringVacancyCandidate {
    /**
     * La etapa.
     */
    @JsonProperty("stage")
    private String stage;

    /**
     * Cuántos hay en ella.
     */
    @JsonProperty("count")
    private Long count;

    /**
     * La etapa.
     */
    public String getStage() {
        return stage;
    }

    public HiringVacancyCandidate setStage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * Cuántos hay en ella.
     */
    public Long getCount() {
        return count;
    }

    public HiringVacancyCandidate setCount(Long count) {
        this.count = count;
        return this;
    }

    @JsonIgnore
    public HiringVacancyCandidate setCount(long count) {
        return setCount(Long.valueOf(count));
    }
}
