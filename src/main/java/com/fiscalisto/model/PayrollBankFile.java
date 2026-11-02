// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * PayrollBankFile: El archivo para pagar la nómina desde el portal del banco (no cobra nada).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollBankFile {
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
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El formato del banco: bbva, banamex, banorte, santander o spei (CSV).
     * <p>
     * Valores: bbva, banamex, banorte, santander, spei.
     */
    @JsonProperty("layout")
    private String layout;

    /**
     * Fecha de pago (FechaPago), AAAA-MM-DD. Por omisión el último día del periodo.
     */
    @JsonProperty("payment_date")
    private String paymentDate;

    /**
     * La CLABE de la cuenta de cargo.
     */
    @JsonProperty("account")
    private String account;

    /**
     * El nombre con que el portal del banco lo espera.
     */
    @JsonProperty("file_name")
    private String fileName;

    /**
     * text/plain para los portales de los bancos, text/csv para spei.
     * <p>
     * Valores: text/plain, text/csv.
     */
    @JsonProperty("content_type")
    private String contentType;

    /**
     * El archivo como texto, con renglones terminados en CR LF.
     */
    @JsonProperty("content")
    private String content;

    /**
     * El mismo archivo en Windows-1252 (ANSI), en base64: guárdelo tal cual para subirlo.
     */
    @JsonProperty("content_base64")
    private String contentBase64;

    /**
     * Total en la moneda del comprobante (Total).
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Cuántos pagos lleva.
     */
    @JsonProperty("count")
    private Long count;

    /**
     * Cada pago del archivo, en el orden en que va.
     */
    @JsonProperty("payments")
    private List<PayrollBankFilePayment> payments;

    /**
     * Quién no va en el archivo y por qué (sin CLABE, otro banco…).
     */
    @JsonProperty("excluded")
    private List<PayrollBankFileExcludedItem> excluded;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PayrollBankFile setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public PayrollBankFile setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public PayrollBankFile setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El formato del banco: bbva, banamex, banorte, santander o spei (CSV).
     * <p>
     * Valores: bbva, banamex, banorte, santander, spei.
     */
    public String getLayout() {
        return layout;
    }

    public PayrollBankFile setLayout(String layout) {
        this.layout = layout;
        return this;
    }

    /**
     * Fecha de pago (FechaPago), AAAA-MM-DD. Por omisión el último día del periodo.
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    public PayrollBankFile setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    /**
     * La CLABE de la cuenta de cargo.
     */
    public String getAccount() {
        return account;
    }

    public PayrollBankFile setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * El nombre con que el portal del banco lo espera.
     */
    public String getFileName() {
        return fileName;
    }

    public PayrollBankFile setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * text/plain para los portales de los bancos, text/csv para spei.
     * <p>
     * Valores: text/plain, text/csv.
     */
    public String getContentType() {
        return contentType;
    }

    public PayrollBankFile setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * El archivo como texto, con renglones terminados en CR LF.
     */
    public String getContent() {
        return content;
    }

    public PayrollBankFile setContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * El mismo archivo en Windows-1252 (ANSI), en base64: guárdelo tal cual para subirlo.
     */
    public String getContentBase64() {
        return contentBase64;
    }

    public PayrollBankFile setContentBase64(String contentBase64) {
        this.contentBase64 = contentBase64;
        return this;
    }

    /**
     * Total en la moneda del comprobante (Total).
     */
    public BigDecimal getTotal() {
        return total;
    }

    public PayrollBankFile setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public PayrollBankFile setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Cuántos pagos lleva.
     */
    public Long getCount() {
        return count;
    }

    public PayrollBankFile setCount(Long count) {
        this.count = count;
        return this;
    }

    @JsonIgnore
    public PayrollBankFile setCount(long count) {
        return setCount(Long.valueOf(count));
    }

    /**
     * Cada pago del archivo, en el orden en que va.
     */
    public List<PayrollBankFilePayment> getPayments() {
        return payments;
    }

    public PayrollBankFile setPayments(List<PayrollBankFilePayment> payments) {
        this.payments = payments;
        return this;
    }

    /**
     * Quién no va en el archivo y por qué (sin CLABE, otro banco…).
     */
    public List<PayrollBankFileExcludedItem> getExcluded() {
        return excluded;
    }

    public PayrollBankFile setExcluded(List<PayrollBankFileExcludedItem> excluded) {
        this.excluded = excluded;
        return this;
    }
}
