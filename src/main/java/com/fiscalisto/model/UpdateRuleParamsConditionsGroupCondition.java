// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * UpdateRuleParamsConditionsGroupCondition: UpdateRuleParamsConditionsGroupCondition.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateRuleParamsConditionsGroupCondition {
    /**
     * Qué se revisa. Facturas: supplier, customer, supplierGroup (recibidas: el grupo del proveedor, sgr_…), customerGroup (emitidas: el grupo del cliente, cgr_…), partyName, ownRfc, direction (received/issued, en invoice.paid e invoice.canceled), category (categoría de gasto), tags (tag_…), total, subtotal, iva, saldo, saldoPct (el saldo en % del total), orderDiff (recibidas: cuánto pasa de sus órdenes, en %), orderTotal (recibidas: el total de sus órdenes, en pesos), lastTotal (el total de la factura anterior de ese proveedor o cliente), avgTotal (el promedio de sus facturas en los últimos 6 meses), age (días desde su fecha), weekday (el día de su fecha: lun, mar, mie, jue, vie, sab, dom), newParty (la primera factura de ese proveedor o cliente), monthTotal (lo facturado ese mes por ese proveedor o cliente, en pesos), dayCount (sus facturas ese día), opinion (recibidas: la opinión 32-D del proveedor en el portal: positive, negative, expired o none), satList (está en una lista del SAT: 69-B o 69), hasOrder (recibidas: ligada a una orden de compra), payoutAmount, newAccount y accountCheck (en payout.*: lo que se le paga al proveedor en el pago, si es el primer pago a esa cuenta y cómo se verificó: bank, hand o none), tipo, metodo, forma, uso, moneda, serie, concept, clave, costCenter, ivaRetenido, isrRetenido, hasFindings. Órdenes de compra: supplier, supplierGroup (sgr_…), ownRfc, total, category, warehouse, stage, createdBy, moneda, note, project (el id del proyecto), paymentDays, deliveryDays (días para la entrega), advance (lleva anticipo), newSupplier (la primera orden a ese proveedor), monthTotal (lo ordenado ese mes a ese proveedor, en pesos), lastTotal (el total de la orden anterior a ese proveedor), avgTotal (el promedio de sus órdenes en los últimos 6 meses). Movimientos del banco: flow (out: retiro; in: depósito), description (el texto del banco), reference, amount, bankAccount (los últimos 4 dígitos de la cuenta), ownRfc, classification (de un depósito: prestamo, traspaso, devolucion o intereses), monthDay (el día del mes), weekday. Avisos del SAT (sat.*): party (supplier/customer/own), supplier, customer, supplierGroup, customerGroup, ownRfc, list (69b, 69b_bis, 69_no_localizados, 69_exigibles, 69_firmes, 69_sentencias, 69_cancelados, 69_csd_sin_efectos), situation (presunto, definitivo, desvirtuado, sentencia_favorable, listado), billed12m (lo facturado con ese RFC en 12 meses, en pesos), balance (su saldo pendiente) en sat.listed; sentido y previous (positivo, negativo, sin_obligaciones, suspendido; previous también ninguno) y pending (obligaciones pendientes) en sat.opinion; kind (comunicado, notificacion, sin_medios), urgency (urgente, atender, informativo) y text (el asunto) en sat.buzon; certificate (csd, efirma) y daysLeft (días para vencer; negativo si ya venció) en sat.certificate.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("field")
    private String field;

    /**
     * Listas: is (alguno de values), not (ninguno), set, unset. Montos (MXN): gte, lte, between (value y to; o contra otro campo con compare_to). Texto: contains, not_contains, starts (text; sin importar acentos ni mayúsculas), set, unset. Sí/no: yes, no.
     * <p>
     * Valores: is, not, gte, lte, between, contains, not_contains, starts, yes, no, set, unset.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("operator")
    private String operator;

    /**
     * Para is / not: RFC, claves del SAT, ccn_…, whs_… o mem_….
     */
    @JsonProperty("values")
    private List<String> values;

    /**
     * Valor de la mercancía (ValorMercancia); obligatorio en transporte aéreo.
     */
    @JsonProperty("value")
    private BigDecimal value;

    /**
     * Para between: el monto hasta.
     */
    @JsonProperty("to")
    private BigDecimal to;

    /**
     * Texto de la leyenda (textoLeyenda).
     */
    @JsonProperty("text")
    private String text;

    /**
     * Para gte, lte y between: compara con otro campo numérico del mismo registro en vez de un monto fijo (montos con montos); value y to son entonces el % de ese campo (100: igual). Por ejemplo total gte 110 compare_to orderTotal: el total pasa del 110% de sus órdenes.
     */
    @JsonProperty("compare_to")
    private String compareTo;

    /**
     * Qué se revisa. Facturas: supplier, customer, supplierGroup (recibidas: el grupo del proveedor, sgr_…), customerGroup (emitidas: el grupo del cliente, cgr_…), partyName, ownRfc, direction (received/issued, en invoice.paid e invoice.canceled), category (categoría de gasto), tags (tag_…), total, subtotal, iva, saldo, saldoPct (el saldo en % del total), orderDiff (recibidas: cuánto pasa de sus órdenes, en %), orderTotal (recibidas: el total de sus órdenes, en pesos), lastTotal (el total de la factura anterior de ese proveedor o cliente), avgTotal (el promedio de sus facturas en los últimos 6 meses), age (días desde su fecha), weekday (el día de su fecha: lun, mar, mie, jue, vie, sab, dom), newParty (la primera factura de ese proveedor o cliente), monthTotal (lo facturado ese mes por ese proveedor o cliente, en pesos), dayCount (sus facturas ese día), opinion (recibidas: la opinión 32-D del proveedor en el portal: positive, negative, expired o none), satList (está en una lista del SAT: 69-B o 69), hasOrder (recibidas: ligada a una orden de compra), payoutAmount, newAccount y accountCheck (en payout.*: lo que se le paga al proveedor en el pago, si es el primer pago a esa cuenta y cómo se verificó: bank, hand o none), tipo, metodo, forma, uso, moneda, serie, concept, clave, costCenter, ivaRetenido, isrRetenido, hasFindings. Órdenes de compra: supplier, supplierGroup (sgr_…), ownRfc, total, category, warehouse, stage, createdBy, moneda, note, project (el id del proyecto), paymentDays, deliveryDays (días para la entrega), advance (lleva anticipo), newSupplier (la primera orden a ese proveedor), monthTotal (lo ordenado ese mes a ese proveedor, en pesos), lastTotal (el total de la orden anterior a ese proveedor), avgTotal (el promedio de sus órdenes en los últimos 6 meses). Movimientos del banco: flow (out: retiro; in: depósito), description (el texto del banco), reference, amount, bankAccount (los últimos 4 dígitos de la cuenta), ownRfc, classification (de un depósito: prestamo, traspaso, devolucion o intereses), monthDay (el día del mes), weekday. Avisos del SAT (sat.*): party (supplier/customer/own), supplier, customer, supplierGroup, customerGroup, ownRfc, list (69b, 69b_bis, 69_no_localizados, 69_exigibles, 69_firmes, 69_sentencias, 69_cancelados, 69_csd_sin_efectos), situation (presunto, definitivo, desvirtuado, sentencia_favorable, listado), billed12m (lo facturado con ese RFC en 12 meses, en pesos), balance (su saldo pendiente) en sat.listed; sentido y previous (positivo, negativo, sin_obligaciones, suspendido; previous también ninguno) y pending (obligaciones pendientes) en sat.opinion; kind (comunicado, notificacion, sin_medios), urgency (urgente, atender, informativo) y text (el asunto) en sat.buzon; certificate (csd, efirma) y daysLeft (días para vencer; negativo si ya venció) en sat.certificate.
     * <p>
     * Obligatorio.
     */
    public String getField() {
        return field;
    }

    public UpdateRuleParamsConditionsGroupCondition setField(String field) {
        this.field = field;
        return this;
    }

    /**
     * Listas: is (alguno de values), not (ninguno), set, unset. Montos (MXN): gte, lte, between (value y to; o contra otro campo con compare_to). Texto: contains, not_contains, starts (text; sin importar acentos ni mayúsculas), set, unset. Sí/no: yes, no.
     * <p>
     * Valores: is, not, gte, lte, between, contains, not_contains, starts, yes, no, set, unset.
     * <p>
     * Obligatorio.
     */
    public String getOperator() {
        return operator;
    }

    public UpdateRuleParamsConditionsGroupCondition setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Para is / not: RFC, claves del SAT, ccn_…, whs_… o mem_….
     */
    public List<String> getValues() {
        return values;
    }

    public UpdateRuleParamsConditionsGroupCondition setValues(List<String> values) {
        this.values = values;
        return this;
    }

    /**
     * Valor de la mercancía (ValorMercancia); obligatorio en transporte aéreo.
     */
    public BigDecimal getValue() {
        return value;
    }

    public UpdateRuleParamsConditionsGroupCondition setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    @JsonIgnore
    public UpdateRuleParamsConditionsGroupCondition setValue(double value) {
        return setValue(BigDecimal.valueOf(value));
    }

    /**
     * Para between: el monto hasta.
     */
    public BigDecimal getTo() {
        return to;
    }

    public UpdateRuleParamsConditionsGroupCondition setTo(BigDecimal to) {
        this.to = to;
        return this;
    }

    @JsonIgnore
    public UpdateRuleParamsConditionsGroupCondition setTo(double to) {
        return setTo(BigDecimal.valueOf(to));
    }

    /**
     * Texto de la leyenda (textoLeyenda).
     */
    public String getText() {
        return text;
    }

    public UpdateRuleParamsConditionsGroupCondition setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Para gte, lte y between: compara con otro campo numérico del mismo registro en vez de un monto fijo (montos con montos); value y to son entonces el % de ese campo (100: igual). Por ejemplo total gte 110 compare_to orderTotal: el total pasa del 110% de sus órdenes.
     */
    public String getCompareTo() {
        return compareTo;
    }

    public UpdateRuleParamsConditionsGroupCondition setCompareTo(String compareTo) {
        this.compareTo = compareTo;
        return this;
    }
}
