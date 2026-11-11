// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * SupplierInvoice: Una factura que un proveedor le mandó al emisor por su Portal de proveedores, con lo que se revisó, su orden de compra, su contrarecibo y sus fechas de pago.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SupplierInvoice {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El emisor de su cuenta (iss_…) que la recibió.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El proveedor (sup_…) que la mandó.
     */
    @JsonProperty("supplier")
    private String supplier;

    /**
     * El RFC del proveedor.
     */
    @JsonProperty("supplier_tax_id")
    private String supplierTaxId;

    /**
     * El folio fiscal (UUID del timbre).
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * La misma factura en sus facturas recibidas (sat_…), para su XML y su PDF, o null.
     */
    @JsonProperty("sat_invoice")
    private String satInvoice;

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
     * income (factura de ingreso) o credit_note (nota de crédito).
     * <p>
     * Valores: income, credit_note.
     */
    @JsonProperty("type")
    private String type;

    /**
     * La fecha de la factura.
     */
    @JsonProperty("date")
    private String date;

    /**
     * La moneda.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * El total de la factura.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Lo que se le paga: el total sin las diferencias con su orden ni el descuento de pronto pago aceptado.
     */
    @JsonProperty("payable")
    private BigDecimal payable;

    /**
     * PUE o PPD.
     */
    @JsonProperty("payment_method")
    private String paymentMethod;

    /**
     * received (por revisar), approved, scheduled (con fecha de pago), paid o rejected.
     * <p>
     * Valores: received, approved, scheduled, paid, rejected.
     */
    @JsonProperty("status")
    private String status;

    /**
     * La orden de compra que factura (OC-12), o null.
     */
    @JsonProperty("purchase_order")
    private String purchaseOrder;

    /**
     * true si cuadró con su orden, false si tuvo diferencias, null sin orden.
     */
    @JsonProperty("matches_purchase_order")
    private Boolean matchesPurchaseOrder;

    /**
     * El folio de su contrarecibo, o null.
     */
    @JsonProperty("contrarecibo")
    private String contrarecibo;

    /**
     * El día en que vence por sus fechas de pago, o null.
     */
    @JsonProperty("due_on")
    private String dueOn;

    /**
     * El día programado para pagarla, o null.
     */
    @JsonProperty("scheduled_on")
    private String scheduledOn;

    /**
     * El día en que se pagó, o null.
     */
    @JsonProperty("paid_on")
    private String paidOn;

    /**
     * Lo que se pagó, o null.
     */
    @JsonProperty("paid_amount")
    private BigDecimal paidAmount;

    /**
     * La referencia del pago, o null.
     */
    @JsonProperty("payment_reference")
    private String paymentReference;

    /**
     * Por qué se rechazó, o null.
     */
    @JsonProperty("rejection_reason")
    private String rejectionReason;

    /**
     * Lo que se revisó y quedó como aviso (code y message), para que su equipo lo vea.
     */
    @JsonProperty("warnings")
    private List<SupplierInvoiceWarning> warnings;

    /**
     * Cuándo llegó.
     */
    @JsonProperty("received_at")
    private String receivedAt;

    /**
     * Cuándo se aprobó, o null.
     */
    @JsonProperty("approved_at")
    private String approvedAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public SupplierInvoice setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public SupplierInvoice setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public SupplierInvoice setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor de su cuenta (iss_…) que la recibió.
     */
    public String getIssuer() {
        return issuer;
    }

    public SupplierInvoice setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El proveedor (sup_…) que la mandó.
     */
    public String getSupplier() {
        return supplier;
    }

    public SupplierInvoice setSupplier(String supplier) {
        this.supplier = supplier;
        return this;
    }

    /**
     * El RFC del proveedor.
     */
    public String getSupplierTaxId() {
        return supplierTaxId;
    }

    public SupplierInvoice setSupplierTaxId(String supplierTaxId) {
        this.supplierTaxId = supplierTaxId;
        return this;
    }

    /**
     * El folio fiscal (UUID del timbre).
     */
    public String getUuid() {
        return uuid;
    }

    public SupplierInvoice setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * La misma factura en sus facturas recibidas (sat_…), para su XML y su PDF, o null.
     */
    public String getSatInvoice() {
        return satInvoice;
    }

    public SupplierInvoice setSatInvoice(String satInvoice) {
        this.satInvoice = satInvoice;
        return this;
    }

    /**
     * Su serie, o null.
     */
    public String getSeries() {
        return series;
    }

    public SupplierInvoice setSeries(String series) {
        this.series = series;
        return this;
    }

    /**
     * Su folio, o null.
     */
    public String getFolio() {
        return folio;
    }

    public SupplierInvoice setFolio(String folio) {
        this.folio = folio;
        return this;
    }

    /**
     * income (factura de ingreso) o credit_note (nota de crédito).
     * <p>
     * Valores: income, credit_note.
     */
    public String getType() {
        return type;
    }

    public SupplierInvoice setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * La fecha de la factura.
     */
    public String getDate() {
        return date;
    }

    public SupplierInvoice setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * La moneda.
     */
    public String getCurrency() {
        return currency;
    }

    public SupplierInvoice setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * El total de la factura.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public SupplierInvoice setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public SupplierInvoice setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Lo que se le paga: el total sin las diferencias con su orden ni el descuento de pronto pago aceptado.
     */
    public BigDecimal getPayable() {
        return payable;
    }

    public SupplierInvoice setPayable(BigDecimal payable) {
        this.payable = payable;
        return this;
    }

    @JsonIgnore
    public SupplierInvoice setPayable(double payable) {
        return setPayable(BigDecimal.valueOf(payable));
    }

    /**
     * PUE o PPD.
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public SupplierInvoice setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * received (por revisar), approved, scheduled (con fecha de pago), paid o rejected.
     * <p>
     * Valores: received, approved, scheduled, paid, rejected.
     */
    public String getStatus() {
        return status;
    }

    public SupplierInvoice setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * La orden de compra que factura (OC-12), o null.
     */
    public String getPurchaseOrder() {
        return purchaseOrder;
    }

    public SupplierInvoice setPurchaseOrder(String purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
        return this;
    }

    /**
     * true si cuadró con su orden, false si tuvo diferencias, null sin orden.
     */
    public Boolean getMatchesPurchaseOrder() {
        return matchesPurchaseOrder;
    }

    public SupplierInvoice setMatchesPurchaseOrder(Boolean matchesPurchaseOrder) {
        this.matchesPurchaseOrder = matchesPurchaseOrder;
        return this;
    }

    /**
     * El folio de su contrarecibo, o null.
     */
    public String getContrarecibo() {
        return contrarecibo;
    }

    public SupplierInvoice setContrarecibo(String contrarecibo) {
        this.contrarecibo = contrarecibo;
        return this;
    }

    /**
     * El día en que vence por sus fechas de pago, o null.
     */
    public String getDueOn() {
        return dueOn;
    }

    public SupplierInvoice setDueOn(String dueOn) {
        this.dueOn = dueOn;
        return this;
    }

    /**
     * El día programado para pagarla, o null.
     */
    public String getScheduledOn() {
        return scheduledOn;
    }

    public SupplierInvoice setScheduledOn(String scheduledOn) {
        this.scheduledOn = scheduledOn;
        return this;
    }

    /**
     * El día en que se pagó, o null.
     */
    public String getPaidOn() {
        return paidOn;
    }

    public SupplierInvoice setPaidOn(String paidOn) {
        this.paidOn = paidOn;
        return this;
    }

    /**
     * Lo que se pagó, o null.
     */
    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    public SupplierInvoice setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
        return this;
    }

    @JsonIgnore
    public SupplierInvoice setPaidAmount(double paidAmount) {
        return setPaidAmount(BigDecimal.valueOf(paidAmount));
    }

    /**
     * La referencia del pago, o null.
     */
    public String getPaymentReference() {
        return paymentReference;
    }

    public SupplierInvoice setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference;
        return this;
    }

    /**
     * Por qué se rechazó, o null.
     */
    public String getRejectionReason() {
        return rejectionReason;
    }

    public SupplierInvoice setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
        return this;
    }

    /**
     * Lo que se revisó y quedó como aviso (code y message), para que su equipo lo vea.
     */
    public List<SupplierInvoiceWarning> getWarnings() {
        return warnings;
    }

    public SupplierInvoice setWarnings(List<SupplierInvoiceWarning> warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     * Cuándo llegó.
     */
    public String getReceivedAt() {
        return receivedAt;
    }

    public SupplierInvoice setReceivedAt(String receivedAt) {
        this.receivedAt = receivedAt;
        return this;
    }

    /**
     * Cuándo se aprobó, o null.
     */
    public String getApprovedAt() {
        return approvedAt;
    }

    public SupplierInvoice setApprovedAt(String approvedAt) {
        this.approvedAt = approvedAt;
        return this;
    }
}
