// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * DeliverTrainingCertificatesParams: los campos de «Marcar constancias como entregadas».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeliverTrainingCertificatesParams {
    /**
     * A quiénes se entregó; por omisión todas las emitidas sin entregar.
     */
    @JsonProperty("employees")
    private List<String> employees;

    /**
     * El día de la entrega; por omisión hoy.
     */
    @JsonProperty("delivered_on")
    private String deliveredOn;

    /**
     * Cómo: paper (en papel, por omisión), email o portal.
     * <p>
     * Valores: paper, email, portal.
     */
    @JsonProperty("via")
    private String via;

    /**
     * A quiénes se entregó; por omisión todas las emitidas sin entregar.
     */
    public List<String> getEmployees() {
        return employees;
    }

    public DeliverTrainingCertificatesParams setEmployees(List<String> employees) {
        this.employees = employees;
        return this;
    }

    /**
     * El día de la entrega; por omisión hoy.
     */
    public String getDeliveredOn() {
        return deliveredOn;
    }

    public DeliverTrainingCertificatesParams setDeliveredOn(String deliveredOn) {
        this.deliveredOn = deliveredOn;
        return this;
    }

    /**
     * Cómo: paper (en papel, por omisión), email o portal.
     * <p>
     * Valores: paper, email, portal.
     */
    public String getVia() {
        return via;
    }

    public DeliverTrainingCertificatesParams setVia(String via) {
        this.via = via;
        return this;
    }
}
