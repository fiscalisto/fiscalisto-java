// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * AnnualReturnTaxAccountsYearEnd: Los saldos al 31 de diciembre, actualizados y con la utilidad fiscal neta del año.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnualReturnTaxAccountsYearEnd {
    /**
     * La CUFIN de 2014 en adelante.
     */
    @JsonProperty("cufin")
    private BigDecimal cufin;

    /**
     * La CUFIN hasta 2013.
     */
    @JsonProperty("cufin_2013")
    private BigDecimal cufin2013;

    /**
     * La cuenta de capital de aportación.
     */
    @JsonProperty("cuca")
    private BigDecimal cuca;

    /**
     * AAAA-MM de la última actualización de la CUFIN.
     */
    @JsonProperty("cufin_updated_to")
    private String cufinUpdatedTo;

    /**
     * AAAA-MM de la última actualización de la CUCA.
     */
    @JsonProperty("cuca_updated_to")
    private String cucaUpdatedTo;

    /**
     * La CUFIN de 2014 en adelante.
     */
    public BigDecimal getCufin() {
        return cufin;
    }

    public AnnualReturnTaxAccountsYearEnd setCufin(BigDecimal cufin) {
        this.cufin = cufin;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccountsYearEnd setCufin(double cufin) {
        return setCufin(BigDecimal.valueOf(cufin));
    }

    /**
     * La CUFIN hasta 2013.
     */
    public BigDecimal getCufin2013() {
        return cufin2013;
    }

    public AnnualReturnTaxAccountsYearEnd setCufin2013(BigDecimal cufin2013) {
        this.cufin2013 = cufin2013;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccountsYearEnd setCufin2013(double cufin2013) {
        return setCufin2013(BigDecimal.valueOf(cufin2013));
    }

    /**
     * La cuenta de capital de aportación.
     */
    public BigDecimal getCuca() {
        return cuca;
    }

    public AnnualReturnTaxAccountsYearEnd setCuca(BigDecimal cuca) {
        this.cuca = cuca;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccountsYearEnd setCuca(double cuca) {
        return setCuca(BigDecimal.valueOf(cuca));
    }

    /**
     * AAAA-MM de la última actualización de la CUFIN.
     */
    public String getCufinUpdatedTo() {
        return cufinUpdatedTo;
    }

    public AnnualReturnTaxAccountsYearEnd setCufinUpdatedTo(String cufinUpdatedTo) {
        this.cufinUpdatedTo = cufinUpdatedTo;
        return this;
    }

    /**
     * AAAA-MM de la última actualización de la CUCA.
     */
    public String getCucaUpdatedTo() {
        return cucaUpdatedTo;
    }

    public AnnualReturnTaxAccountsYearEnd setCucaUpdatedTo(String cucaUpdatedTo) {
        this.cucaUpdatedTo = cucaUpdatedTo;
        return this;
    }
}
