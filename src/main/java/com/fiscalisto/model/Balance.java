// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Balance: Timbres de producción de la cuenta, por paquete, el que vence antes primero.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Balance {
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
     * Timbres de sus paquetes, en total: un solo saldo para la API y la app, comprados en Desarrolladores o en Plan y pagos.
     */
    @JsonProperty("available")
    private Long available;

    /**
     * Obsoleto: siempre false. Solo las cuentas internas de Fiscalisto timbran sin usar timbres. Se conserva por compatibilidad; no lo use.
     */
    @JsonProperty("unlimited")
    private Boolean unlimited;

    /**
     * Con esta cantidad o menos llega balance.low (y otra vez al acabarse). Se elige en Desarrolladores › Timbres y pagos. Si solo le quedan timbres de regalo, llega al quedar 2.
     */
    @JsonProperty("low_balance_at")
    private Long lowBalanceAt;

    /**
     * La recarga automática con la tarjeta guardada, o null si está apagada (se enciende en Desarrolladores › Timbres y pagos).
     */
    @JsonProperty("auto_recharge")
    private BalanceAutoRecharge autoRecharge;

    /**
     * Obsoleto: siempre true. Los RFC de la empresa (type own) timbran primero con los timbres del mes de su plan y después con `available`, los paquetes de su único saldo (comprados en Desarrolladores o en Plan y pagos). Los emisores conectados usan solo `available`. Se conserva por compatibilidad.
     */
    @JsonProperty("use_plan_timbres")
    private Boolean usePlanTimbres;

    /**
     * Los timbres del mes del plan de su empresa, que los RFC de la empresa (type own) usan antes que `available`; no se suman a `available`. null si la empresa no tiene un plan de paga con timbres al mes (Gratis o una prueba sin pagar). Con llaves de prueba trae los mismos que en producción, como `available`.
     */
    @JsonProperty("plan_timbres")
    private BalancePlanTimbres planTimbres;

    /**
     * Los paquetes con timbres, el que vence antes primero (en ese orden se usan).
     */
    @JsonProperty("packs")
    private List<BalancePack> packs;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Balance setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Balance setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Timbres de sus paquetes, en total: un solo saldo para la API y la app, comprados en Desarrolladores o en Plan y pagos.
     */
    public Long getAvailable() {
        return available;
    }

    public Balance setAvailable(Long available) {
        this.available = available;
        return this;
    }

    @JsonIgnore
    public Balance setAvailable(long available) {
        return setAvailable(Long.valueOf(available));
    }

    /**
     * Obsoleto: siempre false. Solo las cuentas internas de Fiscalisto timbran sin usar timbres. Se conserva por compatibilidad; no lo use.
     */
    public Boolean getUnlimited() {
        return unlimited;
    }

    public Balance setUnlimited(Boolean unlimited) {
        this.unlimited = unlimited;
        return this;
    }

    /**
     * Con esta cantidad o menos llega balance.low (y otra vez al acabarse). Se elige en Desarrolladores › Timbres y pagos. Si solo le quedan timbres de regalo, llega al quedar 2.
     */
    public Long getLowBalanceAt() {
        return lowBalanceAt;
    }

    public Balance setLowBalanceAt(Long lowBalanceAt) {
        this.lowBalanceAt = lowBalanceAt;
        return this;
    }

    @JsonIgnore
    public Balance setLowBalanceAt(long lowBalanceAt) {
        return setLowBalanceAt(Long.valueOf(lowBalanceAt));
    }

    /**
     * La recarga automática con la tarjeta guardada, o null si está apagada (se enciende en Desarrolladores › Timbres y pagos).
     */
    public BalanceAutoRecharge getAutoRecharge() {
        return autoRecharge;
    }

    public Balance setAutoRecharge(BalanceAutoRecharge autoRecharge) {
        this.autoRecharge = autoRecharge;
        return this;
    }

    /**
     * Obsoleto: siempre true. Los RFC de la empresa (type own) timbran primero con los timbres del mes de su plan y después con `available`, los paquetes de su único saldo (comprados en Desarrolladores o en Plan y pagos). Los emisores conectados usan solo `available`. Se conserva por compatibilidad.
     */
    public Boolean getUsePlanTimbres() {
        return usePlanTimbres;
    }

    public Balance setUsePlanTimbres(Boolean usePlanTimbres) {
        this.usePlanTimbres = usePlanTimbres;
        return this;
    }

    /**
     * Los timbres del mes del plan de su empresa, que los RFC de la empresa (type own) usan antes que `available`; no se suman a `available`. null si la empresa no tiene un plan de paga con timbres al mes (Gratis o una prueba sin pagar). Con llaves de prueba trae los mismos que en producción, como `available`.
     */
    public BalancePlanTimbres getPlanTimbres() {
        return planTimbres;
    }

    public Balance setPlanTimbres(BalancePlanTimbres planTimbres) {
        this.planTimbres = planTimbres;
        return this;
    }

    /**
     * Los paquetes con timbres, el que vence antes primero (en ese orden se usan).
     */
    public List<BalancePack> getPacks() {
        return packs;
    }

    public Balance setPacks(List<BalancePack> packs) {
        this.packs = packs;
        return this;
    }
}
