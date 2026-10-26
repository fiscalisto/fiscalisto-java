// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BalanceAutoRecharge: BalanceAutoRecharge.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BalanceAutoRecharge {
    /**
     * Timbres del paquete que se compra.
     */
    @JsonProperty("timbres")
    private Long timbres;

    /**
     * Se compra con esta cantidad o menos.
     */
    @JsonProperty("at")
    private Long at;

    /**
     * Como máximo tantas compras al mes.
     */
    @JsonProperty("max_per_month")
    private Long maxPerMonth;

    /**
     * Timbres del paquete que se compra.
     */
    public Long getTimbres() {
        return timbres;
    }

    public BalanceAutoRecharge setTimbres(Long timbres) {
        this.timbres = timbres;
        return this;
    }

    @JsonIgnore
    public BalanceAutoRecharge setTimbres(long timbres) {
        return setTimbres(Long.valueOf(timbres));
    }

    /**
     * Se compra con esta cantidad o menos.
     */
    public Long getAt() {
        return at;
    }

    public BalanceAutoRecharge setAt(Long at) {
        this.at = at;
        return this;
    }

    @JsonIgnore
    public BalanceAutoRecharge setAt(long at) {
        return setAt(Long.valueOf(at));
    }

    /**
     * Como máximo tantas compras al mes.
     */
    public Long getMaxPerMonth() {
        return maxPerMonth;
    }

    public BalanceAutoRecharge setMaxPerMonth(Long maxPerMonth) {
        this.maxPerMonth = maxPerMonth;
        return this;
    }

    @JsonIgnore
    public BalanceAutoRecharge setMaxPerMonth(long maxPerMonth) {
        return setMaxPerMonth(Long.valueOf(maxPerMonth));
    }
}
