// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StoreConnection: Una tienda de Shopify o Mercado Libre cuyos pedidos pagados se vuelven tickets de autofactura del emisor.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StoreConnection {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, evt_, whe_).
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
     * El emisor dueño de la tienda.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * shopify o mercadolibre.
     * <p>
     * Valores: shopify, mercadolibre.
     */
    @JsonProperty("platform")
    private String platform;

    /**
     * El dominio de la tienda de Shopify, o el id del vendedor en Mercado Libre (al autorizar).
     */
    @JsonProperty("shop")
    private String shop;

    /**
     * pending (Mercado Libre espera que el vendedor autorice en authorize_url), active o disconnected.
     * <p>
     * Valores: pending, active, disconnected.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Si está pending: la página de Mercado Libre donde el vendedor autoriza (vale un día; cada consulta da una nueva). Si no, null.
     */
    @JsonProperty("authorize_url")
    private String authorizeUrl;

    /**
     * Cómo se vuelve ticket cada pedido.
     */
    @JsonProperty("settings")
    private StoreConnectionSettings settings;

    /**
     * Cuántos pedidos se han vuelto tickets.
     */
    @JsonProperty("orders_count")
    private Long ordersCount;

    /**
     * Cuándo llegó el último, o null.
     */
    @JsonProperty("last_order_at")
    private String lastOrderAt;

    /**
     * El último problema (un pedido en dólares, un ticket que ya se facturó cuando se canceló el pedido…), o null.
     */
    @JsonProperty("last_error")
    private StoreConnectionLastError lastError;

    /**
     * Cuándo se conectó.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public StoreConnection setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public StoreConnection setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public StoreConnection setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor dueño de la tienda.
     */
    public String getIssuer() {
        return issuer;
    }

    public StoreConnection setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * shopify o mercadolibre.
     * <p>
     * Valores: shopify, mercadolibre.
     */
    public String getPlatform() {
        return platform;
    }

    public StoreConnection setPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * El dominio de la tienda de Shopify, o el id del vendedor en Mercado Libre (al autorizar).
     */
    public String getShop() {
        return shop;
    }

    public StoreConnection setShop(String shop) {
        this.shop = shop;
        return this;
    }

    /**
     * pending (Mercado Libre espera que el vendedor autorice en authorize_url), active o disconnected.
     * <p>
     * Valores: pending, active, disconnected.
     */
    public String getStatus() {
        return status;
    }

    public StoreConnection setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Si está pending: la página de Mercado Libre donde el vendedor autoriza (vale un día; cada consulta da una nueva). Si no, null.
     */
    public String getAuthorizeUrl() {
        return authorizeUrl;
    }

    public StoreConnection setAuthorizeUrl(String authorizeUrl) {
        this.authorizeUrl = authorizeUrl;
        return this;
    }

    /**
     * Cómo se vuelve ticket cada pedido.
     */
    public StoreConnectionSettings getSettings() {
        return settings;
    }

    public StoreConnection setSettings(StoreConnectionSettings settings) {
        this.settings = settings;
        return this;
    }

    /**
     * Cuántos pedidos se han vuelto tickets.
     */
    public Long getOrdersCount() {
        return ordersCount;
    }

    public StoreConnection setOrdersCount(Long ordersCount) {
        this.ordersCount = ordersCount;
        return this;
    }

    @JsonIgnore
    public StoreConnection setOrdersCount(long ordersCount) {
        return setOrdersCount(Long.valueOf(ordersCount));
    }

    /**
     * Cuándo llegó el último, o null.
     */
    public String getLastOrderAt() {
        return lastOrderAt;
    }

    public StoreConnection setLastOrderAt(String lastOrderAt) {
        this.lastOrderAt = lastOrderAt;
        return this;
    }

    /**
     * El último problema (un pedido en dólares, un ticket que ya se facturó cuando se canceló el pedido…), o null.
     */
    public StoreConnectionLastError getLastError() {
        return lastError;
    }

    public StoreConnection setLastError(StoreConnectionLastError lastError) {
        this.lastError = lastError;
        return this;
    }

    /**
     * Cuándo se conectó.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public StoreConnection setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
