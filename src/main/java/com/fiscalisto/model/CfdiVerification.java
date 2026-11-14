// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CfdiVerification: Lo que dice el SAT de un CFDI: si existe, si está vigente o cancelado y si se puede cancelar, con su emisor y su receptor en las listas del SAT.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CfdiVerification {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * El RFC del emisor que se consultó.
     */
    @JsonProperty("issuer_tax_id")
    private String issuerTaxId;

    /**
     * El RFC del receptor que se consultó.
     */
    @JsonProperty("receiver_tax_id")
    private String receiverTaxId;

    /**
     * Total en la moneda del comprobante (Total).
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * De dónde se leyeron el UUID, los RFC y el total: xml, qr o fields.
     * <p>
     * Valores: xml, qr, fields.
     */
    @JsonProperty("source")
    private String source;

    /**
     * Lo que dice el SAT: active (vigente), canceled (cancelado), not_found (no lo tiene: no se timbró, se timbró hace minutos o es de pruebas) o data_mismatch (el UUID existe pero los RFC o el total no coinciden).
     * <p>
     * Valores: active, canceled, not_found, data_mismatch.
     */
    @JsonProperty("sat_status")
    private String satStatus;

    /**
     * Si está vigente, cómo se cancela: without_acceptance (sin que el receptor acepte), with_acceptance (el receptor tiene 3 días hábiles para aceptar) o not_cancellable (por ejemplo, tiene documentos relacionados vigentes). null si no está vigente o el SAT no lo dijo.
     * <p>
     * Valores: without_acceptance, with_acceptance, not_cancellable.
     */
    @JsonProperty("cancellable")
    private String cancellable;

    /**
     * Una cancelación en curso o terminada: in_process (esperando al receptor), rejected (el receptor la rechazó), deadline_passed (pasó el plazo y se canceló), accepted o without_acceptance (cancelado con o sin aceptación). null si nadie la pidió.
     * <p>
     * Valores: in_process, rejected, deadline_passed, accepted, without_acceptance.
     */
    @JsonProperty("cancellation_status")
    private String cancellationStatus;

    /**
     * true si el SAT dice que el emisor está en la lista 69-B como definitivo (EFOS); false si no; null si no lo dijo.
     */
    @JsonProperty("issuer_efos")
    private Boolean issuerEfos;

    /**
     * La respuesta del SAT tal cual (CodigoEstatus, Estado, EsCancelable, EstatusCancelacion, ValidacionEFOS), por si la necesita igual que el SAT.
     */
    @JsonProperty("sat")
    private CfdiVerificationSat sat;

    /**
     * Lo que trae el XML además (versión, tipo, fechas, nombres, moneda), si mandó xml; null si no.
     */
    @JsonProperty("xml")
    private CfdiVerificationXml xml;

    /**
     * El emisor en las listas del SAT (69-B, 69-B Bis y art. 69), como GET /v1/sat_lists/{tax_id}, sin costo. Solo cuando el SAT tiene el comprobante (active o canceled); null si no, o si las listas no se pudieron leer.
     */
    @JsonProperty("issuer_sat_lists")
    private SatListCheck issuerSatLists;

    /**
     * El receptor en las listas del SAT, igual que el emisor.
     */
    @JsonProperty("receiver_sat_lists")
    private SatListCheck receiverSatLists;

    /**
     * Cuándo se le preguntó al SAT.
     */
    @JsonProperty("checked_at")
    private String checkedAt;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public CfdiVerification setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public CfdiVerification setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    public String getUuid() {
        return uuid;
    }

    public CfdiVerification setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * El RFC del emisor que se consultó.
     */
    public String getIssuerTaxId() {
        return issuerTaxId;
    }

    public CfdiVerification setIssuerTaxId(String issuerTaxId) {
        this.issuerTaxId = issuerTaxId;
        return this;
    }

    /**
     * El RFC del receptor que se consultó.
     */
    public String getReceiverTaxId() {
        return receiverTaxId;
    }

    public CfdiVerification setReceiverTaxId(String receiverTaxId) {
        this.receiverTaxId = receiverTaxId;
        return this;
    }

    /**
     * Total en la moneda del comprobante (Total).
     */
    public BigDecimal getTotal() {
        return total;
    }

    public CfdiVerification setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public CfdiVerification setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * De dónde se leyeron el UUID, los RFC y el total: xml, qr o fields.
     * <p>
     * Valores: xml, qr, fields.
     */
    public String getSource() {
        return source;
    }

    public CfdiVerification setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Lo que dice el SAT: active (vigente), canceled (cancelado), not_found (no lo tiene: no se timbró, se timbró hace minutos o es de pruebas) o data_mismatch (el UUID existe pero los RFC o el total no coinciden).
     * <p>
     * Valores: active, canceled, not_found, data_mismatch.
     */
    public String getSatStatus() {
        return satStatus;
    }

    public CfdiVerification setSatStatus(String satStatus) {
        this.satStatus = satStatus;
        return this;
    }

    /**
     * Si está vigente, cómo se cancela: without_acceptance (sin que el receptor acepte), with_acceptance (el receptor tiene 3 días hábiles para aceptar) o not_cancellable (por ejemplo, tiene documentos relacionados vigentes). null si no está vigente o el SAT no lo dijo.
     * <p>
     * Valores: without_acceptance, with_acceptance, not_cancellable.
     */
    public String getCancellable() {
        return cancellable;
    }

    public CfdiVerification setCancellable(String cancellable) {
        this.cancellable = cancellable;
        return this;
    }

    /**
     * Una cancelación en curso o terminada: in_process (esperando al receptor), rejected (el receptor la rechazó), deadline_passed (pasó el plazo y se canceló), accepted o without_acceptance (cancelado con o sin aceptación). null si nadie la pidió.
     * <p>
     * Valores: in_process, rejected, deadline_passed, accepted, without_acceptance.
     */
    public String getCancellationStatus() {
        return cancellationStatus;
    }

    public CfdiVerification setCancellationStatus(String cancellationStatus) {
        this.cancellationStatus = cancellationStatus;
        return this;
    }

    /**
     * true si el SAT dice que el emisor está en la lista 69-B como definitivo (EFOS); false si no; null si no lo dijo.
     */
    public Boolean getIssuerEfos() {
        return issuerEfos;
    }

    public CfdiVerification setIssuerEfos(Boolean issuerEfos) {
        this.issuerEfos = issuerEfos;
        return this;
    }

    /**
     * La respuesta del SAT tal cual (CodigoEstatus, Estado, EsCancelable, EstatusCancelacion, ValidacionEFOS), por si la necesita igual que el SAT.
     */
    public CfdiVerificationSat getSat() {
        return sat;
    }

    public CfdiVerification setSat(CfdiVerificationSat sat) {
        this.sat = sat;
        return this;
    }

    /**
     * Lo que trae el XML además (versión, tipo, fechas, nombres, moneda), si mandó xml; null si no.
     */
    public CfdiVerificationXml getXml() {
        return xml;
    }

    public CfdiVerification setXml(CfdiVerificationXml xml) {
        this.xml = xml;
        return this;
    }

    /**
     * El emisor en las listas del SAT (69-B, 69-B Bis y art. 69), como GET /v1/sat_lists/{tax_id}, sin costo. Solo cuando el SAT tiene el comprobante (active o canceled); null si no, o si las listas no se pudieron leer.
     */
    public SatListCheck getIssuerSatLists() {
        return issuerSatLists;
    }

    public CfdiVerification setIssuerSatLists(SatListCheck issuerSatLists) {
        this.issuerSatLists = issuerSatLists;
        return this;
    }

    /**
     * El receptor en las listas del SAT, igual que el emisor.
     */
    public SatListCheck getReceiverSatLists() {
        return receiverSatLists;
    }

    public CfdiVerification setReceiverSatLists(SatListCheck receiverSatLists) {
        this.receiverSatLists = receiverSatLists;
        return this;
    }

    /**
     * Cuándo se le preguntó al SAT.
     */
    public String getCheckedAt() {
        return checkedAt;
    }

    public CfdiVerification setCheckedAt(String checkedAt) {
        this.checkedAt = checkedAt;
        return this;
    }
}
