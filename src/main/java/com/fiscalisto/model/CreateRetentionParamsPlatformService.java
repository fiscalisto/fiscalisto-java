// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateRetentionParamsPlatformService: CreateRetentionParamsPlatformService.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsPlatformService {
    /**
     * Fecha en que el cliente pagó (FechaServ), AAAA-MM-DD, dentro del mes del periodo.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Forma de pago de la operación (FormaPagoServ), c_FormaPagoServ: 01 efectivo, 02 transferencia, 03 tarjeta de crédito, 04 monedero, 05 dinero electrónico, 06 débito, 07 tarjeta de servicios, 08 intermediario de pagos, 09 premios o bonificaciones.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("payment_form")
    private String paymentForm;

    /**
     * Precio sin IVA (PrecioServSinIVA).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("price")
    private BigDecimal price;

    /**
     * Tasa del impuesto trasladado (TasaCuota): 0.16 (por omisión), 0.08 o 0 de IVA; 0.5 de IEPS solo con type 11, donde cada jugada va dos veces: una operación con su IVA y otra con su IEPS (el SAT pide un impuesto por operación). Sin tasa en premios (09), que desde 2026 no suman en totals.
     */
    @JsonProperty("rate")
    private Object rate;

    /**
     * Subtipo (SubTipServ), c_SubTipoServ: con type 01, 01 personal (por omisión), 02 compartido, 03 plus o 04 cancelación; con type 11, 08 apuestas (por omisión) o 09 sorteos.
     */
    @JsonProperty("subtype")
    private String subtype;

    /**
     * RFC (persona física) del tercero autorizado que prestó el servicio (RFCTerceroAutorizado).
     */
    @JsonProperty("authorized_tax_id")
    private String authorizedTaxId;

    /**
     * Comisión de la plataforma por la operación (ComisionDelServicio): amount mayor que cero y percent opcional (0.001 a 1). Obligatoria en cada operación con IVA; no va en premios ni en las de IEPS.
     */
    @JsonProperty("commission")
    private CreateRetentionParamsPlatformServiceCommission commission;

    /**
     * Contribución gubernamental pagada, como el impuesto sobre hospedaje (ContribucionGubernamental): amount de al menos 1.00 y state (01 a 32).
     */
    @JsonProperty("contribution")
    private CreateRetentionParamsPlatformServiceContribution contribution;

    /**
     * Fecha en que el cliente pagó (FechaServ), AAAA-MM-DD, dentro del mes del periodo.
     * <p>
     * Obligatorio.
     */
    public String getDate() {
        return date;
    }

    public CreateRetentionParamsPlatformService setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Forma de pago de la operación (FormaPagoServ), c_FormaPagoServ: 01 efectivo, 02 transferencia, 03 tarjeta de crédito, 04 monedero, 05 dinero electrónico, 06 débito, 07 tarjeta de servicios, 08 intermediario de pagos, 09 premios o bonificaciones.
     * <p>
     * Obligatorio.
     */
    public String getPaymentForm() {
        return paymentForm;
    }

    public CreateRetentionParamsPlatformService setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
        return this;
    }

    /**
     * Precio sin IVA (PrecioServSinIVA).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getPrice() {
        return price;
    }

    public CreateRetentionParamsPlatformService setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    @JsonIgnore
    public CreateRetentionParamsPlatformService setPrice(double price) {
        return setPrice(BigDecimal.valueOf(price));
    }

    /**
     * Tasa del impuesto trasladado (TasaCuota): 0.16 (por omisión), 0.08 o 0 de IVA; 0.5 de IEPS solo con type 11, donde cada jugada va dos veces: una operación con su IVA y otra con su IEPS (el SAT pide un impuesto por operación). Sin tasa en premios (09), que desde 2026 no suman en totals.
     */
    public Object getRate() {
        return rate;
    }

    public CreateRetentionParamsPlatformService setRate(Object rate) {
        this.rate = rate;
        return this;
    }

    /**
     * Subtipo (SubTipServ), c_SubTipoServ: con type 01, 01 personal (por omisión), 02 compartido, 03 plus o 04 cancelación; con type 11, 08 apuestas (por omisión) o 09 sorteos.
     */
    public String getSubtype() {
        return subtype;
    }

    public CreateRetentionParamsPlatformService setSubtype(String subtype) {
        this.subtype = subtype;
        return this;
    }

    /**
     * RFC (persona física) del tercero autorizado que prestó el servicio (RFCTerceroAutorizado).
     */
    public String getAuthorizedTaxId() {
        return authorizedTaxId;
    }

    public CreateRetentionParamsPlatformService setAuthorizedTaxId(String authorizedTaxId) {
        this.authorizedTaxId = authorizedTaxId;
        return this;
    }

    /**
     * Comisión de la plataforma por la operación (ComisionDelServicio): amount mayor que cero y percent opcional (0.001 a 1). Obligatoria en cada operación con IVA; no va en premios ni en las de IEPS.
     */
    public CreateRetentionParamsPlatformServiceCommission getCommission() {
        return commission;
    }

    public CreateRetentionParamsPlatformService setCommission(CreateRetentionParamsPlatformServiceCommission commission) {
        this.commission = commission;
        return this;
    }

    /**
     * Contribución gubernamental pagada, como el impuesto sobre hospedaje (ContribucionGubernamental): amount de al menos 1.00 y state (01 a 32).
     */
    public CreateRetentionParamsPlatformServiceContribution getContribution() {
        return contribution;
    }

    public CreateRetentionParamsPlatformService setContribution(CreateRetentionParamsPlatformServiceContribution contribution) {
        this.contribution = contribution;
        return this;
    }
}
