// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateAccountingSettingsParams: los campos de «Cambiar cómo se lleva la contabilidad».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateAccountingSettingsParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * true: cada cliente con su subcuenta de Clientes (105-01-0001…) y cada proveedor con la suya de Proveedores (201-01-0001…); false: todos en Clientes y Proveedores.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("party_subaccounts")
    private Boolean partySubaccounts;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public UpdateAccountingSettingsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * true: cada cliente con su subcuenta de Clientes (105-01-0001…) y cada proveedor con la suya de Proveedores (201-01-0001…); false: todos en Clientes y Proveedores.
     * <p>
     * Obligatorio.
     */
    public Boolean getPartySubaccounts() {
        return partySubaccounts;
    }

    public UpdateAccountingSettingsParams setPartySubaccounts(Boolean partySubaccounts) {
        this.partySubaccounts = partySubaccounts;
        return this;
    }
}
