// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * UpdateInvoiceParamsCartaPorteGood: UpdateInvoiceParamsCartaPorteGood.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateInvoiceParamsCartaPorteGood {
    /**
     * Clave del bien transportado (BienesTransp), c_ClaveProdServCP.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("product_key")
    private String productKey;

    /**
     * Descripción de la mercancía (Descripcion).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Cantidad (Cantidad).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("quantity")
    private BigDecimal quantity;

    /**
     * Clave de unidad (ClaveUnidad), c_ClaveUnidad.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("unit_key")
    private String unitKey;

    /**
     * Peso en kilogramos (PesoEnKg).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("weight_kg")
    private BigDecimal weightKg;

    /**
     * Dimensiones (Dimensiones), como 30/40/30cm o en plg.
     */
    @JsonProperty("dimensions")
    private String dimensions;

    /**
     * Material peligroso (MaterialPeligroso Sí): clave UN y embalaje.
     */
    @JsonProperty("hazmat")
    private UpdateInvoiceParamsCartaPorteGoodHazmat hazmat;

    /**
     * Datos COFEPRIS de la mercancía: sector y lo que pide cada uno (medicamentos, precursores, psicotrópicos, sustancias tóxicas, plaguicidas).
     */
    @JsonProperty("cofepris")
    private UpdateInvoiceParamsCartaPorteGoodCofepris cofepris;

    /**
     * Valor de la mercancía (ValorMercancia); obligatorio en transporte aéreo.
     */
    @JsonProperty("value")
    private BigDecimal value;

    /**
     * Moneda del valor de la mercancía (Moneda), c_Moneda.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Fracción arancelaria (FraccionArancelaria), 10 dígitos. Transporte internacional.
     */
    @JsonProperty("tariff")
    private String tariff;

    /**
     * UUID del CFDI con complemento de comercio exterior (UUIDComercioExt).
     */
    @JsonProperty("cce_uuid")
    private String cceUuid;

    /**
     * Tipo de materia (TipoMateria, c_TipoMateria) y su descripción si es «otra».
     */
    @JsonProperty("material")
    private UpdateInvoiceParamsCartaPorteGoodMaterial material;

    /**
     * Documentación aduanera (DocumentacionAduanera) de la mercancía en transporte internacional.
     */
    @JsonProperty("customs_docs")
    private List<UpdateInvoiceParamsCartaPorteGoodCustomsDoc> customsDocs;

    /**
     * Paquetería: guías de los paquetes o tarimas (GuiasIdentificacion).
     */
    @JsonProperty("guides")
    private List<UpdateInvoiceParamsCartaPorteGoodGuide> guides;

    /**
     * Cuánto va a cada destino (CantidadTransporta), por destino.
     */
    @JsonProperty("quantities")
    private List<UpdateInvoiceParamsCartaPorteGoodQuantity> quantities;

    /**
     * Marítimo: detalle de la mercancía (DetalleMercancia): kilos netos, tara y piezas.
     */
    @JsonProperty("detail")
    private UpdateInvoiceParamsCartaPorteGoodDetail detail;

    /**
     * Ferroviario: clave STCC (ClaveSTCC).
     */
    @JsonProperty("stcc")
    private String stcc;

    /**
     * Clave del bien transportado (BienesTransp), c_ClaveProdServCP.
     * <p>
     * Obligatorio.
     */
    public String getProductKey() {
        return productKey;
    }

    public UpdateInvoiceParamsCartaPorteGood setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }

    /**
     * Descripción de la mercancía (Descripcion).
     * <p>
     * Obligatorio.
     */
    public String getDescription() {
        return description;
    }

    public UpdateInvoiceParamsCartaPorteGood setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Cantidad (Cantidad).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    public UpdateInvoiceParamsCartaPorteGood setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    @JsonIgnore
    public UpdateInvoiceParamsCartaPorteGood setQuantity(double quantity) {
        return setQuantity(BigDecimal.valueOf(quantity));
    }

    /**
     * Clave de unidad (ClaveUnidad), c_ClaveUnidad.
     * <p>
     * Obligatorio.
     */
    public String getUnitKey() {
        return unitKey;
    }

    public UpdateInvoiceParamsCartaPorteGood setUnitKey(String unitKey) {
        this.unitKey = unitKey;
        return this;
    }

    /**
     * Peso en kilogramos (PesoEnKg).
     * <p>
     * Obligatorio.
     */
    public BigDecimal getWeightKg() {
        return weightKg;
    }

    public UpdateInvoiceParamsCartaPorteGood setWeightKg(BigDecimal weightKg) {
        this.weightKg = weightKg;
        return this;
    }

    @JsonIgnore
    public UpdateInvoiceParamsCartaPorteGood setWeightKg(double weightKg) {
        return setWeightKg(BigDecimal.valueOf(weightKg));
    }

    /**
     * Dimensiones (Dimensiones), como 30/40/30cm o en plg.
     */
    public String getDimensions() {
        return dimensions;
    }

    public UpdateInvoiceParamsCartaPorteGood setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Material peligroso (MaterialPeligroso Sí): clave UN y embalaje.
     */
    public UpdateInvoiceParamsCartaPorteGoodHazmat getHazmat() {
        return hazmat;
    }

    public UpdateInvoiceParamsCartaPorteGood setHazmat(UpdateInvoiceParamsCartaPorteGoodHazmat hazmat) {
        this.hazmat = hazmat;
        return this;
    }

    /**
     * Datos COFEPRIS de la mercancía: sector y lo que pide cada uno (medicamentos, precursores, psicotrópicos, sustancias tóxicas, plaguicidas).
     */
    public UpdateInvoiceParamsCartaPorteGoodCofepris getCofepris() {
        return cofepris;
    }

    public UpdateInvoiceParamsCartaPorteGood setCofepris(UpdateInvoiceParamsCartaPorteGoodCofepris cofepris) {
        this.cofepris = cofepris;
        return this;
    }

    /**
     * Valor de la mercancía (ValorMercancia); obligatorio en transporte aéreo.
     */
    public BigDecimal getValue() {
        return value;
    }

    public UpdateInvoiceParamsCartaPorteGood setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    @JsonIgnore
    public UpdateInvoiceParamsCartaPorteGood setValue(double value) {
        return setValue(BigDecimal.valueOf(value));
    }

    /**
     * Moneda del valor de la mercancía (Moneda), c_Moneda.
     */
    public String getCurrency() {
        return currency;
    }

    public UpdateInvoiceParamsCartaPorteGood setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Fracción arancelaria (FraccionArancelaria), 10 dígitos. Transporte internacional.
     */
    public String getTariff() {
        return tariff;
    }

    public UpdateInvoiceParamsCartaPorteGood setTariff(String tariff) {
        this.tariff = tariff;
        return this;
    }

    /**
     * UUID del CFDI con complemento de comercio exterior (UUIDComercioExt).
     */
    public String getCceUuid() {
        return cceUuid;
    }

    public UpdateInvoiceParamsCartaPorteGood setCceUuid(String cceUuid) {
        this.cceUuid = cceUuid;
        return this;
    }

    /**
     * Tipo de materia (TipoMateria, c_TipoMateria) y su descripción si es «otra».
     */
    public UpdateInvoiceParamsCartaPorteGoodMaterial getMaterial() {
        return material;
    }

    public UpdateInvoiceParamsCartaPorteGood setMaterial(UpdateInvoiceParamsCartaPorteGoodMaterial material) {
        this.material = material;
        return this;
    }

    /**
     * Documentación aduanera (DocumentacionAduanera) de la mercancía en transporte internacional.
     */
    public List<UpdateInvoiceParamsCartaPorteGoodCustomsDoc> getCustomsDocs() {
        return customsDocs;
    }

    public UpdateInvoiceParamsCartaPorteGood setCustomsDocs(List<UpdateInvoiceParamsCartaPorteGoodCustomsDoc> customsDocs) {
        this.customsDocs = customsDocs;
        return this;
    }

    /**
     * Paquetería: guías de los paquetes o tarimas (GuiasIdentificacion).
     */
    public List<UpdateInvoiceParamsCartaPorteGoodGuide> getGuides() {
        return guides;
    }

    public UpdateInvoiceParamsCartaPorteGood setGuides(List<UpdateInvoiceParamsCartaPorteGoodGuide> guides) {
        this.guides = guides;
        return this;
    }

    /**
     * Cuánto va a cada destino (CantidadTransporta), por destino.
     */
    public List<UpdateInvoiceParamsCartaPorteGoodQuantity> getQuantities() {
        return quantities;
    }

    public UpdateInvoiceParamsCartaPorteGood setQuantities(List<UpdateInvoiceParamsCartaPorteGoodQuantity> quantities) {
        this.quantities = quantities;
        return this;
    }

    /**
     * Marítimo: detalle de la mercancía (DetalleMercancia): kilos netos, tara y piezas.
     */
    public UpdateInvoiceParamsCartaPorteGoodDetail getDetail() {
        return detail;
    }

    public UpdateInvoiceParamsCartaPorteGood setDetail(UpdateInvoiceParamsCartaPorteGoodDetail detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Ferroviario: clave STCC (ClaveSTCC).
     */
    public String getStcc() {
        return stcc;
    }

    public UpdateInvoiceParamsCartaPorteGood setStcc(String stcc) {
        this.stcc = stcc;
        return this;
    }
}
