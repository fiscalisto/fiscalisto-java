// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SaveAnnualReturnParamsTaxAccountsOpening: SaveAnnualReturnParamsTaxAccountsOpening.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveAnnualReturnParamsTaxAccountsOpening {
    /**
     * La CUFIN de utilidades de 2014 en adelante al cierre del año anterior.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("cufin")
    private BigDecimal cufin;

    /**
     * La CUFIN de utilidades hasta 2013 (transitorio 2014, fr. XXX): sus dividendos no pagan el 10% de las personas físicas.
     */
    @JsonProperty("cufin_2013")
    private BigDecimal cufin2013;

    /**
     * La cuenta de capital de aportación (artículo 78).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("cuca")
    private BigDecimal cuca;

    /**
     * AAAA-MM de la última actualización de la CUFIN, antes de este año.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("cufin_updated_to")
    private String cufinUpdatedTo;

    /**
     * AAAA-MM de la última actualización de la CUCA, antes de este año.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("cuca_updated_to")
    private String cucaUpdatedTo;

    /**
     * La CUFIN de utilidades de 2014 en adelante al cierre del año anterior.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getCufin() {
        return cufin;
    }

    public SaveAnnualReturnParamsTaxAccountsOpening setCufin(BigDecimal cufin) {
        this.cufin = cufin;
        return this;
    }

    @JsonIgnore
    public SaveAnnualReturnParamsTaxAccountsOpening setCufin(double cufin) {
        return setCufin(BigDecimal.valueOf(cufin));
    }

    /**
     * La CUFIN de utilidades hasta 2013 (transitorio 2014, fr. XXX): sus dividendos no pagan el 10% de las personas físicas.
     */
    public BigDecimal getCufin2013() {
        return cufin2013;
    }

    public SaveAnnualReturnParamsTaxAccountsOpening setCufin2013(BigDecimal cufin2013) {
        this.cufin2013 = cufin2013;
        return this;
    }

    @JsonIgnore
    public SaveAnnualReturnParamsTaxAccountsOpening setCufin2013(double cufin2013) {
        return setCufin2013(BigDecimal.valueOf(cufin2013));
    }

    /**
     * La cuenta de capital de aportación (artículo 78).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getCuca() {
        return cuca;
    }

    public SaveAnnualReturnParamsTaxAccountsOpening setCuca(BigDecimal cuca) {
        this.cuca = cuca;
        return this;
    }

    @JsonIgnore
    public SaveAnnualReturnParamsTaxAccountsOpening setCuca(double cuca) {
        return setCuca(BigDecimal.valueOf(cuca));
    }

    /**
     * AAAA-MM de la última actualización de la CUFIN, antes de este año.
     * <p>
     * Obligatorio.
     */
    public String getCufinUpdatedTo() {
        return cufinUpdatedTo;
    }

    public SaveAnnualReturnParamsTaxAccountsOpening setCufinUpdatedTo(String cufinUpdatedTo) {
        this.cufinUpdatedTo = cufinUpdatedTo;
        return this;
    }

    /**
     * AAAA-MM de la última actualización de la CUCA, antes de este año.
     * <p>
     * Obligatorio.
     */
    public String getCucaUpdatedTo() {
        return cucaUpdatedTo;
    }

    public SaveAnnualReturnParamsTaxAccountsOpening setCucaUpdatedTo(String cucaUpdatedTo) {
        this.cucaUpdatedTo = cucaUpdatedTo;
        return this;
    }
}
