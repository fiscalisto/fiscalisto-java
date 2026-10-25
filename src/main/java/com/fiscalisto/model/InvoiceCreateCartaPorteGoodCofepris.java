// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InvoiceCreateCartaPorteGoodCofepris: Datos COFEPRIS de la mercancía: sector y lo que pide cada uno (medicamentos, precursores, psicotrópicos, sustancias tóxicas, plaguicidas).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorteGoodCofepris {
    /**
     * Sector COFEPRIS (SectorCOFEPRIS): 01 medicamento, 02 precursores y químicos de uso dual, 03 psicotrópicos y estupefacientes, 04 sustancias tóxicas, 05 plaguicidas y fertilizantes.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("sector")
    private String sector;

    /**
     * Nombre del ingrediente activo (NombreIngredienteActivo).
     */
    @JsonProperty("active_ingredient")
    private String activeIngredient;

    /**
     * Nombre químico (NomQuimico).
     */
    @JsonProperty("chemical_name")
    private String chemicalName;

    /**
     * Denominación genérica del producto (DenominacionGenericaProd).
     */
    @JsonProperty("generic_name")
    private String genericName;

    /**
     * Denominación distintiva o marca (DenominacionDistintivaProd).
     */
    @JsonProperty("brand_name")
    private String brandName;

    /**
     * Fabricante (Fabricante).
     */
    @JsonProperty("manufacturer")
    private String manufacturer;

    /**
     * Fecha de caducidad (FechaCaducidad), AAAA-MM-DD.
     */
    @JsonProperty("expiry")
    private String expiry;

    /**
     * Lote del medicamento (LoteMedicamento).
     */
    @JsonProperty("lot")
    private String lot;

    /**
     * Forma farmacéutica (FormaFarmaceutica), c_FormaFarmaceutica.
     */
    @JsonProperty("form")
    private String form;

    /**
     * Condiciones especiales de transporte (CondicionesEspTransp), c_CondicionesEspeciales.
     */
    @JsonProperty("conditions")
    private String conditions;

    /**
     * Registro sanitario o folio de autorización (RegistroSanitarioFolioAutorizacion).
     */
    @JsonProperty("sanitary_registry")
    private String sanitaryRegistry;

    /**
     * Permiso de importación (PermisoImportacion).
     */
    @JsonProperty("import_permit")
    private String importPermit;

    /**
     * Folio de importación VUCEM (FolioImpoVUCEM).
     */
    @JsonProperty("vucem_folio")
    private String vucemFolio;

    /**
     * Número CAS de la sustancia (NumCAS).
     */
    @JsonProperty("cas")
    private String cas;

    /**
     * Razón social de la empresa importadora (RazonSocialEmpImp).
     */
    @JsonProperty("importer")
    private String importer;

    /**
     * Registro sanitario de plaguicidas COFEPRIS (NumRegSanPlagCOFEPRIS).
     */
    @JsonProperty("pesticide_registry")
    private String pesticideRegistry;

    /**
     * Datos del fabricante (DatosFabricante).
     */
    @JsonProperty("manufacturer_data")
    private String manufacturerData;

    /**
     * Datos del formulador (DatosFormulador).
     */
    @JsonProperty("formulator_data")
    private String formulatorData;

    /**
     * Datos del maquilador (DatosMaquilador).
     */
    @JsonProperty("maquilador_data")
    private String maquiladorData;

    /**
     * Uso autorizado (UsoAutorizado).
     */
    @JsonProperty("authorized_use")
    private String authorizedUse;

    /**
     * Sector COFEPRIS (SectorCOFEPRIS): 01 medicamento, 02 precursores y químicos de uso dual, 03 psicotrópicos y estupefacientes, 04 sustancias tóxicas, 05 plaguicidas y fertilizantes.
     * <p>
     * Obligatorio.
     */
    public String getSector() {
        return sector;
    }

    public InvoiceCreateCartaPorteGoodCofepris setSector(String sector) {
        this.sector = sector;
        return this;
    }

    /**
     * Nombre del ingrediente activo (NombreIngredienteActivo).
     */
    public String getActiveIngredient() {
        return activeIngredient;
    }

    public InvoiceCreateCartaPorteGoodCofepris setActiveIngredient(String activeIngredient) {
        this.activeIngredient = activeIngredient;
        return this;
    }

    /**
     * Nombre químico (NomQuimico).
     */
    public String getChemicalName() {
        return chemicalName;
    }

    public InvoiceCreateCartaPorteGoodCofepris setChemicalName(String chemicalName) {
        this.chemicalName = chemicalName;
        return this;
    }

    /**
     * Denominación genérica del producto (DenominacionGenericaProd).
     */
    public String getGenericName() {
        return genericName;
    }

    public InvoiceCreateCartaPorteGoodCofepris setGenericName(String genericName) {
        this.genericName = genericName;
        return this;
    }

    /**
     * Denominación distintiva o marca (DenominacionDistintivaProd).
     */
    public String getBrandName() {
        return brandName;
    }

    public InvoiceCreateCartaPorteGoodCofepris setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }

    /**
     * Fabricante (Fabricante).
     */
    public String getManufacturer() {
        return manufacturer;
    }

    public InvoiceCreateCartaPorteGoodCofepris setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    /**
     * Fecha de caducidad (FechaCaducidad), AAAA-MM-DD.
     */
    public String getExpiry() {
        return expiry;
    }

    public InvoiceCreateCartaPorteGoodCofepris setExpiry(String expiry) {
        this.expiry = expiry;
        return this;
    }

    /**
     * Lote del medicamento (LoteMedicamento).
     */
    public String getLot() {
        return lot;
    }

    public InvoiceCreateCartaPorteGoodCofepris setLot(String lot) {
        this.lot = lot;
        return this;
    }

    /**
     * Forma farmacéutica (FormaFarmaceutica), c_FormaFarmaceutica.
     */
    public String getForm() {
        return form;
    }

    public InvoiceCreateCartaPorteGoodCofepris setForm(String form) {
        this.form = form;
        return this;
    }

    /**
     * Condiciones especiales de transporte (CondicionesEspTransp), c_CondicionesEspeciales.
     */
    public String getConditions() {
        return conditions;
    }

    public InvoiceCreateCartaPorteGoodCofepris setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Registro sanitario o folio de autorización (RegistroSanitarioFolioAutorizacion).
     */
    public String getSanitaryRegistry() {
        return sanitaryRegistry;
    }

    public InvoiceCreateCartaPorteGoodCofepris setSanitaryRegistry(String sanitaryRegistry) {
        this.sanitaryRegistry = sanitaryRegistry;
        return this;
    }

    /**
     * Permiso de importación (PermisoImportacion).
     */
    public String getImportPermit() {
        return importPermit;
    }

    public InvoiceCreateCartaPorteGoodCofepris setImportPermit(String importPermit) {
        this.importPermit = importPermit;
        return this;
    }

    /**
     * Folio de importación VUCEM (FolioImpoVUCEM).
     */
    public String getVucemFolio() {
        return vucemFolio;
    }

    public InvoiceCreateCartaPorteGoodCofepris setVucemFolio(String vucemFolio) {
        this.vucemFolio = vucemFolio;
        return this;
    }

    /**
     * Número CAS de la sustancia (NumCAS).
     */
    public String getCas() {
        return cas;
    }

    public InvoiceCreateCartaPorteGoodCofepris setCas(String cas) {
        this.cas = cas;
        return this;
    }

    /**
     * Razón social de la empresa importadora (RazonSocialEmpImp).
     */
    public String getImporter() {
        return importer;
    }

    public InvoiceCreateCartaPorteGoodCofepris setImporter(String importer) {
        this.importer = importer;
        return this;
    }

    /**
     * Registro sanitario de plaguicidas COFEPRIS (NumRegSanPlagCOFEPRIS).
     */
    public String getPesticideRegistry() {
        return pesticideRegistry;
    }

    public InvoiceCreateCartaPorteGoodCofepris setPesticideRegistry(String pesticideRegistry) {
        this.pesticideRegistry = pesticideRegistry;
        return this;
    }

    /**
     * Datos del fabricante (DatosFabricante).
     */
    public String getManufacturerData() {
        return manufacturerData;
    }

    public InvoiceCreateCartaPorteGoodCofepris setManufacturerData(String manufacturerData) {
        this.manufacturerData = manufacturerData;
        return this;
    }

    /**
     * Datos del formulador (DatosFormulador).
     */
    public String getFormulatorData() {
        return formulatorData;
    }

    public InvoiceCreateCartaPorteGoodCofepris setFormulatorData(String formulatorData) {
        this.formulatorData = formulatorData;
        return this;
    }

    /**
     * Datos del maquilador (DatosMaquilador).
     */
    public String getMaquiladorData() {
        return maquiladorData;
    }

    public InvoiceCreateCartaPorteGoodCofepris setMaquiladorData(String maquiladorData) {
        this.maquiladorData = maquiladorData;
        return this;
    }

    /**
     * Uso autorizado (UsoAutorizado).
     */
    public String getAuthorizedUse() {
        return authorizedUse;
    }

    public InvoiceCreateCartaPorteGoodCofepris setAuthorizedUse(String authorizedUse) {
        this.authorizedUse = authorizedUse;
        return this;
    }
}
