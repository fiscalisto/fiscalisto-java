// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * MaterialityInvoice: Una factura recibida (ingreso) con lo que prueba que la operación existió: qué tiene, qué le falta y de dónde salió cada evidencia.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MaterialityInvoice {
    /**
     * El UUID de la factura (el mismo que uuid).
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
     * El emisor que la recibió.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El folio fiscal (UUID).
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * Su serie, o null.
     */
    @JsonProperty("series")
    private String series;

    /**
     * Su folio, o null.
     */
    @JsonProperty("folio")
    private String folio;

    /**
     * Su fecha (AAAA-MM-DD).
     */
    @JsonProperty("date")
    private String date;

    /**
     * El RFC del proveedor que la emitió.
     */
    @JsonProperty("supplier_tax_id")
    private String supplierTaxId;

    /**
     * Su nombre como viene en el CFDI, o null.
     */
    @JsonProperty("supplier_name")
    private String supplierName;

    /**
     * Su total en pesos (de otra moneda, a su tipo de cambio).
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * complete (tiene acuerdo, entrega y pago), partial (alguno) o none (ninguno).
     * <p>
     * Valores: complete, partial, none.
     */
    @JsonProperty("state")
    private String state;

    /**
     * Lo que ya tiene: agreement (contrato u orden de compra), delivery (recepción, entregables o fotos), payment (complemento, pago en el portal o en la orden, banco o comprobante).
     */
    @JsonProperty("has")
    private List<String> has;

    /**
     * Lo que le falta, de lo mismo.
     */
    @JsonProperty("missing")
    private List<String> missing;

    /**
     * De dónde salió cada evidencia: source es un código estable (orden_compra, recepcion, complemento_pago, pago_banco, foto, mensaje_portal…), proves lo que prueba (null: respaldo que no prueba nada solo) y label lo dice en palabras.
     */
    @JsonProperty("evidence")
    private List<MaterialityInvoiceEvidenceItem> evidence;

    /**
     * El UUID de la factura (el mismo que uuid).
     */
    public String getId() {
        return id;
    }

    public MaterialityInvoice setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public MaterialityInvoice setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public MaterialityInvoice setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor que la recibió.
     */
    public String getIssuer() {
        return issuer;
    }

    public MaterialityInvoice setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El folio fiscal (UUID).
     */
    public String getUuid() {
        return uuid;
    }

    public MaterialityInvoice setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Su serie, o null.
     */
    public String getSeries() {
        return series;
    }

    public MaterialityInvoice setSeries(String series) {
        this.series = series;
        return this;
    }

    /**
     * Su folio, o null.
     */
    public String getFolio() {
        return folio;
    }

    public MaterialityInvoice setFolio(String folio) {
        this.folio = folio;
        return this;
    }

    /**
     * Su fecha (AAAA-MM-DD).
     */
    public String getDate() {
        return date;
    }

    public MaterialityInvoice setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * El RFC del proveedor que la emitió.
     */
    public String getSupplierTaxId() {
        return supplierTaxId;
    }

    public MaterialityInvoice setSupplierTaxId(String supplierTaxId) {
        this.supplierTaxId = supplierTaxId;
        return this;
    }

    /**
     * Su nombre como viene en el CFDI, o null.
     */
    public String getSupplierName() {
        return supplierName;
    }

    public MaterialityInvoice setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }

    /**
     * Su total en pesos (de otra moneda, a su tipo de cambio).
     */
    public BigDecimal getTotal() {
        return total;
    }

    public MaterialityInvoice setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public MaterialityInvoice setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * complete (tiene acuerdo, entrega y pago), partial (alguno) o none (ninguno).
     * <p>
     * Valores: complete, partial, none.
     */
    public String getState() {
        return state;
    }

    public MaterialityInvoice setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Lo que ya tiene: agreement (contrato u orden de compra), delivery (recepción, entregables o fotos), payment (complemento, pago en el portal o en la orden, banco o comprobante).
     */
    public List<String> getHas() {
        return has;
    }

    public MaterialityInvoice setHas(List<String> has) {
        this.has = has;
        return this;
    }

    /**
     * Lo que le falta, de lo mismo.
     */
    public List<String> getMissing() {
        return missing;
    }

    public MaterialityInvoice setMissing(List<String> missing) {
        this.missing = missing;
        return this;
    }

    /**
     * De dónde salió cada evidencia: source es un código estable (orden_compra, recepcion, complemento_pago, pago_banco, foto, mensaje_portal…), proves lo que prueba (null: respaldo que no prueba nada solo) y label lo dice en palabras.
     */
    public List<MaterialityInvoiceEvidenceItem> getEvidence() {
        return evidence;
    }

    public MaterialityInvoice setEvidence(List<MaterialityInvoiceEvidenceItem> evidence) {
        this.evidence = evidence;
        return this;
    }
}
