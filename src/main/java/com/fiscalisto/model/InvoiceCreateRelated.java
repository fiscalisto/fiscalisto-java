// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * InvoiceCreateRelated: CFDI relacionados (CfdiRelacionados): tipo de relación de c_TipoRelacion y los UUID.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateRelated {
    /**
     * Tipo de relación (TipoRelacion): 01 nota de crédito, 03 devolución, 04 sustitución, 07 anticipo…
     * <p>
     * Obligatorio.
     */
    @JsonProperty("relationship")
    private String relationship;

    /**
     * Folios fiscales relacionados.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("uuids")
    private List<String> uuids;

    /**
     * Tipo de relación (TipoRelacion): 01 nota de crédito, 03 devolución, 04 sustitución, 07 anticipo…
     * <p>
     * Obligatorio.
     */
    public String getRelationship() {
        return relationship;
    }

    public InvoiceCreateRelated setRelationship(String relationship) {
        this.relationship = relationship;
        return this;
    }

    /**
     * Folios fiscales relacionados.
     * <p>
     * Obligatorio.
     */
    public List<String> getUuids() {
        return uuids;
    }

    public InvoiceCreateRelated setUuids(List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
}
