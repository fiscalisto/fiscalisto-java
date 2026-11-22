// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * RepseContract: Un contrato de servicios u obras especializados (LFT art. 15) con un cliente, y quién del personal del emisor trabaja en él: lo que piden el ICSOE y el SISUB. Como Nómina › REPSE en la app.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RepseContract {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Número de contrato (dígitos, hasta 20).
     */
    @JsonProperty("number")
    private String number;

    /**
     * Tipo de contrato.
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
     * Fecha de término, o null si es por tiempo indefinido.
     */
    @JsonProperty("end_date")
    private String endDate;

    /**
     * Número estimado mensual de trabajadores que pone a disposición.
     */
    @JsonProperty("estimated_workers")
    private Long estimatedWorkers;

    /**
     * RFC del cliente (el beneficiario).
     */
    @JsonProperty("client_tax_id")
    private String clientTaxId;

    /**
     * Razón social del cliente.
     */
    @JsonProperty("client_name")
    private String clientName;

    /**
     * Registro patronal del cliente, o null si no tiene.
     */
    @JsonProperty("client_employer_registration")
    private String clientEmployerRegistration;

    /**
     * Domicilio fiscal del cliente.
     */
    @JsonProperty("client_address")
    private RepseContractClientAddress clientAddress;

    /**
     * El centro de trabajo donde trabajan las personas que pone a disposición.
     */
    @JsonProperty("site_address")
    private RepseContractSiteAddress siteAddress;

    /**
     * Quién trabaja en el contrato y desde cuándo.
     */
    @JsonProperty("workers")
    private List<RepseContractWorker> workers;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public RepseContract setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public RepseContract setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public RepseContract setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public RepseContract setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Número de contrato (dígitos, hasta 20).
     */
    public String getNumber() {
        return number;
    }

    public RepseContract setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Tipo de contrato.
     */
    public String getKind() {
        return kind;
    }

    public RepseContract setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Objeto del contrato.
     */
    public String getContractObject() {
        return contractObject;
    }

    public RepseContract setContractObject(String contractObject) {
        this.contractObject = contractObject;
        return this;
    }

    /**
     * El servicio u obra especializada registrado en el REPSE que cubre.
     */
    public String getService() {
        return service;
    }

    public RepseContract setService(String service) {
        this.service = service;
        return this;
    }

    /**
     * Monto pactado, en pesos.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public RepseContract setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @JsonIgnore
    public RepseContract setAmount(double amount) {
        return setAmount(BigDecimal.valueOf(amount));
    }

    /**
     * Inicio de su vigencia (YYYY-MM-DD).
     */
    public String getStartDate() {
        return startDate;
    }

    public RepseContract setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Fecha de término, o null si es por tiempo indefinido.
     */
    public String getEndDate() {
        return endDate;
    }

    public RepseContract setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Número estimado mensual de trabajadores que pone a disposición.
     */
    public Long getEstimatedWorkers() {
        return estimatedWorkers;
    }

    public RepseContract setEstimatedWorkers(Long estimatedWorkers) {
        this.estimatedWorkers = estimatedWorkers;
        return this;
    }

    @JsonIgnore
    public RepseContract setEstimatedWorkers(long estimatedWorkers) {
        return setEstimatedWorkers(Long.valueOf(estimatedWorkers));
    }

    /**
     * RFC del cliente (el beneficiario).
     */
    public String getClientTaxId() {
        return clientTaxId;
    }

    public RepseContract setClientTaxId(String clientTaxId) {
        this.clientTaxId = clientTaxId;
        return this;
    }

    /**
     * Razón social del cliente.
     */
    public String getClientName() {
        return clientName;
    }

    public RepseContract setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * Registro patronal del cliente, o null si no tiene.
     */
    public String getClientEmployerRegistration() {
        return clientEmployerRegistration;
    }

    public RepseContract setClientEmployerRegistration(String clientEmployerRegistration) {
        this.clientEmployerRegistration = clientEmployerRegistration;
        return this;
    }

    /**
     * Domicilio fiscal del cliente.
     */
    public RepseContractClientAddress getClientAddress() {
        return clientAddress;
    }

    public RepseContract setClientAddress(RepseContractClientAddress clientAddress) {
        this.clientAddress = clientAddress;
        return this;
    }

    /**
     * El centro de trabajo donde trabajan las personas que pone a disposición.
     */
    public RepseContractSiteAddress getSiteAddress() {
        return siteAddress;
    }

    public RepseContract setSiteAddress(RepseContractSiteAddress siteAddress) {
        this.siteAddress = siteAddress;
        return this;
    }

    /**
     * Quién trabaja en el contrato y desde cuándo.
     */
    public List<RepseContractWorker> getWorkers() {
        return workers;
    }

    public RepseContract setWorkers(List<RepseContractWorker> workers) {
        this.workers = workers;
        return this;
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public RepseContract setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
