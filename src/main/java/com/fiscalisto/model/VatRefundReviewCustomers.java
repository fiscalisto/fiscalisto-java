// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VatRefundReviewCustomers: Los clientes del mes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VatRefundReviewCustomers {
    /**
     * Cuántos clientes tuvo en el mes.
     */
    @JsonProperty("count")
    private Long count;

    /**
     * Cuántos CFDI emitidos suman al IVA cobrado.
     */
    @JsonProperty("cfdi")
    private Long cfdi;

    /**
     * Cuántos clientes tuvo en el mes.
     */
    public Long getCount() {
        return count;
    }

    public VatRefundReviewCustomers setCount(Long count) {
        this.count = count;
        return this;
    }

    @JsonIgnore
    public VatRefundReviewCustomers setCount(long count) {
        return setCount(Long.valueOf(count));
    }

    /**
     * Cuántos CFDI emitidos suman al IVA cobrado.
     */
    public Long getCfdi() {
        return cfdi;
    }

    public VatRefundReviewCustomers setCfdi(Long cfdi) {
        this.cfdi = cfdi;
        return this;
    }

    @JsonIgnore
    public VatRefundReviewCustomers setCfdi(long cfdi) {
        return setCfdi(Long.valueOf(cfdi));
    }
}
