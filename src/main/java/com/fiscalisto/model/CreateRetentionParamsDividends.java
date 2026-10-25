// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateRetentionParamsDividends: Complemento de dividendos.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsDividends {
    /**
     * Tipo de dividendo o utilidad distribuida (CveTipDivOUtil), c_TipoDividendoOUtilidadDistribuida.
     * <p>
     * Valores: 01, 02, 03, 04, 05, 06.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * ISR acreditable en México (MontISRAcredRetMexico).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("isr_mexico")
    private BigDecimal isrMexico;

    /**
     * ISR acreditable en el extranjero (MontISRAcredRetExtranjero).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("isr_foreign")
    private BigDecimal isrForeign;

    /**
     * Retención en el extranjero sobre dividendos (MontRetExtDivExt).
     */
    @JsonProperty("foreign_retention")
    private BigDecimal foreignRetention;

    /**
     * Tipo de sociedad que distribuye (TipoSocDistrDiv): nacional o extranjera.
     * <p>
     * Valores: nacional, extranjera.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("company")
    private String company;

    /**
     * ISR acreditable nacional (MontISRAcredNal).
     */
    @JsonProperty("national_credit")
    private BigDecimal nationalCredit;

    /**
     * Dividendo acumulable nacional (MontDivAcumNal).
     */
    @JsonProperty("accumulated_national")
    private BigDecimal accumulatedNational;

    /**
     * Dividendo acumulable extranjero (MontDivAcumExt).
     */
    @JsonProperty("accumulated_foreign")
    private BigDecimal accumulatedForeign;

    /**
     * Tipo de dividendo o utilidad distribuida (CveTipDivOUtil), c_TipoDividendoOUtilidadDistribuida.
     * <p>
     * Valores: 01, 02, 03, 04, 05, 06.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public CreateRetentionParamsDividends setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * ISR acreditable en México (MontISRAcredRetMexico).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getIsrMexico() {
        return isrMexico;
    }

    public CreateRetentionParamsDividends setIsrMexico(BigDecimal isrMexico) {
        this.isrMexico = isrMexico;
        return this;
    }

    public CreateRetentionParamsDividends setIsrMexico(double isrMexico) {
        return setIsrMexico(BigDecimal.valueOf(isrMexico));
    }

    /**
     * ISR acreditable en el extranjero (MontISRAcredRetExtranjero).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getIsrForeign() {
        return isrForeign;
    }

    public CreateRetentionParamsDividends setIsrForeign(BigDecimal isrForeign) {
        this.isrForeign = isrForeign;
        return this;
    }

    public CreateRetentionParamsDividends setIsrForeign(double isrForeign) {
        return setIsrForeign(BigDecimal.valueOf(isrForeign));
    }

    /**
     * Retención en el extranjero sobre dividendos (MontRetExtDivExt).
     */
    public BigDecimal getForeignRetention() {
        return foreignRetention;
    }

    public CreateRetentionParamsDividends setForeignRetention(BigDecimal foreignRetention) {
        this.foreignRetention = foreignRetention;
        return this;
    }

    public CreateRetentionParamsDividends setForeignRetention(double foreignRetention) {
        return setForeignRetention(BigDecimal.valueOf(foreignRetention));
    }

    /**
     * Tipo de sociedad que distribuye (TipoSocDistrDiv): nacional o extranjera.
     * <p>
     * Valores: nacional, extranjera.
     * <p>
     * Obligatorio.
     */
    public String getCompany() {
        return company;
    }

    public CreateRetentionParamsDividends setCompany(String company) {
        this.company = company;
        return this;
    }

    /**
     * ISR acreditable nacional (MontISRAcredNal).
     */
    public BigDecimal getNationalCredit() {
        return nationalCredit;
    }

    public CreateRetentionParamsDividends setNationalCredit(BigDecimal nationalCredit) {
        this.nationalCredit = nationalCredit;
        return this;
    }

    public CreateRetentionParamsDividends setNationalCredit(double nationalCredit) {
        return setNationalCredit(BigDecimal.valueOf(nationalCredit));
    }

    /**
     * Dividendo acumulable nacional (MontDivAcumNal).
     */
    public BigDecimal getAccumulatedNational() {
        return accumulatedNational;
    }

    public CreateRetentionParamsDividends setAccumulatedNational(BigDecimal accumulatedNational) {
        this.accumulatedNational = accumulatedNational;
        return this;
    }

    public CreateRetentionParamsDividends setAccumulatedNational(double accumulatedNational) {
        return setAccumulatedNational(BigDecimal.valueOf(accumulatedNational));
    }

    /**
     * Dividendo acumulable extranjero (MontDivAcumExt).
     */
    public BigDecimal getAccumulatedForeign() {
        return accumulatedForeign;
    }

    public CreateRetentionParamsDividends setAccumulatedForeign(BigDecimal accumulatedForeign) {
        this.accumulatedForeign = accumulatedForeign;
        return this;
    }

    public CreateRetentionParamsDividends setAccumulatedForeign(double accumulatedForeign) {
        return setAccumulatedForeign(BigDecimal.valueOf(accumulatedForeign));
    }
}
