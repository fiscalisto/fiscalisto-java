// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParamsPortalStyle: UpdateSelfInvoicingParamsPortalStyle.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsPortalStyle {
    /**
     * `checkout` (por omisión): la factura se llena junto al formulario. `compact`: solo el formulario, la factura plegada. `card`: el formulario en una tarjeta al centro.
     * <p>
     * Valores: checkout, compact, card.
     */
    @JsonProperty("layout")
    private String layout;

    /**
     * `comfortable` o `compact`.
     * <p>
     * Valores: comfortable, compact.
     */
    @JsonProperty("density")
    private String density;

    /**
     * Qué dice arriba: `name_rfc` (por omisión), `name`, `logo_name` o `logo`. El logo y el nombre salen de Marca y documentos.
     * <p>
     * Valores: logo, name, name_rfc, logo_name.
     */
    @JsonProperty("header")
    private String header;

    /**
     * El tamaño del logo: `s`, `m` o `l`.
     * <p>
     * Valores: s, m, l.
     */
    @JsonProperty("logo_size")
    private String logoSize;

    /**
     * La forma del logo: `square`, `rounded` o `circle`.
     * <p>
     * Valores: square, rounded, circle.
     */
    @JsonProperty("logo_shape")
    private String logoShape;

    /**
     * Los colores de la página; cada uno se combina con lo guardado.
     */
    @JsonProperty("colors")
    private UpdateSelfInvoicingParamsPortalStyleColors colors;

    /**
     * La letra: `system` (por omisión) o una de Google Fonts.
     * <p>
     * Valores: system, inter, manrope, dm-sans, work-sans, nunito, space-grotesk, montserrat, lora, merriweather, playfair-display, cormorant-garamond.
     */
    @JsonProperty("font")
    private String font;

    /**
     * La letra de los títulos; `null`, la misma del texto.
     * <p>
     * Valores: system, inter, manrope, dm-sans, work-sans, nunito, space-grotesk, montserrat, lora, merriweather, playfair-display, cormorant-garamond.
     */
    @JsonProperty("heading_font")
    private String headingFont;

    /**
     * El tamaño del título: `s`, `m` o `l`.
     * <p>
     * Valores: s, m, l.
     */
    @JsonProperty("heading_size")
    private String headingSize;

    /**
     * Los bordes: `none`, `subtle` (por omisión) o `strong`.
     * <p>
     * Valores: none, subtle, strong.
     */
    @JsonProperty("borders")
    private String borders;

    /**
     * La sombra: `none`, `soft` (por omisión) o `strong`.
     * <p>
     * Valores: none, soft, strong.
     */
    @JsonProperty("shadow")
    private String shadow;

    /**
     * Cómo llama el portal a lo que se factura, en todos sus textos: `ticket` (por omisión), `nota`, `cuenta`, `compra`, `pedido`, `orden`, `reservacion`, `estancia` o `boleto`. Un hotel usa `reservacion`: «Esta reservación ya se facturó».
     * <p>
     * Valores: ticket, nota, cuenta, compra, pedido, orden, reservacion, estancia, boleto.
     */
    @JsonProperty("noun")
    private String noun;

    /**
     * Los textos, cada uno con `es` y `en`, combinados por llave con lo guardado. El título, el mensaje y dónde viene el código en español son `portal_title`, `portal_message` y `code_hint`; aquí van en inglés.
     */
    @JsonProperty("texts")
    private UpdateSelfInvoicingParamsPortalStyleTexts texts;

    /**
     * Las formas de dar sus datos además de escribirlos. Todas `true` por omisión menos `norfc`.
     */
    @JsonProperty("ways")
    private UpdateSelfInvoicingParamsPortalStyleWays ways;

    /**
     * `true`: no se factura sin correo. Por omisión `false`.
     */
    @JsonProperty("email_required")
    private Boolean emailRequired;

    /**
     * Decir hasta cuándo se puede facturar. Por omisión `true`.
     */
    @JsonProperty("show_deadline")
    private Boolean showDeadline;

    /**
     * Un botón al terminar para volver a su sitio; `null` lo quita.
     */
    @JsonProperty("back")
    private UpdateSelfInvoicingParamsPortalStyleBack back;

    /**
     * CSS propio, dentro del portal y sin llegar a su pie. Se quitan &#64;import, url() y lo que cargue o ejecute algo; la leyenda «Facturado con Fiscalisto» se queda.
     */
    @JsonProperty("css")
    private String css;

    /**
     * `checkout` (por omisión): la factura se llena junto al formulario. `compact`: solo el formulario, la factura plegada. `card`: el formulario en una tarjeta al centro.
     * <p>
     * Valores: checkout, compact, card.
     */
    public String getLayout() {
        return layout;
    }

    public UpdateSelfInvoicingParamsPortalStyle setLayout(String layout) {
        this.layout = layout;
        return this;
    }

    /**
     * `comfortable` o `compact`.
     * <p>
     * Valores: comfortable, compact.
     */
    public String getDensity() {
        return density;
    }

    public UpdateSelfInvoicingParamsPortalStyle setDensity(String density) {
        this.density = density;
        return this;
    }

    /**
     * Qué dice arriba: `name_rfc` (por omisión), `name`, `logo_name` o `logo`. El logo y el nombre salen de Marca y documentos.
     * <p>
     * Valores: logo, name, name_rfc, logo_name.
     */
    public String getHeader() {
        return header;
    }

    public UpdateSelfInvoicingParamsPortalStyle setHeader(String header) {
        this.header = header;
        return this;
    }

    /**
     * El tamaño del logo: `s`, `m` o `l`.
     * <p>
     * Valores: s, m, l.
     */
    public String getLogoSize() {
        return logoSize;
    }

    public UpdateSelfInvoicingParamsPortalStyle setLogoSize(String logoSize) {
        this.logoSize = logoSize;
        return this;
    }

    /**
     * La forma del logo: `square`, `rounded` o `circle`.
     * <p>
     * Valores: square, rounded, circle.
     */
    public String getLogoShape() {
        return logoShape;
    }

    public UpdateSelfInvoicingParamsPortalStyle setLogoShape(String logoShape) {
        this.logoShape = logoShape;
        return this;
    }

    /**
     * Los colores de la página; cada uno se combina con lo guardado.
     */
    public UpdateSelfInvoicingParamsPortalStyleColors getColors() {
        return colors;
    }

    public UpdateSelfInvoicingParamsPortalStyle setColors(UpdateSelfInvoicingParamsPortalStyleColors colors) {
        this.colors = colors;
        return this;
    }

    /**
     * La letra: `system` (por omisión) o una de Google Fonts.
     * <p>
     * Valores: system, inter, manrope, dm-sans, work-sans, nunito, space-grotesk, montserrat, lora, merriweather, playfair-display, cormorant-garamond.
     */
    public String getFont() {
        return font;
    }

    public UpdateSelfInvoicingParamsPortalStyle setFont(String font) {
        this.font = font;
        return this;
    }

    /**
     * La letra de los títulos; `null`, la misma del texto.
     * <p>
     * Valores: system, inter, manrope, dm-sans, work-sans, nunito, space-grotesk, montserrat, lora, merriweather, playfair-display, cormorant-garamond.
     */
    public String getHeadingFont() {
        return headingFont;
    }

    public UpdateSelfInvoicingParamsPortalStyle setHeadingFont(String headingFont) {
        this.headingFont = headingFont;
        return this;
    }

    /**
     * El tamaño del título: `s`, `m` o `l`.
     * <p>
     * Valores: s, m, l.
     */
    public String getHeadingSize() {
        return headingSize;
    }

    public UpdateSelfInvoicingParamsPortalStyle setHeadingSize(String headingSize) {
        this.headingSize = headingSize;
        return this;
    }

    /**
     * Los bordes: `none`, `subtle` (por omisión) o `strong`.
     * <p>
     * Valores: none, subtle, strong.
     */
    public String getBorders() {
        return borders;
    }

    public UpdateSelfInvoicingParamsPortalStyle setBorders(String borders) {
        this.borders = borders;
        return this;
    }

    /**
     * La sombra: `none`, `soft` (por omisión) o `strong`.
     * <p>
     * Valores: none, soft, strong.
     */
    public String getShadow() {
        return shadow;
    }

    public UpdateSelfInvoicingParamsPortalStyle setShadow(String shadow) {
        this.shadow = shadow;
        return this;
    }

    /**
     * Cómo llama el portal a lo que se factura, en todos sus textos: `ticket` (por omisión), `nota`, `cuenta`, `compra`, `pedido`, `orden`, `reservacion`, `estancia` o `boleto`. Un hotel usa `reservacion`: «Esta reservación ya se facturó».
     * <p>
     * Valores: ticket, nota, cuenta, compra, pedido, orden, reservacion, estancia, boleto.
     */
    public String getNoun() {
        return noun;
    }

    public UpdateSelfInvoicingParamsPortalStyle setNoun(String noun) {
        this.noun = noun;
        return this;
    }

    /**
     * Los textos, cada uno con `es` y `en`, combinados por llave con lo guardado. El título, el mensaje y dónde viene el código en español son `portal_title`, `portal_message` y `code_hint`; aquí van en inglés.
     */
    public UpdateSelfInvoicingParamsPortalStyleTexts getTexts() {
        return texts;
    }

    public UpdateSelfInvoicingParamsPortalStyle setTexts(UpdateSelfInvoicingParamsPortalStyleTexts texts) {
        this.texts = texts;
        return this;
    }

    /**
     * Las formas de dar sus datos además de escribirlos. Todas `true` por omisión menos `norfc`.
     */
    public UpdateSelfInvoicingParamsPortalStyleWays getWays() {
        return ways;
    }

    public UpdateSelfInvoicingParamsPortalStyle setWays(UpdateSelfInvoicingParamsPortalStyleWays ways) {
        this.ways = ways;
        return this;
    }

    /**
     * `true`: no se factura sin correo. Por omisión `false`.
     */
    public Boolean getEmailRequired() {
        return emailRequired;
    }

    public UpdateSelfInvoicingParamsPortalStyle setEmailRequired(Boolean emailRequired) {
        this.emailRequired = emailRequired;
        return this;
    }

    /**
     * Decir hasta cuándo se puede facturar. Por omisión `true`.
     */
    public Boolean getShowDeadline() {
        return showDeadline;
    }

    public UpdateSelfInvoicingParamsPortalStyle setShowDeadline(Boolean showDeadline) {
        this.showDeadline = showDeadline;
        return this;
    }

    /**
     * Un botón al terminar para volver a su sitio; `null` lo quita.
     */
    public UpdateSelfInvoicingParamsPortalStyleBack getBack() {
        return back;
    }

    public UpdateSelfInvoicingParamsPortalStyle setBack(UpdateSelfInvoicingParamsPortalStyleBack back) {
        this.back = back;
        return this;
    }

    /**
     * CSS propio, dentro del portal y sin llegar a su pie. Se quitan &#64;import, url() y lo que cargue o ejecute algo; la leyenda «Facturado con Fiscalisto» se queda.
     */
    public String getCss() {
        return css;
    }

    public UpdateSelfInvoicingParamsPortalStyle setCss(String css) {
        this.css = css;
        return this;
    }
}
