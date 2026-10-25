// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceAdvanceApplication: La aplicación del anticipo: método, nota de aplicación y su estado.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceAdvanceApplication {
    /**
     * El anticipo, como factura (inv_…).
     */
    @JsonProperty("advance")
    private String advance;

    /**
     * El folio fiscal del anticipo.
     */
    @JsonProperty("advance_uuid")
    private String advanceUuid;

    /**
     * egreso (la factura completa y después una nota de crédito por el anticipo, opción A) o remanente (la factura solo por lo que falta, opción B).
     * <p>
     * Valores: egreso, remanente.
     */
    @JsonProperty("method")
    private String method;

    /**
     * done (listo) o credit_note_pending (falta timbrar la nota de aplicación: repita la solicitud con la misma Idempotency-Key).
     * <p>
     * Valores: done, credit_note_pending.
     */
    @JsonProperty("status")
    private String status;

    /**
     * La nota de aplicación del anticipo (inv_…), con method egreso.
     */
    @JsonProperty("credit_note")
    private String creditNote;

    /**
     * Por qué no se timbró la nota de aplicación (repita con la misma Idempotency-Key).
     */
    @JsonProperty("credit_note_error")
    private String creditNoteError;

    /**
     * El anticipo, como factura (inv_…).
     */
    public String getAdvance() {
        return advance;
    }

    public InvoiceAdvanceApplication setAdvance(String advance) {
        this.advance = advance;
        return this;
    }

    /**
     * El folio fiscal del anticipo.
     */
    public String getAdvanceUuid() {
        return advanceUuid;
    }

    public InvoiceAdvanceApplication setAdvanceUuid(String advanceUuid) {
        this.advanceUuid = advanceUuid;
        return this;
    }

    /**
     * egreso (la factura completa y después una nota de crédito por el anticipo, opción A) o remanente (la factura solo por lo que falta, opción B).
     * <p>
     * Valores: egreso, remanente.
     */
    public String getMethod() {
        return method;
    }

    public InvoiceAdvanceApplication setMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * done (listo) o credit_note_pending (falta timbrar la nota de aplicación: repita la solicitud con la misma Idempotency-Key).
     * <p>
     * Valores: done, credit_note_pending.
     */
    public String getStatus() {
        return status;
    }

    public InvoiceAdvanceApplication setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * La nota de aplicación del anticipo (inv_…), con method egreso.
     */
    public String getCreditNote() {
        return creditNote;
    }

    public InvoiceAdvanceApplication setCreditNote(String creditNote) {
        this.creditNote = creditNote;
        return this;
    }

    /**
     * Por qué no se timbró la nota de aplicación (repita con la misma Idempotency-Key).
     */
    public String getCreditNoteError() {
        return creditNoteError;
    }

    public InvoiceAdvanceApplication setCreditNoteError(String creditNoteError) {
        this.creditNoteError = creditNoteError;
        return this;
    }
}
