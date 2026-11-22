// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateRuleParamsElseAction: UpdateRuleParamsElseAction.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateRuleParamsElseAction {
    /**
     * flag (facturas, órdenes y movimientos del banco): marcar el hallazgo propio de la regla, con su nombre, `severity` y `detail`; queda abierto en Hallazgos hasta que alguien lo revise y se va si se borra la regla (`finding_code` es su código en GET /v1/findings y GET /v1/sat_findings); tag (facturas y órdenes): poner la etiqueta `tag`; category (facturas recibidas): poner la categoría de gasto `category`, nunca sobre la que eligió una persona; account (facturas): registrar su ingreso o gasto en la cuenta `account` del catálogo en vez de la de su categoría, nunca sobre la que eligió una persona ni en un mes cerrado; en bank.movement, registrar el movimiento con su póliza de ingresos o egresos contra esa cuenta (otra cuenta de banco de la empresa es un traspaso), si no tiene una ni es un mes cerrado; cost_center (facturas): poner `cost_center` (ccn_…), nunca sobre lo que puso una persona; stage (órdenes): pasar a la etapa `stage`; close (órdenes): cerrarla si ya llegó todo; ask_approval (órdenes en borrador): pedir aprobación por sus pasos de aprobación; notify: avisar a `members` (mem_…); lote (invoice.received e invoice.approved): agregar la factura al lote de pagos abierto `lote_name` que paga `pay_on`, o crear uno, preparado como quien hizo la regla; hold_payment (facturas recibidas): retener su pago hasta que alguien lo suelte, con `note`; email_supplier (facturas recibidas): escribirle al proveedor a los correos de su tema `topic`, con `subject` y `message`; review_findings: dar por revisados los hallazgos `findings` de la factura; extra_signature (payout.submitted): el pago necesita `signatures` firmas más que las de Configurar pagos, con `reason` para quien firma (nunca las baja; no cambia un pago que ya salió); webhook: mandar el evento rule.matched, con el registro y todos los campos de sus condiciones, a `url` (Zapier, Make, n8n o su sistema), firmado y con reintentos como los demás webhooks; al guardar se usa o se crea el webhook de esa dirección en Desarrolladores › Webhooks. Pide permiso de administrar la API.
     * <p>
     * Valores: tag, cost_center, stage, close, ask_approval, notify, category, account, lote, hold_payment, email_supplier, review_findings, extra_signature, webhook, flag.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * webhook: la dirección https a la que manda rule.matched.
     */
    @JsonProperty("url")
    private String url;

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
     * account: el número de la cuenta del catálogo («601-84-002», GET /v1/accounting/accounts). No una de Caja o Bancos.
     */
    @JsonProperty("account")
    private String account;

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
     * notify: lo que dice el aviso. hold_payment: por qué se retiene (hasta 200). Puede llevar las variables de `message`, menos las tablas.
     */
    @JsonProperty("note")
    private String note;

    /**
     * email_supplier: el tema de los correos del proveedor a los que va (ordenes, pagos, facturas, complementos, documentos, precios; Ajustes › Correos a proveedores). Sin correos de ese tema, va a sus correos generales. Por omisión, facturas.
     * <p>
     * Valores: ordenes, pagos, facturas, complementos, documentos, precios.
     */
    @JsonProperty("topic")
    private String topic;

    /**
     * email_supplier: el asunto. Lleva las variables de `message`, menos las tablas.
     */
    @JsonProperty("subject")
    private String subject;

    /**
     * email_supplier: el mensaje. Variables: {folio}, {total}, {fecha}, {empresa}, {rfc_empresa}, {proveedor}, {rfc_proveedor}, {subtotal}, {iva}, {retenciones} y {moneda}; de una factura también {uuid}, {metodo_pago}, {forma_pago}, {uso_cfdi}, {conceptos}, {categoria}, {saldo}, {orden}, {contrarecibo}, {fecha_promesa}, {hallazgos} y la tabla {tabla_conceptos}; de una orden {entrega}, {almacen}, {credito}, {comprador}, {nota}, {enlace} y la tabla {tabla_productos}; en invoice.rejected y purchase_order.rejected, {motivo_rechazo}; en los momentos de pagos {facturas}, la tabla {tabla_facturas}, {pagado}, {fecha_pago}, {pago}, {cuenta}, {banco} y {referencia}, en payout.paid {rastreo} y {cep}, en payout.failed {motivo}. Un correo por pago (per payout) no lleva las de una sola factura. Cada {tabla_…} se dibuja como tabla, con las columnas de `columns`; un dato que el registro no tiene queda en blanco.
     */
    @JsonProperty("message")
    private String message;

    /**
     * email_supplier en payout.submitted, payout.paid y payout.failed: payout manda un correo por pago y proveedor con todas sus facturas ({folio} es la lista de folios, {total} lo que se le paga y {fecha} la fecha del pago); invoice, uno por factura. Por omisión, payout.
     * <p>
     * Valores: payout, invoice.
     */
    @JsonProperty("per")
    private String per;

    /**
     * email_supplier: las columnas de cada tabla del mensaje, en su orden. tabla_facturas: folio, uuid, fecha, total, retenido, pagado; tabla_conceptos: clave, descripcion, cantidad, unidad, precio, importe; tabla_productos: producto, codigo, cantidad, recibido, pendiente, precio, importe. Sin columnas, las de siempre.
     */
    @JsonProperty("columns")
    private UpdateRuleParamsElseActionColumns columns;

    /**
     * email_supplier: personas del equipo que reciben copia (mem_…, GET /v1/members).
     */
    @JsonProperty("cc")
    private List<String> cc;

    /**
     * extra_signature: cuántas firmas más pide (1 a 3). Por omisión, 1.
     */
    @JsonProperty("signatures")
    private Long signatures;

    /**
     * extra_signature: por qué, para quien firma («Proveedor nuevo»). Puede llevar las variables de `message`, menos las tablas.
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * flag: qué tan grave es su hallazgo. Por omisión, warning.
     * <p>
     * Valores: critical, warning, info.
     */
    @JsonProperty("severity")
    private String severity;

    /**
     * flag: qué revisar, como sale en Hallazgos.
     */
    @JsonProperty("detail")
    private String detail;

    /**
     * review_findings: los hallazgos que da por revisados (sus códigos, `code` en GET /v1/sat_findings). No los que cambian impuestos o la lista negra: cancelado, efos_definitivo, efos_presunto, lista_69b_bis, lista_69.
     */
    @JsonProperty("findings")
    private List<String> findings;

    /**
     * flag (facturas, órdenes y movimientos del banco): marcar el hallazgo propio de la regla, con su nombre, `severity` y `detail`; queda abierto en Hallazgos hasta que alguien lo revise y se va si se borra la regla (`finding_code` es su código en GET /v1/findings y GET /v1/sat_findings); tag (facturas y órdenes): poner la etiqueta `tag`; category (facturas recibidas): poner la categoría de gasto `category`, nunca sobre la que eligió una persona; account (facturas): registrar su ingreso o gasto en la cuenta `account` del catálogo en vez de la de su categoría, nunca sobre la que eligió una persona ni en un mes cerrado; en bank.movement, registrar el movimiento con su póliza de ingresos o egresos contra esa cuenta (otra cuenta de banco de la empresa es un traspaso), si no tiene una ni es un mes cerrado; cost_center (facturas): poner `cost_center` (ccn_…), nunca sobre lo que puso una persona; stage (órdenes): pasar a la etapa `stage`; close (órdenes): cerrarla si ya llegó todo; ask_approval (órdenes en borrador): pedir aprobación por sus pasos de aprobación; notify: avisar a `members` (mem_…); lote (invoice.received e invoice.approved): agregar la factura al lote de pagos abierto `lote_name` que paga `pay_on`, o crear uno, preparado como quien hizo la regla; hold_payment (facturas recibidas): retener su pago hasta que alguien lo suelte, con `note`; email_supplier (facturas recibidas): escribirle al proveedor a los correos de su tema `topic`, con `subject` y `message`; review_findings: dar por revisados los hallazgos `findings` de la factura; extra_signature (payout.submitted): el pago necesita `signatures` firmas más que las de Configurar pagos, con `reason` para quien firma (nunca las baja; no cambia un pago que ya salió); webhook: mandar el evento rule.matched, con el registro y todos los campos de sus condiciones, a `url` (Zapier, Make, n8n o su sistema), firmado y con reintentos como los demás webhooks; al guardar se usa o se crea el webhook de esa dirección en Desarrolladores › Webhooks. Pide permiso de administrar la API.
     * <p>
     * Valores: tag, cost_center, stage, close, ask_approval, notify, category, account, lote, hold_payment, email_supplier, review_findings, extra_signature, webhook, flag.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public UpdateRuleParamsElseAction setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * webhook: la dirección https a la que manda rule.matched.
     */
    public String getUrl() {
        return url;
    }

    public UpdateRuleParamsElseAction setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * tag: la etiqueta (tag_…, GET /v1/tags). Un número, el id de antes, también se acepta.
     */
    public Object getTag() {
        return tag;
    }

    public UpdateRuleParamsElseAction setTag(Object tag) {
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

    public UpdateRuleParamsElseAction setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * account: el número de la cuenta del catálogo («601-84-002», GET /v1/accounting/accounts). No una de Caja o Bancos.
     */
    public String getAccount() {
        return account;
    }

    public UpdateRuleParamsElseAction setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * tag: quitarla si la orden deja de cumplir.
     */
    public Boolean getRemoveWhenUnmet() {
        return removeWhenUnmet;
    }

    public UpdateRuleParamsElseAction setRemoveWhenUnmet(Boolean removeWhenUnmet) {
        this.removeWhenUnmet = removeWhenUnmet;
        return this;
    }

    /**
     * lote: el nombre del lote («Fletes»); vacío o null: «Lote del jueves 27 nov».
     */
    public String getLoteName() {
        return loteName;
    }

    public UpdateRuleParamsElseAction setLoteName(String loteName) {
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

    public UpdateRuleParamsElseAction setPayOn(String payOn) {
        this.payOn = payOn;
        return this;
    }

    /**
     * lote con pay_on in_days: cuántos días después.
     */
    public Long getDays() {
        return days;
    }

    public UpdateRuleParamsElseAction setDays(Long days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public UpdateRuleParamsElseAction setDays(long days) {
        return setDays(Long.valueOf(days));
    }

    /**
     * Su centro de costo (ccn_…): la obra, proyecto, sucursal o área a la que pertenece, para ver ingresos y gastos por centro en Reportes. No cambia el CFDI. Sus notas de crédito lo toman solas.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public UpdateRuleParamsElseAction setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * stage: la etapa.
     */
    public Long getStage() {
        return stage;
    }

    public UpdateRuleParamsElseAction setStage(Long stage) {
        this.stage = stage;
        return this;
    }

    @JsonIgnore
    public UpdateRuleParamsElseAction setStage(long stage) {
        return setStage(Long.valueOf(stage));
    }

    /**
     * notify: a quién (mem_…, GET /v1/members).
     */
    public List<String> getMembers() {
        return members;
    }

    public UpdateRuleParamsElseAction setMembers(List<String> members) {
        this.members = members;
        return this;
    }

    /**
     * notify: lo que dice el aviso. hold_payment: por qué se retiene (hasta 200). Puede llevar las variables de `message`, menos las tablas.
     */
    public String getNote() {
        return note;
    }

    public UpdateRuleParamsElseAction setNote(String note) {
        this.note = note;
        return this;
    }

    /**
     * email_supplier: el tema de los correos del proveedor a los que va (ordenes, pagos, facturas, complementos, documentos, precios; Ajustes › Correos a proveedores). Sin correos de ese tema, va a sus correos generales. Por omisión, facturas.
     * <p>
     * Valores: ordenes, pagos, facturas, complementos, documentos, precios.
     */
    public String getTopic() {
        return topic;
    }

    public UpdateRuleParamsElseAction setTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * email_supplier: el asunto. Lleva las variables de `message`, menos las tablas.
     */
    public String getSubject() {
        return subject;
    }

    public UpdateRuleParamsElseAction setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * email_supplier: el mensaje. Variables: {folio}, {total}, {fecha}, {empresa}, {rfc_empresa}, {proveedor}, {rfc_proveedor}, {subtotal}, {iva}, {retenciones} y {moneda}; de una factura también {uuid}, {metodo_pago}, {forma_pago}, {uso_cfdi}, {conceptos}, {categoria}, {saldo}, {orden}, {contrarecibo}, {fecha_promesa}, {hallazgos} y la tabla {tabla_conceptos}; de una orden {entrega}, {almacen}, {credito}, {comprador}, {nota}, {enlace} y la tabla {tabla_productos}; en invoice.rejected y purchase_order.rejected, {motivo_rechazo}; en los momentos de pagos {facturas}, la tabla {tabla_facturas}, {pagado}, {fecha_pago}, {pago}, {cuenta}, {banco} y {referencia}, en payout.paid {rastreo} y {cep}, en payout.failed {motivo}. Un correo por pago (per payout) no lleva las de una sola factura. Cada {tabla_…} se dibuja como tabla, con las columnas de `columns`; un dato que el registro no tiene queda en blanco.
     */
    public String getMessage() {
        return message;
    }

    public UpdateRuleParamsElseAction setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * email_supplier en payout.submitted, payout.paid y payout.failed: payout manda un correo por pago y proveedor con todas sus facturas ({folio} es la lista de folios, {total} lo que se le paga y {fecha} la fecha del pago); invoice, uno por factura. Por omisión, payout.
     * <p>
     * Valores: payout, invoice.
     */
    public String getPer() {
        return per;
    }

    public UpdateRuleParamsElseAction setPer(String per) {
        this.per = per;
        return this;
    }

    /**
     * email_supplier: las columnas de cada tabla del mensaje, en su orden. tabla_facturas: folio, uuid, fecha, total, retenido, pagado; tabla_conceptos: clave, descripcion, cantidad, unidad, precio, importe; tabla_productos: producto, codigo, cantidad, recibido, pendiente, precio, importe. Sin columnas, las de siempre.
     */
    public UpdateRuleParamsElseActionColumns getColumns() {
        return columns;
    }

    public UpdateRuleParamsElseAction setColumns(UpdateRuleParamsElseActionColumns columns) {
        this.columns = columns;
        return this;
    }

    /**
     * email_supplier: personas del equipo que reciben copia (mem_…, GET /v1/members).
     */
    public List<String> getCc() {
        return cc;
    }

    public UpdateRuleParamsElseAction setCc(List<String> cc) {
        this.cc = cc;
        return this;
    }

    /**
     * extra_signature: cuántas firmas más pide (1 a 3). Por omisión, 1.
     */
    public Long getSignatures() {
        return signatures;
    }

    public UpdateRuleParamsElseAction setSignatures(Long signatures) {
        this.signatures = signatures;
        return this;
    }

    @JsonIgnore
    public UpdateRuleParamsElseAction setSignatures(long signatures) {
        return setSignatures(Long.valueOf(signatures));
    }

    /**
     * extra_signature: por qué, para quien firma («Proveedor nuevo»). Puede llevar las variables de `message`, menos las tablas.
     */
    public String getReason() {
        return reason;
    }

    public UpdateRuleParamsElseAction setReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * flag: qué tan grave es su hallazgo. Por omisión, warning.
     * <p>
     * Valores: critical, warning, info.
     */
    public String getSeverity() {
        return severity;
    }

    public UpdateRuleParamsElseAction setSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * flag: qué revisar, como sale en Hallazgos.
     */
    public String getDetail() {
        return detail;
    }

    public UpdateRuleParamsElseAction setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * review_findings: los hallazgos que da por revisados (sus códigos, `code` en GET /v1/sat_findings). No los que cambian impuestos o la lista negra: cancelado, efos_definitivo, efos_presunto, lista_69b_bis, lista_69.
     */
    public List<String> getFindings() {
        return findings;
    }

    public UpdateRuleParamsElseAction setFindings(List<String> findings) {
        this.findings = findings;
        return this;
    }
}
