// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * CreatePayrollPayoutParams: los campos de «Pagar la nómina por transferencia».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePayrollPayoutParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * La fecha de pago (FechaPago) de los recibos de nómina timbrados que paga (AAAA-MM-DD).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("payment_date")
    private String paymentDate;

    /**
     * El día en que sale (AAAA-MM-DD, hoy o después). Por omisión, hoy: sale en cuanto lo firmen.
     */
    @JsonProperty("pay_on")
    private String payOn;

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreatePayrollPayoutParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * La fecha de pago (FechaPago) de los recibos de nómina timbrados que paga (AAAA-MM-DD).
     * <p>
     * Obligatorio.
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    public CreatePayrollPayoutParams setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    /**
     * El día en que sale (AAAA-MM-DD, hoy o después). Por omisión, hoy: sale en cuanto lo firmen.
     */
    public String getPayOn() {
        return payOn;
    }

    public CreatePayrollPayoutParams setPayOn(String payOn) {
        this.payOn = payOn;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public CreatePayrollPayoutParams setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
