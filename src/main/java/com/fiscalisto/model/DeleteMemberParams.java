// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeleteMemberParams: los campos de «Quitar a un miembro».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteMemberParams {
    /**
     * El miembro (mem_…) que recibe su trabajo; sin él, cualquiera con permiso.
     */
    @JsonProperty("transfer_to")
    private String transferTo;

    /**
     * El miembro (mem_…) que recibe su trabajo; sin él, cualquiera con permiso.
     */
    public String getTransferTo() {
        return transferTo;
    }

    public DeleteMemberParams setTransferTo(String transferTo) {
        this.transferTo = transferTo;
        return this;
    }
}
