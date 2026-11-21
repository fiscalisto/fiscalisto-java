// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListCandidatesParams: los campos de «Listar candidatos».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListCandidatesParams {
    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    @JsonProperty("limit")
    private Long limit;

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    @JsonProperty("starting_after")
    private String startingAfter;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Solo las de una vacante (vac_…).
     */
    @JsonProperty("vacancy")
    private String vacancy;

    /**
     * Solo las de una etapa, como en stages de hiring.
     */
    @JsonProperty("stage")
    private String stage;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListCandidatesParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListCandidatesParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListCandidatesParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListCandidatesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Solo las de una vacante (vac_…).
     */
    public String getVacancy() {
        return vacancy;
    }

    public ListCandidatesParams setVacancy(String vacancy) {
        this.vacancy = vacancy;
        return this;
    }

    /**
     * Solo las de una etapa, como en stages de hiring.
     */
    public String getStage() {
        return stage;
    }

    public ListCandidatesParams setStage(String stage) {
        this.stage = stage;
        return this;
    }
}
