// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ClimateActions: Las acciones del Programa de intervención.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimateActions {
    /**
     * Total en la moneda del comprobante (Total).
     */
    @JsonProperty("total")
    private Long total;

    /**
     * Las que no se han terminado.
     */
    @JsonProperty("pending")
    private Long pending;

    /**
     * De ellas, las que pasaron su fecha.
     */
    @JsonProperty("late")
    private Long late;

    /**
     * Total en la moneda del comprobante (Total).
     */
    public Long getTotal() {
        return total;
    }

    public ClimateActions setTotal(Long total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public ClimateActions setTotal(long total) {
        return setTotal(Long.valueOf(total));
    }

    /**
     * Las que no se han terminado.
     */
    public Long getPending() {
        return pending;
    }

    public ClimateActions setPending(Long pending) {
        this.pending = pending;
        return this;
    }

    @JsonIgnore
    public ClimateActions setPending(long pending) {
        return setPending(Long.valueOf(pending));
    }

    /**
     * De ellas, las que pasaron su fecha.
     */
    public Long getLate() {
        return late;
    }

    public ClimateActions setLate(Long late) {
        this.late = late;
        return this;
    }

    @JsonIgnore
    public ClimateActions setLate(long late) {
        return setLate(Long.valueOf(late));
    }
}
