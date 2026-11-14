// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CfdiSealsStamp: CfdiSealsStamp.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CfdiSealsStamp {
    /**
     * Si el SelloSAT firma el timbre con el certificado del SAT (NoCertificadoSAT). null si el certificado del SAT no se pudo obtener en ese momento.
     */
    @JsonProperty("sat_seal_valid")
    private Boolean satSealValid;

    /**
     * El número del certificado del SAT que selló el timbre.
     */
    @JsonProperty("sat_certificate_number")
    private String satCertificateNumber;

    /**
     * El RFC del PAC que timbró (RfcProvCertif).
     */
    @JsonProperty("pac_tax_id")
    private String pacTaxId;

    /**
     * Si el SelloSAT firma el timbre con el certificado del SAT (NoCertificadoSAT). null si el certificado del SAT no se pudo obtener en ese momento.
     */
    public Boolean getSatSealValid() {
        return satSealValid;
    }

    public CfdiSealsStamp setSatSealValid(Boolean satSealValid) {
        this.satSealValid = satSealValid;
        return this;
    }

    /**
     * El número del certificado del SAT que selló el timbre.
     */
    public String getSatCertificateNumber() {
        return satCertificateNumber;
    }

    public CfdiSealsStamp setSatCertificateNumber(String satCertificateNumber) {
        this.satCertificateNumber = satCertificateNumber;
        return this;
    }

    /**
     * El RFC del PAC que timbró (RfcProvCertif).
     */
    public String getPacTaxId() {
        return pacTaxId;
    }

    public CfdiSealsStamp setPacTaxId(String pacTaxId) {
        this.pacTaxId = pacTaxId;
        return this;
    }
}
