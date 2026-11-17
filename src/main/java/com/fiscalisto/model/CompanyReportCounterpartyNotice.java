// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CompanyReportCounterpartyNotice: CompanyReportCounterpartyNotice.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyReportCounterpartyNotice {
    /**
     * El RFC del cliente o proveedor.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Su nombre en sus facturas.
     */
    @JsonProperty("name")
    private String name;

    /**
     * customer (cliente) o supplier (proveedor).
     * <p>
     * Valores: customer, supplier.
     */
    @JsonProperty("side")
    private String side;

    /**
     * Qué publicó («Aviso de liquidación», «Fusión»…).
     */
    @JsonProperty("type")
    private String type;

    /**
     * Su grupo de publicaciones.
     */
    @JsonProperty("group")
    private String group;

    /**
     * El día que se publicó (AAAA-MM-DD).
     */
    @JsonProperty("date")
    private String date;

    /**
     * Su número de publicación.
     */
    @JsonProperty("number")
    private String number;

    /**
     * Su PDF, cuando ya se conoce.
     */
    @JsonProperty("pdf_url")
    private String pdfUrl;

    /**
     * El RFC del cliente o proveedor.
     */
    public String getTaxId() {
        return taxId;
    }

    public CompanyReportCounterpartyNotice setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Su nombre en sus facturas.
     */
    public String getName() {
        return name;
    }

    public CompanyReportCounterpartyNotice setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * customer (cliente) o supplier (proveedor).
     * <p>
     * Valores: customer, supplier.
     */
    public String getSide() {
        return side;
    }

    public CompanyReportCounterpartyNotice setSide(String side) {
        this.side = side;
        return this;
    }

    /**
     * Qué publicó («Aviso de liquidación», «Fusión»…).
     */
    public String getType() {
        return type;
    }

    public CompanyReportCounterpartyNotice setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Su grupo de publicaciones.
     */
    public String getGroup() {
        return group;
    }

    public CompanyReportCounterpartyNotice setGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * El día que se publicó (AAAA-MM-DD).
     */
    public String getDate() {
        return date;
    }

    public CompanyReportCounterpartyNotice setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Su número de publicación.
     */
    public String getNumber() {
        return number;
    }

    public CompanyReportCounterpartyNotice setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Su PDF, cuando ya se conoce.
     */
    public String getPdfUrl() {
        return pdfUrl;
    }

    public CompanyReportCounterpartyNotice setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
        return this;
    }
}
