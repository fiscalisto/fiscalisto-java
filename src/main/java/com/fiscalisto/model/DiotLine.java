// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DiotLine: DiotLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DiotLine {
    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Tipo de tercero: 04 nacional, 05 extranjero, 15 global.
     * <p>
     * Valores: 15, 04, 05.
     */
    @JsonProperty("third_party_type")
    private String thirdPartyType;

    /**
     * Tipo de operación: 02 enajenación de bienes, 03 servicios profesionales, 06 uso o goce temporal, 07 importación, 85 otros, 87 operaciones globales.
     * <p>
     * Valores: 85, 87, 02, 03, 06, 07.
     */
    @JsonProperty("operation_type")
    private String operationType;

    /**
     * Lo pagado en el mes por tasa, en pesos, con su IVA.
     */
    @JsonProperty("paid")
    private DiotLinePaid paid;

    /**
     * Las devoluciones (notas de crédito) del mes, por tasa.
     */
    @JsonProperty("returns")
    private DiotLineReturns returns;

    /**
     * El proveedor está en la lista 69-B definitiva: revise si deduce sus CFDI.
     */
    @JsonProperty("blacklisted")
    private Boolean blacklisted;

    /**
     * RFC (Rfc), 12 caracteres una persona moral y 13 una física.
     */
    public String getTaxId() {
        return taxId;
    }

    public DiotLine setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public DiotLine setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Tipo de tercero: 04 nacional, 05 extranjero, 15 global.
     * <p>
     * Valores: 15, 04, 05.
     */
    public String getThirdPartyType() {
        return thirdPartyType;
    }

    public DiotLine setThirdPartyType(String thirdPartyType) {
        this.thirdPartyType = thirdPartyType;
        return this;
    }

    /**
     * Tipo de operación: 02 enajenación de bienes, 03 servicios profesionales, 06 uso o goce temporal, 07 importación, 85 otros, 87 operaciones globales.
     * <p>
     * Valores: 85, 87, 02, 03, 06, 07.
     */
    public String getOperationType() {
        return operationType;
    }

    public DiotLine setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * Lo pagado en el mes por tasa, en pesos, con su IVA.
     */
    public DiotLinePaid getPaid() {
        return paid;
    }

    public DiotLine setPaid(DiotLinePaid paid) {
        this.paid = paid;
        return this;
    }

    /**
     * Las devoluciones (notas de crédito) del mes, por tasa.
     */
    public DiotLineReturns getReturns() {
        return returns;
    }

    public DiotLine setReturns(DiotLineReturns returns) {
        this.returns = returns;
        return this;
    }

    /**
     * El proveedor está en la lista 69-B definitiva: revise si deduce sus CFDI.
     */
    public Boolean getBlacklisted() {
        return blacklisted;
    }

    public DiotLine setBlacklisted(Boolean blacklisted) {
        this.blacklisted = blacklisted;
        return this;
    }
}
