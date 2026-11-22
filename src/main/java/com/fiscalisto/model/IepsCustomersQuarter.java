// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * IepsCustomersQuarter: IepsCustomersQuarter.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IepsCustomersQuarter {
    /**
     * El trimestre, 1 a 4.
     */
    @JsonProperty("quarter")
    private Long quarter;

    /**
     * El mes (AAAA-MM) en que se presenta en el MULTI-IEPS: el siguiente al trimestre.
     */
    @JsonProperty("due_month")
    private String dueMonth;

    /**
     * Los clientes, el de más IEPS primero.
     */
    @JsonProperty("customers")
    private List<IepsCustomersQuarterCustomer> customers;

    /**
     * El IEPS de todos, en pesos.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * El trimestre, 1 a 4.
     */
    public Long getQuarter() {
        return quarter;
    }

    public IepsCustomersQuarter setQuarter(Long quarter) {
        this.quarter = quarter;
        return this;
    }

    @JsonIgnore
    public IepsCustomersQuarter setQuarter(long quarter) {
        return setQuarter(Long.valueOf(quarter));
    }

    /**
     * El mes (AAAA-MM) en que se presenta en el MULTI-IEPS: el siguiente al trimestre.
     */
    public String getDueMonth() {
        return dueMonth;
    }

    public IepsCustomersQuarter setDueMonth(String dueMonth) {
        this.dueMonth = dueMonth;
        return this;
    }

    /**
     * Los clientes, el de más IEPS primero.
     */
    public List<IepsCustomersQuarterCustomer> getCustomers() {
        return customers;
    }

    public IepsCustomersQuarter setCustomers(List<IepsCustomersQuarterCustomer> customers) {
        this.customers = customers;
        return this;
    }

    /**
     * El IEPS de todos, en pesos.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public IepsCustomersQuarter setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public IepsCustomersQuarter setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }
}
