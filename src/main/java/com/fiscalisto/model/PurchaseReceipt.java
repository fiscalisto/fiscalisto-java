// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * PurchaseReceipt: Un ticket de compra del emisor sin factura: lo que se leyó de su foto y si ya se pidió, llegó o no es deducible.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PurchaseReceipt {
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
     * El emisor (el que compró).
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * pending (por pedir), requested (pedida a la tienda), invoiced (ya tiene factura) o non_deductible (no hubo factura).
     * <p>
     * Valores: pending, requested, invoiced, non_deductible.
     */
    @JsonProperty("status")
    private String status;

    /**
     * La tienda: name, tax_id (su RFC), email, portal_url (su portal o la liga del QR) y on_fiscalisto (factura con Fiscalisto: method fiscalisto la timbra al momento).
     */
    @JsonProperty("store")
    private PurchaseReceiptStore store;

    /**
     * El día de la compra (AAAA-MM-DD), o null.
     */
    @JsonProperty("date")
    private String date;

    /**
     * El total pagado, en pesos, o null.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * efectivo, tarjeta u otro, o null.
     * <p>
     * Valores: efectivo, tarjeta, otro.
     */
    @JsonProperty("payment_method")
    private String paymentMethod;

    /**
     * El folio o número de ticket, o null.
     */
    @JsonProperty("folio")
    private String folio;

    /**
     * Otros datos que pide el portal de la tienda para facturar (Web ID, sucursal, caja…).
     */
    @JsonProperty("fields")
    private List<PurchaseReceiptField> fields;

    /**
     * El uso de la factura que se pide, o null: G03 si el régimen del emisor lo permite, si no S01.
     */
    @JsonProperty("use")
    private String use;

    /**
     * Una nota, o null.
     */
    @JsonProperty("note")
    private String note;

    /**
     * ai (lo leyó la IA), manual (se mandaron los datos) o null.
     * <p>
     * Valores: ai, manual.
     */
    @JsonProperty("read_by")
    private String readBy;

    /**
     * Por qué no se leyó o qué revisar (foto borrosa, no parece un ticket…), o null.
     */
    @JsonProperty("read_note")
    private String readNote;

    /**
     * El tipo del archivo guardado (image/jpeg, application/pdf…).
     */
    @JsonProperty("file_type")
    private String fileType;

    /**
     * true si se pagó en efectivo más de $2,000: aunque tenga factura, no es deducible (LISR art. 27 fr. III).
     */
    @JsonProperty("cash_over_limit")
    private Boolean cashOverLimit;

    /**
     * Por pedir: los días que le quedan al mes de la compra, en hora de México (muchas tiendas solo facturan dentro del mes); si no, null.
     */
    @JsonProperty("days_left_in_month")
    private Long daysLeftInMonth;

    /**
     * Cuándo y cómo se pidió (method: fiscalisto, email, portal o manual; to: la tienda o su correo), o null.
     */
    @JsonProperty("requested")
    private PurchaseReceiptRequested requested;

    /**
     * El folio fiscal de la factura que lo cubre, o null.
     */
    @JsonProperty("invoice_uuid")
    private String invoiceUuid;

    /**
     * La factura recibida (sat_…) que lo cubre, si ya llegó con las descargas del SAT, o null.
     */
    @JsonProperty("invoice")
    private String invoice;

    /**
     * Cuándo quedó facturado, o null.
     */
    @JsonProperty("invoiced_at")
    private String invoicedAt;

    /**
     * Cuándo se marcó no deducible, o null.
     */
    @JsonProperty("non_deductible_at")
    private String nonDeductibleAt;

    /**
     * Cuándo se guardó.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public PurchaseReceipt setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public PurchaseReceipt setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PurchaseReceipt setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (el que compró).
     */
    public String getIssuer() {
        return issuer;
    }

    public PurchaseReceipt setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * pending (por pedir), requested (pedida a la tienda), invoiced (ya tiene factura) o non_deductible (no hubo factura).
     * <p>
     * Valores: pending, requested, invoiced, non_deductible.
     */
    public String getStatus() {
        return status;
    }

    public PurchaseReceipt setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * La tienda: name, tax_id (su RFC), email, portal_url (su portal o la liga del QR) y on_fiscalisto (factura con Fiscalisto: method fiscalisto la timbra al momento).
     */
    public PurchaseReceiptStore getStore() {
        return store;
    }

    public PurchaseReceipt setStore(PurchaseReceiptStore store) {
        this.store = store;
        return this;
    }

    /**
     * El día de la compra (AAAA-MM-DD), o null.
     */
    public String getDate() {
        return date;
    }

    public PurchaseReceipt setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * El total pagado, en pesos, o null.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public PurchaseReceipt setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public PurchaseReceipt setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * efectivo, tarjeta u otro, o null.
     * <p>
     * Valores: efectivo, tarjeta, otro.
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public PurchaseReceipt setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * El folio o número de ticket, o null.
     */
    public String getFolio() {
        return folio;
    }

    public PurchaseReceipt setFolio(String folio) {
        this.folio = folio;
        return this;
    }

    /**
     * Otros datos que pide el portal de la tienda para facturar (Web ID, sucursal, caja…).
     */
    public List<PurchaseReceiptField> getFields() {
        return fields;
    }

    public PurchaseReceipt setFields(List<PurchaseReceiptField> fields) {
        this.fields = fields;
        return this;
    }

    /**
     * El uso de la factura que se pide, o null: G03 si el régimen del emisor lo permite, si no S01.
     */
    public String getUse() {
        return use;
    }

    public PurchaseReceipt setUse(String use) {
        this.use = use;
        return this;
    }

    /**
     * Una nota, o null.
     */
    public String getNote() {
        return note;
    }

    public PurchaseReceipt setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * ai (lo leyó la IA), manual (se mandaron los datos) o null.
     * <p>
     * Valores: ai, manual.
     */
    public String getReadBy() {
        return readBy;
    }

    public PurchaseReceipt setReadBy(String readBy) {
        this.readBy = readBy;
        return this;
    }

    /**
     * Por qué no se leyó o qué revisar (foto borrosa, no parece un ticket…), o null.
     */
    public String getReadNote() {
        return readNote;
    }

    public PurchaseReceipt setReadNote(String readNote) {
        this.readNote = readNote;
        return this;
    }

    /**
     * El tipo del archivo guardado (image/jpeg, application/pdf…).
     */
    public String getFileType() {
        return fileType;
    }

    public PurchaseReceipt setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * true si se pagó en efectivo más de $2,000: aunque tenga factura, no es deducible (LISR art. 27 fr. III).
     */
    public Boolean getCashOverLimit() {
        return cashOverLimit;
    }

    public PurchaseReceipt setCashOverLimit(Boolean cashOverLimit) {
        this.cashOverLimit = cashOverLimit;
        return this;
    }

    /**
     * Por pedir: los días que le quedan al mes de la compra, en hora de México (muchas tiendas solo facturan dentro del mes); si no, null.
     */
    public Long getDaysLeftInMonth() {
        return daysLeftInMonth;
    }

    public PurchaseReceipt setDaysLeftInMonth(Long daysLeftInMonth) {
        this.daysLeftInMonth = daysLeftInMonth;
        return this;
    }

    @JsonIgnore
    public PurchaseReceipt setDaysLeftInMonth(long daysLeftInMonth) {
        return setDaysLeftInMonth(Long.valueOf(daysLeftInMonth));
    }

    /**
     * Cuándo y cómo se pidió (method: fiscalisto, email, portal o manual; to: la tienda o su correo), o null.
     */
    public PurchaseReceiptRequested getRequested() {
        return requested;
    }

    public PurchaseReceipt setRequested(PurchaseReceiptRequested requested) {
        this.requested = requested;
        return this;
    }

    /**
     * El folio fiscal de la factura que lo cubre, o null.
     */
    public String getInvoiceUuid() {
        return invoiceUuid;
    }

    public PurchaseReceipt setInvoiceUuid(String invoiceUuid) {
        this.invoiceUuid = invoiceUuid;
        return this;
    }

    /**
     * La factura recibida (sat_…) que lo cubre, si ya llegó con las descargas del SAT, o null.
     */
    public String getInvoice() {
        return invoice;
    }

    public PurchaseReceipt setInvoice(String invoice) {
        this.invoice = invoice;
        return this;
    }

    /**
     * Cuándo quedó facturado, o null.
     */
    public String getInvoicedAt() {
        return invoicedAt;
    }

    public PurchaseReceipt setInvoicedAt(String invoicedAt) {
        this.invoicedAt = invoicedAt;
        return this;
    }

    /**
     * Cuándo se marcó no deducible, o null.
     */
    public String getNonDeductibleAt() {
        return nonDeductibleAt;
    }

    public PurchaseReceipt setNonDeductibleAt(String nonDeductibleAt) {
        this.nonDeductibleAt = nonDeductibleAt;
        return this;
    }

    /**
     * Cuándo se guardó.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public PurchaseReceipt setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
