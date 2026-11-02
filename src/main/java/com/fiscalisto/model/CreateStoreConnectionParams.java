// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateStoreConnectionParams: los campos de «Conectar una tienda».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateStoreConnectionParams {
    /**
     * El emisor (iss_…) dueño de la tienda. Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * shopify, woocommerce, mercadolibre, tiendanube o amazon.
     * <p>
     * Valores: shopify, mercadolibre, amazon, tiendanube, woocommerce.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("platform")
    private String platform;

    /**
     * Shopify: el dominio de la tienda (mi-tienda.myshopify.com).
     */
    @JsonProperty("shop")
    private String shop;

    /**
     * Shopify: el Client ID de la app de la tienda (Dev Dashboard).
     */
    @JsonProperty("client_id")
    private String clientId;

    /**
     * Shopify: el Client secret de esa app; con él se firman los webhooks. Se guarda cifrado y nunca se muestra.
     */
    @JsonProperty("client_secret")
    private String clientSecret;

    /**
     * Shopify, solo apps personalizadas antiguas: su token de la Admin API (shpat_…); client_secret es entonces su API secret key.
     */
    @JsonProperty("access_token")
    private String accessToken;

    /**
     * WooCommerce: la dirección de la tienda (https://mitienda.com).
     */
    @JsonProperty("site")
    private String site;

    /**
     * WooCommerce: la Clave de cliente (ck_…) de una llave de la API REST con permisos de Lectura/Escritura.
     */
    @JsonProperty("consumer_key")
    private String consumerKey;

    /**
     * WooCommerce: la Clave secreta de cliente (cs_…) de esa llave. Se guarda cifrada y nunca se muestra.
     */
    @JsonProperty("consumer_secret")
    private String consumerSecret;

    /**
     * Mercado Libre, Tiendanube y Amazon: a dónde volver después de autorizar (se agregan store_connection y status).
     */
    @JsonProperty("return_url")
    private String returnUrl;

    /**
     * Cómo se vuelve ticket cada pedido.
     */
    @JsonProperty("settings")
    private CreateStoreConnectionParamsSettings settings;

    /**
     * El emisor (iss_…) dueño de la tienda. Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateStoreConnectionParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * shopify, woocommerce, mercadolibre, tiendanube o amazon.
     * <p>
     * Valores: shopify, mercadolibre, amazon, tiendanube, woocommerce.
     * <p>
     * Obligatorio.
     */
    public String getPlatform() {
        return platform;
    }

    public CreateStoreConnectionParams setPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Shopify: el dominio de la tienda (mi-tienda.myshopify.com).
     */
    public String getShop() {
        return shop;
    }

    public CreateStoreConnectionParams setShop(String shop) {
        this.shop = shop;
        return this;
    }

    /**
     * Shopify: el Client ID de la app de la tienda (Dev Dashboard).
     */
    public String getClientId() {
        return clientId;
    }

    public CreateStoreConnectionParams setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Shopify: el Client secret de esa app; con él se firman los webhooks. Se guarda cifrado y nunca se muestra.
     */
    public String getClientSecret() {
        return clientSecret;
    }

    public CreateStoreConnectionParams setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Shopify, solo apps personalizadas antiguas: su token de la Admin API (shpat_…); client_secret es entonces su API secret key.
     */
    public String getAccessToken() {
        return accessToken;
    }

    public CreateStoreConnectionParams setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * WooCommerce: la dirección de la tienda (https://mitienda.com).
     */
    public String getSite() {
        return site;
    }

    public CreateStoreConnectionParams setSite(String site) {
        this.site = site;
        return this;
    }

    /**
     * WooCommerce: la Clave de cliente (ck_…) de una llave de la API REST con permisos de Lectura/Escritura.
     */
    public String getConsumerKey() {
        return consumerKey;
    }

    public CreateStoreConnectionParams setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
        return this;
    }

    /**
     * WooCommerce: la Clave secreta de cliente (cs_…) de esa llave. Se guarda cifrada y nunca se muestra.
     */
    public String getConsumerSecret() {
        return consumerSecret;
    }

    public CreateStoreConnectionParams setConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
        return this;
    }

    /**
     * Mercado Libre, Tiendanube y Amazon: a dónde volver después de autorizar (se agregan store_connection y status).
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    public CreateStoreConnectionParams setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }

    /**
     * Cómo se vuelve ticket cada pedido.
     */
    public CreateStoreConnectionParamsSettings getSettings() {
        return settings;
    }

    public CreateStoreConnectionParams setSettings(CreateStoreConnectionParamsSettings settings) {
        this.settings = settings;
        return this;
    }
}
