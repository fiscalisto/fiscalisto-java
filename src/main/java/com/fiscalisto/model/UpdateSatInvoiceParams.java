// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

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
     * Sus etiquetas, exactamente estas (hasta 10): ids (tag_…) o nombres; un nombre nuevo crea la etiqueta. [] se las quita. Una que puso una regla y no manda se queda quitada.
     */
    @JsonProperty("tags")
    private List<String> tags;

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

    /**
     * Sus etiquetas, exactamente estas (hasta 10): ids (tag_…) o nombres; un nombre nuevo crea la etiqueta. [] se las quita. Una que puso una regla y no manda se queda quitada.
     */
    public List<String> getTags() {
        return tags;
    }

    public UpdateSatInvoiceParams setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }
}
