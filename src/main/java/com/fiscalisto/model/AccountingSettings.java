// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AccountingSettings: Cómo se lleva la contabilidad de la empresa del emisor: si cada cliente y cada proveedor tiene su propia subcuenta de Clientes o Proveedores.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountingSettings {
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
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * true si cada cliente y cada proveedor tiene su subcuenta (105-01-0001…, 201-01-0001…); false si todos van a Clientes y Proveedores.
     */
    @JsonProperty("party_subaccounts")
    private Boolean partySubaccounts;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public AccountingSettings setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public AccountingSettings setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public AccountingSettings setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * true si cada cliente y cada proveedor tiene su subcuenta (105-01-0001…, 201-01-0001…); false si todos van a Clientes y Proveedores.
     */
    public Boolean getPartySubaccounts() {
        return partySubaccounts;
    }

    public AccountingSettings setPartySubaccounts(Boolean partySubaccounts) {
        this.partySubaccounts = partySubaccounts;
        return this;
    }
}
