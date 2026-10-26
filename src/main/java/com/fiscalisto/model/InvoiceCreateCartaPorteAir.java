// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * InvoiceCreateCartaPorteAir: Transporte aéreo (TransporteAereo): permiso, guía y transportista.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorteAir {
    /**
     * Tipo de permiso SCT (PermSCT), c_TipoPermiso.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("permit_type")
    private String permitType;

    /**
     * Número de permiso SCT (NumPermisoSCT).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("permit_number")
    private String permitNumber;

    /**
     * Matrícula de la aeronave (MatriculaAeronave).
     */
    @JsonProperty("aircraft")
    private String aircraft;

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
     * Número de guía aérea (NumeroGuia), de 12 a 15 caracteres.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("waybill")
    private String waybill;

    /**
     * Lugar del contrato (LugarContrato).
     */
    @JsonProperty("contract_place")
    private String contractPlace;

    /**
     * Código del transportista (CodigoTransportista), c_CodigoTransporteAereo.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("carrier")
    private String carrier;

    /**
     * Embarcador (RFCEmbarcador o NumRegIdTribEmbarc y ResidenciaFiscalEmbarc, NombreEmbarcador).
     */
    @JsonProperty("shipper")
    private InvoiceCreateCartaPorteAirShipper shipper;

    /**
     * Cargo por tasación (CargoPorTasacion).
     */
    @JsonProperty("rate_charge")
    private BigDecimal rateCharge;

    /**
     * Tipo de permiso SCT (PermSCT), c_TipoPermiso.
     * <p>
     * Obligatorio.
     */
    public String getPermitType() {
        return permitType;
    }

    public InvoiceCreateCartaPorteAir setPermitType(String permitType) {
        this.permitType = permitType;
        return this;
    }

    /**
     * Número de permiso SCT (NumPermisoSCT).
     * <p>
     * Obligatorio.
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    public InvoiceCreateCartaPorteAir setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
        return this;
    }

    /**
     * Matrícula de la aeronave (MatriculaAeronave).
     */
    public String getAircraft() {
        return aircraft;
    }

    public InvoiceCreateCartaPorteAir setAircraft(String aircraft) {
        this.aircraft = aircraft;
        return this;
    }

    /**
     * Aseguradora de responsabilidad civil (AseguraRespCivil).
     */
    public String getInsurer() {
        return insurer;
    }

    public InvoiceCreateCartaPorteAir setInsurer(String insurer) {
        this.insurer = insurer;
        return this;
    }

    /**
     * Póliza de responsabilidad civil (PolizaRespCivil).
     */
    public String getPolicy() {
        return policy;
    }

    public InvoiceCreateCartaPorteAir setPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Número de guía aérea (NumeroGuia), de 12 a 15 caracteres.
     * <p>
     * Obligatorio.
     */
    public String getWaybill() {
        return waybill;
    }

    public InvoiceCreateCartaPorteAir setWaybill(String waybill) {
        this.waybill = waybill;
        return this;
    }

    /**
     * Lugar del contrato (LugarContrato).
     */
    public String getContractPlace() {
        return contractPlace;
    }

    public InvoiceCreateCartaPorteAir setContractPlace(String contractPlace) {
        this.contractPlace = contractPlace;
        return this;
    }

    /**
     * Código del transportista (CodigoTransportista), c_CodigoTransporteAereo.
     * <p>
     * Obligatorio.
     */
    public String getCarrier() {
        return carrier;
    }

    public InvoiceCreateCartaPorteAir setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    /**
     * Embarcador (RFCEmbarcador o NumRegIdTribEmbarc y ResidenciaFiscalEmbarc, NombreEmbarcador).
     */
    public InvoiceCreateCartaPorteAirShipper getShipper() {
        return shipper;
    }

    public InvoiceCreateCartaPorteAir setShipper(InvoiceCreateCartaPorteAirShipper shipper) {
        this.shipper = shipper;
        return this;
    }

    /**
     * Cargo por tasación (CargoPorTasacion).
     */
    public BigDecimal getRateCharge() {
        return rateCharge;
    }

    public InvoiceCreateCartaPorteAir setRateCharge(BigDecimal rateCharge) {
        this.rateCharge = rateCharge;
        return this;
    }

    @JsonIgnore
    public InvoiceCreateCartaPorteAir setRateCharge(double rateCharge) {
        return setRateCharge(BigDecimal.valueOf(rateCharge));
    }
}
