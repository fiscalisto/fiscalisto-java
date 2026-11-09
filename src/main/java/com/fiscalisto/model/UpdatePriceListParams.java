// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * UpdatePriceListParams: los campos de «Actualizar una lista de precios».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdatePriceListParams {
    /**
     * Mayoreo, Distribuidor, Buen Fin…
     */
    @JsonProperty("name")
    private String name;

    /**
     * Descripción.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Otra lista (prl_…) de la que parte; null o sin ella: el precio del catálogo.
     */
    @JsonProperty("base_list")
    private String baseList;

    /**
     * Cuánto mueve el precio del que parte: −10 lo baja 10 %, 5 lo sube 5 %.
     */
    @JsonProperty("adjust_percent")
    private BigDecimal adjustPercent;

    /**
     * Redondea a: 0.5, 1, 5, 10… (null: a centavos).
     */
    @JsonProperty("round_to")
    private BigDecimal roundTo;

    /**
     * Desde qué día vale (YYYY-MM-DD, Ciudad de México), o null desde siempre.
     */
    @JsonProperty("starts_on")
    private String startsOn;

    /**
     * Hasta qué día vale, ese día incluido (YYYY-MM-DD), o null sin fin.
     */
    @JsonProperty("ends_on")
    private String endsOn;

    /**
     * La tienen los clientes sin otra lista (ni ellos ni su grupo). Solo una lo es.
     */
    @JsonProperty("is_default")
    private Boolean isDefault;

    /**
     * Sus precios propios; al mandarlos reemplazan a los que tenía.
     */
    @JsonProperty("items")
    private List<UpdatePriceListParamsItem> items;

    /**
     * Mayoreo, Distribuidor, Buen Fin…
     */
    public String getName() {
        return name;
    }

    public UpdatePriceListParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Descripción.
     */
    public String getDescription() {
        return description;
    }

    public UpdatePriceListParams setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Otra lista (prl_…) de la que parte; null o sin ella: el precio del catálogo.
     */
    public String getBaseList() {
        return baseList;
    }

    public UpdatePriceListParams setBaseList(String baseList) {
        this.baseList = baseList;
        return this;
    }

    /**
     * Cuánto mueve el precio del que parte: −10 lo baja 10 %, 5 lo sube 5 %.
     */
    public BigDecimal getAdjustPercent() {
        return adjustPercent;
    }

    public UpdatePriceListParams setAdjustPercent(BigDecimal adjustPercent) {
        this.adjustPercent = adjustPercent;
        return this;
    }

    @JsonIgnore
    public UpdatePriceListParams setAdjustPercent(double adjustPercent) {
        return setAdjustPercent(BigDecimal.valueOf(adjustPercent));
    }

    /**
     * Redondea a: 0.5, 1, 5, 10… (null: a centavos).
     */
    public BigDecimal getRoundTo() {
        return roundTo;
    }

    public UpdatePriceListParams setRoundTo(BigDecimal roundTo) {
        this.roundTo = roundTo;
        return this;
    }

    @JsonIgnore
    public UpdatePriceListParams setRoundTo(double roundTo) {
        return setRoundTo(BigDecimal.valueOf(roundTo));
    }

    /**
     * Desde qué día vale (YYYY-MM-DD, Ciudad de México), o null desde siempre.
     */
    public String getStartsOn() {
        return startsOn;
    }

    public UpdatePriceListParams setStartsOn(String startsOn) {
        this.startsOn = startsOn;
        return this;
    }

    /**
     * Hasta qué día vale, ese día incluido (YYYY-MM-DD), o null sin fin.
     */
    public String getEndsOn() {
        return endsOn;
    }

    public UpdatePriceListParams setEndsOn(String endsOn) {
        this.endsOn = endsOn;
        return this;
    }

    /**
     * La tienen los clientes sin otra lista (ni ellos ni su grupo). Solo una lo es.
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public UpdatePriceListParams setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Sus precios propios; al mandarlos reemplazan a los que tenía.
     */
    public List<UpdatePriceListParamsItem> getItems() {
        return items;
    }

    public UpdatePriceListParams setItems(List<UpdatePriceListParamsItem> items) {
        this.items = items;
        return this;
    }
}
