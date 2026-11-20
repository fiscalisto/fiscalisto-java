// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * AnnualReturnTaxAccountsOpening: Los saldos al inicio del año.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AnnualReturnTaxAccountsOpening {
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

    public AnnualReturnTaxAccountsOpening setCufin(BigDecimal cufin) {
        this.cufin = cufin;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccountsOpening setCufin(double cufin) {
        return setCufin(BigDecimal.valueOf(cufin));
    }

    /**
     * La CUFIN hasta 2013.
     */
    public BigDecimal getCufin2013() {
        return cufin2013;
    }

    public AnnualReturnTaxAccountsOpening setCufin2013(BigDecimal cufin2013) {
        this.cufin2013 = cufin2013;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccountsOpening setCufin2013(double cufin2013) {
        return setCufin2013(BigDecimal.valueOf(cufin2013));
    }

    /**
     * La cuenta de capital de aportación.
     */
    public BigDecimal getCuca() {
        return cuca;
    }

    public AnnualReturnTaxAccountsOpening setCuca(BigDecimal cuca) {
        this.cuca = cuca;
        return this;
    }

    @JsonIgnore
    public AnnualReturnTaxAccountsOpening setCuca(double cuca) {
        return setCuca(BigDecimal.valueOf(cuca));
    }

    /**
     * AAAA-MM de la última actualización de la CUFIN.
     */
    public String getCufinUpdatedTo() {
        return cufinUpdatedTo;
    }

    public AnnualReturnTaxAccountsOpening setCufinUpdatedTo(String cufinUpdatedTo) {
        this.cufinUpdatedTo = cufinUpdatedTo;
        return this;
    }

    /**
     * AAAA-MM de la última actualización de la CUCA.
     */
    public String getCucaUpdatedTo() {
        return cucaUpdatedTo;
    }

    public AnnualReturnTaxAccountsOpening setCucaUpdatedTo(String cucaUpdatedTo) {
        this.cucaUpdatedTo = cucaUpdatedTo;
        return this;
    }
}
