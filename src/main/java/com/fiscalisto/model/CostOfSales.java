// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CostOfSales: El costo de ventas de un mes en la contabilidad (sistema de inventarios periódico): las compras del mes, el inventario en libros y al cierre, y la póliza que lleva la diferencia a Costo de ventas, si ya se registró.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CostOfSales {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El mes (AAAA-MM).
     */
    @JsonProperty("month")
    private String month;

    /**
     * El último día del mes: la fecha de la póliza.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Las compras del mes por cuenta (código agrupador 502: cargos menos abonos), sin la póliza del mes.
     */
    @JsonProperty("purchases")
    private List<CostOfSalesPurchase> purchases;

    /**
     * Las devoluciones y descuentos sobre compras del mes por cuenta (503: abonos menos cargos).
     */
    @JsonProperty("purchase_returns")
    private List<CostOfSalesPurchaseReturn> purchaseReturns;

    /**
     * purchases − purchase_returns.
     */
    @JsonProperty("net_purchases")
    private BigDecimal netPurchases;

    /**
     * El saldo de las cuentas de inventario (115) al cierre del mes en sus libros, sin la póliza del mes.
     */
    @JsonProperty("book_inventory")
    private BigDecimal bookInventory;

    /**
     * Lo que valen sus existencias al cierre del mes según Inventario (con su método de valuación), o null si no lleva existencias en Fiscalisto: entonces use su conteo físico.
     */
    @JsonProperty("suggested_ending_inventory")
    private BigDecimal suggestedEndingInventory;

    /**
     * La póliza de costo de ventas (mje_…) si ya se registró, o null. Es una póliza a mano de tipo adjustment.
     */
    @JsonProperty("manual_entry")
    private String manualEntry;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public CostOfSales setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public CostOfSales setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CostOfSales setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El mes (AAAA-MM).
     */
    public String getMonth() {
        return month;
    }

    public CostOfSales setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * El último día del mes: la fecha de la póliza.
     */
    public String getDate() {
        return date;
    }

    public CostOfSales setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Las compras del mes por cuenta (código agrupador 502: cargos menos abonos), sin la póliza del mes.
     */
    public List<CostOfSalesPurchase> getPurchases() {
        return purchases;
    }

    public CostOfSales setPurchases(List<CostOfSalesPurchase> purchases) {
        this.purchases = purchases;
        return this;
    }

    /**
     * Las devoluciones y descuentos sobre compras del mes por cuenta (503: abonos menos cargos).
     */
    public List<CostOfSalesPurchaseReturn> getPurchaseReturns() {
        return purchaseReturns;
    }

    public CostOfSales setPurchaseReturns(List<CostOfSalesPurchaseReturn> purchaseReturns) {
        this.purchaseReturns = purchaseReturns;
        return this;
    }

    /**
     * purchases − purchase_returns.
     */
    public BigDecimal getNetPurchases() {
        return netPurchases;
    }

    public CostOfSales setNetPurchases(BigDecimal netPurchases) {
        this.netPurchases = netPurchases;
        return this;
    }

    @JsonIgnore
    public CostOfSales setNetPurchases(double netPurchases) {
        return setNetPurchases(BigDecimal.valueOf(netPurchases));
    }

    /**
     * El saldo de las cuentas de inventario (115) al cierre del mes en sus libros, sin la póliza del mes.
     */
    public BigDecimal getBookInventory() {
        return bookInventory;
    }

    public CostOfSales setBookInventory(BigDecimal bookInventory) {
        this.bookInventory = bookInventory;
        return this;
    }

    @JsonIgnore
    public CostOfSales setBookInventory(double bookInventory) {
        return setBookInventory(BigDecimal.valueOf(bookInventory));
    }

    /**
     * Lo que valen sus existencias al cierre del mes según Inventario (con su método de valuación), o null si no lleva existencias en Fiscalisto: entonces use su conteo físico.
     */
    public BigDecimal getSuggestedEndingInventory() {
        return suggestedEndingInventory;
    }

    public CostOfSales setSuggestedEndingInventory(BigDecimal suggestedEndingInventory) {
        this.suggestedEndingInventory = suggestedEndingInventory;
        return this;
    }

    @JsonIgnore
    public CostOfSales setSuggestedEndingInventory(double suggestedEndingInventory) {
        return setSuggestedEndingInventory(BigDecimal.valueOf(suggestedEndingInventory));
    }

    /**
     * La póliza de costo de ventas (mje_…) si ya se registró, o null. Es una póliza a mano de tipo adjustment.
     */
    public String getManualEntry() {
        return manualEntry;
    }

    public CostOfSales setManualEntry(String manualEntry) {
        this.manualEntry = manualEntry;
        return this;
    }
}
