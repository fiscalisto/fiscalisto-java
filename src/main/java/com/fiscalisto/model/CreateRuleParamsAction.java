// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreateRuleParamsAction: CreateRuleParamsAction.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRuleParamsAction {
    /**
     * tag (facturas y órdenes): poner la etiqueta `tag`; category (facturas recibidas): poner la categoría de gasto `category`, nunca sobre la que eligió una persona; cost_center (facturas): poner `cost_center` (ccn_…), nunca sobre lo que puso una persona; stage (órdenes): pasar a la etapa `stage`; close (órdenes): cerrarla si ya llegó todo; ask_approval (órdenes en borrador): pedir aprobación por sus pasos de aprobación; notify: avisar a `members` (mem_…); lote (invoice.received e invoice.approved): agregar la factura al lote de pagos abierto `lote_name` que paga `pay_on`, o crear uno, preparado como quien hizo la regla.
     * <p>
     * Valores: tag, cost_center, stage, close, ask_approval, notify, category, lote.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * tag: la etiqueta (tag_…, GET /v1/tags). Un número, el id de antes, también se acepta.
     */
    @JsonProperty("tag")
    private Object tag;

    /**
     * category: la categoría de gasto, como la app la nombra («Combustible»).
     * <p>
     * Valores: Renta y arrendamiento, Servicios profesionales, Nómina y personal, Transporte y fletes, Combustible, Viáticos y viajes, Alimentos y representación, Telecomunicaciones e internet, Energía y agua, Software y suscripciones, Equipo de cómputo, Papelería y oficina, Mantenimiento y reparaciones, Publicidad y marketing, Seguros y fianzas, Comisiones bancarias y financieras, Impuestos y derechos, Compras de mercancía e inventario, Materias primas y producción, Activo fijo y mobiliario, Vehículos, Capacitación, Donativos, Otros gastos.
     */
    @JsonProperty("category")
    private String category;

    /**
     * tag: quitarla si la orden deja de cumplir.
     */
    @JsonProperty("remove_when_unmet")
    private Boolean removeWhenUnmet;

    /**
     * lote: el nombre del lote («Fletes»); vacío o null: «Lote del jueves 27 nov».
     */
    @JsonProperty("lote_name")
    private String loteName;

    /**
     * lote: el día que paga: el siguiente lunes … viernes (hoy incluido), a los `days` días, o `due`, la fecha de pago del contrarecibo del portal. Un día inhábil pasa al siguiente hábil. Por omisión, friday.
     * <p>
     * Valores: monday, tuesday, wednesday, thursday, friday, in_days, due.
     */
    @JsonProperty("pay_on")
    private String payOn;

    /**
     * lote con pay_on in_days: cuántos días después.
     */
    @JsonProperty("days")
    private Long days;

    /**
     * Su centro de costo (ccn_…): la obra, proyecto, sucursal o área a la que pertenece, para ver ingresos y gastos por centro en Reportes. No cambia el CFDI. Sus notas de crédito lo toman solas.
     */
    @JsonProperty("cost_center")
    private String costCenter;

    /**
     * stage: la etapa.
     */
    @JsonProperty("stage")
    private Long stage;

    /**
     * notify: a quién (mem_…, GET /v1/members).
     */
    @JsonProperty("members")
    private List<String> members;

    /**
     * notify: lo que dice el aviso.
     */
    @JsonProperty("note")
    private String note;

    /**
     * tag (facturas y órdenes): poner la etiqueta `tag`; category (facturas recibidas): poner la categoría de gasto `category`, nunca sobre la que eligió una persona; cost_center (facturas): poner `cost_center` (ccn_…), nunca sobre lo que puso una persona; stage (órdenes): pasar a la etapa `stage`; close (órdenes): cerrarla si ya llegó todo; ask_approval (órdenes en borrador): pedir aprobación por sus pasos de aprobación; notify: avisar a `members` (mem_…); lote (invoice.received e invoice.approved): agregar la factura al lote de pagos abierto `lote_name` que paga `pay_on`, o crear uno, preparado como quien hizo la regla.
     * <p>
     * Valores: tag, cost_center, stage, close, ask_approval, notify, category, lote.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public CreateRuleParamsAction setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * tag: la etiqueta (tag_…, GET /v1/tags). Un número, el id de antes, también se acepta.
     */
    public Object getTag() {
        return tag;
    }

    public CreateRuleParamsAction setTag(Object tag) {
        this.tag = tag;
        return this;
    }

    /**
     * category: la categoría de gasto, como la app la nombra («Combustible»).
     * <p>
     * Valores: Renta y arrendamiento, Servicios profesionales, Nómina y personal, Transporte y fletes, Combustible, Viáticos y viajes, Alimentos y representación, Telecomunicaciones e internet, Energía y agua, Software y suscripciones, Equipo de cómputo, Papelería y oficina, Mantenimiento y reparaciones, Publicidad y marketing, Seguros y fianzas, Comisiones bancarias y financieras, Impuestos y derechos, Compras de mercancía e inventario, Materias primas y producción, Activo fijo y mobiliario, Vehículos, Capacitación, Donativos, Otros gastos.
     */
    public String getCategory() {
        return category;
    }

    public CreateRuleParamsAction setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * tag: quitarla si la orden deja de cumplir.
     */
    public Boolean getRemoveWhenUnmet() {
        return removeWhenUnmet;
    }

    public CreateRuleParamsAction setRemoveWhenUnmet(Boolean removeWhenUnmet) {
        this.removeWhenUnmet = removeWhenUnmet;
        return this;
    }

    /**
     * lote: el nombre del lote («Fletes»); vacío o null: «Lote del jueves 27 nov».
     */
    public String getLoteName() {
        return loteName;
    }

    public CreateRuleParamsAction setLoteName(String loteName) {
        this.loteName = loteName;
        return this;
    }

    /**
     * lote: el día que paga: el siguiente lunes … viernes (hoy incluido), a los `days` días, o `due`, la fecha de pago del contrarecibo del portal. Un día inhábil pasa al siguiente hábil. Por omisión, friday.
     * <p>
     * Valores: monday, tuesday, wednesday, thursday, friday, in_days, due.
     */
    public String getPayOn() {
        return payOn;
    }

    public CreateRuleParamsAction setPayOn(String payOn) {
        this.payOn = payOn;
        return this;
    }

    /**
     * lote con pay_on in_days: cuántos días después.
     */
    public Long getDays() {
        return days;
    }

    public CreateRuleParamsAction setDays(Long days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public CreateRuleParamsAction setDays(long days) {
        return setDays(Long.valueOf(days));
    }

    /**
     * Su centro de costo (ccn_…): la obra, proyecto, sucursal o área a la que pertenece, para ver ingresos y gastos por centro en Reportes. No cambia el CFDI. Sus notas de crédito lo toman solas.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public CreateRuleParamsAction setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * stage: la etapa.
     */
    public Long getStage() {
        return stage;
    }

    public CreateRuleParamsAction setStage(Long stage) {
        this.stage = stage;
        return this;
    }

    @JsonIgnore
    public CreateRuleParamsAction setStage(long stage) {
        return setStage(Long.valueOf(stage));
    }

    /**
     * notify: a quién (mem_…, GET /v1/members).
     */
    public List<String> getMembers() {
        return members;
    }

    public CreateRuleParamsAction setMembers(List<String> members) {
        this.members = members;
        return this;
    }

    /**
     * notify: lo que dice el aviso.
     */
    public String getNote() {
        return note;
    }

    public CreateRuleParamsAction setNote(String note) {
        this.note = note;
        return this;
    }
}
