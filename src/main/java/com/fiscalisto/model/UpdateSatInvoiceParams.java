// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSatInvoiceParams: los campos de «Actualizar una factura del SAT».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSatInvoiceParams {
    /**
     * Su centro de costo (ccn_…), o null para quitárselo. Los complementos de pago y los traslados no llevan.
     */
    @JsonProperty("cost_center")
    private String costCenter;

    /**
     * Su centro de costo (ccn_…), o null para quitárselo. Los complementos de pago y los traslados no llevan.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public UpdateSatInvoiceParams setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }
}
