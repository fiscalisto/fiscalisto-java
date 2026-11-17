// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SatAnnualPreloadPersonalDeductionsPossibleItem: SatAnnualPreloadPersonalDeductionsPossibleItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatAnnualPreloadPersonalDeductionsPossibleItem {
    /**
     * La clave del tipo de deducción del SAT (A a J).
     */
    @JsonProperty("code")
    private String code;

    /**
     * Su nombre en el SAT.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Cuántos CFDI.
     */
    @JsonProperty("invoices")
    private Long invoices;

    /**
     * La suma, en pesos.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * La clave del tipo de deducción del SAT (A a J).
     */
    public String getCode() {
        return code;
    }

    public SatAnnualPreloadPersonalDeductionsPossibleItem setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Su nombre en el SAT.
     */
    public String getDescription() {
        return description;
    }

    public SatAnnualPreloadPersonalDeductionsPossibleItem setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Cuántos CFDI.
     */
    public Long getInvoices() {
        return invoices;
    }

    public SatAnnualPreloadPersonalDeductionsPossibleItem setInvoices(Long invoices) {
        this.invoices = invoices;
        return this;
    }

    @JsonIgnore
    public SatAnnualPreloadPersonalDeductionsPossibleItem setInvoices(long invoices) {
        return setInvoices(Long.valueOf(invoices));
    }

    /**
     * La suma, en pesos.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public SatAnnualPreloadPersonalDeductionsPossibleItem setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public SatAnnualPreloadPersonalDeductionsPossibleItem setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }
}
