// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateExpenseMovementParams: los campos de «Registrar dinero dado o devuelto».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateExpenseMovementParams {
    /**
     * anticipo (dinero que se le da antes o durante; hasta que se aprueba), reembolso (lo que la empresa le debe, ya aprobada) o devolucion (lo que le sobró, ya aprobada).
     * <p>
     * Valores: anticipo, reembolso, devolucion.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * En pesos.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Cuándo se pagó.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("date")
    private String date;

    /**
     * transferencia (por omisión), efectivo, tarjeta o nomina (en el siguiente recibo de nómina del empleado; solo si está en Nómina).
     * <p>
     * Valores: transferencia, efectivo, tarjeta, nomina.
     */
    @JsonProperty("method")
    private String method;

    /**
     * Su referencia (folio de la transferencia).
     */
    @JsonProperty("reference")
    private String reference;

    /**
     * anticipo (dinero que se le da antes o durante; hasta que se aprueba), reembolso (lo que la empresa le debe, ya aprobada) o devolucion (lo que le sobró, ya aprobada).
     * <p>
     * Valores: anticipo, reembolso, devolucion.
     * <p>
     * Obligatorio.
     */
    public String getKind() {
        return kind;
    }

    public CreateExpenseMovementParams setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * En pesos.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CreateExpenseMovementParams setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CreateExpenseMovementParams setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Cuándo se pagó.
     * <p>
     * Obligatorio.
     */
    public String getDate() {
        return date;
    }

    public CreateExpenseMovementParams setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * transferencia (por omisión), efectivo, tarjeta o nomina (en el siguiente recibo de nómina del empleado; solo si está en Nómina).
     * <p>
     * Valores: transferencia, efectivo, tarjeta, nomina.
     */
    public String getMethod() {
        return method;
    }

    public CreateExpenseMovementParams setMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * Su referencia (folio de la transferencia).
     */
    public String getReference() {
        return reference;
    }

    public CreateExpenseMovementParams setReference(String reference) {
        this.reference = reference;
        return this;
    }
}
