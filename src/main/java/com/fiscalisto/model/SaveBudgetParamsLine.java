// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * SaveBudgetParamsLine: SaveBudgetParamsLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveBudgetParamsLine {
    /**
     * El número de una cuenta de resultados (código agrupador 4 a 7) de su catálogo, por ejemplo 601-84.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("account")
    private String account;

    /**
     * Los 12 meses, de enero a diciembre, en pesos y en la naturaleza de la cuenta: un ingreso como ingreso, un gasto como gasto.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("months")
    private List<BigDecimal> months;

    /**
     * El número de una cuenta de resultados (código agrupador 4 a 7) de su catálogo, por ejemplo 601-84.
     * <p>
     * Obligatorio.
     */
    public String getAccount() {
        return account;
    }

    public SaveBudgetParamsLine setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * Los 12 meses, de enero a diciembre, en pesos y en la naturaleza de la cuenta: un ingreso como ingreso, un gasto como gasto.
     * <p>
     * Obligatorio.
     */
    public List<BigDecimal> getMonths() {
        return months;
    }

    public SaveBudgetParamsLine setMonths(List<BigDecimal> months) {
        this.months = months;
        return this;
    }
}
