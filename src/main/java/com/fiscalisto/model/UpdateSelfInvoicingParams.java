// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParams: los campos de «Cambiar las reglas de autofactura».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParams {
    /**
     * Hasta cuándo se puede facturar un ticket: `month`, hasta el fin del mes de la venta (lo usual ante el SAT); `days`, `window_days` días después.
     * <p>
     * Valores: month, days.
     */
    @JsonProperty("window")
    private String window;

    /**
     * Días para facturar con `window: days`.
     */
    @JsonProperty("window_days")
    private Long windowDays;

    /**
     * c_Periodicidad de la factura global con los tickets que nadie facturó: 01 diaria, 02 semanal, 03 quincenal, 04 mensual.
     * <p>
     * Valores: 01, 02, 03, 04.
     */
    @JsonProperty("global_periodicity")
    private String globalPeriodicity;

    /**
     * `auto` (por omisión): los tickets que nadie facturó van solos a la factura global al terminar su periodo. `off`: Fiscalisto no hace factura global de los tickets (por ejemplo, porque su punto de venta ya la hace); quedan pendientes y usted responde por ellos ante el SAT.
     * <p>
     * Valores: auto, off.
     */
    @JsonProperty("global_invoice")
    private String globalInvoice;

    /**
     * `true` (por omisión): el comprador busca su ticket con el código y el total. `false`: solo con el código (sus 4 caracteres al azar; cada ticket se bloquea tras varios intentos fallidos).
     */
    @JsonProperty("ask_total")
    private Boolean askTotal;

    /**
     * El título del portal, en lugar de «Facture su ticket». `null` lo quita.
     */
    @JsonProperty("portal_title")
    private String portalTitle;

    /**
     * Un mensaje bajo el título (instrucciones, horario, a quién escribir). `null` lo quita.
     */
    @JsonProperty("portal_message")
    private String portalMessage;

    /**
     * Dónde encuentra el comprador su código, bajo el campo («Viene en su correo de salida»). `null` pone el de Fiscalisto.
     */
    @JsonProperty("code_hint")
    private String codeHint;

    /**
     * Hasta cuándo se puede facturar un ticket: `month`, hasta el fin del mes de la venta (lo usual ante el SAT); `days`, `window_days` días después.
     * <p>
     * Valores: month, days.
     */
    public String getWindow() {
        return window;
    }

    public UpdateSelfInvoicingParams setWindow(String window) {
        this.window = window;
        return this;
    }

    /**
     * Días para facturar con `window: days`.
     */
    public Long getWindowDays() {
        return windowDays;
    }

    public UpdateSelfInvoicingParams setWindowDays(Long windowDays) {
        this.windowDays = windowDays;
        return this;
    }

    @JsonIgnore
    public UpdateSelfInvoicingParams setWindowDays(long windowDays) {
        return setWindowDays(Long.valueOf(windowDays));
    }

    /**
     * c_Periodicidad de la factura global con los tickets que nadie facturó: 01 diaria, 02 semanal, 03 quincenal, 04 mensual.
     * <p>
     * Valores: 01, 02, 03, 04.
     */
    public String getGlobalPeriodicity() {
        return globalPeriodicity;
    }

    public UpdateSelfInvoicingParams setGlobalPeriodicity(String globalPeriodicity) {
        this.globalPeriodicity = globalPeriodicity;
        return this;
    }

    /**
     * `auto` (por omisión): los tickets que nadie facturó van solos a la factura global al terminar su periodo. `off`: Fiscalisto no hace factura global de los tickets (por ejemplo, porque su punto de venta ya la hace); quedan pendientes y usted responde por ellos ante el SAT.
     * <p>
     * Valores: auto, off.
     */
    public String getGlobalInvoice() {
        return globalInvoice;
    }

    public UpdateSelfInvoicingParams setGlobalInvoice(String globalInvoice) {
        this.globalInvoice = globalInvoice;
        return this;
    }

    /**
     * `true` (por omisión): el comprador busca su ticket con el código y el total. `false`: solo con el código (sus 4 caracteres al azar; cada ticket se bloquea tras varios intentos fallidos).
     */
    public Boolean getAskTotal() {
        return askTotal;
    }

    public UpdateSelfInvoicingParams setAskTotal(Boolean askTotal) {
        this.askTotal = askTotal;
        return this;
    }

    /**
     * El título del portal, en lugar de «Facture su ticket». `null` lo quita.
     */
    public String getPortalTitle() {
        return portalTitle;
    }

    public UpdateSelfInvoicingParams setPortalTitle(String portalTitle) {
        this.portalTitle = portalTitle;
        return this;
    }

    /**
     * Un mensaje bajo el título (instrucciones, horario, a quién escribir). `null` lo quita.
     */
    public String getPortalMessage() {
        return portalMessage;
    }

    public UpdateSelfInvoicingParams setPortalMessage(String portalMessage) {
        this.portalMessage = portalMessage;
        return this;
    }

    /**
     * Dónde encuentra el comprador su código, bajo el campo («Viene en su correo de salida»). `null` pone el de Fiscalisto.
     */
    public String getCodeHint() {
        return codeHint;
    }

    public UpdateSelfInvoicingParams setCodeHint(String codeHint) {
        this.codeHint = codeHint;
        return this;
    }
}
