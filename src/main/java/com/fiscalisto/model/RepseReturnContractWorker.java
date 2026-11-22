// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * RepseReturnContractWorker: RepseReturnContractWorker.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RepseReturnContractWorker {
    /**
     * El empleado (emp_…).
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Su nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Su NSS, 11 dígitos.
     */
    @JsonProperty("nss")
    private String nss;

    /**
     * Su CURP.
     */
    @JsonProperty("curp")
    private String curp;

    /**
     * Su último salario base de cotización del cuatrimestre, hasta 25 UMA.
     */
    @JsonProperty("sbc")
    private BigDecimal sbc;

    /**
     * El empleado (emp_…).
     */
    public String getEmployee() {
        return employee;
    }

    public RepseReturnContractWorker setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public RepseReturnContractWorker setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Su NSS, 11 dígitos.
     */
    public String getNss() {
        return nss;
    }

    public RepseReturnContractWorker setNss(String nss) {
        this.nss = nss;
        return this;
    }

    /**
     * Su CURP.
     */
    public String getCurp() {
        return curp;
    }

    public RepseReturnContractWorker setCurp(String curp) {
        this.curp = curp;
        return this;
    }

    /**
     * Su último salario base de cotización del cuatrimestre, hasta 25 UMA.
     */
    public BigDecimal getSbc() {
        return sbc;
    }

    public RepseReturnContractWorker setSbc(BigDecimal sbc) {
        this.sbc = sbc;
        return this;
    }

    @JsonIgnore
    public RepseReturnContractWorker setSbc(double sbc) {
        return setSbc(BigDecimal.valueOf(sbc));
    }
}
