// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateRetentionParamsTrustIncome: Ingresos o entradas del fideicomiso en el periodo (IngresosOEntradas) y la parte del receptor.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsTrustIncome {
    /**
     * Concepto de los ingresos (IntegracIngresos/Concepto), hasta 100 caracteres.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("concept")
    private String concept;

    /**
     * Ingresos totales del fideicomiso en el periodo (MontTotEntradasPeriodo).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Parte proporcional de los ingresos acumulables del receptor (PartPropAcumDelFideicom).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("share")
    private BigDecimal share;

    /**
     * Proporción de participación del receptor según el contrato (PropDelMontTot).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("proportion")
    private BigDecimal proportion;

    /**
     * Concepto de los ingresos (IntegracIngresos/Concepto), hasta 100 caracteres.
     * <p>
     * Obligatorio.
     */
    public String getConcept() {
        return concept;
    }

    public CreateRetentionParamsTrustIncome setConcept(String concept) {
        this.concept = concept;
        return this;
    }

    /**
     * Ingresos totales del fideicomiso en el periodo (MontTotEntradasPeriodo).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public CreateRetentionParamsTrustIncome setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsTrustIncome setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Parte proporcional de los ingresos acumulables del receptor (PartPropAcumDelFideicom).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getShare() {
        return share;
    }

    public CreateRetentionParamsTrustIncome setShare(BigDecimal share) {
        this.share = share;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsTrustIncome setShare(double share) {
        return setShare(BigDecimal.valueOf(share));
    }

    /**
     * Proporción de participación del receptor según el contrato (PropDelMontTot).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getProportion() {
        return proportion;
    }

    public CreateRetentionParamsTrustIncome setProportion(BigDecimal proportion) {
        this.proportion = proportion;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsTrustIncome setProportion(double proportion) {
        return setProportion(BigDecimal.valueOf(proportion));
    }
}
