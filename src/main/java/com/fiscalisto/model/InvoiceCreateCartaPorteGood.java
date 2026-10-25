// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * InvoiceCreateCartaPorteGood: InvoiceCreateCartaPorteGood.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateCartaPorteGood {
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
    private InvoiceCreateCartaPorteGoodHazmat hazmat;

    /**
     * Datos COFEPRIS de la mercancía: sector y lo que pide cada uno (medicamentos, precursores, psicotrópicos, sustancias tóxicas, plaguicidas).
     */
    @JsonProperty("cofepris")
    private InvoiceCreateCartaPorteGoodCofepris cofepris;

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
    private InvoiceCreateCartaPorteGoodMaterial material;

    /**
     * Documentación aduanera (DocumentacionAduanera) de la mercancía en transporte internacional.
     */
    @JsonProperty("customs_docs")
    private List<InvoiceCreateCartaPorteGoodCustomsDoc> customsDocs;

    /**
     * Paquetería: guías de los paquetes o tarimas (GuiasIdentificacion).
     */
    @JsonProperty("guides")
    private List<InvoiceCreateCartaPorteGoodGuide> guides;

    /**
     * Cuánto va a cada destino (CantidadTransporta), por destino.
     */
    @JsonProperty("quantities")
    private List<InvoiceCreateCartaPorteGoodQuantity> quantities;

    /**
     * Marítimo: detalle de la mercancía (DetalleMercancia): kilos netos, tara y piezas.
     */
    @JsonProperty("detail")
    private InvoiceCreateCartaPorteGoodDetail detail;

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

    public InvoiceCreateCartaPorteGood setProductKey(String productKey) {
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

    public InvoiceCreateCartaPorteGood setDescription(String description) {
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

    public InvoiceCreateCartaPorteGood setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    public InvoiceCreateCartaPorteGood setQuantity(double quantity) {
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

    public InvoiceCreateCartaPorteGood setUnitKey(String unitKey) {
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

    public InvoiceCreateCartaPorteGood setWeightKg(BigDecimal weightKg) {
        this.weightKg = weightKg;
        return this;
    }

    public InvoiceCreateCartaPorteGood setWeightKg(double weightKg) {
        return setWeightKg(BigDecimal.valueOf(weightKg));
    }

    /**
     * Dimensiones (Dimensiones), como 30/40/30cm o en plg.
     */
    public String getDimensions() {
        return dimensions;
    }

    public InvoiceCreateCartaPorteGood setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    /**
     * Material peligroso (MaterialPeligroso Sí): clave UN y embalaje.
     */
    public InvoiceCreateCartaPorteGoodHazmat getHazmat() {
        return hazmat;
    }

    public InvoiceCreateCartaPorteGood setHazmat(InvoiceCreateCartaPorteGoodHazmat hazmat) {
        this.hazmat = hazmat;
        return this;
    }

    /**
     * Datos COFEPRIS de la mercancía: sector y lo que pide cada uno (medicamentos, precursores, psicotrópicos, sustancias tóxicas, plaguicidas).
     */
    public InvoiceCreateCartaPorteGoodCofepris getCofepris() {
        return cofepris;
    }

    public InvoiceCreateCartaPorteGood setCofepris(InvoiceCreateCartaPorteGoodCofepris cofepris) {
        this.cofepris = cofepris;
        return this;
    }

    /**
     * Valor de la mercancía (ValorMercancia); obligatorio en transporte aéreo.
     */
    public BigDecimal getValue() {
        return value;
    }

    public InvoiceCreateCartaPorteGood setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    public InvoiceCreateCartaPorteGood setValue(double value) {
        return setValue(BigDecimal.valueOf(value));
    }

    /**
     * Moneda del valor de la mercancía (Moneda), c_Moneda.
     */
    public String getCurrency() {
        return currency;
    }

    public InvoiceCreateCartaPorteGood setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Fracción arancelaria (FraccionArancelaria), 10 dígitos. Transporte internacional.
     */
    public String getTariff() {
        return tariff;
    }

    public InvoiceCreateCartaPorteGood setTariff(String tariff) {
        this.tariff = tariff;
        return this;
    }

    /**
     * UUID del CFDI con complemento de comercio exterior (UUIDComercioExt).
     */
    public String getCceUuid() {
        return cceUuid;
    }

    public InvoiceCreateCartaPorteGood setCceUuid(String cceUuid) {
        this.cceUuid = cceUuid;
        return this;
    }

    /**
     * Tipo de materia (TipoMateria, c_TipoMateria) y su descripción si es «otra».
     */
    public InvoiceCreateCartaPorteGoodMaterial getMaterial() {
        return material;
    }

    public InvoiceCreateCartaPorteGood setMaterial(InvoiceCreateCartaPorteGoodMaterial material) {
        this.material = material;
        return this;
    }

    /**
     * Documentación aduanera (DocumentacionAduanera) de la mercancía en transporte internacional.
     */
    public List<InvoiceCreateCartaPorteGoodCustomsDoc> getCustomsDocs() {
        return customsDocs;
    }

    public InvoiceCreateCartaPorteGood setCustomsDocs(List<InvoiceCreateCartaPorteGoodCustomsDoc> customsDocs) {
        this.customsDocs = customsDocs;
        return this;
    }

    /**
     * Paquetería: guías de los paquetes o tarimas (GuiasIdentificacion).
     */
    public List<InvoiceCreateCartaPorteGoodGuide> getGuides() {
        return guides;
    }

    public InvoiceCreateCartaPorteGood setGuides(List<InvoiceCreateCartaPorteGoodGuide> guides) {
        this.guides = guides;
        return this;
    }

    /**
     * Cuánto va a cada destino (CantidadTransporta), por destino.
     */
    public List<InvoiceCreateCartaPorteGoodQuantity> getQuantities() {
        return quantities;
    }

    public InvoiceCreateCartaPorteGood setQuantities(List<InvoiceCreateCartaPorteGoodQuantity> quantities) {
        this.quantities = quantities;
        return this;
    }

    /**
     * Marítimo: detalle de la mercancía (DetalleMercancia): kilos netos, tara y piezas.
     */
    public InvoiceCreateCartaPorteGoodDetail getDetail() {
        return detail;
    }

    public InvoiceCreateCartaPorteGood setDetail(InvoiceCreateCartaPorteGoodDetail detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Ferroviario: clave STCC (ClaveSTCC).
     */
    public String getStcc() {
        return stcc;
    }

    public InvoiceCreateCartaPorteGood setStcc(String stcc) {
        this.stcc = stcc;
        return this;
    }
}
