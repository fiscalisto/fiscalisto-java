// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetPayrollAccumulatedParams: los campos de «Acumulados de nómina».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetPayrollAccumulatedParams {
    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El año: 2026 (por omisión, el actual).
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Un empleado (emp_…): solo sus recibos.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetPayrollAccumulatedParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El año: 2026 (por omisión, el actual).
     */
    public Long getYear() {
        return year;
    }

    public GetPayrollAccumulatedParams setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public GetPayrollAccumulatedParams setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Un empleado (emp_…): solo sus recibos.
     */
    public String getEmployee() {
        return employee;
    }

    public GetPayrollAccumulatedParams setEmployee(String employee) {
        this.employee = employee;
        return this;
    }
}
