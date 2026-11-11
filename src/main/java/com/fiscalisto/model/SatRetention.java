// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SatRetention: Un CFDI de retenciones e información de pagos del emisor, recibido (la constancia que le dio un banco, una plataforma o quien le pagó) o emitido, como lo muestra Facturas › Retenciones.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatRetention {
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
     * El emisor de su cuenta (iss_…) a quien pertenece esta constancia.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El folio fiscal (UUID del timbre).
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * received (se la dieron al emisor: un banco, una plataforma, quien le pagó) o issued (la emitió).
     * <p>
     * Valores: received, issued.
     */
    @JsonProperty("direction")
    private String direction;

    /**
     * La fecha de expedición (FechaExp).
     */
    @JsonProperty("date")
    private String date;

    /**
     * Folio interno (FolioInt), o null.
     */
    @JsonProperty("internal_folio")
    private String internalFolio;

    /**
     * Clave de la retención (CveRetenc), como 14 dividendos, 16 intereses o 26 plataformas.
     */
    @JsonProperty("code")
    private String code;

    /**
     * Descripción de la retención (DescRetenc), o null.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Quien retuvo (Emisor).
     */
    @JsonProperty("issued_by")
    private SatRetentionIssuedBy issuedBy;

    /**
     * A quien le retuvieron (Receptor).
     */
    @JsonProperty("issued_to")
    private SatRetentionIssuedTo issuedTo;

    /**
     * Los meses y el ejercicio que cubre (Periodo), o null si no se pudo leer.
     */
    @JsonProperty("period")
    private SatRetentionPeriod period;

    /**
     * Los montos de Totales.
     */
    @JsonProperty("totals")
    private SatRetentionTotals totals;

    /**
     * Cada impuesto retenido (ImpRetenidos).
     */
    @JsonProperty("withheld_taxes")
    private List<SatRetentionWithheldTax> withheldTaxes;

    /**
     * active o canceled: la canceló el emisor en Fiscalisto, o el SAT la reporta cancelada (se revisa cada mes). Una cancelada ya no es impuesto retenido.
     * <p>
     * Valores: active, canceled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Si su XML no se pudo leer, por qué; sus campos quedan en null. Si no, null.
     */
    @JsonProperty("read_error")
    private String readError;

    /**
     * Cuándo llegó a Fiscalisto.
     */
    @JsonProperty("downloaded_at")
    private String downloadedAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public SatRetention setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public SatRetention setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public SatRetention setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor de su cuenta (iss_…) a quien pertenece esta constancia.
     */
    public String getIssuer() {
        return issuer;
    }

    public SatRetention setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El folio fiscal (UUID del timbre).
     */
    public String getUuid() {
        return uuid;
    }

    public SatRetention setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * received (se la dieron al emisor: un banco, una plataforma, quien le pagó) o issued (la emitió).
     * <p>
     * Valores: received, issued.
     */
    public String getDirection() {
        return direction;
    }

    public SatRetention setDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * La fecha de expedición (FechaExp).
     */
    public String getDate() {
        return date;
    }

    public SatRetention setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Folio interno (FolioInt), o null.
     */
    public String getInternalFolio() {
        return internalFolio;
    }

    public SatRetention setInternalFolio(String internalFolio) {
        this.internalFolio = internalFolio;
        return this;
    }

    /**
     * Clave de la retención (CveRetenc), como 14 dividendos, 16 intereses o 26 plataformas.
     */
    public String getCode() {
        return code;
    }

    public SatRetention setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Descripción de la retención (DescRetenc), o null.
     */
    public String getDescription() {
        return description;
    }

    public SatRetention setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Quien retuvo (Emisor).
     */
    public SatRetentionIssuedBy getIssuedBy() {
        return issuedBy;
    }

    public SatRetention setIssuedBy(SatRetentionIssuedBy issuedBy) {
        this.issuedBy = issuedBy;
        return this;
    }

    /**
     * A quien le retuvieron (Receptor).
     */
    public SatRetentionIssuedTo getIssuedTo() {
        return issuedTo;
    }

    public SatRetention setIssuedTo(SatRetentionIssuedTo issuedTo) {
        this.issuedTo = issuedTo;
        return this;
    }

    /**
     * Los meses y el ejercicio que cubre (Periodo), o null si no se pudo leer.
     */
    public SatRetentionPeriod getPeriod() {
        return period;
    }

    public SatRetention setPeriod(SatRetentionPeriod period) {
        this.period = period;
        return this;
    }

    /**
     * Los montos de Totales.
     */
    public SatRetentionTotals getTotals() {
        return totals;
    }

    public SatRetention setTotals(SatRetentionTotals totals) {
        this.totals = totals;
        return this;
    }

    /**
     * Cada impuesto retenido (ImpRetenidos).
     */
    public List<SatRetentionWithheldTax> getWithheldTaxes() {
        return withheldTaxes;
    }

    public SatRetention setWithheldTaxes(List<SatRetentionWithheldTax> withheldTaxes) {
        this.withheldTaxes = withheldTaxes;
        return this;
    }

    /**
     * active o canceled: la canceló el emisor en Fiscalisto, o el SAT la reporta cancelada (se revisa cada mes). Una cancelada ya no es impuesto retenido.
     * <p>
     * Valores: active, canceled.
     */
    public String getStatus() {
        return status;
    }

    public SatRetention setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Si su XML no se pudo leer, por qué; sus campos quedan en null. Si no, null.
     */
    public String getReadError() {
        return readError;
    }

    public SatRetention setReadError(String readError) {
        this.readError = readError;
        return this;
    }

    /**
     * Cuándo llegó a Fiscalisto.
     */
    public String getDownloadedAt() {
        return downloadedAt;
    }

    public SatRetention setDownloadedAt(String downloadedAt) {
        this.downloadedAt = downloadedAt;
        return this;
    }
}
