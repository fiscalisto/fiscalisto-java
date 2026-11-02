// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SelfInvoicing: El portal de autofactura de un emisor y sus reglas.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SelfInvoicing {
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
     * El portal permanente del emisor: ahí cualquier comprador factura con su código y su total.
     */
    @JsonProperty("portal_url")
    private String portalUrl;

    /**
     * month: se factura hasta el fin del mes de la venta. days: hasta window_days días después.
     * <p>
     * Valores: month, days.
     */
    @JsonProperty("window")
    private String window;

    /**
     * Días para facturar con window: days.
     */
    @JsonProperty("window_days")
    private Long windowDays;

    /**
     * Cada cuánto se timbra sola la factura global con lo que nadie facturó: 01 diaria, 02 semanal, 03 quincenal, 04 mensual.
     * <p>
     * Valores: 01, 02, 03, 04.
     */
    @JsonProperty("global_periodicity")
    private String globalPeriodicity;

    /**
     * auto: los tickets que nadie facturó van solos a la factura global de su periodo. off: Fiscalisto no hace factura global de estos tickets (la hace usted en otro lado).
     * <p>
     * Valores: auto, off.
     */
    @JsonProperty("global_invoice")
    private String globalInvoice;

    /**
     * Si el portal pide el total para encontrar el ticket (true) o solo su código (false).
     */
    @JsonProperty("ask_total")
    private Boolean askTotal;

    /**
     * El título del portal, o null para «Facture su ticket».
     */
    @JsonProperty("portal_title")
    private String portalTitle;

    /**
     * El mensaje bajo el título, o null.
     */
    @JsonProperty("portal_message")
    private String portalMessage;

    /**
     * Dónde encuentra el comprador su código, bajo el campo; null para el texto de Fiscalisto.
     */
    @JsonProperty("code_hint")
    private String codeHint;

    /**
     * auto: el tema del dispositivo del comprador, que puede cambiarlo. light o dark: siempre ese, en la página del portal, sus QR y dentro de su sitio.
     * <p>
     * Valores: auto, light, dark.
     */
    @JsonProperty("portal_theme")
    private String portalTheme;

    /**
     * El color de los botones del portal («#rrggbb»), o null para el de Fiscalisto.
     */
    @JsonProperty("portal_accent")
    private String portalAccent;

    /**
     * Las esquinas del portal en píxeles (0 a 24), o null para las de Fiscalisto.
     */
    @JsonProperty("portal_radius")
    private Long portalRadius;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public SelfInvoicing setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public SelfInvoicing setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public SelfInvoicing setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El portal permanente del emisor: ahí cualquier comprador factura con su código y su total.
     */
    public String getPortalUrl() {
        return portalUrl;
    }

    public SelfInvoicing setPortalUrl(String portalUrl) {
        this.portalUrl = portalUrl;
        return this;
    }

    /**
     * month: se factura hasta el fin del mes de la venta. days: hasta window_days días después.
     * <p>
     * Valores: month, days.
     */
    public String getWindow() {
        return window;
    }

    public SelfInvoicing setWindow(String window) {
        this.window = window;
        return this;
    }

    /**
     * Días para facturar con window: days.
     */
    public Long getWindowDays() {
        return windowDays;
    }

    public SelfInvoicing setWindowDays(Long windowDays) {
        this.windowDays = windowDays;
        return this;
    }

    @JsonIgnore
    public SelfInvoicing setWindowDays(long windowDays) {
        return setWindowDays(Long.valueOf(windowDays));
    }

    /**
     * Cada cuánto se timbra sola la factura global con lo que nadie facturó: 01 diaria, 02 semanal, 03 quincenal, 04 mensual.
     * <p>
     * Valores: 01, 02, 03, 04.
     */
    public String getGlobalPeriodicity() {
        return globalPeriodicity;
    }

    public SelfInvoicing setGlobalPeriodicity(String globalPeriodicity) {
        this.globalPeriodicity = globalPeriodicity;
        return this;
    }

    /**
     * auto: los tickets que nadie facturó van solos a la factura global de su periodo. off: Fiscalisto no hace factura global de estos tickets (la hace usted en otro lado).
     * <p>
     * Valores: auto, off.
     */
    public String getGlobalInvoice() {
        return globalInvoice;
    }

    public SelfInvoicing setGlobalInvoice(String globalInvoice) {
        this.globalInvoice = globalInvoice;
        return this;
    }

    /**
     * Si el portal pide el total para encontrar el ticket (true) o solo su código (false).
     */
    public Boolean getAskTotal() {
        return askTotal;
    }

    public SelfInvoicing setAskTotal(Boolean askTotal) {
        this.askTotal = askTotal;
        return this;
    }

    /**
     * El título del portal, o null para «Facture su ticket».
     */
    public String getPortalTitle() {
        return portalTitle;
    }

    public SelfInvoicing setPortalTitle(String portalTitle) {
        this.portalTitle = portalTitle;
        return this;
    }

    /**
     * El mensaje bajo el título, o null.
     */
    public String getPortalMessage() {
        return portalMessage;
    }

    public SelfInvoicing setPortalMessage(String portalMessage) {
        this.portalMessage = portalMessage;
        return this;
    }

    /**
     * Dónde encuentra el comprador su código, bajo el campo; null para el texto de Fiscalisto.
     */
    public String getCodeHint() {
        return codeHint;
    }

    public SelfInvoicing setCodeHint(String codeHint) {
        this.codeHint = codeHint;
        return this;
    }

    /**
     * auto: el tema del dispositivo del comprador, que puede cambiarlo. light o dark: siempre ese, en la página del portal, sus QR y dentro de su sitio.
     * <p>
     * Valores: auto, light, dark.
     */
    public String getPortalTheme() {
        return portalTheme;
    }

    public SelfInvoicing setPortalTheme(String portalTheme) {
        this.portalTheme = portalTheme;
        return this;
    }

    /**
     * El color de los botones del portal («#rrggbb»), o null para el de Fiscalisto.
     */
    public String getPortalAccent() {
        return portalAccent;
    }

    public SelfInvoicing setPortalAccent(String portalAccent) {
        this.portalAccent = portalAccent;
        return this;
    }

    /**
     * Las esquinas del portal en píxeles (0 a 24), o null para las de Fiscalisto.
     */
    public Long getPortalRadius() {
        return portalRadius;
    }

    public SelfInvoicing setPortalRadius(Long portalRadius) {
        this.portalRadius = portalRadius;
        return this;
    }

    @JsonIgnore
    public SelfInvoicing setPortalRadius(long portalRadius) {
        return setPortalRadius(Long.valueOf(portalRadius));
    }
}
