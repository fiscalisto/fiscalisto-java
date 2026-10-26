// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CrossChecks: Lo que el emisor declaró cada mes contra lo que dicen sus CFDI, el IVA a favor y el régimen con que factura.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrossChecks {
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
     * El ejercicio.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Cada mes cuya declaración mensual ya venció (el día 17 del mes siguiente), con sus cruces. Un mes con complementaria toma, por impuesto, la más reciente que lo trae.
     */
    @JsonProperty("months")
    private List<CrossChecksMonth> months;

    /**
     * El IVA a favor que muestran las declaraciones del año y lo que meses posteriores acreditaron. Una estimación con las declaraciones leídas, no la cuenta del SAT.
     */
    @JsonProperty("vat_balance_in_favor")
    private CrossChecksVatBalanceInFavor vatBalanceInFavor;

    /**
     * Los regímenes del emisor (registered, de su constancia) y con cuáles facturó en el año.
     */
    @JsonProperty("tax_regimes")
    private CrossChecksTaxRegimes taxRegimes;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public CrossChecks setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public CrossChecks setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CrossChecks setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El ejercicio.
     */
    public Long getYear() {
        return year;
    }

    public CrossChecks setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public CrossChecks setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Cada mes cuya declaración mensual ya venció (el día 17 del mes siguiente), con sus cruces. Un mes con complementaria toma, por impuesto, la más reciente que lo trae.
     */
    public List<CrossChecksMonth> getMonths() {
        return months;
    }

    public CrossChecks setMonths(List<CrossChecksMonth> months) {
        this.months = months;
        return this;
    }

    /**
     * El IVA a favor que muestran las declaraciones del año y lo que meses posteriores acreditaron. Una estimación con las declaraciones leídas, no la cuenta del SAT.
     */
    public CrossChecksVatBalanceInFavor getVatBalanceInFavor() {
        return vatBalanceInFavor;
    }

    public CrossChecks setVatBalanceInFavor(CrossChecksVatBalanceInFavor vatBalanceInFavor) {
        this.vatBalanceInFavor = vatBalanceInFavor;
        return this;
    }

    /**
     * Los regímenes del emisor (registered, de su constancia) y con cuáles facturó en el año.
     */
    public CrossChecksTaxRegimes getTaxRegimes() {
        return taxRegimes;
    }

    public CrossChecks setTaxRegimes(CrossChecksTaxRegimes taxRegimes) {
        this.taxRegimes = taxRegimes;
        return this;
    }
}
