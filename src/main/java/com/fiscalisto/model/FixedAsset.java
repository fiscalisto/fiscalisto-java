// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * FixedAsset: Un activo fijo del emisor en su contabilidad al cierre de un mes: su monto original, su depreciación en línea recta (tasas del artículo 34 de la LISR) y su valor en libros.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FixedAsset {
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
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Qué es: lo capturado, o el emisor del CFDI.
     */
    @JsonProperty("description")
    private String description;

    /**
     * cfdi (llegó con una factura recibida de uso I01 a I08) o manual (capturado sin factura).
     * <p>
     * Valores: cfdi, manual.
     */
    @JsonProperty("source")
    private String source;

    /**
     * Su tipo por uso CFDI (I01 a I08), que da su tasa.
     */
    @JsonProperty("cfdi_use")
    private String cfdiUse;

    /**
     * El nombre de su tipo, por ejemplo «Equipo de cómputo».
     */
    @JsonProperty("class")
    private String class_;

    /**
     * El UUID de su CFDI, o null si se capturó.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * Desde cuándo se usa: se deprecia desde el mes siguiente.
     */
    @JsonProperty("in_use_since")
    private String inUseSince;

    /**
     * Su monto original sin IVA.
     */
    @JsonProperty("cost")
    private BigDecimal cost;

    /**
     * Su tasa anual de depreciación contable (0.3 es 30%): la del artículo 34 de la LISR o la que fijó con POST /v1/accounting/book_depreciation_rates.
     */
    @JsonProperty("annual_rate")
    private BigDecimal annualRate;

    /**
     * Su valor residual como fracción del monto original; 0 por omisión.
     */
    @JsonProperty("residual_rate")
    private BigDecimal residualRate;

    /**
     * La tasa del artículo 34 de la LISR, la de su deducción fiscal.
     */
    @JsonProperty("tax_annual_rate")
    private BigDecimal taxAnnualRate;

    /**
     * Lo que se deprecia cada mes mientras dura.
     */
    @JsonProperty("monthly_depreciation")
    private BigDecimal monthlyDepreciation;

    /**
     * El mes (AAAA-MM) a cuyo cierre van las cifras.
     */
    @JsonProperty("month")
    private String month;

    /**
     * Lo que se depreció en ese mes.
     */
    @JsonProperty("month_depreciation")
    private BigDecimal monthDepreciation;

    /**
     * Lo depreciado hasta el cierre de ese mes.
     */
    @JsonProperty("accumulated_depreciation")
    private BigDecimal accumulatedDepreciation;

    /**
     * Su valor en libros: el monto original menos lo depreciado; 0 después de su baja.
     */
    @JsonProperty("book_value")
    private BigDecimal bookValue;

    /**
     * Su venta o baja (date, reason sale o write_off, note), o null si sigue en uso.
     */
    @JsonProperty("disposal")
    private FixedAssetDisposal disposal;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public FixedAsset setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public FixedAsset setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public FixedAsset setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public FixedAsset setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Qué es: lo capturado, o el emisor del CFDI.
     */
    public String getDescription() {
        return description;
    }

    public FixedAsset setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * cfdi (llegó con una factura recibida de uso I01 a I08) o manual (capturado sin factura).
     * <p>
     * Valores: cfdi, manual.
     */
    public String getSource() {
        return source;
    }

    public FixedAsset setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Su tipo por uso CFDI (I01 a I08), que da su tasa.
     */
    public String getCfdiUse() {
        return cfdiUse;
    }

    public FixedAsset setCfdiUse(String cfdiUse) {
        this.cfdiUse = cfdiUse;
        return this;
    }

    /**
     * El nombre de su tipo, por ejemplo «Equipo de cómputo».
     */
    public String getClassName() {
        return class_;
    }

    public FixedAsset setClassName(String class_) {
        this.class_ = class_;
        return this;
    }

    /**
     * El UUID de su CFDI, o null si se capturó.
     */
    public String getUuid() {
        return uuid;
    }

    public FixedAsset setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Desde cuándo se usa: se deprecia desde el mes siguiente.
     */
    public String getInUseSince() {
        return inUseSince;
    }

    public FixedAsset setInUseSince(String inUseSince) {
        this.inUseSince = inUseSince;
        return this;
    }

    /**
     * Su monto original sin IVA.
     */
    public BigDecimal getCost() {
        return cost;
    }

    public FixedAsset setCost(BigDecimal cost) {
        this.cost = cost;
        return this;
    }

    @JsonIgnore
    public FixedAsset setCost(double cost) {
        return setCost(BigDecimal.valueOf(cost));
    }

    /**
     * Su tasa anual de depreciación contable (0.3 es 30%): la del artículo 34 de la LISR o la que fijó con POST /v1/accounting/book_depreciation_rates.
     */
    public BigDecimal getAnnualRate() {
        return annualRate;
    }

    public FixedAsset setAnnualRate(BigDecimal annualRate) {
        this.annualRate = annualRate;
        return this;
    }

    @JsonIgnore
    public FixedAsset setAnnualRate(double annualRate) {
        return setAnnualRate(BigDecimal.valueOf(annualRate));
    }

    /**
     * Su valor residual como fracción del monto original; 0 por omisión.
     */
    public BigDecimal getResidualRate() {
        return residualRate;
    }

    public FixedAsset setResidualRate(BigDecimal residualRate) {
        this.residualRate = residualRate;
        return this;
    }

    @JsonIgnore
    public FixedAsset setResidualRate(double residualRate) {
        return setResidualRate(BigDecimal.valueOf(residualRate));
    }

    /**
     * La tasa del artículo 34 de la LISR, la de su deducción fiscal.
     */
    public BigDecimal getTaxAnnualRate() {
        return taxAnnualRate;
    }

    public FixedAsset setTaxAnnualRate(BigDecimal taxAnnualRate) {
        this.taxAnnualRate = taxAnnualRate;
        return this;
    }

    @JsonIgnore
    public FixedAsset setTaxAnnualRate(double taxAnnualRate) {
        return setTaxAnnualRate(BigDecimal.valueOf(taxAnnualRate));
    }

    /**
     * Lo que se deprecia cada mes mientras dura.
     */
    public BigDecimal getMonthlyDepreciation() {
        return monthlyDepreciation;
    }

    public FixedAsset setMonthlyDepreciation(BigDecimal monthlyDepreciation) {
        this.monthlyDepreciation = monthlyDepreciation;
        return this;
    }

    @JsonIgnore
    public FixedAsset setMonthlyDepreciation(double monthlyDepreciation) {
        return setMonthlyDepreciation(BigDecimal.valueOf(monthlyDepreciation));
    }

    /**
     * El mes (AAAA-MM) a cuyo cierre van las cifras.
     */
    public String getMonth() {
        return month;
    }

    public FixedAsset setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Lo que se depreció en ese mes.
     */
    public BigDecimal getMonthDepreciation() {
        return monthDepreciation;
    }

    public FixedAsset setMonthDepreciation(BigDecimal monthDepreciation) {
        this.monthDepreciation = monthDepreciation;
        return this;
    }

    @JsonIgnore
    public FixedAsset setMonthDepreciation(double monthDepreciation) {
        return setMonthDepreciation(BigDecimal.valueOf(monthDepreciation));
    }

    /**
     * Lo depreciado hasta el cierre de ese mes.
     */
    public BigDecimal getAccumulatedDepreciation() {
        return accumulatedDepreciation;
    }

    public FixedAsset setAccumulatedDepreciation(BigDecimal accumulatedDepreciation) {
        this.accumulatedDepreciation = accumulatedDepreciation;
        return this;
    }

    @JsonIgnore
    public FixedAsset setAccumulatedDepreciation(double accumulatedDepreciation) {
        return setAccumulatedDepreciation(BigDecimal.valueOf(accumulatedDepreciation));
    }

    /**
     * Su valor en libros: el monto original menos lo depreciado; 0 después de su baja.
     */
    public BigDecimal getBookValue() {
        return bookValue;
    }

    public FixedAsset setBookValue(BigDecimal bookValue) {
        this.bookValue = bookValue;
        return this;
    }

    @JsonIgnore
    public FixedAsset setBookValue(double bookValue) {
        return setBookValue(BigDecimal.valueOf(bookValue));
    }

    /**
     * Su venta o baja (date, reason sale o write_off, note), o null si sigue en uso.
     */
    public FixedAssetDisposal getDisposal() {
        return disposal;
    }

    public FixedAsset setDisposal(FixedAssetDisposal disposal) {
        this.disposal = disposal;
        return this;
    }
}
