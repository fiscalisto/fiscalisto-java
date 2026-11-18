// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * PortalStyle: Cómo se ve el portal además de su tema, color y esquinas (Autofactura › Cómo se ve el portal).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PortalStyle {
    /**
     * checkout: la factura se llena junto al formulario. compact: solo el formulario, la factura plegada. card: el formulario en una tarjeta al centro.
     * <p>
     * Valores: checkout, compact, card.
     */
    @JsonProperty("layout")
    private String layout;

    /**
     * comfortable o compact.
     * <p>
     * Valores: comfortable, compact.
     */
    @JsonProperty("density")
    private String density;

    /**
     * Qué dice arriba: name_rfc, name, logo_name o logo.
     * <p>
     * Valores: logo, name, name_rfc, logo_name.
     */
    @JsonProperty("header")
    private String header;

    /**
     * El tamaño del logo: s, m o l.
     * <p>
     * Valores: s, m, l.
     */
    @JsonProperty("logo_size")
    private String logoSize;

    /**
     * La forma del logo: square, rounded o circle.
     * <p>
     * Valores: square, rounded, circle.
     */
    @JsonProperty("logo_shape")
    private String logoShape;

    /**
     * La letra: system o una de Google Fonts.
     */
    @JsonProperty("font")
    private String font;

    /**
     * La letra de los títulos, o null para la misma del texto.
     */
    @JsonProperty("heading_font")
    private String headingFont;

    /**
     * El tamaño del título: s, m o l.
     * <p>
     * Valores: s, m, l.
     */
    @JsonProperty("heading_size")
    private String headingSize;

    /**
     * Los bordes: none, subtle o strong.
     * <p>
     * Valores: none, subtle, strong.
     */
    @JsonProperty("borders")
    private String borders;

    /**
     * La sombra: none, soft o strong.
     * <p>
     * Valores: none, soft, strong.
     */
    @JsonProperty("shadow")
    private String shadow;

    /**
     * Las formas de dar sus datos además de escribirlos.
     */
    @JsonProperty("ways")
    private PortalStyleWays ways;

    /**
     * Si no se factura sin correo.
     */
    @JsonProperty("email_required")
    private Boolean emailRequired;

    /**
     * Si dice hasta cuándo se puede facturar.
     */
    @JsonProperty("show_deadline")
    private Boolean showDeadline;

    /**
     * El botón al terminar para volver a su sitio, o null.
     */
    @JsonProperty("back")
    private PortalStyleBack back;

    /**
     * CSS propio, ya limpio.
     */
    @JsonProperty("css")
    private String css;

    /**
     * Los colores de la página; null usa el del tema.
     */
    @JsonProperty("colors")
    private PortalStyleColors colors;

    /**
     * Los textos propios por llave (step_ticket, submit, success_title…), cada uno con es y en. Uno que falta lleva el de Fiscalisto.
     */
    @JsonProperty("texts")
    private Map<String, Object> texts;

    /**
     * checkout: la factura se llena junto al formulario. compact: solo el formulario, la factura plegada. card: el formulario en una tarjeta al centro.
     * <p>
     * Valores: checkout, compact, card.
     */
    public String getLayout() {
        return layout;
    }

    public PortalStyle setLayout(String layout) {
        this.layout = layout;
        return this;
    }

    /**
     * comfortable o compact.
     * <p>
     * Valores: comfortable, compact.
     */
    public String getDensity() {
        return density;
    }

    public PortalStyle setDensity(String density) {
        this.density = density;
        return this;
    }

    /**
     * Qué dice arriba: name_rfc, name, logo_name o logo.
     * <p>
     * Valores: logo, name, name_rfc, logo_name.
     */
    public String getHeader() {
        return header;
    }

    public PortalStyle setHeader(String header) {
        this.header = header;
        return this;
    }

    /**
     * El tamaño del logo: s, m o l.
     * <p>
     * Valores: s, m, l.
     */
    public String getLogoSize() {
        return logoSize;
    }

    public PortalStyle setLogoSize(String logoSize) {
        this.logoSize = logoSize;
        return this;
    }

    /**
     * La forma del logo: square, rounded o circle.
     * <p>
     * Valores: square, rounded, circle.
     */
    public String getLogoShape() {
        return logoShape;
    }

    public PortalStyle setLogoShape(String logoShape) {
        this.logoShape = logoShape;
        return this;
    }

    /**
     * La letra: system o una de Google Fonts.
     */
    public String getFont() {
        return font;
    }

    public PortalStyle setFont(String font) {
        this.font = font;
        return this;
    }

    /**
     * La letra de los títulos, o null para la misma del texto.
     */
    public String getHeadingFont() {
        return headingFont;
    }

    public PortalStyle setHeadingFont(String headingFont) {
        this.headingFont = headingFont;
        return this;
    }

    /**
     * El tamaño del título: s, m o l.
     * <p>
     * Valores: s, m, l.
     */
    public String getHeadingSize() {
        return headingSize;
    }

    public PortalStyle setHeadingSize(String headingSize) {
        this.headingSize = headingSize;
        return this;
    }

    /**
     * Los bordes: none, subtle o strong.
     * <p>
     * Valores: none, subtle, strong.
     */
    public String getBorders() {
        return borders;
    }

    public PortalStyle setBorders(String borders) {
        this.borders = borders;
        return this;
    }

    /**
     * La sombra: none, soft o strong.
     * <p>
     * Valores: none, soft, strong.
     */
    public String getShadow() {
        return shadow;
    }

    public PortalStyle setShadow(String shadow) {
        this.shadow = shadow;
        return this;
    }

    /**
     * Las formas de dar sus datos además de escribirlos.
     */
    public PortalStyleWays getWays() {
        return ways;
    }

    public PortalStyle setWays(PortalStyleWays ways) {
        this.ways = ways;
        return this;
    }

    /**
     * Si no se factura sin correo.
     */
    public Boolean getEmailRequired() {
        return emailRequired;
    }

    public PortalStyle setEmailRequired(Boolean emailRequired) {
        this.emailRequired = emailRequired;
        return this;
    }

    /**
     * Si dice hasta cuándo se puede facturar.
     */
    public Boolean getShowDeadline() {
        return showDeadline;
    }

    public PortalStyle setShowDeadline(Boolean showDeadline) {
        this.showDeadline = showDeadline;
        return this;
    }

    /**
     * El botón al terminar para volver a su sitio, o null.
     */
    public PortalStyleBack getBack() {
        return back;
    }

    public PortalStyle setBack(PortalStyleBack back) {
        this.back = back;
        return this;
    }

    /**
     * CSS propio, ya limpio.
     */
    public String getCss() {
        return css;
    }

    public PortalStyle setCss(String css) {
        this.css = css;
        return this;
    }

    /**
     * Los colores de la página; null usa el del tema.
     */
    public PortalStyleColors getColors() {
        return colors;
    }

    public PortalStyle setColors(PortalStyleColors colors) {
        this.colors = colors;
        return this;
    }

    /**
     * Los textos propios por llave (step_ticket, submit, success_title…), cada uno con es y en. Uno que falta lleva el de Fiscalisto.
     */
    public Map<String, Object> getTexts() {
        return texts;
    }

    public PortalStyle setTexts(Map<String, Object> texts) {
        this.texts = texts;
        return this;
    }
}
