// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParamsPortalStyleColors: Los colores de la página; cada uno se combina con lo guardado.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsPortalStyleColors {
    /**
     * El fondo de la página, como `#f5f1e8`; `null` usa el del tema.
     */
    @JsonProperty("background")
    private String background;

    /**
     * El fondo de los campos y tarjetas, como `#f5f1e8`; `null` usa el del tema.
     */
    @JsonProperty("card")
    private String card;

    /**
     * El texto, como `#f5f1e8`; `null` usa el del tema.
     */
    @JsonProperty("text")
    private String text;

    /**
     * El texto de los botones, como `#f5f1e8`; `null` usa el del tema.
     */
    @JsonProperty("button_text")
    private String buttonText;

    /**
     * El fondo de la página, como `#f5f1e8`; `null` usa el del tema.
     */
    public String getBackground() {
        return background;
    }

    public UpdateSelfInvoicingParamsPortalStyleColors setBackground(String background) {
        this.background = background;
        return this;
    }

    /**
     * El fondo de los campos y tarjetas, como `#f5f1e8`; `null` usa el del tema.
     */
    public String getCard() {
        return card;
    }

    public UpdateSelfInvoicingParamsPortalStyleColors setCard(String card) {
        this.card = card;
        return this;
    }

    /**
     * El texto, como `#f5f1e8`; `null` usa el del tema.
     */
    public String getText() {
        return text;
    }

    public UpdateSelfInvoicingParamsPortalStyleColors setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * El texto de los botones, como `#f5f1e8`; `null` usa el del tema.
     */
    public String getButtonText() {
        return buttonText;
    }

    public UpdateSelfInvoicingParamsPortalStyleColors setButtonText(String buttonText) {
        this.buttonText = buttonText;
        return this;
    }
}
