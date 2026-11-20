// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * PayableInvoice: Una factura recibida con lo que falta por pagar, como la muestra Pagos › Por pagar: lo pagado cuenta complementos, notas de crédito, pagos de Fiscalisto y pagos registrados a mano.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayableInvoice {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El folio fiscal.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * La factura descargada del SAT (sat_…).
     */
    @JsonProperty("sat_invoice")
    private String satInvoice;

    /**
     * El RFC del proveedor.
     */
    @JsonProperty("supplier_tax_id")
    private String supplierTaxId;

    /**
     * El nombre del proveedor, o null.
     */
    @JsonProperty("supplier_name")
    private String supplierName;

    /**
     * Su serie, o null.
     */
    @JsonProperty("series")
    private String series;

    /**
     * Su folio, o null.
     */
    @JsonProperty("folio")
    private String folio;

    /**
     * La fecha de la factura.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Su moneda.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Su total, en su moneda.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Lo pagado ya, en su moneda.
     */
    @JsonProperty("paid")
    private BigDecimal paid;

    /**
     * Lo que falta por pagar, en su moneda.
     */
    @JsonProperty("amount_due")
    private BigDecimal amountDue;

    /**
     * PUE o PPD, o null.
     */
    @JsonProperty("payment_method")
    private String paymentMethod;

    /**
     * El pago abierto (pyo_…) en el que ya está, o null.
     */
    @JsonProperty("in_payout")
    private String inPayout;

    /**
     * Lo que las Reglas antes de pagar encontraron (por ejemplo cancelada en el SAT, o proveedor en la lista 69-B).
     */
    @JsonProperty("warnings")
    private List<String> warnings;

    /**
     * La factura en la app.
     */
    @JsonProperty("app_url")
    private String appUrl;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PayableInvoice setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El folio fiscal.
     */
    public String getUuid() {
        return uuid;
    }

    public PayableInvoice setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * La factura descargada del SAT (sat_…).
     */
    public String getSatInvoice() {
        return satInvoice;
    }

    public PayableInvoice setSatInvoice(String satInvoice) {
        this.satInvoice = satInvoice;
        return this;
    }

    /**
     * El RFC del proveedor.
     */
    public String getSupplierTaxId() {
        return supplierTaxId;
    }

    public PayableInvoice setSupplierTaxId(String supplierTaxId) {
        this.supplierTaxId = supplierTaxId;
        return this;
    }

    /**
     * El nombre del proveedor, o null.
     */
    public String getSupplierName() {
        return supplierName;
    }

    public PayableInvoice setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }

    /**
     * Su serie, o null.
     */
    public String getSeries() {
        return series;
    }

    public PayableInvoice setSeries(String series) {
        this.series = series;
        return this;
    }

    /**
     * Su folio, o null.
     */
    public String getFolio() {
        return folio;
    }

    public PayableInvoice setFolio(String folio) {
        this.folio = folio;
        return this;
    }

    /**
     * La fecha de la factura.
     */
    public String getDate() {
        return date;
    }

    public PayableInvoice setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Su moneda.
     */
    public String getCurrency() {
        return currency;
    }

    public PayableInvoice setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Su total, en su moneda.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public PayableInvoice setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public PayableInvoice setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Lo pagado ya, en su moneda.
     */
    public BigDecimal getPaid() {
        return paid;
    }

    public PayableInvoice setPaid(BigDecimal paid) {
        this.paid = paid;
        return this;
    }

    @JsonIgnore
    public PayableInvoice setPaid(double paid) {
        return setPaid(BigDecimal.valueOf(paid));
    }

    /**
     * Lo que falta por pagar, en su moneda.
     */
    public BigDecimal getAmountDue() {
        return amountDue;
    }

    public PayableInvoice setAmountDue(BigDecimal amountDue) {
        this.amountDue = amountDue;
        return this;
    }

    @JsonIgnore
    public PayableInvoice setAmountDue(double amountDue) {
        return setAmountDue(BigDecimal.valueOf(amountDue));
    }

    /**
     * PUE o PPD, o null.
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public PayableInvoice setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * El pago abierto (pyo_…) en el que ya está, o null.
     */
    public String getInPayout() {
        return inPayout;
    }

    public PayableInvoice setInPayout(String inPayout) {
        this.inPayout = inPayout;
        return this;
    }

    /**
     * Lo que las Reglas antes de pagar encontraron (por ejemplo cancelada en el SAT, o proveedor en la lista 69-B).
     */
    public List<String> getWarnings() {
        return warnings;
    }

    public PayableInvoice setWarnings(List<String> warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     * La factura en la app.
     */
    public String getAppUrl() {
        return appUrl;
    }

    public PayableInvoice setAppUrl(String appUrl) {
        this.appUrl = appUrl;
        return this;
    }
}
