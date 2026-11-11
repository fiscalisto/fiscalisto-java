// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PortalSupplierBankAccount: PortalSupplierBankAccount.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PortalSupplierBankAccount {
    /**
     * La CLABE de 18 dígitos.
     */
    @JsonProperty("clabe")
    private String clabe;

    /**
     * El banco, o null.
     */
    @JsonProperty("bank")
    private String bank;

    /**
     * El titular de la cuenta, o null.
     */
    @JsonProperty("holder")
    private String holder;

    /**
     * Estado del objeto.
     * <p>
     * Valores: pending, approved, rejected.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Mientras una CLABE nueva está pending, la anterior, a la que se le sigue pagando; si no, null.
     */
    @JsonProperty("previous_clabe")
    private String previousClabe;

    /**
     * La CLABE de 18 dígitos.
     */
    public String getClabe() {
        return clabe;
    }

    public PortalSupplierBankAccount setClabe(String clabe) {
        this.clabe = clabe;
        return this;
    }

    /**
     * El banco, o null.
     */
    public String getBank() {
        return bank;
    }

    public PortalSupplierBankAccount setBank(String bank) {
        this.bank = bank;
        return this;
    }

    /**
     * El titular de la cuenta, o null.
     */
    public String getHolder() {
        return holder;
    }

    public PortalSupplierBankAccount setHolder(String holder) {
        this.holder = holder;
        return this;
    }

    /**
     * Estado del objeto.
     * <p>
     * Valores: pending, approved, rejected.
     */
    public String getStatus() {
        return status;
    }

    public PortalSupplierBankAccount setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Mientras una CLABE nueva está pending, la anterior, a la que se le sigue pagando; si no, null.
     */
    public String getPreviousClabe() {
        return previousClabe;
    }

    public PortalSupplierBankAccount setPreviousClabe(String previousClabe) {
        this.previousClabe = previousClabe;
        return this;
    }
}
