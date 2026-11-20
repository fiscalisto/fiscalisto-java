// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * AnnualReturnCarryForwardLoss: AnnualReturnCarryForwardLoss.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnualReturnCarryForwardLoss {
    /**
     * El ejercicio en que nació.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Lo que queda por aplicar, actualizado hasta updated_to.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * AAAA-MM de su última actualización.
     */
    @JsonProperty("updated_to")
    private String updatedTo;

    /**
     * El ejercicio en que nació.
     */
    public Long getYear() {
        return year;
    }

    public AnnualReturnCarryForwardLoss setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public AnnualReturnCarryForwardLoss setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Lo que queda por aplicar, actualizado hasta updated_to.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public AnnualReturnCarryForwardLoss setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public AnnualReturnCarryForwardLoss setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * AAAA-MM de su última actualización.
     */
    public String getUpdatedTo() {
        return updatedTo;
    }

    public AnnualReturnCarryForwardLoss setUpdatedTo(String updatedTo) {
        this.updatedTo = updatedTo;
        return this;
    }
}
