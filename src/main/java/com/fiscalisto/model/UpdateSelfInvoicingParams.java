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
     * El tema del portal: `auto` (por omisión), el del dispositivo del comprador, que puede cambiarlo; `light` o `dark`, siempre ese. Vale en su página, sus QR y dentro de su sitio (salvo que el código para incrustarlo elija otro).
     * <p>
     * Valores: auto, light, dark.
     */
    @JsonProperty("portal_theme")
    private String portalTheme;

    /**
     * El color de los botones del portal, como `#0b7c77`. `null` pone el de Fiscalisto.
     */
    @JsonProperty("portal_accent")
    private String portalAccent;

    /**
     * Lo redondo de las esquinas del portal, en píxeles (0 a 24). `null` pone el de Fiscalisto (10).
     */
    @JsonProperty("portal_radius")
    private Long portalRadius;

    /**
     * Todo lo demás de cómo se ve el portal (Autofactura › Cómo se ve el portal): acomodo, encabezado, colores, letra, bordes, textos en español e inglés, las formas de dar los datos, el botón para volver a su sitio y CSS propio. Mande solo lo que cambia: `colors`, `ways` y `texts` se combinan por llave (un texto en `null` lo quita); lo demás se reemplaza. `null` regresa todo al diseño de Fiscalisto. La leyenda «Facturado con Fiscalisto» no se puede ocultar.
     */
    @JsonProperty("portal_style")
    private UpdateSelfInvoicingParamsPortalStyle portalStyle;

    /**
     * Cuando se factura una persona moral y retiene (1.25% de ISR a un emisor en RESICO, artículo 113-J de la LISR, o lo que diga el producto): `keep_total` (por omisión), la base crece para que la factura sume lo que se pagó; `subtract`, la base es la del ticket y la retención se resta, así que el total de la factura es menor a lo pagado.
     * <p>
     * Valores: keep_total, subtract.
     */
    @JsonProperty("retention_mode")
    private String retentionMode;

    /**
     * La serie de las facturas que los compradores se hacen en el portal (y las que se emiten desde un ticket), como `AF`: hasta 25 caracteres, sin `|`. `null` o una vacía usa la serie de facturas del emisor. La factura global sigue con la serie de siempre.
     */
    @JsonProperty("invoice_series")
    private String invoiceSeries;

    /**
     * `true`: el portal le pide al comprador una nota para el PDF de su factura (hasta 500 caracteres; Autofactura › Nota del cliente). Solo sale en el PDF, nunca en el XML. Por omisión `false`.
     */
    @JsonProperty("customer_notes")
    private Boolean customerNotes;

    /**
     * Los conceptos de la factura que se hace el comprador (Autofactura › Conceptos de la factura): desglosados o en uno solo, y si el comprador puede elegir. Mande solo lo que cambia; `null` regresa a desglosados sin elección.
     */
    @JsonProperty("invoice_concepts")
    private UpdateSelfInvoicingParamsInvoiceConcepts invoiceConcepts;

    /**
     * Los conceptos de la factura global: `ticket` (por omisión), uno «Venta» por ticket con su folio como `NoIdentificacion`; `summary`, solo el monto total del periodo, uno por combinación de impuestos con `NoIdentificacion` «Resumen» (regla 2.7.1.21 de la RMF 2026). `summary` es solo para un emisor persona física en RESICO (626); otro contesta `invalid_request`.
     * <p>
     * Valores: ticket, summary.
     */
    @JsonProperty("global_concepts")
    private String globalConcepts;

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

    /**
     * El tema del portal: `auto` (por omisión), el del dispositivo del comprador, que puede cambiarlo; `light` o `dark`, siempre ese. Vale en su página, sus QR y dentro de su sitio (salvo que el código para incrustarlo elija otro).
     * <p>
     * Valores: auto, light, dark.
     */
    public String getPortalTheme() {
        return portalTheme;
    }

    public UpdateSelfInvoicingParams setPortalTheme(String portalTheme) {
        this.portalTheme = portalTheme;
        return this;
    }

    /**
     * El color de los botones del portal, como `#0b7c77`. `null` pone el de Fiscalisto.
     */
    public String getPortalAccent() {
        return portalAccent;
    }

    public UpdateSelfInvoicingParams setPortalAccent(String portalAccent) {
        this.portalAccent = portalAccent;
        return this;
    }

    /**
     * Lo redondo de las esquinas del portal, en píxeles (0 a 24). `null` pone el de Fiscalisto (10).
     */
    public Long getPortalRadius() {
        return portalRadius;
    }

    public UpdateSelfInvoicingParams setPortalRadius(Long portalRadius) {
        this.portalRadius = portalRadius;
        return this;
    }

    @JsonIgnore
    public UpdateSelfInvoicingParams setPortalRadius(long portalRadius) {
        return setPortalRadius(Long.valueOf(portalRadius));
    }

    /**
     * Todo lo demás de cómo se ve el portal (Autofactura › Cómo se ve el portal): acomodo, encabezado, colores, letra, bordes, textos en español e inglés, las formas de dar los datos, el botón para volver a su sitio y CSS propio. Mande solo lo que cambia: `colors`, `ways` y `texts` se combinan por llave (un texto en `null` lo quita); lo demás se reemplaza. `null` regresa todo al diseño de Fiscalisto. La leyenda «Facturado con Fiscalisto» no se puede ocultar.
     */
    public UpdateSelfInvoicingParamsPortalStyle getPortalStyle() {
        return portalStyle;
    }

    public UpdateSelfInvoicingParams setPortalStyle(UpdateSelfInvoicingParamsPortalStyle portalStyle) {
        this.portalStyle = portalStyle;
        return this;
    }

    /**
     * Cuando se factura una persona moral y retiene (1.25% de ISR a un emisor en RESICO, artículo 113-J de la LISR, o lo que diga el producto): `keep_total` (por omisión), la base crece para que la factura sume lo que se pagó; `subtract`, la base es la del ticket y la retención se resta, así que el total de la factura es menor a lo pagado.
     * <p>
     * Valores: keep_total, subtract.
     */
    public String getRetentionMode() {
        return retentionMode;
    }

    public UpdateSelfInvoicingParams setRetentionMode(String retentionMode) {
        this.retentionMode = retentionMode;
        return this;
    }

    /**
     * La serie de las facturas que los compradores se hacen en el portal (y las que se emiten desde un ticket), como `AF`: hasta 25 caracteres, sin `|`. `null` o una vacía usa la serie de facturas del emisor. La factura global sigue con la serie de siempre.
     */
    public String getInvoiceSeries() {
        return invoiceSeries;
    }

    public UpdateSelfInvoicingParams setInvoiceSeries(String invoiceSeries) {
        this.invoiceSeries = invoiceSeries;
        return this;
    }

    /**
     * `true`: el portal le pide al comprador una nota para el PDF de su factura (hasta 500 caracteres; Autofactura › Nota del cliente). Solo sale en el PDF, nunca en el XML. Por omisión `false`.
     */
    public Boolean getCustomerNotes() {
        return customerNotes;
    }

    public UpdateSelfInvoicingParams setCustomerNotes(Boolean customerNotes) {
        this.customerNotes = customerNotes;
        return this;
    }

    /**
     * Los conceptos de la factura que se hace el comprador (Autofactura › Conceptos de la factura): desglosados o en uno solo, y si el comprador puede elegir. Mande solo lo que cambia; `null` regresa a desglosados sin elección.
     */
    public UpdateSelfInvoicingParamsInvoiceConcepts getInvoiceConcepts() {
        return invoiceConcepts;
    }

    public UpdateSelfInvoicingParams setInvoiceConcepts(UpdateSelfInvoicingParamsInvoiceConcepts invoiceConcepts) {
        this.invoiceConcepts = invoiceConcepts;
        return this;
    }

    /**
     * Los conceptos de la factura global: `ticket` (por omisión), uno «Venta» por ticket con su folio como `NoIdentificacion`; `summary`, solo el monto total del periodo, uno por combinación de impuestos con `NoIdentificacion` «Resumen» (regla 2.7.1.21 de la RMF 2026). `summary` es solo para un emisor persona física en RESICO (626); otro contesta `invalid_request`.
     * <p>
     * Valores: ticket, summary.
     */
    public String getGlobalConcepts() {
        return globalConcepts;
    }

    public UpdateSelfInvoicingParams setGlobalConcepts(String globalConcepts) {
        this.globalConcepts = globalConcepts;
        return this;
    }
}
