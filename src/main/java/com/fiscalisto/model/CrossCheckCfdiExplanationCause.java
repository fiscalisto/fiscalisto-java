// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CrossCheckCfdiExplanationCause: CrossCheckCfdiExplanationCause.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossCheckCfdiExplanationCause {
    /**
     * El motivo que comparten.
     * <p>
     * Valores: cancelled, ppd_not_collected, other_month, month_edge, credit_note, ppd_payment, duplicate, left_out, withholding_certificate.
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * La suma de su effect.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Sus CFDI.
     */
    @JsonProperty("cfdi")
    private List<CrossCheckCfdiExplanationCauseCfdiItem> cfdi;

    /**
     * El motivo que comparten.
     * <p>
     * Valores: cancelled, ppd_not_collected, other_month, month_edge, credit_note, ppd_payment, duplicate, left_out, withholding_certificate.
     */
    public String getReason() {
        return reason;
    }

    public CrossCheckCfdiExplanationCause setReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * La suma de su effect.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public CrossCheckCfdiExplanationCause setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public CrossCheckCfdiExplanationCause setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Sus CFDI.
     */
    public List<CrossCheckCfdiExplanationCauseCfdiItem> getCfdi() {
        return cfdi;
    }

    public CrossCheckCfdiExplanationCause setCfdi(List<CrossCheckCfdiExplanationCauseCfdiItem> cfdi) {
        this.cfdi = cfdi;
        return this;
    }
}
