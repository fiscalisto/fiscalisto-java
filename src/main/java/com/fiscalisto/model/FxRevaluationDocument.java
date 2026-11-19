// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * FxRevaluationDocument: FxRevaluationDocument.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FxRevaluationDocument {
    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * EntradaSalidaMerc: Entrada o Salida.
     * <p>
     * Valores: issued, received.
     */
    @JsonProperty("direction")
    private String direction;

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su serie y folio, o null si no tiene.
     */
    @JsonProperty("series_folio")
    private String seriesFolio;

    /**
     * Fecha de emisión (Fecha), hora de la Ciudad de México.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Moneda de la factura pagada (MonedaDR).
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Lo que faltaba pagar al cierre del mes, en su moneda.
     */
    @JsonProperty("balance")
    private BigDecimal balance;

    /**
     * Su TipoCambio: los pesos por unidad a los que se registró.
     */
    @JsonProperty("booked_rate")
    private BigDecimal bookedRate;

    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    public String getUuid() {
        return uuid;
    }

    public FxRevaluationDocument setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * EntradaSalidaMerc: Entrada o Salida.
     * <p>
     * Valores: issued, received.
     */
    public String getDirection() {
        return direction;
    }

    public FxRevaluationDocument setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    public String getTaxId() {
        return taxId;
    }

    public FxRevaluationDocument setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public FxRevaluationDocument setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su serie y folio, o null si no tiene.
     */
    public String getSeriesFolio() {
        return seriesFolio;
    }

    public FxRevaluationDocument setSeriesFolio(String seriesFolio) {
        this.seriesFolio = seriesFolio;
        return this;
    }

    /**
     * Fecha de emisión (Fecha), hora de la Ciudad de México.
     */
    public String getDate() {
        return date;
    }

    public FxRevaluationDocument setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Moneda de la factura pagada (MonedaDR).
     */
    public String getCurrency() {
        return currency;
    }

    public FxRevaluationDocument setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Lo que faltaba pagar al cierre del mes, en su moneda.
     */
    public BigDecimal getBalance() {
        return balance;
    }

    public FxRevaluationDocument setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    @JsonIgnore
    public FxRevaluationDocument setBalance(double balance) {
        return setBalance(BigDecimal.valueOf(balance));
    }

    /**
     * Su TipoCambio: los pesos por unidad a los que se registró.
     */
    public BigDecimal getBookedRate() {
        return bookedRate;
    }

    public FxRevaluationDocument setBookedRate(BigDecimal bookedRate) {
        this.bookedRate = bookedRate;
        return this;
    }

    @JsonIgnore
    public FxRevaluationDocument setBookedRate(double bookedRate) {
        return setBookedRate(BigDecimal.valueOf(bookedRate));
    }
}
