// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PortalStyleColors: Los colores de la página; null usa el del tema.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PortalStyleColors {
    /**
     * El fondo de la página, o null.
     */
    @JsonProperty("background")
    private String background;

    /**
     * El fondo de los campos y tarjetas, o null.
     */
    @JsonProperty("card")
    private String card;

    /**
     * El texto, o null.
     */
    @JsonProperty("text")
    private String text;

    /**
     * El texto de los botones, o null.
     */
    @JsonProperty("button_text")
    private String buttonText;

    /**
     * El fondo de la página, o null.
     */
    public String getBackground() {
        return background;
    }

    public PortalStyleColors setBackground(String background) {
        this.background = background;
        return this;
    }

    /**
     * El fondo de los campos y tarjetas, o null.
     */
    public String getCard() {
        return card;
    }

    public PortalStyleColors setCard(String card) {
        this.card = card;
        return this;
    }

    /**
     * El texto, o null.
     */
    public String getText() {
        return text;
    }

    public PortalStyleColors setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * El texto de los botones, o null.
     */
    public String getButtonText() {
        return buttonText;
    }

    public PortalStyleColors setButtonText(String buttonText) {
        this.buttonText = buttonText;
        return this;
    }
}
