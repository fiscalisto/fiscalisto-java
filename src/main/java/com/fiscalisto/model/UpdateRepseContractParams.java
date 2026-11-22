// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * UpdateRepseContractParams: los campos de «Cambiar un contrato de servicios especializados».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateRepseContractParams {
    /**
     * Número de contrato: dígitos, hasta 20 (así lo pide el SISUB).
     */
    @JsonProperty("number")
    private String number;

    /**
     * Tipo de contrato, como lo dice el contrato.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Objeto del contrato.
     */
    @JsonProperty("contract_object")
    private String contractObject;

    /**
     * El servicio u obra especializada registrado en el REPSE que cubre.
     */
    @JsonProperty("service")
    private String service;

    /**
     * Monto pactado, en pesos.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Inicio de su vigencia (YYYY-MM-DD).
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * Fecha de término; null si es por tiempo indefinido.
     */
    @JsonProperty("end_date")
    private String endDate;

    /**
     * Número estimado mensual de trabajadores que pone a disposición.
     */
    @JsonProperty("estimated_workers")
    private Long estimatedWorkers;

    /**
     * RFC del cliente (el beneficiario de los servicios).
     */
    @JsonProperty("client_tax_id")
    private String clientTaxId;

    /**
     * Razón social del cliente.
     */
    @JsonProperty("client_name")
    private String clientName;

    /**
     * Registro patronal del cliente ante el IMSS, si tiene.
     */
    @JsonProperty("client_employer_registration")
    private String clientEmployerRegistration;

    /**
     * Domicilio fiscal del cliente.
     */
    @JsonProperty("client_address")
    private UpdateRepseContractParamsClientAddress clientAddress;

    /**
     * El centro de trabajo donde trabajan las personas que pone a disposición.
     */
    @JsonProperty("site_address")
    private UpdateRepseContractParamsSiteAddress siteAddress;

    /**
     * Quién trabaja en el contrato y desde cuándo (hasta 2,000).
     */
    @JsonProperty("workers")
    private List<UpdateRepseContractParamsWorker> workers;

    /**
     * Número de contrato: dígitos, hasta 20 (así lo pide el SISUB).
     */
    public String getNumber() {
        return number;
    }

    public UpdateRepseContractParams setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Tipo de contrato, como lo dice el contrato.
     */
    public String getKind() {
        return kind;
    }

    public UpdateRepseContractParams setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Objeto del contrato.
     */
    public String getContractObject() {
        return contractObject;
    }

    public UpdateRepseContractParams setContractObject(String contractObject) {
        this.contractObject = contractObject;
        return this;
    }

    /**
     * El servicio u obra especializada registrado en el REPSE que cubre.
     */
    public String getService() {
        return service;
    }

    public UpdateRepseContractParams setService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Monto pactado, en pesos.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public UpdateRepseContractParams setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public UpdateRepseContractParams setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Inicio de su vigencia (YYYY-MM-DD).
     */
    public String getStartDate() {
        return startDate;
    }

    public UpdateRepseContractParams setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Fecha de término; null si es por tiempo indefinido.
     */
    public String getEndDate() {
        return endDate;
    }

    public UpdateRepseContractParams setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Número estimado mensual de trabajadores que pone a disposición.
     */
    public Long getEstimatedWorkers() {
        return estimatedWorkers;
    }

    public UpdateRepseContractParams setEstimatedWorkers(Long estimatedWorkers) {
        this.estimatedWorkers = estimatedWorkers;
        return this;
    }

    @JsonIgnore
    public UpdateRepseContractParams setEstimatedWorkers(long estimatedWorkers) {
        return setEstimatedWorkers(Long.valueOf(estimatedWorkers));
    }

    /**
     * RFC del cliente (el beneficiario de los servicios).
     */
    public String getClientTaxId() {
        return clientTaxId;
    }

    public UpdateRepseContractParams setClientTaxId(String clientTaxId) {
        this.clientTaxId = clientTaxId;
        return this;
    }

    /**
     * Razón social del cliente.
     */
    public String getClientName() {
        return clientName;
    }

    public UpdateRepseContractParams setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * Registro patronal del cliente ante el IMSS, si tiene.
     */
    public String getClientEmployerRegistration() {
        return clientEmployerRegistration;
    }

    public UpdateRepseContractParams setClientEmployerRegistration(String clientEmployerRegistration) {
        this.clientEmployerRegistration = clientEmployerRegistration;
        return this;
    }

    /**
     * Domicilio fiscal del cliente.
     */
    public UpdateRepseContractParamsClientAddress getClientAddress() {
        return clientAddress;
    }

    public UpdateRepseContractParams setClientAddress(UpdateRepseContractParamsClientAddress clientAddress) {
        this.clientAddress = clientAddress;
        return this;
    }

    /**
     * El centro de trabajo donde trabajan las personas que pone a disposición.
     */
    public UpdateRepseContractParamsSiteAddress getSiteAddress() {
        return siteAddress;
    }

    public UpdateRepseContractParams setSiteAddress(UpdateRepseContractParamsSiteAddress siteAddress) {
        this.siteAddress = siteAddress;
        return this;
    }

    /**
     * Quién trabaja en el contrato y desde cuándo (hasta 2,000).
     */
    public List<UpdateRepseContractParamsWorker> getWorkers() {
        return workers;
    }

    public UpdateRepseContractParams setWorkers(List<UpdateRepseContractParamsWorker> workers) {
        this.workers = workers;
        return this;
    }
}
