// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CfdiVerificationSat: La respuesta del SAT tal cual (CodigoEstatus, Estado, EsCancelable, EstatusCancelacion, ValidacionEFOS), por si la necesita igual que el SAT.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CfdiVerificationSat {
    /**
     * Clave de la retención (CveRetenc), c_CveRetenc: 01 servicios profesionales, 05 arrendamiento, 14 dividendos, 16 intereses, 18 pagos al extranjero… Las claves 14, 16, 17 y 18 a 24 llevan su complemento (dividends, interest, trust_lease, foreign_payment, share_sale, prize, trust, retirement_plan, mortgage_interest, financial_derivatives); la 26 (plataformas tecnológicas) lleva platform, y sus totals y taxes se calculan de las operaciones.
     */
    @JsonProperty("code")
    private String code;

    /**
     * Entidad federativa donde trabaja (ClaveEntFed): JAL, CMX, NLE…
     */
    @JsonProperty("state")
    private String state;

    /**
     * EsCancelable, tal cual lo dijo el SAT.
     */
    @JsonProperty("cancellable")
    private String cancellable;

    /**
     * EstatusCancelacion, tal cual lo dijo el SAT.
     */
    @JsonProperty("cancellation_status")
    private String cancellationStatus;

    /**
     * ValidacionEFOS: 200 si el emisor no es EFOS, 100 si lo es.
     */
    @JsonProperty("efos_validation")
    private String efosValidation;

    /**
     * Clave de la retención (CveRetenc), c_CveRetenc: 01 servicios profesionales, 05 arrendamiento, 14 dividendos, 16 intereses, 18 pagos al extranjero… Las claves 14, 16, 17 y 18 a 24 llevan su complemento (dividends, interest, trust_lease, foreign_payment, share_sale, prize, trust, retirement_plan, mortgage_interest, financial_derivatives); la 26 (plataformas tecnológicas) lleva platform, y sus totals y taxes se calculan de las operaciones.
     */
    public String getCode() {
        return code;
    }

    public CfdiVerificationSat setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Entidad federativa donde trabaja (ClaveEntFed): JAL, CMX, NLE…
     */
    public String getState() {
        return state;
    }

    public CfdiVerificationSat setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * EsCancelable, tal cual lo dijo el SAT.
     */
    public String getCancellable() {
        return cancellable;
    }

    public CfdiVerificationSat setCancellable(String cancellable) {
        this.cancellable = cancellable;
        return this;
    }

    /**
     * EstatusCancelacion, tal cual lo dijo el SAT.
     */
    public String getCancellationStatus() {
        return cancellationStatus;
    }

    public CfdiVerificationSat setCancellationStatus(String cancellationStatus) {
        this.cancellationStatus = cancellationStatus;
        return this;
    }

    /**
     * ValidacionEFOS: 200 si el emisor no es EFOS, 100 si lo es.
     */
    public String getEfosValidation() {
        return efosValidation;
    }

    public CfdiVerificationSat setEfosValidation(String efosValidation) {
        this.efosValidation = efosValidation;
        return this;
    }
}
