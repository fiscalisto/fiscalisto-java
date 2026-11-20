// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SaveBudgetParams: los campos de «Guardar el presupuesto de un año».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveBudgetParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El centro de costo (ccn_…) del presupuesto. Sin él, el de toda la empresa. Cada centro tiene el suyo.
     */
    @JsonProperty("cost_center")
    private String costCenter;

    /**
     * Las cuentas del presupuesto. Reemplaza todo el presupuesto de ese año (y centro): una cuenta que no mande sale; una lista vacía lo borra.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("lines")
    private List<SaveBudgetParamsLine> lines;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public SaveBudgetParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El centro de costo (ccn_…) del presupuesto. Sin él, el de toda la empresa. Cada centro tiene el suyo.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public SaveBudgetParams setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * Las cuentas del presupuesto. Reemplaza todo el presupuesto de ese año (y centro): una cuenta que no mande sale; una lista vacía lo borra.
     * <p>
     * Obligatorio.
     */
    public List<SaveBudgetParamsLine> getLines() {
        return lines;
    }

    public SaveBudgetParams setLines(List<SaveBudgetParamsLine> lines) {
        this.lines = lines;
        return this;
    }
}
