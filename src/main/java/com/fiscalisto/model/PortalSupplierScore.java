// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * PortalSupplierScore: Su calificación de 0 a 100 de los últimos 12 meses (value, null sin datos; level excellent, good, fair o poor) y cada parte: invoices (facturas a la primera), deliveries (entregas a tiempo), prices (precio y cantidad de la orden), documents (documentos al día) y complements (complementos de pago), con good de total casos.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PortalSupplierScore {
    /**
     * Valor de la mercancía (ValorMercancia); obligatorio en transporte aéreo.
     */
    @JsonProperty("value")
    private Long value;

    /**
     * Nivel educativo (nivelEducativo).
     * <p>
     * Valores: excellent, good, fair, poor.
     */
    @JsonProperty("level")
    private String level;

    /**
     * Partes del transporte que posee o arrienda (ParteTransporte), c_ParteTransporte.
     */
    @JsonProperty("parts")
    private List<PortalSupplierScorePart> parts;

    /**
     * Valor de la mercancía (ValorMercancia); obligatorio en transporte aéreo.
     */
    public Long getValue() {
        return value;
    }

    public PortalSupplierScore setValue(Long value) {
        this.value = value;
        return this;
    }

    @JsonIgnore
    public PortalSupplierScore setValue(long value) {
        return setValue(Long.valueOf(value));
    }

    /**
     * Nivel educativo (nivelEducativo).
     * <p>
     * Valores: excellent, good, fair, poor.
     */
    public String getLevel() {
        return level;
    }

    public PortalSupplierScore setLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * Partes del transporte que posee o arrienda (ParteTransporte), c_ParteTransporte.
     */
    public List<PortalSupplierScorePart> getParts() {
        return parts;
    }

    public PortalSupplierScore setParts(List<PortalSupplierScorePart> parts) {
        this.parts = parts;
        return this;
    }
}
