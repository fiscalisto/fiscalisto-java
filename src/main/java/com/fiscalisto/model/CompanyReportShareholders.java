// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CompanyReportShareholders: CompanyReportShareholders.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyReportShareholders {
    /**
     * A quién pagó dividendos: sus socios.
     */
    @JsonProperty("paid_to")
    private List<CompanyReportShareholdersPaidToItem> paidTo;

    /**
     * Quién le pagó dividendos: dónde tiene acciones.
     */
    @JsonProperty("received_from")
    private List<CompanyReportShareholdersReceivedFromItem> receivedFrom;

    /**
     * A quién pagó dividendos: sus socios.
     */
    public List<CompanyReportShareholdersPaidToItem> getPaidTo() {
        return paidTo;
    }

    public CompanyReportShareholders setPaidTo(List<CompanyReportShareholdersPaidToItem> paidTo) {
        this.paidTo = paidTo;
        return this;
    }

    /**
     * Quién le pagó dividendos: dónde tiene acciones.
     */
    public List<CompanyReportShareholdersReceivedFromItem> getReceivedFrom() {
        return receivedFrom;
    }

    public CompanyReportShareholders setReceivedFrom(List<CompanyReportShareholdersReceivedFromItem> receivedFrom) {
        this.receivedFrom = receivedFrom;
        return this;
    }
}
