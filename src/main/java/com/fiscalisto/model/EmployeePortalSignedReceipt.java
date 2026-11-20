// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmployeePortalSignedReceipt: EmployeePortalSignedReceipt.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeePortalSignedReceipt {
    /**
     * El folio fiscal del recibo.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * Cuándo lo firmó de recibido.
     */
    @JsonProperty("signed_at")
    private String signedAt;

    /**
     * El folio fiscal del recibo.
     */
    public String getUuid() {
        return uuid;
    }

    public EmployeePortalSignedReceipt setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Cuándo lo firmó de recibido.
     */
    public String getSignedAt() {
        return signedAt;
    }

    public EmployeePortalSignedReceipt setSignedAt(String signedAt) {
        this.signedAt = signedAt;
        return this;
    }
}
