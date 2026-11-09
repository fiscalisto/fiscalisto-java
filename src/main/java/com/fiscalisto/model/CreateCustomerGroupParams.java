// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateCustomerGroupParams: los campos de «Crear un grupo de clientes».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateCustomerGroupParams {
    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Nombre.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Color de su etiqueta en la app: info, warning, positive, critical o muted.
     * <p>
     * Valores: info, warning, positive, critical, muted.
     */
    @JsonProperty("color")
    private String color;

    /**
     * Su lista (prl_…); null: la que aplica a todos.
     */
    @JsonProperty("price_list")
    private String priceList;

    /**
     * Un descuento en cada concepto, como descuento del CFDI.
     */
    @JsonProperty("discount_percent")
    private BigDecimal discountPercent;

    /**
     * Días de crédito que se le dan, de 0 a 365, o null para no cambiar los del cliente.
     */
    @JsonProperty("credit_days")
    private Long creditDays;

    /**
     * El pedido mínimo antes de IVA desde el Portal del cliente.
     */
    @JsonProperty("min_order")
    private BigDecimal minOrder;

    /**
     * Sus clientes pueden hacer pedidos desde su Portal del cliente (true por omisión).
     */
    @JsonProperty("portal_ordering")
    private Boolean portalOrdering;

    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateCustomerGroupParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Nombre.
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public CreateCustomerGroupParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Color de su etiqueta en la app: info, warning, positive, critical o muted.
     * <p>
     * Valores: info, warning, positive, critical, muted.
     */
    public String getColor() {
        return color;
    }

    public CreateCustomerGroupParams setColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * Su lista (prl_…); null: la que aplica a todos.
     */
    public String getPriceList() {
        return priceList;
    }

    public CreateCustomerGroupParams setPriceList(String priceList) {
        this.priceList = priceList;
        return this;
    }

    /**
     * Un descuento en cada concepto, como descuento del CFDI.
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    public CreateCustomerGroupParams setDiscountPercent(BigDecimal discountPercent) {
        this.discountPercent = discountPercent;
        return this;
    }

    @JsonIgnore
    public CreateCustomerGroupParams setDiscountPercent(double discountPercent) {
        return setDiscountPercent(BigDecimal.valueOf(discountPercent));
    }

    /**
     * Días de crédito que se le dan, de 0 a 365, o null para no cambiar los del cliente.
     */
    public Long getCreditDays() {
        return creditDays;
    }

    public CreateCustomerGroupParams setCreditDays(Long creditDays) {
        this.creditDays = creditDays;
        return this;
    }

    @JsonIgnore
    public CreateCustomerGroupParams setCreditDays(long creditDays) {
        return setCreditDays(Long.valueOf(creditDays));
    }

    /**
     * El pedido mínimo antes de IVA desde el Portal del cliente.
     */
    public BigDecimal getMinOrder() {
        return minOrder;
    }

    public CreateCustomerGroupParams setMinOrder(BigDecimal minOrder) {
        this.minOrder = minOrder;
        return this;
    }

    @JsonIgnore
    public CreateCustomerGroupParams setMinOrder(double minOrder) {
        return setMinOrder(BigDecimal.valueOf(minOrder));
    }

    /**
     * Sus clientes pueden hacer pedidos desde su Portal del cliente (true por omisión).
     */
    public Boolean getPortalOrdering() {
        return portalOrdering;
    }

    public CreateCustomerGroupParams setPortalOrdering(Boolean portalOrdering) {
        this.portalOrdering = portalOrdering;
        return this;
    }
}
