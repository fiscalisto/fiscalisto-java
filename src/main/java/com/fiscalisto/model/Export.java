// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * Export: Las facturas de un emisor en un periodo, en un ZIP o en Excel.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Export {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * zip (los archivos de cada factura) o xlsx (un Excel con una fila por factura).
     * <p>
     * Valores: zip, xlsx.
     */
    @JsonProperty("format")
    private String format;

    /**
     * Qué archivos de cada factura lleva el ZIP; null en un Excel.
     * <p>
     * Valores: xml, pdf, xml_and_pdf.
     */
    @JsonProperty("files")
    private String files;

    /**
     * EntradaSalidaMerc: Entrada o Salida.
     * <p>
     * Valores: issued, received.
     */
    @JsonProperty("direction")
    private String direction;

    /**
     * Desde qué día (incluido), por la fecha de emisión.
     */
    @JsonProperty("from")
    private String from;

    /**
     * Hasta qué día (incluido), por la fecha de emisión.
     */
    @JsonProperty("to")
    private String to;

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Valores: I, E, P, T, N.
     */
    @JsonProperty("type")
    private String type;

    /**
     * processing: se está generando. completed: listo para descargar. failed: falló (ver error); pídala otra vez. expired: pasaron 30 días y el archivo se borró.
     * <p>
     * Valores: processing, completed, failed, expired.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Cuántas facturas lleva.
     */
    @JsonProperty("invoice_count")
    private BigDecimal invoiceCount;

    /**
     * El tamaño del archivo en bytes, cuando está listo.
     */
    @JsonProperty("size_bytes")
    private BigDecimal sizeBytes;

    /**
     * Por qué falló la exportación, en palabras; null si no falló.
     */
    @JsonProperty("error")
    private String error;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Cuándo terminó.
     */
    @JsonProperty("completed_at")
    private String completedAt;

    /**
     * Hasta cuándo se descarga (30 días después de completed).
     */
    @JsonProperty("expires_at")
    private String expiresAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public Export setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Export setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Export setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public Export setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * zip (los archivos de cada factura) o xlsx (un Excel con una fila por factura).
     * <p>
     * Valores: zip, xlsx.
     */
    public String getFormat() {
        return format;
    }

    public Export setFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * Qué archivos de cada factura lleva el ZIP; null en un Excel.
     * <p>
     * Valores: xml, pdf, xml_and_pdf.
     */
    public String getFiles() {
        return files;
    }

    public Export setFiles(String files) {
        this.files = files;
        return this;
    }

    /**
     * EntradaSalidaMerc: Entrada o Salida.
     * <p>
     * Valores: issued, received.
     */
    public String getDirection() {
        return direction;
    }

    public Export setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Desde qué día (incluido), por la fecha de emisión.
     */
    public String getFrom() {
        return from;
    }

    public Export setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Hasta qué día (incluido), por la fecha de emisión.
     */
    public String getTo() {
        return to;
    }

    public Export setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Valores: I, E, P, T, N.
     */
    public String getType() {
        return type;
    }

    public Export setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * processing: se está generando. completed: listo para descargar. failed: falló (ver error); pídala otra vez. expired: pasaron 30 días y el archivo se borró.
     * <p>
     * Valores: processing, completed, failed, expired.
     */
    public String getStatus() {
        return status;
    }

    public Export setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Cuántas facturas lleva.
     */
    public BigDecimal getInvoiceCount() {
        return invoiceCount;
    }

    public Export setInvoiceCount(BigDecimal invoiceCount) {
        this.invoiceCount = invoiceCount;
        return this;
    }

    @JsonIgnore
    public Export setInvoiceCount(double invoiceCount) {
        return setInvoiceCount(BigDecimal.valueOf(invoiceCount));
    }

    /**
     * El tamaño del archivo en bytes, cuando está listo.
     */
    public BigDecimal getSizeBytes() {
        return sizeBytes;
    }

    public Export setSizeBytes(BigDecimal sizeBytes) {
        this.sizeBytes = sizeBytes;
        return this;
    }

    @JsonIgnore
    public Export setSizeBytes(double sizeBytes) {
        return setSizeBytes(BigDecimal.valueOf(sizeBytes));
    }

    /**
     * Por qué falló la exportación, en palabras; null si no falló.
     */
    public String getError() {
        return error;
    }

    public Export setError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public Export setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo terminó.
     */
    public String getCompletedAt() {
        return completedAt;
    }

    public Export setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * Hasta cuándo se descarga (30 días después de completed).
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    public Export setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
}
