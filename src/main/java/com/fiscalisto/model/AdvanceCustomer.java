// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AdvanceCustomer: Cliente (Receptor): el id de uno de su catálogo (cus_…) o sus datos en un objeto.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdvanceCustomer {
    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Nombre o razón social tal como está en la constancia de situación fiscal, sin el régimen de capital (sin «S.A. de C.V.»).
     */
    @JsonProperty("legal_name")
    private String legalName;

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    public String getTaxId() {
        return taxId;
    }

    public AdvanceCustomer setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Nombre o razón social tal como está en la constancia de situación fiscal, sin el régimen de capital (sin «S.A. de C.V.»).
     */
    public String getLegalName() {
        return legalName;
    }

    public AdvanceCustomer setLegalName(String legalName) {
        this.legalName = legalName;
        return this;
    }
}
