// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * VatRefundReviewSuppliers: Los proveedores del mes, para la relación que pide el SAT.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VatRefundReviewSuppliers {
    /**
     * Cuántos proveedores tuvo en el mes.
     */
    @JsonProperty("count")
    private Long count;

    /**
     * Cuántos CFDI recibidos suman al IVA acreditable.
     */
    @JsonProperty("cfdi")
    private Long cfdi;

    /**
     * Cuántos proveedores juntan el 80% del IVA acreditable.
     */
    @JsonProperty("main")
    private Long main;

    /**
     * El IVA de CFDI de proveedores que el SAT no reconocería: cancelados, de EFOS o con otros hallazgos.
     */
    @JsonProperty("vat_at_risk")
    private BigDecimal vatAtRisk;

    /**
     * Cuántos proveedores tuvo en el mes.
     */
    public Long getCount() {
        return count;
    }

    public VatRefundReviewSuppliers setCount(Long count) {
        this.count = count;
        return this;
    }

    @JsonIgnore
    public VatRefundReviewSuppliers setCount(long count) {
        return setCount(Long.valueOf(count));
    }

    /**
     * Cuántos CFDI recibidos suman al IVA acreditable.
     */
    public Long getCfdi() {
        return cfdi;
    }

    public VatRefundReviewSuppliers setCfdi(Long cfdi) {
        this.cfdi = cfdi;
        return this;
    }

    @JsonIgnore
    public VatRefundReviewSuppliers setCfdi(long cfdi) {
        return setCfdi(Long.valueOf(cfdi));
    }

    /**
     * Cuántos proveedores juntan el 80% del IVA acreditable.
     */
    public Long getMain() {
        return main;
    }

    public VatRefundReviewSuppliers setMain(Long main) {
        this.main = main;
        return this;
    }

    @JsonIgnore
    public VatRefundReviewSuppliers setMain(long main) {
        return setMain(Long.valueOf(main));
    }

    /**
     * El IVA de CFDI de proveedores que el SAT no reconocería: cancelados, de EFOS o con otros hallazgos.
     */
    public BigDecimal getVatAtRisk() {
        return vatAtRisk;
    }

    public VatRefundReviewSuppliers setVatAtRisk(BigDecimal vatAtRisk) {
        this.vatAtRisk = vatAtRisk;
        return this;
    }

    @JsonIgnore
    public VatRefundReviewSuppliers setVatAtRisk(double vatAtRisk) {
        return setVatAtRisk(BigDecimal.valueOf(vatAtRisk));
    }
}
