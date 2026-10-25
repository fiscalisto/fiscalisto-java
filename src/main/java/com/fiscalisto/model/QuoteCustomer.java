// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * QuoteCustomer: A quién va: tax_id null si aún no tiene sus datos fiscales; catalog_id es su cliente (cus_…) en su catálogo, o null.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteCustomer {
    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Correo a donde se envía (varios separados por comas). Solo se usa si se pide enviarlo.
     */
    @JsonProperty("email")
    private String email;

    /**
     * El cliente (cus_…) en su catálogo, o null si no está en él.
     */
    @JsonProperty("catalog_id")
    private String catalogId;

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    public String getTaxId() {
        return taxId;
    }

    public QuoteCustomer setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public QuoteCustomer setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Correo a donde se envía (varios separados por comas). Solo se usa si se pide enviarlo.
     */
    public String getEmail() {
        return email;
    }

    public QuoteCustomer setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * El cliente (cus_…) en su catálogo, o null si no está en él.
     */
    public String getCatalogId() {
        return catalogId;
    }

    public QuoteCustomer setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
}
