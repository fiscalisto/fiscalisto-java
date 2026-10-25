// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * Advance: Un anticipo timbrado que aún no se aplica.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Advance {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * Fecha de emisión (Fecha), hora de la Ciudad de México.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Serie (Serie), hasta 25 caracteres. Cada serie lleva sus propios folios.
     */
    @JsonProperty("series")
    private String series;

    /**
     * Folio (Folio). Fiscalisto asigna el siguiente de la serie; mande uno solo si debe ser ese.
     */
    @JsonProperty("folio")
    private String folio;

    /**
     * Cliente (Receptor): el id de uno de su catálogo (cus_…) o sus datos en un objeto.
     */
    @JsonProperty("customer")
    private AdvanceCustomer customer;

    /**
     * El anticipo antes de impuestos.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Total en la moneda del comprobante (Total).
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Tasa de IVA trasladado: 0.16 (por omisión), 0.08 (región fronteriza), 0 o exento.
     */
    @JsonProperty("iva")
    private String iva;

    /**
     * Moneda, clave ISO 4217 de c_Moneda (MXN, USD, EUR…). Por omisión MXN.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Advance setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    public String getUuid() {
        return uuid;
    }

    public Advance setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Fecha de emisión (Fecha), hora de la Ciudad de México.
     */
    public String getDate() {
        return date;
    }

    public Advance setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Serie (Serie), hasta 25 caracteres. Cada serie lleva sus propios folios.
     */
    public String getSeries() {
        return series;
    }

    public Advance setSeries(String series) {
        this.series = series;
        return this;
    }

    /**
     * Folio (Folio). Fiscalisto asigna el siguiente de la serie; mande uno solo si debe ser ese.
     */
    public String getFolio() {
        return folio;
    }

    public Advance setFolio(String folio) {
        this.folio = folio;
        return this;
    }

    /**
     * Cliente (Receptor): el id de uno de su catálogo (cus_…) o sus datos en un objeto.
     */
    public AdvanceCustomer getCustomer() {
        return customer;
    }

    public Advance setCustomer(AdvanceCustomer customer) {
        this.customer = customer;
        return this;
    }

    /**
     * El anticipo antes de impuestos.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public Advance setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public Advance setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Total en la moneda del comprobante (Total).
     */
    public BigDecimal getTotal() {
        return total;
    }

    public Advance setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    public Advance setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Tasa de IVA trasladado: 0.16 (por omisión), 0.08 (región fronteriza), 0 o exento.
     */
    public String getIva() {
        return iva;
    }

    public Advance setIva(String iva) {
        this.iva = iva;
        return this;
    }

    /**
     * Moneda, clave ISO 4217 de c_Moneda (MXN, USD, EUR…). Por omisión MXN.
     */
    public String getCurrency() {
        return currency;
    }

    public Advance setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
}
