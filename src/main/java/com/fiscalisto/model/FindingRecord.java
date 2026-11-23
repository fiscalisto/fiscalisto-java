// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FindingRecord: En qué registro está.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FindingRecord {
    /**
     * purchase_order, payout, supplier, poliza (la contabilidad de un mes), account (una cuenta en un mes), bank_movement, expense_report (una comprobación de viáticos), expense_ticket (un ticket de compra), product (la existencia de un producto), customer (un cliente) o employee (un empleado).
     * <p>
     * Valores: purchase_order, payout, supplier, poliza, account, bank_movement, expense_report, expense_ticket, product, customer, employee.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Su id en la API: el pago (pyo_…), la comprobación (exr_…), el ticket (rct_…), el producto (prd_…), el cliente (cus_…), el empleado (emp_…) o el RFC del proveedor; null si no tiene.
     */
    @JsonProperty("id")
    private String id;

    /**
     * Cómo lo nombra Fiscalisto: el número de la orden, el RFC, «RFC:AAAA-MM» un mes de contabilidad, «RFC:AAAA-MM:cuenta» una cuenta.
     */
    @JsonProperty("reference")
    private String reference;

    /**
     * El registro en palabras: «Orden de compra 12».
     */
    @JsonProperty("description")
    private String description;

    /**
     * purchase_order, payout, supplier, poliza (la contabilidad de un mes), account (una cuenta en un mes), bank_movement, expense_report (una comprobación de viáticos), expense_ticket (un ticket de compra), product (la existencia de un producto), customer (un cliente) o employee (un empleado).
     * <p>
     * Valores: purchase_order, payout, supplier, poliza, account, bank_movement, expense_report, expense_ticket, product, customer, employee.
     */
    public String getType() {
        return type;
    }

    public FindingRecord setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Su id en la API: el pago (pyo_…), la comprobación (exr_…), el ticket (rct_…), el producto (prd_…), el cliente (cus_…), el empleado (emp_…) o el RFC del proveedor; null si no tiene.
     */
    public String getId() {
        return id;
    }

    public FindingRecord setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Cómo lo nombra Fiscalisto: el número de la orden, el RFC, «RFC:AAAA-MM» un mes de contabilidad, «RFC:AAAA-MM:cuenta» una cuenta.
     */
    public String getReference() {
        return reference;
    }

    public FindingRecord setReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * El registro en palabras: «Orden de compra 12».
     */
    public String getDescription() {
        return description;
    }

    public FindingRecord setDescription(String description) {
        this.description = description;
        return this;
    }
}
