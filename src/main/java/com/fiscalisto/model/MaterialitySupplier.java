// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * MaterialitySupplier: Un proveedor del emisor en el periodo: cuánto le facturó, cuánto de eso tiene su evidencia completa (acuerdo, entrega y pago) y, si está en la lista 69-B, su plazo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MaterialitySupplier {
    /**
     * Su RFC (el mismo que tax_id).
     */
    @JsonProperty("id")
    private String id;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El emisor que recibió sus facturas.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El RFC del proveedor.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Su nombre como viene en el CFDI, o null.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Cuántas facturas recibidas (ingresos, no canceladas) le dio en el periodo.
     */
    @JsonProperty("invoices")
    private Long invoices;

    /**
     * Lo que suman, en pesos (las de otra moneda, a su tipo de cambio).
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Lo que suman las que no tienen su evidencia completa, en pesos.
     */
    @JsonProperty("unproven")
    private BigDecimal unproven;

    /**
     * Cuántas facturas están complete (acuerdo, entrega y pago), partial (alguna) y none (ninguna).
     */
    @JsonProperty("states")
    private MaterialitySupplierStates states;

    /**
     * A cuántas facturas les falta el acuerdo, la entrega y el pago.
     */
    @JsonProperty("missing")
    private MaterialitySupplierMissing missing;

    /**
     * Si está en la lista 69-B: definitive (definitivo) o presumed (presunto); en definitivo, el día que se publicó, el último día de los 30 días hábiles para acreditar las operaciones o corregir y cuántos días hábiles quedan (negativo: ya venció). null: no está.
     */
    @JsonProperty("sat_list")
    private MaterialitySupplierSatList satList;

    /**
     * Si está en el Portal de proveedores del emisor (para pedirle la evidencia desde la app).
     */
    @JsonProperty("in_supplier_portal")
    private Boolean inSupplierPortal;

    /**
     * Cuándo se le pidió evidencia que todavía no manda, o null.
     */
    @JsonProperty("evidence_requested_at")
    private String evidenceRequestedAt;

    /**
     * Su RFC (el mismo que tax_id).
     */
    public String getId() {
        return id;
    }

    public MaterialitySupplier setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public MaterialitySupplier setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public MaterialitySupplier setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor que recibió sus facturas.
     */
    public String getIssuer() {
        return issuer;
    }

    public MaterialitySupplier setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El RFC del proveedor.
     */
    public String getTaxId() {
        return taxId;
    }

    public MaterialitySupplier setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Su nombre como viene en el CFDI, o null.
     */
    public String getName() {
        return name;
    }

    public MaterialitySupplier setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Cuántas facturas recibidas (ingresos, no canceladas) le dio en el periodo.
     */
    public Long getInvoices() {
        return invoices;
    }

    public MaterialitySupplier setInvoices(Long invoices) {
        this.invoices = invoices;
        return this;
    }

    @JsonIgnore
    public MaterialitySupplier setInvoices(long invoices) {
        return setInvoices(Long.valueOf(invoices));
    }

    /**
     * Lo que suman, en pesos (las de otra moneda, a su tipo de cambio).
     */
    public BigDecimal getTotal() {
        return total;
    }

    public MaterialitySupplier setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public MaterialitySupplier setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Lo que suman las que no tienen su evidencia completa, en pesos.
     */
    public BigDecimal getUnproven() {
        return unproven;
    }

    public MaterialitySupplier setUnproven(BigDecimal unproven) {
        this.unproven = unproven;
        return this;
    }

    @JsonIgnore
    public MaterialitySupplier setUnproven(double unproven) {
        return setUnproven(BigDecimal.valueOf(unproven));
    }

    /**
     * Cuántas facturas están complete (acuerdo, entrega y pago), partial (alguna) y none (ninguna).
     */
    public MaterialitySupplierStates getStates() {
        return states;
    }

    public MaterialitySupplier setStates(MaterialitySupplierStates states) {
        this.states = states;
        return this;
    }

    /**
     * A cuántas facturas les falta el acuerdo, la entrega y el pago.
     */
    public MaterialitySupplierMissing getMissing() {
        return missing;
    }

    public MaterialitySupplier setMissing(MaterialitySupplierMissing missing) {
        this.missing = missing;
        return this;
    }

    /**
     * Si está en la lista 69-B: definitive (definitivo) o presumed (presunto); en definitivo, el día que se publicó, el último día de los 30 días hábiles para acreditar las operaciones o corregir y cuántos días hábiles quedan (negativo: ya venció). null: no está.
     */
    public MaterialitySupplierSatList getSatList() {
        return satList;
    }

    public MaterialitySupplier setSatList(MaterialitySupplierSatList satList) {
        this.satList = satList;
        return this;
    }

    /**
     * Si está en el Portal de proveedores del emisor (para pedirle la evidencia desde la app).
     */
    public Boolean getInSupplierPortal() {
        return inSupplierPortal;
    }

    public MaterialitySupplier setInSupplierPortal(Boolean inSupplierPortal) {
        this.inSupplierPortal = inSupplierPortal;
        return this;
    }

    /**
     * Cuándo se le pidió evidencia que todavía no manda, o null.
     */
    public String getEvidenceRequestedAt() {
        return evidenceRequestedAt;
    }

    public MaterialitySupplier setEvidenceRequestedAt(String evidenceRequestedAt) {
        this.evidenceRequestedAt = evidenceRequestedAt;
        return this;
    }
}
