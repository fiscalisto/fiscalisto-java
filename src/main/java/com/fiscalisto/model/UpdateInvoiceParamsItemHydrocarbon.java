// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateInvoiceParamsItemHydrocarbon: Complemento de Hidrocarburos y Petrolíferos: obligatorio en cada concepto de diésel (15101505) o gasolina (15101514, 15101515) de una factura o nota de crédito, en litros (LTR).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateInvoiceParamsItemHydrocarbon {
    /**
     * Tipo de permiso de la CNE o la CRE (TipoPermiso, c_TipoPermiso): PER01 a PER11.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("permit_type")
    private String permitType;

    /**
     * Número de permiso de la CNE o la CRE (NumeroPermiso), como PL/12345/EXP/ES/2016: de 15 a 35 caracteres.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("permit_number")
    private String permitNumber;

    /**
     * Subproducto (SubProductoHYP, c_SubProductoHYP): SP16 gasolina regular, SP17 premium, SP18 diésel automotriz…
     * <p>
     * Obligatorio.
     */
    @JsonProperty("subproduct")
    private String subproduct;

    /**
     * Tipo de permiso de la CNE o la CRE (TipoPermiso, c_TipoPermiso): PER01 a PER11.
     * <p>
     * Obligatorio.
     */
    public String getPermitType() {
        return permitType;
    }

    public UpdateInvoiceParamsItemHydrocarbon setPermitType(String permitType) {
        this.permitType = permitType;
        return this;
    }

    /**
     * Número de permiso de la CNE o la CRE (NumeroPermiso), como PL/12345/EXP/ES/2016: de 15 a 35 caracteres.
     * <p>
     * Obligatorio.
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    public UpdateInvoiceParamsItemHydrocarbon setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
        return this;
    }

    /**
     * Subproducto (SubProductoHYP, c_SubProductoHYP): SP16 gasolina regular, SP17 premium, SP18 diésel automotriz…
     * <p>
     * Obligatorio.
     */
    public String getSubproduct() {
        return subproduct;
    }

    public UpdateInvoiceParamsItemHydrocarbon setSubproduct(String subproduct) {
        this.subproduct = subproduct;
        return this;
    }
}
