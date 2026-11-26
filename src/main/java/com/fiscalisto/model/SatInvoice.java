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
 * SatInvoice: Una factura que el SAT tiene del emisor, emitida o recibida, traída con una descarga.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatInvoice {
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
     * El emisor de su cuenta (iss_…) a quien pertenece esta factura.
     */
    @JsonProperty("issuer")
    private StringOr<Issuer> issuer;

    /**
     * El folio fiscal (UUID del timbre).
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * received (se la hicieron al emisor) o issued (la emitió).
     * <p>
     * Valores: received, issued.
     */
    @JsonProperty("direction")
    private String direction;

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Valores: I, E, P, T, N.
     */
    @JsonProperty("type")
    private String type;

    /**
     * La fecha del comprobante (Fecha), en la hora local con que se emitió.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Serie (Serie), o null.
     */
    @JsonProperty("series")
    private String series;

    /**
     * Folio (Folio), o null.
     */
    @JsonProperty("folio")
    private String folio;

    /**
     * Quien la emitió (Emisor).
     */
    @JsonProperty("issued_by")
    private SatInvoiceIssuedBy issuedBy;

    /**
     * A quien se la emitieron (Receptor).
     */
    @JsonProperty("issued_to")
    private SatInvoiceIssuedTo issuedTo;

    /**
     * Moneda (Moneda): MXN, USD…
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Tipo de cambio (TipoCambio), o null en pesos.
     */
    @JsonProperty("exchange_rate")
    private BigDecimal exchangeRate;

    /**
     * Método de pago (MetodoPago): PUE o PPD.
     */
    @JsonProperty("payment_method")
    private String paymentMethod;

    /**
     * Forma de pago (FormaPago), clave de c_FormaPago.
     */
    @JsonProperty("payment_form")
    private String paymentForm;

    /**
     * Uso del CFDI (UsoCFDI).
     */
    @JsonProperty("use")
    private String use;

    /**
     * Subtotal (SubTotal).
     */
    @JsonProperty("subtotal")
    private BigDecimal subtotal;

    /**
     * Total (Total).
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Impuestos del comprobante: trasladados (iva, ieps), retenidos (iva_withheld, isr_withheld, ieps_withheld) y locales.
     */
    @JsonProperty("taxes")
    private SatInvoiceTaxes taxes;

    /**
     * Su estado en el SAT cuando se revisó: active (vigente) o canceled. null si aún no se revisa.
     * <p>
     * Valores: active, canceled.
     */
    @JsonProperty("sat_status")
    private String satStatus;

    /**
     * Solo recibidas, marcadas con mark_paid, en la app o por una regla: without_complement true en una PPD pagada sin complemento de pago (el SAT la sigue viendo sin pagar); false en una PUE, donde solo se anotó de dónde salió el dinero.
     */
    @JsonProperty("paid_otherwise")
    private SatInvoicePaidOtherwise paidOtherwise;

    /**
     * Solo en una PUE recibida pagada en efectivo cuando la empresa pide confirmar estos pagos (Ajustes › Pagos en efectivo): pending hasta que alguien anote de dónde salió el dinero (mark_paid con money_source), confirmed después. Null en las demás. Sus impuestos no cambian.
     * <p>
     * Valores: pending, confirmed.
     */
    @JsonProperty("cash_confirmation")
    private String cashConfirmation;

    /**
     * Cuándo alguien confirmó el pago en efectivo (cash_confirmation confirmed), en hora del centro de México. Null en las demás.
     */
    @JsonProperty("cash_confirmed_at")
    private String cashConfirmedAt;

    /**
     * Su centro de costo (ccn_…), o null. Póngalo o cámbielo con POST /v1/sat_invoices/{id}.
     */
    @JsonProperty("cost_center")
    private String costCenter;

    /**
     * El número de cuenta de su catálogo en que se registra su ingreso o gasto en vez de la de su categoría (en la app, en una regla de Ajustes › Reglas o con account). Null: la de su categoría.
     */
    @JsonProperty("account")
    private String account;

    /**
     * Sus etiquetas, por nombre. automatic: true en las que puso una regla (la orden de compra a la que se vinculó o una regla de Ajustes › Reglas). Cámbielas con POST /v1/sat_invoices/{id}.
     */
    @JsonProperty("tags")
    private List<SatInvoiceTag> tags;

    /**
     * La descarga (sdl_…) que la trajo, o null.
     */
    @JsonProperty("sat_download")
    private StringOr<SatDownload> satDownload;

    /**
     * Cuándo llegó.
     */
    @JsonProperty("downloaded_at")
    private String downloadedAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public SatInvoice setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public SatInvoice setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public SatInvoice setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor de su cuenta (iss_…) a quien pertenece esta factura.
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public SatInvoice setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public SatInvoice setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public SatInvoice setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * El folio fiscal (UUID del timbre).
     */
    public String getUuid() {
        return uuid;
    }

    public SatInvoice setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * received (se la hicieron al emisor) o issued (la emitió).
     * <p>
     * Valores: received, issued.
     */
    public String getDirection() {
        return direction;
    }

    public SatInvoice setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Valores: I, E, P, T, N.
     */
    public String getType() {
        return type;
    }

    public SatInvoice setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * La fecha del comprobante (Fecha), en la hora local con que se emitió.
     */
    public String getDate() {
        return date;
    }

    public SatInvoice setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Serie (Serie), o null.
     */
    public String getSeries() {
        return series;
    }

    public SatInvoice setSeries(String series) {
        this.series = series;
        return this;
    }

    /**
     * Folio (Folio), o null.
     */
    public String getFolio() {
        return folio;
    }

    public SatInvoice setFolio(String folio) {
        this.folio = folio;
        return this;
    }

    /**
     * Quien la emitió (Emisor).
     */
    public SatInvoiceIssuedBy getIssuedBy() {
        return issuedBy;
    }

    public SatInvoice setIssuedBy(SatInvoiceIssuedBy issuedBy) {
        this.issuedBy = issuedBy;
        return this;
    }

    /**
     * A quien se la emitieron (Receptor).
     */
    public SatInvoiceIssuedTo getIssuedTo() {
        return issuedTo;
    }

    public SatInvoice setIssuedTo(SatInvoiceIssuedTo issuedTo) {
        this.issuedTo = issuedTo;
        return this;
    }

    /**
     * Moneda (Moneda): MXN, USD…
     */
    public String getCurrency() {
        return currency;
    }

    public SatInvoice setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Tipo de cambio (TipoCambio), o null en pesos.
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public SatInvoice setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    @JsonIgnore
    public SatInvoice setExchangeRate(double exchangeRate) {
        return setExchangeRate(BigDecimal.valueOf(exchangeRate));
    }

    /**
     * Método de pago (MetodoPago): PUE o PPD.
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public SatInvoice setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * Forma de pago (FormaPago), clave de c_FormaPago.
     */
    public String getPaymentForm() {
        return paymentForm;
    }

    public SatInvoice setPaymentForm(String paymentForm) {
        this.paymentForm = paymentForm;
        return this;
    }

    /**
     * Uso del CFDI (UsoCFDI).
     */
    public String getUse() {
        return use;
    }

    public SatInvoice setUse(String use) {
        this.use = use;
        return this;
    }

    /**
     * Subtotal (SubTotal).
     */
    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public SatInvoice setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
        return this;
    }

    @JsonIgnore
    public SatInvoice setSubtotal(double subtotal) {
        return setSubtotal(BigDecimal.valueOf(subtotal));
    }

    /**
     * Total (Total).
     */
    public BigDecimal getTotal() {
        return total;
    }

    public SatInvoice setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public SatInvoice setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Impuestos del comprobante: trasladados (iva, ieps), retenidos (iva_withheld, isr_withheld, ieps_withheld) y locales.
     */
    public SatInvoiceTaxes getTaxes() {
        return taxes;
    }

    public SatInvoice setTaxes(SatInvoiceTaxes taxes) {
        this.taxes = taxes;
        return this;
    }

    /**
     * Su estado en el SAT cuando se revisó: active (vigente) o canceled. null si aún no se revisa.
     * <p>
     * Valores: active, canceled.
     */
    public String getSatStatus() {
        return satStatus;
    }

    public SatInvoice setSatStatus(String satStatus) {
        this.satStatus = satStatus;
        return this;
    }

    /**
     * Solo recibidas, marcadas con mark_paid, en la app o por una regla: without_complement true en una PPD pagada sin complemento de pago (el SAT la sigue viendo sin pagar); false en una PUE, donde solo se anotó de dónde salió el dinero.
     */
    public SatInvoicePaidOtherwise getPaidOtherwise() {
        return paidOtherwise;
    }

    public SatInvoice setPaidOtherwise(SatInvoicePaidOtherwise paidOtherwise) {
        this.paidOtherwise = paidOtherwise;
        return this;
    }

    /**
     * Solo en una PUE recibida pagada en efectivo cuando la empresa pide confirmar estos pagos (Ajustes › Pagos en efectivo): pending hasta que alguien anote de dónde salió el dinero (mark_paid con money_source), confirmed después. Null en las demás. Sus impuestos no cambian.
     * <p>
     * Valores: pending, confirmed.
     */
    public String getCashConfirmation() {
        return cashConfirmation;
    }

    public SatInvoice setCashConfirmation(String cashConfirmation) {
        this.cashConfirmation = cashConfirmation;
        return this;
    }

    /**
     * Cuándo alguien confirmó el pago en efectivo (cash_confirmation confirmed), en hora del centro de México. Null en las demás.
     */
    public String getCashConfirmedAt() {
        return cashConfirmedAt;
    }

    public SatInvoice setCashConfirmedAt(String cashConfirmedAt) {
        this.cashConfirmedAt = cashConfirmedAt;
        return this;
    }

    /**
     * Su centro de costo (ccn_…), o null. Póngalo o cámbielo con POST /v1/sat_invoices/{id}.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public SatInvoice setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * El número de cuenta de su catálogo en que se registra su ingreso o gasto en vez de la de su categoría (en la app, en una regla de Ajustes › Reglas o con account). Null: la de su categoría.
     */
    public String getAccount() {
        return account;
    }

    public SatInvoice setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * Sus etiquetas, por nombre. automatic: true en las que puso una regla (la orden de compra a la que se vinculó o una regla de Ajustes › Reglas). Cámbielas con POST /v1/sat_invoices/{id}.
     */
    public List<SatInvoiceTag> getTags() {
        return tags;
    }

    public SatInvoice setTags(List<SatInvoiceTag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * La descarga (sdl_…) que la trajo, o null.
     */
    public StringOr<SatDownload> getSatDownload() {
        return satDownload;
    }

    public SatInvoice setSatDownload(StringOr<SatDownload> satDownload) {
        this.satDownload = satDownload;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public SatInvoice setSatDownload(String id) {
        return setSatDownload(StringOr.<SatDownload>id(id));
    }

    @JsonIgnore
    public SatInvoice setSatDownload(SatDownload satDownload) {
        return setSatDownload(StringOr.of(satDownload));
    }

    /**
     * Cuándo llegó.
     */
    public String getDownloadedAt() {
        return downloadedAt;
    }

    public SatInvoice setDownloadedAt(String downloadedAt) {
        this.downloadedAt = downloadedAt;
        return this;
    }
}
