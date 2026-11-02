// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateRetentionParamsPlatformServiceContribution: CreateRetentionParamsPlatformServiceContribution.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsPlatformServiceContribution {
    /**
     * Importe.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Entidad federativa donde trabaja (ClaveEntFed): JAL, CMX, NLE…
     * <p>
     * Obligatorio.
     */
    @JsonProperty("state")
    private String state;

    /**
     * Importe.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CreateRetentionParamsPlatformServiceContribution setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsPlatformServiceContribution setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Entidad federativa donde trabaja (ClaveEntFed): JAL, CMX, NLE…
     * <p>
     * Obligatorio.
     */
    public String getState() {
        return state;
    }

    public CreateRetentionParamsPlatformServiceContribution setState(String state) {
        this.state = state;
        return this;
    }
}
