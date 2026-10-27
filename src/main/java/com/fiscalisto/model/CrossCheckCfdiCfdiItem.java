// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CrossCheckCfdiCfdiItem: CrossCheckCfdiCfdiItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossCheckCfdiCfdiItem {
    /**
     * El folio fiscal (UUID) del CFDI; el de la factura PPD en un pago.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * invoice (factura de ingreso, PUE), credit_note (nota de crédito: resta) o payment (lo pagado en el mes de una factura PPD).
     * <p>
     * Valores: invoice, credit_note, payment, withholding_certificate.
     */
    @JsonProperty("type")
    private String type;

    /**
     * La fecha del CFDI, o la del pago (AAAA-MM-DD).
     */
    @JsonProperty("date")
    private String date;

    /**
     * El RFC de la contraparte: el cliente en lo emitido, el proveedor en lo recibido.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * El nombre de la contraparte, como viene en el CFDI.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Lo que aporta a la cifra, en pesos; negativo en una nota de crédito.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * El folio fiscal (UUID) del CFDI; el de la factura PPD en un pago.
     */
    public String getUuid() {
        return uuid;
    }

    public CrossCheckCfdiCfdiItem setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * invoice (factura de ingreso, PUE), credit_note (nota de crédito: resta) o payment (lo pagado en el mes de una factura PPD).
     * <p>
     * Valores: invoice, credit_note, payment, withholding_certificate.
     */
    public String getType() {
        return type;
    }

    public CrossCheckCfdiCfdiItem setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * La fecha del CFDI, o la del pago (AAAA-MM-DD).
     */
    public String getDate() {
        return date;
    }

    public CrossCheckCfdiCfdiItem setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * El RFC de la contraparte: el cliente en lo emitido, el proveedor en lo recibido.
     */
    public String getTaxId() {
        return taxId;
    }

    public CrossCheckCfdiCfdiItem setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * El nombre de la contraparte, como viene en el CFDI.
     */
    public String getName() {
        return name;
    }

    public CrossCheckCfdiCfdiItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Lo que aporta a la cifra, en pesos; negativo en una nota de crédito.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CrossCheckCfdiCfdiItem setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CrossCheckCfdiCfdiItem setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }
}
