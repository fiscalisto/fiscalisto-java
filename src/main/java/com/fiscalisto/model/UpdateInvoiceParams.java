// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateInvoiceParams: los campos de «Actualizar una factura».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateInvoiceParams {
    /**
     * Su centro de costo (ccn_…), o null para quitárselo. Solo facturas, notas de crédito y recibos de nómina timbrados.
     */
    @JsonProperty("cost_center")
    private String costCenter;

    /**
     * Su centro de costo (ccn_…), o null para quitárselo. Solo facturas, notas de crédito y recibos de nómina timbrados.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public UpdateInvoiceParams setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }
}
