// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.util.List;

/**
 * SatRiskCheck: Revise como el SAT: lo que los sistemas del SAT cruzan para mandar cartas invitación y escoger a quién revisar, con lo que Fiscalisto ya leyó del emisor. No consulta al SAT.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatRiskCheck {
    /**
     * Siempre sat_risk_check.
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private StringOr<Issuer> issuer;

    /**
     * Su RFC.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Cuántas revisiones salen para atender ya.
     */
    @JsonProperty("critical")
    private Long critical;

    /**
     * Cuántas salen para revisar.
     */
    @JsonProperty("warning")
    private Long warning;

    /**
     * Cada cruce, los que hay que atender primero.
     */
    @JsonProperty("checks")
    private List<SatRiskCheckCheck> checks;

    /**
     * Siempre sat_risk_check.
     */
    public String getObject() {
        return object;
    }

    public SatRiskCheck setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public SatRiskCheck setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public SatRiskCheck setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public SatRiskCheck setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public SatRiskCheck setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * Su RFC.
     */
    public String getTaxId() {
        return taxId;
    }

    public SatRiskCheck setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Cuántas revisiones salen para atender ya.
     */
    public Long getCritical() {
        return critical;
    }

    public SatRiskCheck setCritical(Long critical) {
        this.critical = critical;
        return this;
    }

    @JsonIgnore
    public SatRiskCheck setCritical(long critical) {
        return setCritical(Long.valueOf(critical));
    }

    /**
     * Cuántas salen para revisar.
     */
    public Long getWarning() {
        return warning;
    }

    public SatRiskCheck setWarning(Long warning) {
        this.warning = warning;
        return this;
    }

    @JsonIgnore
    public SatRiskCheck setWarning(long warning) {
        return setWarning(Long.valueOf(warning));
    }

    /**
     * Cada cruce, los que hay que atender primero.
     */
    public List<SatRiskCheckCheck> getChecks() {
        return checks;
    }

    public SatRiskCheck setChecks(List<SatRiskCheckCheck> checks) {
        this.checks = checks;
        return this;
    }
}
