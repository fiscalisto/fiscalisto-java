// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * UpdateCashForecastParams: los campos de «Dar el saldo de hoy».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateCashForecastParams {
    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El saldo de hoy en sus cuentas de banco; null lo quita.
     */
    @JsonProperty("starting_balance")
    private UpdateCashForecastParamsStartingBalance startingBalance;

    /**
     * Lo menos que quiere tener: cada semana debajo trae un aviso. 0 para ninguno.
     */
    @JsonProperty("minimum_balance")
    private BigDecimal minimumBalance;

    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    public String getIssuer() {
        return issuer;
    }

    public UpdateCashForecastParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El saldo de hoy en sus cuentas de banco; null lo quita.
     */
    public UpdateCashForecastParamsStartingBalance getStartingBalance() {
        return startingBalance;
    }

    public UpdateCashForecastParams setStartingBalance(UpdateCashForecastParamsStartingBalance startingBalance) {
        this.startingBalance = startingBalance;
        return this;
    }

    /**
     * Lo menos que quiere tener: cada semana debajo trae un aviso. 0 para ninguno.
     */
    public BigDecimal getMinimumBalance() {
        return minimumBalance;
    }

    public UpdateCashForecastParams setMinimumBalance(BigDecimal minimumBalance) {
        this.minimumBalance = minimumBalance;
        return this;
    }

    @JsonIgnore
    public UpdateCashForecastParams setMinimumBalance(double minimumBalance) {
        return setMinimumBalance(BigDecimal.valueOf(minimumBalance));
    }
}
