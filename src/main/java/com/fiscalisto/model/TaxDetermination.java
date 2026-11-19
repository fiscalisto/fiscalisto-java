// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * TaxDetermination: La determinación de impuestos de un mes en la contabilidad: el IVA cobrado y pagado del mes (de sus pólizas) que pasa a IVA por pagar o a favor, el pago provisional de ISR sugerido y la póliza que los registra, si ya se registró.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxDetermination {
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
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El mes (AAAA-MM).
     */
    @JsonProperty("month")
    private String month;

    /**
     * El último día del mes: la fecha de la póliza.
     */
    @JsonProperty("date")
    private String date;

    /**
     * El IVA trasladado cobrado en el mes, según sus pólizas.
     */
    @JsonProperty("vat_collected")
    private BigDecimal vatCollected;

    /**
     * El IVA acreditable pagado en el mes, según sus pólizas.
     */
    @JsonProperty("vat_creditable")
    private BigDecimal vatCreditable;

    /**
     * El IVA que le retuvieron sus clientes en el mes.
     */
    @JsonProperty("vat_withheld_by_customers")
    private BigDecimal vatWithheldByCustomers;

    /**
     * vat_collected − vat_creditable − vat_withheld_by_customers: positivo, IVA por pagar; negativo, IVA a favor.
     */
    @JsonProperty("vat")
    private BigDecimal vat;

    /**
     * El pago provisional de ISR que calcula Impuestos con su configuración, o null si no está configurado.
     */
    @JsonProperty("suggested_isr")
    private BigDecimal suggestedIsr;

    /**
     * La póliza de determinación (mje_…) si ya se registró, o null. Es una póliza a mano de tipo adjustment.
     */
    @JsonProperty("manual_entry")
    private String manualEntry;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public TaxDetermination setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public TaxDetermination setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public TaxDetermination setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El mes (AAAA-MM).
     */
    public String getMonth() {
        return month;
    }

    public TaxDetermination setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * El último día del mes: la fecha de la póliza.
     */
    public String getDate() {
        return date;
    }

    public TaxDetermination setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * El IVA trasladado cobrado en el mes, según sus pólizas.
     */
    public BigDecimal getVatCollected() {
        return vatCollected;
    }

    public TaxDetermination setVatCollected(BigDecimal vatCollected) {
        this.vatCollected = vatCollected;
        return this;
    }

    @JsonIgnore
    public TaxDetermination setVatCollected(double vatCollected) {
        return setVatCollected(BigDecimal.valueOf(vatCollected));
    }

    /**
     * El IVA acreditable pagado en el mes, según sus pólizas.
     */
    public BigDecimal getVatCreditable() {
        return vatCreditable;
    }

    public TaxDetermination setVatCreditable(BigDecimal vatCreditable) {
        this.vatCreditable = vatCreditable;
        return this;
    }

    @JsonIgnore
    public TaxDetermination setVatCreditable(double vatCreditable) {
        return setVatCreditable(BigDecimal.valueOf(vatCreditable));
    }

    /**
     * El IVA que le retuvieron sus clientes en el mes.
     */
    public BigDecimal getVatWithheldByCustomers() {
        return vatWithheldByCustomers;
    }

    public TaxDetermination setVatWithheldByCustomers(BigDecimal vatWithheldByCustomers) {
        this.vatWithheldByCustomers = vatWithheldByCustomers;
        return this;
    }

    @JsonIgnore
    public TaxDetermination setVatWithheldByCustomers(double vatWithheldByCustomers) {
        return setVatWithheldByCustomers(BigDecimal.valueOf(vatWithheldByCustomers));
    }

    /**
     * vat_collected − vat_creditable − vat_withheld_by_customers: positivo, IVA por pagar; negativo, IVA a favor.
     */
    public BigDecimal getVat() {
        return vat;
    }

    public TaxDetermination setVat(BigDecimal vat) {
        this.vat = vat;
        return this;
    }

    @JsonIgnore
    public TaxDetermination setVat(double vat) {
        return setVat(BigDecimal.valueOf(vat));
    }

    /**
     * El pago provisional de ISR que calcula Impuestos con su configuración, o null si no está configurado.
     */
    public BigDecimal getSuggestedIsr() {
        return suggestedIsr;
    }

    public TaxDetermination setSuggestedIsr(BigDecimal suggestedIsr) {
        this.suggestedIsr = suggestedIsr;
        return this;
    }

    @JsonIgnore
    public TaxDetermination setSuggestedIsr(double suggestedIsr) {
        return setSuggestedIsr(BigDecimal.valueOf(suggestedIsr));
    }

    /**
     * La póliza de determinación (mje_…) si ya se registró, o null. Es una póliza a mano de tipo adjustment.
     */
    public String getManualEntry() {
        return manualEntry;
    }

    public TaxDetermination setManualEntry(String manualEntry) {
        this.manualEntry = manualEntry;
        return this;
    }
}
