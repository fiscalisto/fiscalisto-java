// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ClimateSettings: Lo que se configura en POST /v1/climate/policy.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimateSettings {
    /**
     * La política de prevención de riesgos psicosociales (numeral 5.1).
     */
    @JsonProperty("policy")
    private String policy;

    /**
     * La versión publicada (0: ninguna).
     */
    @JsonProperty("policy_version")
    private Long policyVersion;

    /**
     * Cuándo se publicó.
     */
    @JsonProperty("policy_published_at")
    private String policyPublishedAt;

    /**
     * Con quién más presentar una queja, además del buzón.
     */
    @JsonProperty("complaints_contact")
    private String complaintsContact;

    /**
     * Quienes leyeron la versión publicada (numeral 5.7 a)).
     */
    @JsonProperty("policy_reads")
    private Long policyReads;

    /**
     * Quienes trabajan hoy en el emisor.
     */
    @JsonProperty("workers")
    private Long workers;

    /**
     * La política de prevención de riesgos psicosociales (numeral 5.1).
     */
    public String getPolicy() {
        return policy;
    }

    public ClimateSettings setPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * La versión publicada (0: ninguna).
     */
    public Long getPolicyVersion() {
        return policyVersion;
    }

    public ClimateSettings setPolicyVersion(Long policyVersion) {
        this.policyVersion = policyVersion;
        return this;
    }

    @JsonIgnore
    public ClimateSettings setPolicyVersion(long policyVersion) {
        return setPolicyVersion(Long.valueOf(policyVersion));
    }

    /**
     * Cuándo se publicó.
     */
    public String getPolicyPublishedAt() {
        return policyPublishedAt;
    }

    public ClimateSettings setPolicyPublishedAt(String policyPublishedAt) {
        this.policyPublishedAt = policyPublishedAt;
        return this;
    }

    /**
     * Con quién más presentar una queja, además del buzón.
     */
    public String getComplaintsContact() {
        return complaintsContact;
    }

    public ClimateSettings setComplaintsContact(String complaintsContact) {
        this.complaintsContact = complaintsContact;
        return this;
    }

    /**
     * Quienes leyeron la versión publicada (numeral 5.7 a)).
     */
    public Long getPolicyReads() {
        return policyReads;
    }

    public ClimateSettings setPolicyReads(Long policyReads) {
        this.policyReads = policyReads;
        return this;
    }

    @JsonIgnore
    public ClimateSettings setPolicyReads(long policyReads) {
        return setPolicyReads(Long.valueOf(policyReads));
    }

    /**
     * Quienes trabajan hoy en el emisor.
     */
    public Long getWorkers() {
        return workers;
    }

    public ClimateSettings setWorkers(Long workers) {
        this.workers = workers;
        return this;
    }

    @JsonIgnore
    public ClimateSettings setWorkers(long workers) {
        return setWorkers(Long.valueOf(workers));
    }
}
