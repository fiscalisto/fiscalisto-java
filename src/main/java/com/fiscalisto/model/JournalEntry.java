// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * JournalEntry: La póliza de diario de un CFDI: sus cargos y abonos, que siempre cuadran.
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
     * La fecha del CFDI.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Factura o nota de crédito, su folio y la contraparte.
     */
    @JsonProperty("description")
    private String description;

    /**
     * La factura (inv_…) si la timbró este emisor; null si la recibió.
     */
    @JsonProperty("invoice")
    private String invoice;

    /**
     * El folio fiscal del CFDI.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * El RFC de la contraparte (cliente o proveedor).
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * El total del CFDI, en su moneda.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * La moneda del CFDI.
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
     * La fecha del CFDI.
     */
    public String getDate() {
        return date;
    }

    public JournalEntry setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Factura o nota de crédito, su folio y la contraparte.
     */
    public String getDescription() {
        return description;
    }

    public JournalEntry setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * La factura (inv_…) si la timbró este emisor; null si la recibió.
     */
    public String getInvoice() {
        return invoice;
    }

    public JournalEntry setInvoice(String invoice) {
        this.invoice = invoice;
        return this;
    }

    /**
     * El folio fiscal del CFDI.
     */
    public String getUuid() {
        return uuid;
    }

    public JournalEntry setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * El RFC de la contraparte (cliente o proveedor).
     */
    public String getTaxId() {
        return taxId;
    }

    public JournalEntry setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * El total del CFDI, en su moneda.
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
     * La moneda del CFDI.
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
