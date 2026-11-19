// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateLedgerAccountParams: los campos de «Agregar una cuenta al catálogo».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateLedgerAccountParams {
    /**
     * Su número en el catálogo, por ejemplo 210-01-01. No se repite.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("number")
    private String number;

    /**
     * Su nombre.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Una subcuenta del código agrupador del SAT (Anexo 24), por ejemplo 210.01.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("grouping_code")
    private String groupingCode;

    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Su número en el catálogo, por ejemplo 210-01-01. No se repite.
     * <p>
     * Obligatorio.
     */
    public String getNumber() {
        return number;
    }

    public CreateLedgerAccountParams setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Su nombre.
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public CreateLedgerAccountParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Una subcuenta del código agrupador del SAT (Anexo 24), por ejemplo 210.01.
     * <p>
     * Obligatorio.
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    public CreateLedgerAccountParams setGroupingCode(String groupingCode) {
        this.groupingCode = groupingCode;
        return this;
    }

    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateLedgerAccountParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
