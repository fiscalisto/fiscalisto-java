// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * PayrollTaxPerception: PayrollTaxPerception.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollTaxPerception {
    /**
     * c_TipoPercepcion.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Su nombre en el catálogo del SAT.
     */
    @JsonProperty("label")
    private String label;

    /**
     * Lo que pagó en el mes.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Si no suma a la base.
     */
    @JsonProperty("excluded")
    private Boolean excluded;

    /**
     * c_TipoPercepcion.
     */
    public String getType() {
        return type;
    }

    public PayrollTaxPerception setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Su nombre en el catálogo del SAT.
     */
    public String getLabel() {
        return label;
    }

    public PayrollTaxPerception setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Lo que pagó en el mes.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public PayrollTaxPerception setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public PayrollTaxPerception setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Si no suma a la base.
     */
    public Boolean getExcluded() {
        return excluded;
    }

    public PayrollTaxPerception setExcluded(Boolean excluded) {
        this.excluded = excluded;
        return this;
    }
}
