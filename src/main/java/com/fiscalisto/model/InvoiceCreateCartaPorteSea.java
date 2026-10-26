// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * InvoiceCreateCartaPorteSea: Transporte marítimo (TransporteMaritimo): embarcación, naviero y contenedores.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorteSea {
    /**
     * Tipo de permiso SCT (PermSCT), c_TipoPermiso.
     */
    @JsonProperty("permit_type")
    private String permitType;

    /**
     * Número de permiso SCT (NumPermisoSCT).
     */
    @JsonProperty("permit_number")
    private String permitNumber;

    /**
     * Aseguradora de responsabilidad civil (AseguraRespCivil).
     */
    @JsonProperty("insurer")
    private String insurer;

    /**
     * Póliza de responsabilidad civil (PolizaRespCivil).
     */
    @JsonProperty("policy")
    private String policy;

    /**
     * Tipo de embarcación (TipoEmbarcacion), c_ConfigMaritima.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("vessel_type")
    private String vesselType;

    /**
     * Matrícula (Matricula).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("registration")
    private String registration;

    /**
     * Número IMO (NumeroOMI): IMO y 7 dígitos.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("imo")
    private String imo;

    /**
     * Año de la embarcación (AnioEmbarcacion).
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Nombre de la embarcación (NombreEmbarc).
     */
    @JsonProperty("vessel_name")
    private String vesselName;

    /**
     * Nacionalidad de la embarcación (NacionalidadEmbarc), c_Pais.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("flag")
    private String flag;

    /**
     * Unidades de arqueo bruto (UnidadesDeArqBruto).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("gross_tonnage")
    private BigDecimal grossTonnage;

    /**
     * Tipo de carga (TipoCarga), c_ClaveTipoCarga.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("cargo_type")
    private String cargoType;

    /**
     * Eslora en metros (Eslora).
     */
    @JsonProperty("length")
    private BigDecimal length;

    /**
     * Manga en metros (Manga).
     */
    @JsonProperty("beam")
    private BigDecimal beam;

    /**
     * Calado en metros (Calado).
     */
    @JsonProperty("draft")
    private BigDecimal draft;

    /**
     * Puntal en metros (Puntal).
     */
    @JsonProperty("depth")
    private BigDecimal depth;

    /**
     * Línea naviera (LineaNaviera).
     */
    @JsonProperty("line")
    private String line;

    /**
     * Nombre del agente naviero consignatario (NombreAgenteNaviero).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("agent_name")
    private String agentName;

    /**
     * Autorización del agente naviero (NumAutorizacionNaviero), c_NumAutorizacionNaviero.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("agent_authorization")
    private String agentAuthorization;

    /**
     * Número de viaje (NumViaje).
     */
    @JsonProperty("voyage")
    private String voyage;

    /**
     * Número de conocimiento de embarque (NumConocEmbarc).
     */
    @JsonProperty("bill_of_lading")
    private String billOfLading;

    /**
     * Permiso temporal de navegación (PermisoTempNavegacion), para una embarcación extranjera.
     */
    @JsonProperty("temp_permit")
    private String tempPermit;

    /**
     * Contenedores (Contenedor).
     */
    @JsonProperty("containers")
    private List<InvoiceCreateCartaPorteSeaContainer> containers;

    /**
     * Tipo de permiso SCT (PermSCT), c_TipoPermiso.
     */
    public String getPermitType() {
        return permitType;
    }

    public InvoiceCreateCartaPorteSea setPermitType(String permitType) {
        this.permitType = permitType;
        return this;
    }

    /**
     * Número de permiso SCT (NumPermisoSCT).
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    public InvoiceCreateCartaPorteSea setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
        return this;
    }

    /**
     * Aseguradora de responsabilidad civil (AseguraRespCivil).
     */
    public String getInsurer() {
        return insurer;
    }

    public InvoiceCreateCartaPorteSea setInsurer(String insurer) {
        this.insurer = insurer;
        return this;
    }

    /**
     * Póliza de responsabilidad civil (PolizaRespCivil).
     */
    public String getPolicy() {
        return policy;
    }

    public InvoiceCreateCartaPorteSea setPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Tipo de embarcación (TipoEmbarcacion), c_ConfigMaritima.
     * <p>
     * Obligatorio.
     */
    public String getVesselType() {
        return vesselType;
    }

    public InvoiceCreateCartaPorteSea setVesselType(String vesselType) {
        this.vesselType = vesselType;
        return this;
    }

    /**
     * Matrícula (Matricula).
     * <p>
     * Obligatorio.
     */
    public String getRegistration() {
        return registration;
    }

    public InvoiceCreateCartaPorteSea setRegistration(String registration) {
        this.registration = registration;
        return this;
    }

    /**
     * Número IMO (NumeroOMI): IMO y 7 dígitos.
     * <p>
     * Obligatorio.
     */
    public String getImo() {
        return imo;
    }

    public InvoiceCreateCartaPorteSea setImo(String imo) {
        this.imo = imo;
        return this;
    }

    /**
     * Año de la embarcación (AnioEmbarcacion).
     */
    public Long getYear() {
        return year;
    }

    public InvoiceCreateCartaPorteSea setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public InvoiceCreateCartaPorteSea setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Nombre de la embarcación (NombreEmbarc).
     */
    public String getVesselName() {
        return vesselName;
    }

    public InvoiceCreateCartaPorteSea setVesselName(String vesselName) {
        this.vesselName = vesselName;
        return this;
    }

    /**
     * Nacionalidad de la embarcación (NacionalidadEmbarc), c_Pais.
     * <p>
     * Obligatorio.
     */
    public String getFlag() {
        return flag;
    }

    public InvoiceCreateCartaPorteSea setFlag(String flag) {
        this.flag = flag;
        return this;
    }

    /**
     * Unidades de arqueo bruto (UnidadesDeArqBruto).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getGrossTonnage() {
        return grossTonnage;
    }

    public InvoiceCreateCartaPorteSea setGrossTonnage(BigDecimal grossTonnage) {
        this.grossTonnage = grossTonnage;
        return this;
    }

    @JsonIgnore
    public InvoiceCreateCartaPorteSea setGrossTonnage(double grossTonnage) {
        return setGrossTonnage(BigDecimal.valueOf(grossTonnage));
    }

    /**
     * Tipo de carga (TipoCarga), c_ClaveTipoCarga.
     * <p>
     * Obligatorio.
     */
    public String getCargoType() {
        return cargoType;
    }

    public InvoiceCreateCartaPorteSea setCargoType(String cargoType) {
        this.cargoType = cargoType;
        return this;
    }

    /**
     * Eslora en metros (Eslora).
     */
    public BigDecimal getLength() {
        return length;
    }

    public InvoiceCreateCartaPorteSea setLength(BigDecimal length) {
        this.length = length;
        return this;
    }

    @JsonIgnore
    public InvoiceCreateCartaPorteSea setLength(double length) {
        return setLength(BigDecimal.valueOf(length));
    }

    /**
     * Manga en metros (Manga).
     */
    public BigDecimal getBeam() {
        return beam;
    }

    public InvoiceCreateCartaPorteSea setBeam(BigDecimal beam) {
        this.beam = beam;
        return this;
    }

    @JsonIgnore
    public InvoiceCreateCartaPorteSea setBeam(double beam) {
        return setBeam(BigDecimal.valueOf(beam));
    }

    /**
     * Calado en metros (Calado).
     */
    public BigDecimal getDraft() {
        return draft;
    }

    public InvoiceCreateCartaPorteSea setDraft(BigDecimal draft) {
        this.draft = draft;
        return this;
    }

    @JsonIgnore
    public InvoiceCreateCartaPorteSea setDraft(double draft) {
        return setDraft(BigDecimal.valueOf(draft));
    }

    /**
     * Puntal en metros (Puntal).
     */
    public BigDecimal getDepth() {
        return depth;
    }

    public InvoiceCreateCartaPorteSea setDepth(BigDecimal depth) {
        this.depth = depth;
        return this;
    }

    @JsonIgnore
    public InvoiceCreateCartaPorteSea setDepth(double depth) {
        return setDepth(BigDecimal.valueOf(depth));
    }

    /**
     * Línea naviera (LineaNaviera).
     */
    public String getLine() {
        return line;
    }

    public InvoiceCreateCartaPorteSea setLine(String line) {
        this.line = line;
        return this;
    }

    /**
     * Nombre del agente naviero consignatario (NombreAgenteNaviero).
     * <p>
     * Obligatorio.
     */
    public String getAgentName() {
        return agentName;
    }

    public InvoiceCreateCartaPorteSea setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }

    /**
     * Autorización del agente naviero (NumAutorizacionNaviero), c_NumAutorizacionNaviero.
     * <p>
     * Obligatorio.
     */
    public String getAgentAuthorization() {
        return agentAuthorization;
    }

    public InvoiceCreateCartaPorteSea setAgentAuthorization(String agentAuthorization) {
        this.agentAuthorization = agentAuthorization;
        return this;
    }

    /**
     * Número de viaje (NumViaje).
     */
    public String getVoyage() {
        return voyage;
    }

    public InvoiceCreateCartaPorteSea setVoyage(String voyage) {
        this.voyage = voyage;
        return this;
    }

    /**
     * Número de conocimiento de embarque (NumConocEmbarc).
     */
    public String getBillOfLading() {
        return billOfLading;
    }

    public InvoiceCreateCartaPorteSea setBillOfLading(String billOfLading) {
        this.billOfLading = billOfLading;
        return this;
    }

    /**
     * Permiso temporal de navegación (PermisoTempNavegacion), para una embarcación extranjera.
     */
    public String getTempPermit() {
        return tempPermit;
    }

    public InvoiceCreateCartaPorteSea setTempPermit(String tempPermit) {
        this.tempPermit = tempPermit;
        return this;
    }

    /**
     * Contenedores (Contenedor).
     */
    public List<InvoiceCreateCartaPorteSeaContainer> getContainers() {
        return containers;
    }

    public InvoiceCreateCartaPorteSea setContainers(List<InvoiceCreateCartaPorteSeaContainer> containers) {
        this.containers = containers;
        return this;
    }
}
