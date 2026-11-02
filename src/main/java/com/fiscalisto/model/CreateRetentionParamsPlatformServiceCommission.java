// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateRetentionParamsPlatformServiceCommission: CreateRetentionParamsPlatformServiceCommission.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsPlatformServiceCommission {
    /**
     * Importe.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * El porcentaje de la comisión sobre el precio, de 0.001 a 1 (0.25 es 25%). Opcional.
     */
    @JsonProperty("percent")
    private BigDecimal percent;

    /**
     * Importe.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CreateRetentionParamsPlatformServiceCommission setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsPlatformServiceCommission setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * El porcentaje de la comisión sobre el precio, de 0.001 a 1 (0.25 es 25%). Opcional.
     */
    public BigDecimal getPercent() {
        return percent;
    }

    public CreateRetentionParamsPlatformServiceCommission setPercent(BigDecimal percent) {
        this.percent = percent;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsPlatformServiceCommission setPercent(double percent) {
        return setPercent(BigDecimal.valueOf(percent));
    }
}
