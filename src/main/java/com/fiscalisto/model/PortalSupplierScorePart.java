// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PortalSupplierScorePart: PortalSupplierScorePart.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PortalSupplierScorePart {
    /**
     * invoices (facturas a la primera), deliveries (entregas a tiempo), prices (precio y cantidad de la orden), documents (documentos al día) o complements (complementos de pago).
     * <p>
     * Valores: invoices, deliveries, prices, documents, complements.
     */
    @JsonProperty("part")
    private String part;

    /**
     * Valor de la mercancía (ValorMercancia); obligatorio en transporte aéreo.
     */
    @JsonProperty("value")
    private Long value;

    /**
     * En cuántos de los total casos lo hizo bien.
     */
    @JsonProperty("good")
    private Long good;

    /**
     * Total en la moneda del comprobante (Total).
     */
    @JsonProperty("total")
    private Long total;

    /**
     * invoices (facturas a la primera), deliveries (entregas a tiempo), prices (precio y cantidad de la orden), documents (documentos al día) o complements (complementos de pago).
     * <p>
     * Valores: invoices, deliveries, prices, documents, complements.
     */
    public String getPart() {
        return part;
    }

    public PortalSupplierScorePart setPart(String part) {
        this.part = part;
        return this;
    }

    /**
     * Valor de la mercancía (ValorMercancia); obligatorio en transporte aéreo.
     */
    public Long getValue() {
        return value;
    }

    public PortalSupplierScorePart setValue(Long value) {
        this.value = value;
        return this;
    }

    @JsonIgnore
    public PortalSupplierScorePart setValue(long value) {
        return setValue(Long.valueOf(value));
    }

    /**
     * En cuántos de los total casos lo hizo bien.
     */
    public Long getGood() {
        return good;
    }

    public PortalSupplierScorePart setGood(Long good) {
        this.good = good;
        return this;
    }

    @JsonIgnore
    public PortalSupplierScorePart setGood(long good) {
        return setGood(Long.valueOf(good));
    }

    /**
     * Total en la moneda del comprobante (Total).
     */
    public Long getTotal() {
        return total;
    }

    public PortalSupplierScorePart setTotal(Long total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public PortalSupplierScorePart setTotal(long total) {
        return setTotal(Long.valueOf(total));
    }
}
