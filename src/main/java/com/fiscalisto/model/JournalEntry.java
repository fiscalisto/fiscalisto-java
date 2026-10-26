// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * JournalEntry: Una póliza de diario (de un CFDI, un pago, un recibo de nómina o la depreciación del mes): sus cargos y abonos, que siempre cuadran.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class JournalEntry {
    /**
     * El número de la póliza: D-AAAAMM-NNNNN, en orden de fecha dentro del mes.
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
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * De qué es: invoice (un CFDI de ingreso o egreso), payment_received o payment_made (un pago de un complemento), payroll (un recibo de nómina) o depreciation (la depreciación del mes de los activos fijos).
     * <p>
     * Valores: invoice, payment_received, payment_made, payroll, depreciation.
     */
    @JsonProperty("type")
    private String type;

    /**
     * La fecha del CFDI o del pago; en la depreciación, el último día del mes.
     */
    @JsonProperty("date")
    private String date;

    /**
     * El documento, su folio y la contraparte.
     */
    @JsonProperty("description")
    private String description;

    /**
     * La factura (inv_…) si es la póliza de un CFDI que timbró este emisor; null en los demás casos.
     */
    @JsonProperty("invoice")
    private String invoice;

    /**
     * El folio fiscal del CFDI (o del complemento de pago); null en la depreciación.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * El RFC de la contraparte (cliente, proveedor o empleado); null en la depreciación.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * El total del documento, en su moneda.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * La moneda del documento.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * El tipo de cambio, si no es en pesos; null si es en pesos.
     */
    @JsonProperty("exchange_rate")
    private BigDecimal exchangeRate;

    /**
     * Los movimientos, en pesos: el cargo (debit) o abono (credit) a cada cuenta.
     */
    @JsonProperty("lines")
    private List<JournalEntryLine> lines;

    /**
     * El número de la póliza: D-AAAAMM-NNNNN, en orden de fecha dentro del mes.
     */
    public String getId() {
        return id;
    }

    public JournalEntry setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public JournalEntry setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public JournalEntry setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public JournalEntry setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * De qué es: invoice (un CFDI de ingreso o egreso), payment_received o payment_made (un pago de un complemento), payroll (un recibo de nómina) o depreciation (la depreciación del mes de los activos fijos).
     * <p>
     * Valores: invoice, payment_received, payment_made, payroll, depreciation.
     */
    public String getType() {
        return type;
    }

    public JournalEntry setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * La fecha del CFDI o del pago; en la depreciación, el último día del mes.
     */
    public String getDate() {
        return date;
    }

    public JournalEntry setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * El documento, su folio y la contraparte.
     */
    public String getDescription() {
        return description;
    }

    public JournalEntry setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * La factura (inv_…) si es la póliza de un CFDI que timbró este emisor; null en los demás casos.
     */
    public String getInvoice() {
        return invoice;
    }

    public JournalEntry setInvoice(String invoice) {
        this.invoice = invoice;
        return this;
    }

    /**
     * El folio fiscal del CFDI (o del complemento de pago); null en la depreciación.
     */
    public String getUuid() {
        return uuid;
    }

    public JournalEntry setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * El RFC de la contraparte (cliente, proveedor o empleado); null en la depreciación.
     */
    public String getTaxId() {
        return taxId;
    }

    public JournalEntry setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * El total del documento, en su moneda.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public JournalEntry setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public JournalEntry setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * La moneda del documento.
     */
    public String getCurrency() {
        return currency;
    }

    public JournalEntry setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * El tipo de cambio, si no es en pesos; null si es en pesos.
     */
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public JournalEntry setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
        return this;
    }

    @JsonIgnore
    public JournalEntry setExchangeRate(double exchangeRate) {
        return setExchangeRate(BigDecimal.valueOf(exchangeRate));
    }

    /**
     * Los movimientos, en pesos: el cargo (debit) o abono (credit) a cada cuenta.
     */
    public List<JournalEntryLine> getLines() {
        return lines;
    }

    public JournalEntry setLines(List<JournalEntryLine> lines) {
        this.lines = lines;
        return this;
    }
}
