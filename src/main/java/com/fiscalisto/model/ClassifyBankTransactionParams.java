// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ClassifyBankTransactionParams: los campos de «Explicar un depósito sin factura».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClassifyBankTransactionParams {
    /**
     * venta (una venta que aún no se factura), prestamo, traspaso (entre cuentas propias), devolucion o intereses (los que paga el banco; ingreso acumulable).
     * <p>
     * Valores: venta, prestamo, traspaso, devolucion, intereses.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("classification")
    private String classification;

    /**
     * Una nota para su equipo (de dónde vino, por qué).
     */
    @JsonProperty("note")
    private String note;

    /**
     * venta (una venta que aún no se factura), prestamo, traspaso (entre cuentas propias), devolucion o intereses (los que paga el banco; ingreso acumulable).
     * <p>
     * Valores: venta, prestamo, traspaso, devolucion, intereses.
     * <p>
     * Obligatorio.
     */
    public String getClassification() {
        return classification;
    }

    public ClassifyBankTransactionParams setClassification(String classification) {
        this.classification = classification;
        return this;
    }

    /**
     * Una nota para su equipo (de dónde vino, por qué).
     */
    public String getNote() {
        return note;
    }

    public ClassifyBankTransactionParams setNote(String note) {
        this.note = note;
        return this;
    }
}
