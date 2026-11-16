// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MaterialityInvoiceEvidenceItem: MaterialityInvoiceEvidenceItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MaterialityInvoiceEvidenceItem {
    /**
     * De dónde salió: orden_compra, recepcion, complemento_pago, pago_banco, foto, mensaje_portal…
     */
    @JsonProperty("source")
    private String source;

    /**
     * Lo que prueba: agreement, delivery o payment; null si solo respalda.
     * <p>
     * Valores: agreement, delivery, payment.
     */
    @JsonProperty("proves")
    private String proves;

    /**
     * De dónde salió, en palabras.
     */
    @JsonProperty("label")
    private String label;

    /**
     * De dónde salió: orden_compra, recepcion, complemento_pago, pago_banco, foto, mensaje_portal…
     */
    public String getSource() {
        return source;
    }

    public MaterialityInvoiceEvidenceItem setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Lo que prueba: agreement, delivery o payment; null si solo respalda.
     * <p>
     * Valores: agreement, delivery, payment.
     */
    public String getProves() {
        return proves;
    }

    public MaterialityInvoiceEvidenceItem setProves(String proves) {
        this.proves = proves;
        return this;
    }

    /**
     * De dónde salió, en palabras.
     */
    public String getLabel() {
        return label;
    }

    public MaterialityInvoiceEvidenceItem setLabel(String label) {
        this.label = label;
        return this;
    }
}
