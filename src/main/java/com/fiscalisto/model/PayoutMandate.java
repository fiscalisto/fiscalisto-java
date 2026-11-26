// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.math.BigDecimal;
import java.util.List;

/**
 * PayoutMandate: Un pago recurrente (Pagos › Recurrentes): firmado una vez, sale cada mes a la misma cuenta por hasta ese monto. Solo lectura.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayoutMandate {
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
     * El emisor (iss_…) que paga.
     */
    @JsonProperty("issuer")
    private StringOr<Issuer> issuer;

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
     * La cuenta (pya_…) a la que sale.
     */
    @JsonProperty("payee_account")
    private String payeeAccount;

    /**
     * La CLABE a la que sale.
     */
    @JsonProperty("clabe")
    private String clabe;

    /**
     * Lo más que sale cada mes, en pesos.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Siempre MXN.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * El día del mes; si no es hábil, sale el día hábil anterior.
     */
    @JsonProperty("day")
    private Long day;

    /**
     * El primer mes (AAAA-MM).
     */
    @JsonProperty("first_month")
    private String firstMonth;

    /**
     * El último mes (AAAA-MM).
     */
    @JsonProperty("last_month")
    private String lastMonth;

    /**
     * El concepto de cada transferencia.
     */
    @JsonProperty("concept")
    private String concept;

    /**
     * pending_signatures (falta firmarlo en la app), active, canceled o ended (pasó su último mes).
     * <p>
     * Valores: pending_signatures, active, canceled, ended.
     */
    @JsonProperty("status")
    private String status;

    /**
     * El próximo día en que sale, o null.
     */
    @JsonProperty("next_pay_on")
    private String nextPayOn;

    /**
     * Los pagos (pyo_…) que ya hizo, uno por mes.
     */
    @JsonProperty("payouts")
    private List<String> payouts;

    /**
     * Cuándo se creó.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Cuándo quedó firmado, o null.
     */
    @JsonProperty("activated_at")
    private String activatedAt;

    /**
     * Cuándo se canceló, o null.
     */
    @JsonProperty("canceled_at")
    private String canceledAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public PayoutMandate setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public PayoutMandate setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PayoutMandate setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…) que paga.
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public PayoutMandate setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public PayoutMandate setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public PayoutMandate setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * El RFC del proveedor.
     */
    public String getSupplierTaxId() {
        return supplierTaxId;
    }

    public PayoutMandate setSupplierTaxId(String supplierTaxId) {
        this.supplierTaxId = supplierTaxId;
        return this;
    }

    /**
     * El nombre del proveedor, o null.
     */
    public String getSupplierName() {
        return supplierName;
    }

    public PayoutMandate setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }

    /**
     * La cuenta (pya_…) a la que sale.
     */
    public String getPayeeAccount() {
        return payeeAccount;
    }

    public PayoutMandate setPayeeAccount(String payeeAccount) {
        this.payeeAccount = payeeAccount;
        return this;
    }

    /**
     * La CLABE a la que sale.
     */
    public String getClabe() {
        return clabe;
    }

    public PayoutMandate setClabe(String clabe) {
        this.clabe = clabe;
        return this;
    }

    /**
     * Lo más que sale cada mes, en pesos.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public PayoutMandate setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public PayoutMandate setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Siempre MXN.
     */
    public String getCurrency() {
        return currency;
    }

    public PayoutMandate setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * El día del mes; si no es hábil, sale el día hábil anterior.
     */
    public Long getDay() {
        return day;
    }

    public PayoutMandate setDay(Long day) {
        this.day = day;
        return this;
    }

    @JsonIgnore
    public PayoutMandate setDay(long day) {
        return setDay(Long.valueOf(day));
    }

    /**
     * El primer mes (AAAA-MM).
     */
    public String getFirstMonth() {
        return firstMonth;
    }

    public PayoutMandate setFirstMonth(String firstMonth) {
        this.firstMonth = firstMonth;
        return this;
    }

    /**
     * El último mes (AAAA-MM).
     */
    public String getLastMonth() {
        return lastMonth;
    }

    public PayoutMandate setLastMonth(String lastMonth) {
        this.lastMonth = lastMonth;
        return this;
    }

    /**
     * El concepto de cada transferencia.
     */
    public String getConcept() {
        return concept;
    }

    public PayoutMandate setConcept(String concept) {
        this.concept = concept;
        return this;
    }

    /**
     * pending_signatures (falta firmarlo en la app), active, canceled o ended (pasó su último mes).
     * <p>
     * Valores: pending_signatures, active, canceled, ended.
     */
    public String getStatus() {
        return status;
    }

    public PayoutMandate setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * El próximo día en que sale, o null.
     */
    public String getNextPayOn() {
        return nextPayOn;
    }

    public PayoutMandate setNextPayOn(String nextPayOn) {
        this.nextPayOn = nextPayOn;
        return this;
    }

    /**
     * Los pagos (pyo_…) que ya hizo, uno por mes.
     */
    public List<String> getPayouts() {
        return payouts;
    }

    public PayoutMandate setPayouts(List<String> payouts) {
        this.payouts = payouts;
        return this;
    }

    /**
     * Cuándo se creó.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public PayoutMandate setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo quedó firmado, o null.
     */
    public String getActivatedAt() {
        return activatedAt;
    }

    public PayoutMandate setActivatedAt(String activatedAt) {
        this.activatedAt = activatedAt;
        return this;
    }

    /**
     * Cuándo se canceló, o null.
     */
    public String getCanceledAt() {
        return canceledAt;
    }

    public PayoutMandate setCanceledAt(String canceledAt) {
        this.canceledAt = canceledAt;
        return this;
    }
}
