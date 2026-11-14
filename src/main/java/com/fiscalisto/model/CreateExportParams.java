// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateExportParams: los campos de «Exportar las facturas de un mes».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateExportParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Un mes completo (AAAA-MM), por la fecha de emisión en hora de la Ciudad de México. Mande month, o from y to.
     */
    @JsonProperty("month")
    private String month;

    /**
     * Desde qué día (incluido), en lugar de month.
     */
    @JsonProperty("from")
    private String from;

    /**
     * Hasta qué día (incluido), en lugar de month. A lo más 7 ejercicios.
     */
    @JsonProperty("to")
    private String to;

    /**
     * issued (las facturas que emitió el emisor, por omisión) o received (las que le hicieron).
     * <p>
     * Valores: issued, received.
     */
    @JsonProperty("direction")
    private String direction;

    /**
     * Solo un tipo de comprobante: I, E, P, T o N. Por omisión, todos.
     * <p>
     * Valores: I, E, P, T, N.
     */
    @JsonProperty("type")
    private String type;

    /**
     * zip (los archivos de cada factura, por omisión) o xlsx (un Excel con una fila por factura).
     * <p>
     * Valores: zip, xlsx.
     */
    @JsonProperty("format")
    private String format;

    /**
     * Con format zip: xml (por omisión), pdf, o xml_and_pdf (los dos de cada factura).
     * <p>
     * Valores: xml, pdf, xml_and_pdf.
     */
    @JsonProperty("files")
    private String files;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateExportParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Un mes completo (AAAA-MM), por la fecha de emisión en hora de la Ciudad de México. Mande month, o from y to.
     */
    public String getMonth() {
        return month;
    }

    public CreateExportParams setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Desde qué día (incluido), en lugar de month.
     */
    public String getFrom() {
        return from;
    }

    public CreateExportParams setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Hasta qué día (incluido), en lugar de month. A lo más 7 ejercicios.
     */
    public String getTo() {
        return to;
    }

    public CreateExportParams setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * issued (las facturas que emitió el emisor, por omisión) o received (las que le hicieron).
     * <p>
     * Valores: issued, received.
     */
    public String getDirection() {
        return direction;
    }

    public CreateExportParams setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Solo un tipo de comprobante: I, E, P, T o N. Por omisión, todos.
     * <p>
     * Valores: I, E, P, T, N.
     */
    public String getType() {
        return type;
    }

    public CreateExportParams setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * zip (los archivos de cada factura, por omisión) o xlsx (un Excel con una fila por factura).
     * <p>
     * Valores: zip, xlsx.
     */
    public String getFormat() {
        return format;
    }

    public CreateExportParams setFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * Con format zip: xml (por omisión), pdf, o xml_and_pdf (los dos de cada factura).
     * <p>
     * Valores: xml, pdf, xml_and_pdf.
     */
    public String getFiles() {
        return files;
    }

    public CreateExportParams setFiles(String files) {
        this.files = files;
        return this;
    }
}
