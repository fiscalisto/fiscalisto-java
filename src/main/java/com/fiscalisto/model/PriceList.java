// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * PriceList: Una lista de precios: parte del precio del catálogo (o de otra lista), lo mueve un porcentaje y lo redondea, con precios propios por producto, presentación y desde cierta cantidad (escalones de mayoreo). items solo viene al ver una lista.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceList {
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
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Descripción.
     */
    @JsonProperty("description")
    private String description;

    /**
     * La lista (prl_…) de la que parte; null parte del precio del catálogo de cada producto.
     */
    @JsonProperty("base_list")
    private String baseList;

    /**
     * Cuánto sube (positivo) o baja (negativo) el precio del que parte, en porcentaje.
     */
    @JsonProperty("adjust_percent")
    private BigDecimal adjustPercent;

    /**
     * A cuánto redondea los precios que calcula (0.5, 1, 10…), o null sin redondear.
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
     * true si es la lista de todos los clientes que no tienen otra (solo puede haber una).
     */
    @JsonProperty("is_default")
    private Boolean isDefault;

    /**
     * false la pausa; true la reanuda desde hoy.
     */
    @JsonProperty("active")
    private Boolean active;

    /**
     * Cuántos grupos de clientes la usan.
     */
    @JsonProperty("groups")
    private Long groups;

    /**
     * Cuántos clientes la tienen como suya.
     */
    @JsonProperty("customers")
    private Long customers;

    /**
     * Conceptos (Conceptos), al menos uno.
     */
    @JsonProperty("items")
    private List<PriceListItem> items;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Cuándo cambió por última vez, ISO 8601 (-06:00).
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public PriceList setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public PriceList setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PriceList setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public PriceList setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public PriceList setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Descripción.
     */
    public String getDescription() {
        return description;
    }

    public PriceList setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * La lista (prl_…) de la que parte; null parte del precio del catálogo de cada producto.
     */
    public String getBaseList() {
        return baseList;
    }

    public PriceList setBaseList(String baseList) {
        this.baseList = baseList;
        return this;
    }

    /**
     * Cuánto sube (positivo) o baja (negativo) el precio del que parte, en porcentaje.
     */
    public BigDecimal getAdjustPercent() {
        return adjustPercent;
    }

    public PriceList setAdjustPercent(BigDecimal adjustPercent) {
        this.adjustPercent = adjustPercent;
        return this;
    }

    @JsonIgnore
    public PriceList setAdjustPercent(double adjustPercent) {
        return setAdjustPercent(BigDecimal.valueOf(adjustPercent));
    }

    /**
     * A cuánto redondea los precios que calcula (0.5, 1, 10…), o null sin redondear.
     */
    public BigDecimal getRoundTo() {
        return roundTo;
    }

    public PriceList setRoundTo(BigDecimal roundTo) {
        this.roundTo = roundTo;
        return this;
    }

    @JsonIgnore
    public PriceList setRoundTo(double roundTo) {
        return setRoundTo(BigDecimal.valueOf(roundTo));
    }

    /**
     * Desde qué día vale (YYYY-MM-DD, Ciudad de México), o null desde siempre.
     */
    public String getStartsOn() {
        return startsOn;
    }

    public PriceList setStartsOn(String startsOn) {
        this.startsOn = startsOn;
        return this;
    }

    /**
     * Hasta qué día vale, ese día incluido (YYYY-MM-DD), o null sin fin.
     */
    public String getEndsOn() {
        return endsOn;
    }

    public PriceList setEndsOn(String endsOn) {
        this.endsOn = endsOn;
        return this;
    }

    /**
     * true si es la lista de todos los clientes que no tienen otra (solo puede haber una).
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public PriceList setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * false la pausa; true la reanuda desde hoy.
     */
    public Boolean getActive() {
        return active;
    }

    public PriceList setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Cuántos grupos de clientes la usan.
     */
    public Long getGroups() {
        return groups;
    }

    public PriceList setGroups(Long groups) {
        this.groups = groups;
        return this;
    }

    @JsonIgnore
    public PriceList setGroups(long groups) {
        return setGroups(Long.valueOf(groups));
    }

    /**
     * Cuántos clientes la tienen como suya.
     */
    public Long getCustomers() {
        return customers;
    }

    public PriceList setCustomers(Long customers) {
        this.customers = customers;
        return this;
    }

    @JsonIgnore
    public PriceList setCustomers(long customers) {
        return setCustomers(Long.valueOf(customers));
    }

    /**
     * Conceptos (Conceptos), al menos uno.
     */
    public List<PriceListItem> getItems() {
        return items;
    }

    public PriceList setItems(List<PriceListItem> items) {
        this.items = items;
        return this;
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public PriceList setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo cambió por última vez, ISO 8601 (-06:00).
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public PriceList setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
