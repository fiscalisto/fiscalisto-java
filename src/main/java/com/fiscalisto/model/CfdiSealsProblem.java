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
     * Clave de la retención (CveRetenc), c_CveRetenc: 01 servicios profesionales, 05 arrendamiento, 14 dividendos, 16 intereses, 18 pagos al extranjero… Las claves 14, 16, 17 y 18 a 24 llevan su complemento (dividends, interest, trust_lease, foreign_payment, share_sale, prize, trust, retirement_plan, mortgage_interest, financial_derivatives); la 26 (plataformas tecnológicas) lleva platform, y sus totals y taxes se calculan de las operaciones.
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
     * Clave de la retención (CveRetenc), c_CveRetenc: 01 servicios profesionales, 05 arrendamiento, 14 dividendos, 16 intereses, 18 pagos al extranjero… Las claves 14, 16, 17 y 18 a 24 llevan su complemento (dividends, interest, trust_lease, foreign_payment, share_sale, prize, trust, retirement_plan, mortgage_interest, financial_derivatives); la 26 (plataformas tecnológicas) lleva platform, y sus totals y taxes se calculan de las operaciones.
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
