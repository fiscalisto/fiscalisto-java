// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * UpdateCustomerGroupParams: los campos de «Actualizar un grupo de clientes».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateCustomerGroupParams {
    /**
     * Nombre.
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
     * Días que vale una cotización nueva para sus clientes; null: los de la empresa (Ajustes › Horarios). Un cliente con los suyos los usa antes.
     */
    @JsonProperty("quote_valid_days")
    private Long quoteValidDays;

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
     * Hasta cuándo sus clientes cambian o cancelan desde su portal un pedido que mandaron ahí: none, until_confirmed (hasta que usted lo confirme; por omisión) o until_delivered (hasta que se entregue o facture algo).
     * <p>
     * Valores: none, until_confirmed, until_delivered.
     */
    @JsonProperty("portal_changes")
    private String portalChanges;

    /**
     * Días de la semana en que les entrega (0 domingo a 6 sábado); null: cualquier día. El portal solo ofrece esos días.
     */
    @JsonProperty("delivery_days")
    private List<Long> deliveryDays;

    /**
     * Hora de corte (0 a 23, Ciudad de México): un pedido del portal después de ella cuenta desde el día siguiente; null: sin hora de corte.
     */
    @JsonProperty("cutoff_hour")
    private Long cutoffHour;

    /**
     * Días para preparar un pedido antes de poder entregarlo (0 por omisión).
     */
    @JsonProperty("prep_days")
    private Long prepDays;

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public UpdateCustomerGroupParams setName(String name) {
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

    public UpdateCustomerGroupParams setColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * Su lista (prl_…); null: la que aplica a todos.
     */
    public String getPriceList() {
        return priceList;
    }

    public UpdateCustomerGroupParams setPriceList(String priceList) {
        this.priceList = priceList;
        return this;
    }

    /**
     * Un descuento en cada concepto, como descuento del CFDI.
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    public UpdateCustomerGroupParams setDiscountPercent(BigDecimal discountPercent) {
        this.discountPercent = discountPercent;
        return this;
    }

    @JsonIgnore
    public UpdateCustomerGroupParams setDiscountPercent(double discountPercent) {
        return setDiscountPercent(BigDecimal.valueOf(discountPercent));
    }

    /**
     * Días de crédito que se le dan, de 0 a 365, o null para no cambiar los del cliente.
     */
    public Long getCreditDays() {
        return creditDays;
    }

    public UpdateCustomerGroupParams setCreditDays(Long creditDays) {
        this.creditDays = creditDays;
        return this;
    }

    @JsonIgnore
    public UpdateCustomerGroupParams setCreditDays(long creditDays) {
        return setCreditDays(Long.valueOf(creditDays));
    }

    /**
     * Días que vale una cotización nueva para sus clientes; null: los de la empresa (Ajustes › Horarios). Un cliente con los suyos los usa antes.
     */
    public Long getQuoteValidDays() {
        return quoteValidDays;
    }

    public UpdateCustomerGroupParams setQuoteValidDays(Long quoteValidDays) {
        this.quoteValidDays = quoteValidDays;
        return this;
    }

    @JsonIgnore
    public UpdateCustomerGroupParams setQuoteValidDays(long quoteValidDays) {
        return setQuoteValidDays(Long.valueOf(quoteValidDays));
    }

    /**
     * El pedido mínimo antes de IVA desde el Portal del cliente.
     */
    public BigDecimal getMinOrder() {
        return minOrder;
    }

    public UpdateCustomerGroupParams setMinOrder(BigDecimal minOrder) {
        this.minOrder = minOrder;
        return this;
    }

    @JsonIgnore
    public UpdateCustomerGroupParams setMinOrder(double minOrder) {
        return setMinOrder(BigDecimal.valueOf(minOrder));
    }

    /**
     * Sus clientes pueden hacer pedidos desde su Portal del cliente (true por omisión).
     */
    public Boolean getPortalOrdering() {
        return portalOrdering;
    }

    public UpdateCustomerGroupParams setPortalOrdering(Boolean portalOrdering) {
        this.portalOrdering = portalOrdering;
        return this;
    }

    /**
     * Hasta cuándo sus clientes cambian o cancelan desde su portal un pedido que mandaron ahí: none, until_confirmed (hasta que usted lo confirme; por omisión) o until_delivered (hasta que se entregue o facture algo).
     * <p>
     * Valores: none, until_confirmed, until_delivered.
     */
    public String getPortalChanges() {
        return portalChanges;
    }

    public UpdateCustomerGroupParams setPortalChanges(String portalChanges) {
        this.portalChanges = portalChanges;
        return this;
    }

    /**
     * Días de la semana en que les entrega (0 domingo a 6 sábado); null: cualquier día. El portal solo ofrece esos días.
     */
    public List<Long> getDeliveryDays() {
        return deliveryDays;
    }

    public UpdateCustomerGroupParams setDeliveryDays(List<Long> deliveryDays) {
        this.deliveryDays = deliveryDays;
        return this;
    }

    /**
     * Hora de corte (0 a 23, Ciudad de México): un pedido del portal después de ella cuenta desde el día siguiente; null: sin hora de corte.
     */
    public Long getCutoffHour() {
        return cutoffHour;
    }

    public UpdateCustomerGroupParams setCutoffHour(Long cutoffHour) {
        this.cutoffHour = cutoffHour;
        return this;
    }

    @JsonIgnore
    public UpdateCustomerGroupParams setCutoffHour(long cutoffHour) {
        return setCutoffHour(Long.valueOf(cutoffHour));
    }

    /**
     * Días para preparar un pedido antes de poder entregarlo (0 por omisión).
     */
    public Long getPrepDays() {
        return prepDays;
    }

    public UpdateCustomerGroupParams setPrepDays(Long prepDays) {
        this.prepDays = prepDays;
        return this;
    }

    @JsonIgnore
    public UpdateCustomerGroupParams setPrepDays(long prepDays) {
        return setPrepDays(Long.valueOf(prepDays));
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public UpdateCustomerGroupParams setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
