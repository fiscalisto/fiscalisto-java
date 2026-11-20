// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InflationAccountsAccount: InflationAccountsAccount.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InflationAccountsAccount {
    /**
     * El número de la cuenta.
     */
    @JsonProperty("account")
    private String account;

    /**
     * Su nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su código agrupador.
     */
    @JsonProperty("grouping_code")
    private String groupingCode;

    /**
     * credit (crédito, art. 45 de la LISR), debt (deuda, art. 46) o none.
     * <p>
     * Valores: credit, debt, none.
     */
    @JsonProperty("treatment")
    private String treatment;

    /**
     * true si difiere del de su código agrupador.
     */
    @JsonProperty("changed")
    private Boolean changed;

    /**
     * El número de la cuenta.
     */
    public String getAccount() {
        return account;
    }

    public InflationAccountsAccount setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public InflationAccountsAccount setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su código agrupador.
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    public InflationAccountsAccount setGroupingCode(String groupingCode) {
        this.groupingCode = groupingCode;
        return this;
    }

    /**
     * credit (crédito, art. 45 de la LISR), debt (deuda, art. 46) o none.
     * <p>
     * Valores: credit, debt, none.
     */
    public String getTreatment() {
        return treatment;
    }

    public InflationAccountsAccount setTreatment(String treatment) {
        this.treatment = treatment;
        return this;
    }

    /**
     * true si difiere del de su código agrupador.
     */
    public Boolean getChanged() {
        return changed;
    }

    public InflationAccountsAccount setChanged(Boolean changed) {
        this.changed = changed;
        return this;
    }
}
