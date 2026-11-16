// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CfdiSealsProblem: CfdiSealsProblem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CfdiSealsProblem {
    /**
     * Clave de la retención (CveRetenc), c_CveRetenc: 01 servicios profesionales, 05 arrendamiento, 14 dividendos, 16 intereses, 18 pagos al extranjero… Las claves 06, 14 a 24 llevan su complemento, como lo pide el catálogo del SAT (share_sale con 06 y 19, dividends con 14, distributable_remainder con 15, interest, trust_lease, foreign_payment, prize, trust, retirement_plan, mortgage_interest, financial_derivatives); 01, 02, 04 y 05 llevan foreign_payment cuando el receptor es extranjero; la 26 (plataformas tecnológicas) lleva platform, y sus totals y taxes se calculan de las operaciones. 27 y 28 no se pueden emitir aquí.
     * <p>
     * Valores: malformed_xml, missing_seal, certificate_unreadable, certificate_number_mismatch, certificate_not_issuer, certificate_not_csd, certificate_not_valid_at_issue, seal_mismatch, stamp_not_for_this_seal, sat_seal_mismatch.
     */
    @JsonProperty("code")
    private String code;

    /**
     * Qué pasó y cómo corregirlo, para una persona.
     */
    @JsonProperty("message")
    private String message;

    /**
     * Clave de la retención (CveRetenc), c_CveRetenc: 01 servicios profesionales, 05 arrendamiento, 14 dividendos, 16 intereses, 18 pagos al extranjero… Las claves 06, 14 a 24 llevan su complemento, como lo pide el catálogo del SAT (share_sale con 06 y 19, dividends con 14, distributable_remainder con 15, interest, trust_lease, foreign_payment, prize, trust, retirement_plan, mortgage_interest, financial_derivatives); 01, 02, 04 y 05 llevan foreign_payment cuando el receptor es extranjero; la 26 (plataformas tecnológicas) lleva platform, y sus totals y taxes se calculan de las operaciones. 27 y 28 no se pueden emitir aquí.
     * <p>
     * Valores: malformed_xml, missing_seal, certificate_unreadable, certificate_number_mismatch, certificate_not_issuer, certificate_not_csd, certificate_not_valid_at_issue, seal_mismatch, stamp_not_for_this_seal, sat_seal_mismatch.
     */
    public String getCode() {
        return code;
    }

    public CfdiSealsProblem setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Qué pasó y cómo corregirlo, para una persona.
     */
    public String getMessage() {
        return message;
    }

    public CfdiSealsProblem setMessage(String message) {
        this.message = message;
        return this;
    }
}
