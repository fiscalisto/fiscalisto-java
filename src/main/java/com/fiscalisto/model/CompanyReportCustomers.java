// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CompanyReportCustomers: Sus clientes del periodo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyReportCustomers {
    /**
     * Cuántos hay en el periodo.
     */
    @JsonProperty("count")
    private Long count;

    /**
     * Su concentración (índice Herfindahl-Hirschman, 0 a 10,000; más de 1,500 es concentrado), sin el público en general.
     */
    @JsonProperty("hhi")
    private BigDecimal hhi;

    /**
     * Por ciento del total que suman los 10 principales, sin el público en general.
     */
    @JsonProperty("top10_share")
    private BigDecimal top10Share;

    /**
     * Los principales, de mayor a menor: 15, o 5 en executive.
     */
    @JsonProperty("parties")
    private List<CompanyReportCustomersParty> parties;

    /**
     * Cuántos hay en el periodo.
     */
    public Long getCount() {
        return count;
    }

    public CompanyReportCustomers setCount(Long count) {
        this.count = count;
        return this;
    }

    @JsonIgnore
    public CompanyReportCustomers setCount(long count) {
        return setCount(Long.valueOf(count));
    }

    /**
     * Su concentración (índice Herfindahl-Hirschman, 0 a 10,000; más de 1,500 es concentrado), sin el público en general.
     */
    public BigDecimal getHhi() {
        return hhi;
    }

    public CompanyReportCustomers setHhi(BigDecimal hhi) {
        this.hhi = hhi;
        return this;
    }

    @JsonIgnore
    public CompanyReportCustomers setHhi(double hhi) {
        return setHhi(BigDecimal.valueOf(hhi));
    }

    /**
     * Por ciento del total que suman los 10 principales, sin el público en general.
     */
    public BigDecimal getTop10Share() {
        return top10Share;
    }

    public CompanyReportCustomers setTop10Share(BigDecimal top10Share) {
        this.top10Share = top10Share;
        return this;
    }

    @JsonIgnore
    public CompanyReportCustomers setTop10Share(double top10Share) {
        return setTop10Share(BigDecimal.valueOf(top10Share));
    }

    /**
     * Los principales, de mayor a menor: 15, o 5 en executive.
     */
    public List<CompanyReportCustomersParty> getParties() {
        return parties;
    }

    public CompanyReportCustomers setParties(List<CompanyReportCustomersParty> parties) {
        this.parties = parties;
        return this;
    }
}
