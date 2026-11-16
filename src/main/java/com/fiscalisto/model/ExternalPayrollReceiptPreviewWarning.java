// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExternalPayrollReceiptPreviewWarning: ExternalPayrollReceiptPreviewWarning.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalPayrollReceiptPreviewWarning {
    /**
     * El campo de la solicitud.
     */
    @JsonProperty("param")
    private String param;

    /**
     * Clave de la retención (CveRetenc), c_CveRetenc: 01 servicios profesionales, 05 arrendamiento, 14 dividendos, 16 intereses, 18 pagos al extranjero… Las claves 06, 14 a 24 llevan su complemento, como lo pide el catálogo del SAT (share_sale con 06 y 19, dividends con 14, distributable_remainder con 15, interest, trust_lease, foreign_payment, prize, trust, retirement_plan, mortgage_interest, financial_derivatives); 01, 02, 04 y 05 llevan foreign_payment cuando el receptor es extranjero; la 26 (plataformas tecnológicas) lleva platform, y sus totals y taxes se calculan de las operaciones. 27 y 28 no se pueden emitir aquí.
     */
    @JsonProperty("code")
    private String code;

    /**
     * Qué pasó y cómo corregirlo, para una persona.
     */
    @JsonProperty("message")
    private String message;

    /**
     * El campo de la solicitud.
     */
    public String getParam() {
        return param;
    }

    public ExternalPayrollReceiptPreviewWarning setParam(String param) {
        this.param = param;
        return this;
    }

    /**
     * Clave de la retención (CveRetenc), c_CveRetenc: 01 servicios profesionales, 05 arrendamiento, 14 dividendos, 16 intereses, 18 pagos al extranjero… Las claves 06, 14 a 24 llevan su complemento, como lo pide el catálogo del SAT (share_sale con 06 y 19, dividends con 14, distributable_remainder con 15, interest, trust_lease, foreign_payment, prize, trust, retirement_plan, mortgage_interest, financial_derivatives); 01, 02, 04 y 05 llevan foreign_payment cuando el receptor es extranjero; la 26 (plataformas tecnológicas) lleva platform, y sus totals y taxes se calculan de las operaciones. 27 y 28 no se pueden emitir aquí.
     */
    public String getCode() {
        return code;
    }

    public ExternalPayrollReceiptPreviewWarning setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Qué pasó y cómo corregirlo, para una persona.
     */
    public String getMessage() {
        return message;
    }

    public ExternalPayrollReceiptPreviewWarning setMessage(String message) {
        this.message = message;
        return this;
    }
}
