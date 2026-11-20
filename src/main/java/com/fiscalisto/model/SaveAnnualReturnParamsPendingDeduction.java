// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SaveAnnualReturnParamsPendingDeduction: SaveAnnualReturnParamsPendingDeduction.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveAnnualReturnParamsPendingDeduction {
    /**
     * El ejercicio en que nació.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Lo que queda por aplicar, actualizado hasta updated_to.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * AAAA-MM de su última actualización: diciembre de su ejercicio si aún no se aplica nada.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("updated_to")
    private String updatedTo;

    /**
     * El ejercicio en que nació.
     * <p>
     * Obligatorio.
     */
    public Long getYear() {
        return year;
    }

    public SaveAnnualReturnParamsPendingDeduction setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public SaveAnnualReturnParamsPendingDeduction setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Lo que queda por aplicar, actualizado hasta updated_to.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public SaveAnnualReturnParamsPendingDeduction setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public SaveAnnualReturnParamsPendingDeduction setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * AAAA-MM de su última actualización: diciembre de su ejercicio si aún no se aplica nada.
     * <p>
     * Obligatorio.
     */
    public String getUpdatedTo() {
        return updatedTo;
    }

    public SaveAnnualReturnParamsPendingDeduction setUpdatedTo(String updatedTo) {
        this.updatedTo = updatedTo;
        return this;
    }
}
