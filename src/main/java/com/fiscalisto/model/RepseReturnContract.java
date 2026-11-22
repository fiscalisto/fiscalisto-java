// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * RepseReturnContract: RepseReturnContract.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RepseReturnContract {
    /**
     * El contrato (rpc_…).
     */
    @JsonProperty("contract")
    private String contract;

    /**
     * Su número de contrato.
     */
    @JsonProperty("number")
    private String number;

    /**
     * Sus trabajadores en el cuatrimestre (el CSV del ICSOE).
     */
    @JsonProperty("workers")
    private List<RepseReturnContractWorker> workers;

    /**
     * El contrato (rpc_…).
     */
    public String getContract() {
        return contract;
    }

    public RepseReturnContract setContract(String contract) {
        this.contract = contract;
        return this;
    }

    /**
     * Su número de contrato.
     */
    public String getNumber() {
        return number;
    }

    public RepseReturnContract setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Sus trabajadores en el cuatrimestre (el CSV del ICSOE).
     */
    public List<RepseReturnContractWorker> getWorkers() {
        return workers;
    }

    public RepseReturnContract setWorkers(List<RepseReturnContractWorker> workers) {
        this.workers = workers;
        return this;
    }
}
