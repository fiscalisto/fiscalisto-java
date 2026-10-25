// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

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
     * Timbres disponibles en total.
     */
    @JsonProperty("available")
    private Long available;

    /**
     * true si la cuenta timbra sin usar timbres.
     */
    @JsonProperty("unlimited")
    private Boolean unlimited;

    /**
     * Con esta cantidad o menos llega balance.low (y otra vez al acabarse). Se elige en Desarrolladores › Timbres.
     */
    @JsonProperty("low_balance_at")
    private Long lowBalanceAt;

    /**
     * La recarga automática con la tarjeta guardada, o null si está apagada.
     */
    @JsonProperty("auto_recharge")
    private BalanceAutoRecharge autoRecharge;

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
     * Timbres disponibles en total.
     */
    public Long getAvailable() {
        return available;
    }

    public Balance setAvailable(Long available) {
        this.available = available;
        return this;
    }

    public Balance setAvailable(long available) {
        return setAvailable(Long.valueOf(available));
    }

    /**
     * true si la cuenta timbra sin usar timbres.
     */
    public Boolean getUnlimited() {
        return unlimited;
    }

    public Balance setUnlimited(Boolean unlimited) {
        this.unlimited = unlimited;
        return this;
    }

    /**
     * Con esta cantidad o menos llega balance.low (y otra vez al acabarse). Se elige en Desarrolladores › Timbres.
     */
    public Long getLowBalanceAt() {
        return lowBalanceAt;
    }

    public Balance setLowBalanceAt(Long lowBalanceAt) {
        this.lowBalanceAt = lowBalanceAt;
        return this;
    }

    public Balance setLowBalanceAt(long lowBalanceAt) {
        return setLowBalanceAt(Long.valueOf(lowBalanceAt));
    }

    /**
     * La recarga automática con la tarjeta guardada, o null si está apagada.
     */
    public BalanceAutoRecharge getAutoRecharge() {
        return autoRecharge;
    }

    public Balance setAutoRecharge(BalanceAutoRecharge autoRecharge) {
        this.autoRecharge = autoRecharge;
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
