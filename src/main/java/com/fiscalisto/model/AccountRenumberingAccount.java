// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AccountRenumberingAccount: AccountRenumberingAccount.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountRenumberingAccount {
    /**
     * El número de la cuenta en su catálogo.
     */
    @JsonProperty("number")
    private String number;

    /**
     * Su nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su código agrupador del SAT.
     */
    @JsonProperty("grouping_code")
    private String groupingCode;

    /**
     * Su número antes.
     */
    @JsonProperty("previous_number")
    private String previousNumber;

    /**
     * Por qué no puede tomar el número nuevo, o null.
     */
    @JsonProperty("problem")
    private String problem;

    /**
     * El número de la cuenta en su catálogo.
     */
    public String getNumber() {
        return number;
    }

    public AccountRenumberingAccount setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public AccountRenumberingAccount setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su código agrupador del SAT.
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    public AccountRenumberingAccount setGroupingCode(String groupingCode) {
        this.groupingCode = groupingCode;
        return this;
    }

    /**
     * Su número antes.
     */
    public String getPreviousNumber() {
        return previousNumber;
    }

    public AccountRenumberingAccount setPreviousNumber(String previousNumber) {
        this.previousNumber = previousNumber;
        return this;
    }

    /**
     * Por qué no puede tomar el número nuevo, o null.
     */
    public String getProblem() {
        return problem;
    }

    public AccountRenumberingAccount setProblem(String problem) {
        this.problem = problem;
        return this;
    }
}
