// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProductHydrocarbon: ProductHydrocarbon.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductHydrocarbon {
    /**
     * Tipo de permiso de la CNE o la CRE (TipoPermiso, c_TipoPermiso): PER01 a PER11.
     */
    @JsonProperty("permit_type")
    private String permitType;

    /**
     * Número de permiso de la CNE o la CRE (NumeroPermiso), como PL/12345/EXP/ES/2016: de 15 a 35 caracteres.
     */
    @JsonProperty("permit_number")
    private String permitNumber;

    /**
     * Subproducto (SubProductoHYP, c_SubProductoHYP): SP16 gasolina regular, SP17 premium, SP18 diésel automotriz…
     */
    @JsonProperty("subproduct")
    private String subproduct;

    /**
     * Tipo de permiso de la CNE o la CRE (TipoPermiso, c_TipoPermiso): PER01 a PER11.
     */
    public String getPermitType() {
        return permitType;
    }

    public ProductHydrocarbon setPermitType(String permitType) {
        this.permitType = permitType;
        return this;
    }

    /**
     * Número de permiso de la CNE o la CRE (NumeroPermiso), como PL/12345/EXP/ES/2016: de 15 a 35 caracteres.
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    public ProductHydrocarbon setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
        return this;
    }

    /**
     * Subproducto (SubProductoHYP, c_SubProductoHYP): SP16 gasolina regular, SP17 premium, SP18 diésel automotriz…
     */
    public String getSubproduct() {
        return subproduct;
    }

    public ProductHydrocarbon setSubproduct(String subproduct) {
        this.subproduct = subproduct;
        return this;
    }
}
