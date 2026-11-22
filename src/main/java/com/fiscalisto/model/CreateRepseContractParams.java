// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CreateRepseContractParams: los campos de «Registrar un contrato de servicios especializados».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRepseContractParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Número de contrato: dígitos, hasta 20 (así lo pide el SISUB).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("number")
    private String number;

    /**
     * Tipo de contrato, como lo dice el contrato.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Objeto del contrato.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("contract_object")
    private String contractObject;

    /**
     * El servicio u obra especializada registrado en el REPSE que cubre.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("service")
    private String service;

    /**
     * Monto pactado, en pesos.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("amount")
    private BigDecimal amount;

    /**
     * Inicio de su vigencia (YYYY-MM-DD).
     * <p>
     * Obligatorio.
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
     * <p>
     * Obligatorio.
     */
    @JsonProperty("estimated_workers")
    private Long estimatedWorkers;

    /**
     * RFC del cliente (el beneficiario de los servicios).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("client_tax_id")
    private String clientTaxId;

    /**
     * Razón social del cliente.
     * <p>
     * Obligatorio.
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
     * <p>
     * Obligatorio.
     */
    @JsonProperty("client_address")
    private CreateRepseContractParamsClientAddress clientAddress;

    /**
     * El centro de trabajo donde trabajan las personas que pone a disposición.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("site_address")
    private CreateRepseContractParamsSiteAddress siteAddress;

    /**
     * Quién trabaja en el contrato y desde cuándo (hasta 2,000).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("workers")
    private List<CreateRepseContractParamsWorker> workers;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateRepseContractParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Número de contrato: dígitos, hasta 20 (así lo pide el SISUB).
     * <p>
     * Obligatorio.
     */
    public String getNumber() {
        return number;
    }

    public CreateRepseContractParams setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Tipo de contrato, como lo dice el contrato.
     * <p>
     * Obligatorio.
     */
    public String getKind() {
        return kind;
    }

    public CreateRepseContractParams setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Objeto del contrato.
     * <p>
     * Obligatorio.
     */
    public String getContractObject() {
        return contractObject;
    }

    public CreateRepseContractParams setContractObject(String contractObject) {
        this.contractObject = contractObject;
        return this;
    }

    /**
     * El servicio u obra especializada registrado en el REPSE que cubre.
     * <p>
     * Obligatorio.
     */
    public String getService() {
        return service;
    }

    public CreateRepseContractParams setService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Monto pactado, en pesos.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public CreateRepseContractParams setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public CreateRepseContractParams setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Inicio de su vigencia (YYYY-MM-DD).
     * <p>
     * Obligatorio.
     */
    public String getStartDate() {
        return startDate;
    }

    public CreateRepseContractParams setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Fecha de término; null si es por tiempo indefinido.
     */
    public String getEndDate() {
        return endDate;
    }

    public CreateRepseContractParams setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Número estimado mensual de trabajadores que pone a disposición.
     * <p>
     * Obligatorio.
     */
    public Long getEstimatedWorkers() {
        return estimatedWorkers;
    }

    public CreateRepseContractParams setEstimatedWorkers(Long estimatedWorkers) {
        this.estimatedWorkers = estimatedWorkers;
        return this;
    }

    @JsonIgnore
    public CreateRepseContractParams setEstimatedWorkers(long estimatedWorkers) {
        return setEstimatedWorkers(Long.valueOf(estimatedWorkers));
    }

    /**
     * RFC del cliente (el beneficiario de los servicios).
     * <p>
     * Obligatorio.
     */
    public String getClientTaxId() {
        return clientTaxId;
    }

    public CreateRepseContractParams setClientTaxId(String clientTaxId) {
        this.clientTaxId = clientTaxId;
        return this;
    }

    /**
     * Razón social del cliente.
     * <p>
     * Obligatorio.
     */
    public String getClientName() {
        return clientName;
    }

    public CreateRepseContractParams setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * Registro patronal del cliente ante el IMSS, si tiene.
     */
    public String getClientEmployerRegistration() {
        return clientEmployerRegistration;
    }

    public CreateRepseContractParams setClientEmployerRegistration(String clientEmployerRegistration) {
        this.clientEmployerRegistration = clientEmployerRegistration;
        return this;
    }

    /**
     * Domicilio fiscal del cliente.
     * <p>
     * Obligatorio.
     */
    public CreateRepseContractParamsClientAddress getClientAddress() {
        return clientAddress;
    }

    public CreateRepseContractParams setClientAddress(CreateRepseContractParamsClientAddress clientAddress) {
        this.clientAddress = clientAddress;
        return this;
    }

    /**
     * El centro de trabajo donde trabajan las personas que pone a disposición.
     * <p>
     * Obligatorio.
     */
    public CreateRepseContractParamsSiteAddress getSiteAddress() {
        return siteAddress;
    }

    public CreateRepseContractParams setSiteAddress(CreateRepseContractParamsSiteAddress siteAddress) {
        this.siteAddress = siteAddress;
        return this;
    }

    /**
     * Quién trabaja en el contrato y desde cuándo (hasta 2,000).
     * <p>
     * Obligatorio.
     */
    public List<CreateRepseContractParamsWorker> getWorkers() {
        return workers;
    }

    public CreateRepseContractParams setWorkers(List<CreateRepseContractParamsWorker> workers) {
        this.workers = workers;
        return this;
    }
}
