// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * CustomerGroup: Un grupo de clientes: su lista de precios, descuento, días de crédito, pedido mínimo y si piden desde su Portal del cliente.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerGroup {
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
     * Color de su etiqueta en la app: info, warning, positive, critical o muted.
     */
    @JsonProperty("color")
    private String color;

    /**
     * Lista de precios (prl_…). En un cliente, la suya propia, que gana a la de su grupo; null para usar la de su grupo o la de todos.
     */
    @JsonProperty("price_list")
    private String priceList;

    /**
     * Porcentaje de descuento sobre el precio, de 0 a 100; en el CFDI va como Descuento de cada concepto.
     */
    @JsonProperty("discount_percent")
    private BigDecimal discountPercent;

    /**
     * Días de crédito que se le dan, de 0 a 365, o null para no cambiar los del cliente.
     */
    @JsonProperty("credit_days")
    private Long creditDays;

    /**
     * Pedido mínimo, sin IVA, para pedir desde el Portal del cliente, o null sin mínimo.
     */
    @JsonProperty("min_order")
    private BigDecimal minOrder;

    /**
     * true si sus clientes pueden hacer pedidos desde su Portal del cliente.
     */
    @JsonProperty("portal_ordering")
    private Boolean portalOrdering;

    /**
     * Hasta cuándo sus clientes cambian o cancelan desde su portal un pedido que mandaron ahí: none, until_confirmed (hasta que usted lo confirme) o until_delivered (hasta que se entregue o facture algo).
     * <p>
     * Valores: none, until_confirmed, until_delivered.
     */
    @JsonProperty("portal_changes")
    private String portalChanges;

    /**
     * Días de la semana en que les entrega (0 domingo a 6 sábado), o null si cualquier día. El Portal del cliente solo ofrece esos días.
     */
    @JsonProperty("delivery_days")
    private List<Long> deliveryDays;

    /**
     * Hora de corte (0 a 23, Ciudad de México): un pedido del portal después de ella cuenta desde el día siguiente; null sin hora de corte.
     */
    @JsonProperty("cutoff_hour")
    private Long cutoffHour;

    /**
     * Días para preparar un pedido antes de poder entregarlo.
     */
    @JsonProperty("prep_days")
    private Long prepDays;

    /**
     * Cuántos clientes hay en el grupo.
     */
    @JsonProperty("customers")
    private Long customers;

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

    public CustomerGroup setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public CustomerGroup setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public CustomerGroup setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public CustomerGroup setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public CustomerGroup setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Color de su etiqueta en la app: info, warning, positive, critical o muted.
     */
    public String getColor() {
        return color;
    }

    public CustomerGroup setColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * Lista de precios (prl_…). En un cliente, la suya propia, que gana a la de su grupo; null para usar la de su grupo o la de todos.
     */
    public String getPriceList() {
        return priceList;
    }

    public CustomerGroup setPriceList(String priceList) {
        this.priceList = priceList;
        return this;
    }

    /**
     * Porcentaje de descuento sobre el precio, de 0 a 100; en el CFDI va como Descuento de cada concepto.
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    public CustomerGroup setDiscountPercent(BigDecimal discountPercent) {
        this.discountPercent = discountPercent;
        return this;
    }

    @JsonIgnore
    public CustomerGroup setDiscountPercent(double discountPercent) {
        return setDiscountPercent(BigDecimal.valueOf(discountPercent));
    }

    /**
     * Días de crédito que se le dan, de 0 a 365, o null para no cambiar los del cliente.
     */
    public Long getCreditDays() {
        return creditDays;
    }

    public CustomerGroup setCreditDays(Long creditDays) {
        this.creditDays = creditDays;
        return this;
    }

    @JsonIgnore
    public CustomerGroup setCreditDays(long creditDays) {
        return setCreditDays(Long.valueOf(creditDays));
    }

    /**
     * Pedido mínimo, sin IVA, para pedir desde el Portal del cliente, o null sin mínimo.
     */
    public BigDecimal getMinOrder() {
        return minOrder;
    }

    public CustomerGroup setMinOrder(BigDecimal minOrder) {
        this.minOrder = minOrder;
        return this;
    }

    @JsonIgnore
    public CustomerGroup setMinOrder(double minOrder) {
        return setMinOrder(BigDecimal.valueOf(minOrder));
    }

    /**
     * true si sus clientes pueden hacer pedidos desde su Portal del cliente.
     */
    public Boolean getPortalOrdering() {
        return portalOrdering;
    }

    public CustomerGroup setPortalOrdering(Boolean portalOrdering) {
        this.portalOrdering = portalOrdering;
        return this;
    }

    /**
     * Hasta cuándo sus clientes cambian o cancelan desde su portal un pedido que mandaron ahí: none, until_confirmed (hasta que usted lo confirme) o until_delivered (hasta que se entregue o facture algo).
     * <p>
     * Valores: none, until_confirmed, until_delivered.
     */
    public String getPortalChanges() {
        return portalChanges;
    }

    public CustomerGroup setPortalChanges(String portalChanges) {
        this.portalChanges = portalChanges;
        return this;
    }

    /**
     * Días de la semana en que les entrega (0 domingo a 6 sábado), o null si cualquier día. El Portal del cliente solo ofrece esos días.
     */
    public List<Long> getDeliveryDays() {
        return deliveryDays;
    }

    public CustomerGroup setDeliveryDays(List<Long> deliveryDays) {
        this.deliveryDays = deliveryDays;
        return this;
    }

    /**
     * Hora de corte (0 a 23, Ciudad de México): un pedido del portal después de ella cuenta desde el día siguiente; null sin hora de corte.
     */
    public Long getCutoffHour() {
        return cutoffHour;
    }

    public CustomerGroup setCutoffHour(Long cutoffHour) {
        this.cutoffHour = cutoffHour;
        return this;
    }

    @JsonIgnore
    public CustomerGroup setCutoffHour(long cutoffHour) {
        return setCutoffHour(Long.valueOf(cutoffHour));
    }

    /**
     * Días para preparar un pedido antes de poder entregarlo.
     */
    public Long getPrepDays() {
        return prepDays;
    }

    public CustomerGroup setPrepDays(Long prepDays) {
        this.prepDays = prepDays;
        return this;
    }

    @JsonIgnore
    public CustomerGroup setPrepDays(long prepDays) {
        return setPrepDays(Long.valueOf(prepDays));
    }

    /**
     * Cuántos clientes hay en el grupo.
     */
    public Long getCustomers() {
        return customers;
    }

    public CustomerGroup setCustomers(Long customers) {
        this.customers = customers;
        return this;
    }

    @JsonIgnore
    public CustomerGroup setCustomers(long customers) {
        return setCustomers(Long.valueOf(customers));
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public CustomerGroup setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
