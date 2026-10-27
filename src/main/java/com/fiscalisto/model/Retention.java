// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * Retention: Una constancia de retenciones e información de pagos (CFDI de retenciones 2.0).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Retention {
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
     * processing: el PAC no ha contestado. valid: timbrada. rejected: el SAT o el PAC no la aceptaron (ver error). canceled: cancelada.
     * <p>
     * Valores: processing, valid, rejected, canceled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * Folio (Folio). Fiscalisto asigna el siguiente de la serie; mande uno solo si debe ser ese.
     */
    @JsonProperty("folio")
    private Long folio;

    /**
     * Folio interno (FolioInt): RET1, RET2…
     */
    @JsonProperty("internal_folio")
    private String internalFolio;

    /**
     * Fecha de emisión (Fecha), hora de la Ciudad de México.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Clave de la retención (CveRetenc), c_CveRetenc: 01 servicios profesionales, 05 arrendamiento, 14 dividendos, 16 intereses, 18 pagos al extranjero…
     */
    @JsonProperty("code")
    private String code;

    /**
     * Descripción de la retención (DescRetenc).
     */
    @JsonProperty("description")
    private String description;

    /**
     * Receptor de la constancia (Receptor): nacional con RFC y código postal, o extranjero.
     */
    @JsonProperty("recipient")
    private RetentionRecipient recipient;

    /**
     * Periodo (Periodo): mes inicial, mes final y año.
     */
    @JsonProperty("period")
    private RetentionPeriod period;

    /**
     * Totales (Totales).
     */
    @JsonProperty("totals")
    private RetentionTotals totals;

    /**
     * Impuestos del comprobante, por tipo.
     */
    @JsonProperty("taxes")
    private List<RetentionTax> taxes;

    /**
     * Complemento de dividendos.
     */
    @JsonProperty("dividends")
    private Map<String, Object> dividends;

    /**
     * Complemento de intereses.
     */
    @JsonProperty("interest")
    private Map<String, Object> interest;

    /**
     * Complemento de pagos a extranjeros.
     */
    @JsonProperty("foreign_payment")
    private Map<String, Object> foreignPayment;

    /**
     * La cancelación, si se pidió: estado, motivo, sustituto y cuándo.
     */
    @JsonProperty("cancellation")
    private RetentionCancellation cancellation;

    /**
     * El envío por correo: a quién, con copia a quién y cuándo (null si no se ha enviado).
     */
    @JsonProperty("email")
    private RetentionEmail email;

    /**
     * Por qué el SAT o el PAC no lo aceptaron: mensaje, código del SAT y texto original.
     */
    @JsonProperty("error")
    private RetentionError error;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * Avisos que no impidieron timbrar (por ejemplo, el XML se guardará después).
     */
    @JsonProperty("warnings")
    private List<String> warnings;

    /**
     * Por qué no se pudo mandar el correo; el comprobante sí se timbró.
     */
    @JsonProperty("email_error")
    private String emailError;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public Retention setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Retention setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Retention setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public Retention setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * processing: el PAC no ha contestado. valid: timbrada. rejected: el SAT o el PAC no la aceptaron (ver error). canceled: cancelada.
     * <p>
     * Valores: processing, valid, rejected, canceled.
     */
    public String getStatus() {
        return status;
    }

    public Retention setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Folio fiscal que asigna el SAT (UUID del Timbre Fiscal Digital), en mayúsculas.
     */
    public String getUuid() {
        return uuid;
    }

    public Retention setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Folio (Folio). Fiscalisto asigna el siguiente de la serie; mande uno solo si debe ser ese.
     */
    public Long getFolio() {
        return folio;
    }

    public Retention setFolio(Long folio) {
        this.folio = folio;
        return this;
    }

    @JsonIgnore
    public Retention setFolio(long folio) {
        return setFolio(Long.valueOf(folio));
    }

    /**
     * Folio interno (FolioInt): RET1, RET2…
     */
    public String getInternalFolio() {
        return internalFolio;
    }

    public Retention setInternalFolio(String internalFolio) {
        this.internalFolio = internalFolio;
        return this;
    }

    /**
     * Fecha de emisión (Fecha), hora de la Ciudad de México.
     */
    public String getDate() {
        return date;
    }

    public Retention setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Clave de la retención (CveRetenc), c_CveRetenc: 01 servicios profesionales, 05 arrendamiento, 14 dividendos, 16 intereses, 18 pagos al extranjero…
     */
    public String getCode() {
        return code;
    }

    public Retention setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Descripción de la retención (DescRetenc).
     */
    public String getDescription() {
        return description;
    }

    public Retention setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Receptor de la constancia (Receptor): nacional con RFC y código postal, o extranjero.
     */
    public RetentionRecipient getRecipient() {
        return recipient;
    }

    public Retention setRecipient(RetentionRecipient recipient) {
        this.recipient = recipient;
        return this;
    }

    /**
     * Periodo (Periodo): mes inicial, mes final y año.
     */
    public RetentionPeriod getPeriod() {
        return period;
    }

    public Retention setPeriod(RetentionPeriod period) {
        this.period = period;
        return this;
    }

    /**
     * Totales (Totales).
     */
    public RetentionTotals getTotals() {
        return totals;
    }

    public Retention setTotals(RetentionTotals totals) {
        this.totals = totals;
        return this;
    }

    /**
     * Impuestos del comprobante, por tipo.
     */
    public List<RetentionTax> getTaxes() {
        return taxes;
    }

    public Retention setTaxes(List<RetentionTax> taxes) {
        this.taxes = taxes;
        return this;
    }

    /**
     * Complemento de dividendos.
     */
    public Map<String, Object> getDividends() {
        return dividends;
    }

    public Retention setDividends(Map<String, Object> dividends) {
        this.dividends = dividends;
        return this;
    }

    /**
     * Complemento de intereses.
     */
    public Map<String, Object> getInterest() {
        return interest;
    }

    public Retention setInterest(Map<String, Object> interest) {
        this.interest = interest;
        return this;
    }

    /**
     * Complemento de pagos a extranjeros.
     */
    public Map<String, Object> getForeignPayment() {
        return foreignPayment;
    }

    public Retention setForeignPayment(Map<String, Object> foreignPayment) {
        this.foreignPayment = foreignPayment;
        return this;
    }

    /**
     * La cancelación, si se pidió: estado, motivo, sustituto y cuándo.
     */
    public RetentionCancellation getCancellation() {
        return cancellation;
    }

    public Retention setCancellation(RetentionCancellation cancellation) {
        this.cancellation = cancellation;
        return this;
    }

    /**
     * El envío por correo: a quién, con copia a quién y cuándo (null si no se ha enviado).
     */
    public RetentionEmail getEmail() {
        return email;
    }

    public Retention setEmail(RetentionEmail email) {
        this.email = email;
        return this;
    }

    /**
     * Por qué el SAT o el PAC no lo aceptaron: mensaje, código del SAT y texto original.
     */
    public RetentionError getError() {
        return error;
    }

    public Retention setError(RetentionError error) {
        this.error = error;
        return this;
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public Retention setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public Retention setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Avisos que no impidieron timbrar (por ejemplo, el XML se guardará después).
     */
    public List<String> getWarnings() {
        return warnings;
    }

    public Retention setWarnings(List<String> warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     * Por qué no se pudo mandar el correo; el comprobante sí se timbró.
     */
    public String getEmailError() {
        return emailError;
    }

    public Retention setEmailError(String emailError) {
        this.emailError = emailError;
        return this;
    }
}
