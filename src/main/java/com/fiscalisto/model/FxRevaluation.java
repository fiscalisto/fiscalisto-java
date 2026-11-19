// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * FxRevaluation: La revaluación cambiaria de un mes (NIF B-15): las facturas PPD en otra moneda que seguían pendientes al cierre, lo que se debe por moneda con el tipo de cambio de cierre que sugerimos (el FIX del DOF) y la póliza de ajuste que registra la diferencia, si ya se registró.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FxRevaluation {
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
     * El último día del mes: la fecha de la póliza. Su reversión es del día 1 del mes siguiente.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Cada moneda con saldos pendientes: receivable (lo que le deben sus clientes, en esa moneda), payable (lo que usted debe a sus proveedores), closing_rate (el FIX publicado en el DOF el día hábil siguiente al cierre, o null si no se pudo leer) y closing_rate_date (el día de esa publicación).
     */
    @JsonProperty("currencies")
    private List<FxRevaluationCurrency> currencies;

    /**
     * Las facturas PPD en otra moneda aún pendientes al cierre: direction issued (de un cliente) o received (de un proveedor), balance (lo que faltaba pagar, en su moneda) y booked_rate (su TipoCambio, al que se registró).
     */
    @JsonProperty("documents")
    private List<FxRevaluationDocument> documents;

    /**
     * La póliza de revaluación (mje_…) si ya se registró, o null. Es una póliza a mano de tipo adjustment con reverse_next_month.
     */
    @JsonProperty("manual_entry")
    private String manualEntry;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public FxRevaluation setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public FxRevaluation setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public FxRevaluation setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El mes (AAAA-MM).
     */
    public String getMonth() {
        return month;
    }

    public FxRevaluation setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * El último día del mes: la fecha de la póliza. Su reversión es del día 1 del mes siguiente.
     */
    public String getDate() {
        return date;
    }

    public FxRevaluation setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Cada moneda con saldos pendientes: receivable (lo que le deben sus clientes, en esa moneda), payable (lo que usted debe a sus proveedores), closing_rate (el FIX publicado en el DOF el día hábil siguiente al cierre, o null si no se pudo leer) y closing_rate_date (el día de esa publicación).
     */
    public List<FxRevaluationCurrency> getCurrencies() {
        return currencies;
    }

    public FxRevaluation setCurrencies(List<FxRevaluationCurrency> currencies) {
        this.currencies = currencies;
        return this;
    }

    /**
     * Las facturas PPD en otra moneda aún pendientes al cierre: direction issued (de un cliente) o received (de un proveedor), balance (lo que faltaba pagar, en su moneda) y booked_rate (su TipoCambio, al que se registró).
     */
    public List<FxRevaluationDocument> getDocuments() {
        return documents;
    }

    public FxRevaluation setDocuments(List<FxRevaluationDocument> documents) {
        this.documents = documents;
        return this;
    }

    /**
     * La póliza de revaluación (mje_…) si ya se registró, o null. Es una póliza a mano de tipo adjustment con reverse_next_month.
     */
    public String getManualEntry() {
        return manualEntry;
    }

    public FxRevaluation setManualEntry(String manualEntry) {
        this.manualEntry = manualEntry;
        return this;
    }
}
