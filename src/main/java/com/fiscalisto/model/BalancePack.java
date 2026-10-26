// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BalancePack: BalancePack.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BalancePack {
    /**
     * Timbres del paquete.
     */
    @JsonProperty("timbres")
    private Long timbres;

    /**
     * Los que le quedan.
     */
    @JsonProperty("remaining")
    private Long remaining;

    /**
     * Cuándo se compró.
     */
    @JsonProperty("purchased_at")
    private String purchasedAt;

    /**
     * Cuándo vencen; null si no vencen.
     */
    @JsonProperty("expires_at")
    private String expiresAt;

    /**
     * Timbres del paquete.
     */
    public Long getTimbres() {
        return timbres;
    }

    public BalancePack setTimbres(Long timbres) {
        this.timbres = timbres;
        return this;
    }

    @JsonIgnore
    public BalancePack setTimbres(long timbres) {
        return setTimbres(Long.valueOf(timbres));
    }

    /**
     * Los que le quedan.
     */
    public Long getRemaining() {
        return remaining;
    }

    public BalancePack setRemaining(Long remaining) {
        this.remaining = remaining;
        return this;
    }

    @JsonIgnore
    public BalancePack setRemaining(long remaining) {
        return setRemaining(Long.valueOf(remaining));
    }

    /**
     * Cuándo se compró.
     */
    public String getPurchasedAt() {
        return purchasedAt;
    }

    public BalancePack setPurchasedAt(String purchasedAt) {
        this.purchasedAt = purchasedAt;
        return this;
    }

    /**
     * Cuándo vencen; null si no vencen.
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    public BalancePack setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
}
