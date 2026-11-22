// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * Finding: Un hallazgo en una orden de compra, un pago, un proveedor o la contabilidad: lo que Fiscalisto encontró y conviene revisar. Los de facturas están en SatFinding.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Finding {
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
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * purchase_orders (órdenes de compra), payouts (pagos a proveedores), suppliers (proveedores), accounting (contabilidad), bank (movimientos del banco), expense_reports (comprobaciones de viáticos) o purchase_receipts (tickets de compra).
     * <p>
     * Valores: purchase_orders, payouts, suppliers, accounting, bank, expense_reports, purchase_receipts.
     */
    @JsonProperty("area")
    private String area;

    /**
     * En qué registro está.
     */
    @JsonProperty("record")
    private FindingRecord record_;

    /**
     * El tipo de hallazgo (oc_factura_distinta, prov_lista_sat…).
     */
    @JsonProperty("code")
    private String code;

    /**
     * critical (grave), warning (revisar) o info (aviso), como lo puso la empresa.
     * <p>
     * Valores: critical, warning, info.
     */
    @JsonProperty("severity")
    private String severity;

    /**
     * El tipo de hallazgo en palabras.
     */
    @JsonProperty("title")
    private String title;

    /**
     * Qué significa y por qué, con el artículo.
     */
    @JsonProperty("explanation")
    private String explanation;

    /**
     * Qué encontró exactamente en este registro.
     */
    @JsonProperty("text")
    private String text;

    /**
     * El monto en cuestión, en pesos, o null.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * El RFC del proveedor, o null.
     */
    @JsonProperty("counterparty_tax_id")
    private String counterpartyTaxId;

    /**
     * open: nadie lo ha revisado; reviewed: alguien dijo que está bien; resolved: ya no aplica (lo que lo causó cambió).
     * <p>
     * Valores: open, reviewed, resolved.
     */
    @JsonProperty("status")
    private String status;

    /**
     * true si detiene su registro hasta que alguien lo revise («No dejar aprobar», «No dejar pagar»).
     */
    @JsonProperty("holds_record")
    private Boolean holdsRecord;

    /**
     * Por qué está bien, si quien lo revisó lo dijo.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Cuándo lo encontró.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * La última vez que cambió su texto.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    /**
     * Cuándo lo revisaron, o null.
     */
    @JsonProperty("reviewed_at")
    private String reviewedAt;

    /**
     * Cuándo dejó de aplicar, o null.
     */
    @JsonProperty("resolved_at")
    private String resolvedAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public Finding setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Finding setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Finding setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public Finding setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * purchase_orders (órdenes de compra), payouts (pagos a proveedores), suppliers (proveedores), accounting (contabilidad), bank (movimientos del banco), expense_reports (comprobaciones de viáticos) o purchase_receipts (tickets de compra).
     * <p>
     * Valores: purchase_orders, payouts, suppliers, accounting, bank, expense_reports, purchase_receipts.
     */
    public String getArea() {
        return area;
    }

    public Finding setArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * En qué registro está.
     */
    public FindingRecord getRecord() {
        return record_;
    }

    public Finding setRecord(FindingRecord record_) {
        this.record_ = record_;
        return this;
    }

    /**
     * El tipo de hallazgo (oc_factura_distinta, prov_lista_sat…).
     */
    public String getCode() {
        return code;
    }

    public Finding setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * critical (grave), warning (revisar) o info (aviso), como lo puso la empresa.
     * <p>
     * Valores: critical, warning, info.
     */
    public String getSeverity() {
        return severity;
    }

    public Finding setSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * El tipo de hallazgo en palabras.
     */
    public String getTitle() {
        return title;
    }

    public Finding setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Qué significa y por qué, con el artículo.
     */
    public String getExplanation() {
        return explanation;
    }

    public Finding setExplanation(String explanation) {
        this.explanation = explanation;
        return this;
    }

    /**
     * Qué encontró exactamente en este registro.
     */
    public String getText() {
        return text;
    }

    public Finding setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * El monto en cuestión, en pesos, o null.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public Finding setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public Finding setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * El RFC del proveedor, o null.
     */
    public String getCounterpartyTaxId() {
        return counterpartyTaxId;
    }

    public Finding setCounterpartyTaxId(String counterpartyTaxId) {
        this.counterpartyTaxId = counterpartyTaxId;
        return this;
    }

    /**
     * open: nadie lo ha revisado; reviewed: alguien dijo que está bien; resolved: ya no aplica (lo que lo causó cambió).
     * <p>
     * Valores: open, reviewed, resolved.
     */
    public String getStatus() {
        return status;
    }

    public Finding setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * true si detiene su registro hasta que alguien lo revise («No dejar aprobar», «No dejar pagar»).
     */
    public Boolean getHoldsRecord() {
        return holdsRecord;
    }

    public Finding setHoldsRecord(Boolean holdsRecord) {
        this.holdsRecord = holdsRecord;
        return this;
    }

    /**
     * Por qué está bien, si quien lo revisó lo dijo.
     */
    public String getNote() {
        return note;
    }

    public Finding setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * Cuándo lo encontró.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public Finding setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * La última vez que cambió su texto.
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public Finding setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Cuándo lo revisaron, o null.
     */
    public String getReviewedAt() {
        return reviewedAt;
    }

    public Finding setReviewedAt(String reviewedAt) {
        this.reviewedAt = reviewedAt;
        return this;
    }

    /**
     * Cuándo dejó de aplicar, o null.
     */
    public String getResolvedAt() {
        return resolvedAt;
    }

    public Finding setResolvedAt(String resolvedAt) {
        this.resolvedAt = resolvedAt;
        return this;
    }
}
