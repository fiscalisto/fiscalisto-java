// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LedgerAccount: Una cuenta del catálogo, con su código agrupador del SAT.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LedgerAccount {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El número de cuenta (NumCta).
     */
    @JsonProperty("number")
    private String number;

    /**
     * Su nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * El código agrupador del SAT (Anexo 24).
     */
    @JsonProperty("grouping_code")
    private String groupingCode;

    /**
     * debit (deudora) o credit (acreedora).
     * <p>
     * Valores: debit, credit.
     */
    @JsonProperty("nature")
    private String nature;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public LedgerAccount setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El número de cuenta (NumCta).
     */
    public String getNumber() {
        return number;
    }

    public LedgerAccount setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public LedgerAccount setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * El código agrupador del SAT (Anexo 24).
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    public LedgerAccount setGroupingCode(String groupingCode) {
        this.groupingCode = groupingCode;
        return this;
    }

    /**
     * debit (deudora) o credit (acreedora).
     * <p>
     * Valores: debit, credit.
     */
    public String getNature() {
        return nature;
    }

    public LedgerAccount setNature(String nature) {
        this.nature = nature;
        return this;
    }
}
