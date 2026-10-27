// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateRetentionParamsTrustDeductions: Deducciones o salidas del fideicomiso en el periodo (DeduccOSalidas) y la parte del receptor.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsTrustDeductions {
    /**
     * Concepto de los egresos (IntegracEgresos/ConceptoS), hasta 100 caracteres.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("concept")
    private String concept;

    /**
     * Egresos totales del fideicomiso en el periodo (MontTotEgresPeriodo).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Parte proporcional de las deducciones autorizadas del receptor (PartPropDelFideicom).
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
     * Concepto de los egresos (IntegracEgresos/ConceptoS), hasta 100 caracteres.
     * <p>
     * Obligatorio.
     */
    public String getConcept() {
        return concept;
    }

    public CreateRetentionParamsTrustDeductions setConcept(String concept) {
        this.concept = concept;
        return this;
    }

    /**
     * Egresos totales del fideicomiso en el periodo (MontTotEgresPeriodo).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public CreateRetentionParamsTrustDeductions setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsTrustDeductions setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Parte proporcional de las deducciones autorizadas del receptor (PartPropDelFideicom).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getShare() {
        return share;
    }

    public CreateRetentionParamsTrustDeductions setShare(BigDecimal share) {
        this.share = share;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsTrustDeductions setShare(double share) {
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

    public CreateRetentionParamsTrustDeductions setProportion(BigDecimal proportion) {
        this.proportion = proportion;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsTrustDeductions setProportion(double proportion) {
        return setProportion(BigDecimal.valueOf(proportion));
    }
}
