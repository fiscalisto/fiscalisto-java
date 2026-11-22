// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RuleMatchRecord: El registro con que se cumplió.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleMatchRecord {
    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Valores: invoice, purchase_order, bank_movement, sat.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Cómo lo dice la app: «Factura A-120 de ACME».
     */
    @JsonProperty("label")
    private String label;

    /**
     * El folio fiscal, en facturas.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * Dónde se abre en la app.
     */
    @JsonProperty("app_url")
    private String appUrl;

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Valores: invoice, purchase_order, bank_movement, sat.
     */
    public String getType() {
        return type;
    }

    public RuleMatchRecord setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Cómo lo dice la app: «Factura A-120 de ACME».
     */
    public String getLabel() {
        return label;
    }

    public RuleMatchRecord setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * El folio fiscal, en facturas.
     */
    public String getUuid() {
        return uuid;
    }

    public RuleMatchRecord setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Dónde se abre en la app.
     */
    public String getAppUrl() {
        return appUrl;
    }

    public RuleMatchRecord setAppUrl(String appUrl) {
        this.appUrl = appUrl;
        return this;
    }
}
