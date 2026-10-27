// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateRetentionParamsTrustWithholding: Retención efectuada al fideicomiso (RetEfectFideicomiso).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsTrustWithholding {
    /**
     * Monto de la retención (MontRetRelPagFideic).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Descripción de la retención (DescRetRelPagFideic), hasta 100 caracteres.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Monto de la retención (MontRetRelPagFideic).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CreateRetentionParamsTrustWithholding setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsTrustWithholding setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Descripción de la retención (DescRetRelPagFideic), hasta 100 caracteres.
     * <p>
     * Obligatorio.
     */
    public String getDescription() {
        return description;
    }

    public CreateRetentionParamsTrustWithholding setDescription(String description) {
        this.description = description;
        return this;
    }
}
