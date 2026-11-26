// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateInvoiceParamsIneEntity: UpdateInvoiceParamsIneEntity.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateInvoiceParamsIneEntity {
    /**
     * Clave de la entidad (ClaveEntidad): la del estado (JAL, QUE…), NAC (nacional) o la circunscripción CR1 a CR5; estas seis no van con ámbito Local.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("key")
    private String key;

    /**
     * Ámbito (Ambito): Local o Federal.
     * <p>
     * Valores: Local, Federal.
     */
    @JsonProperty("scope")
    private String scope;

    /**
     * Claves de contabilidad (IdContabilidad).
     */
    @JsonProperty("accounting_ids")
    private List<String> accountingIds;

    /**
     * Clave de la entidad (ClaveEntidad): la del estado (JAL, QUE…), NAC (nacional) o la circunscripción CR1 a CR5; estas seis no van con ámbito Local.
     * <p>
     * Obligatorio.
     */
    public String getKey() {
        return key;
    }

    public UpdateInvoiceParamsIneEntity setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Ámbito (Ambito): Local o Federal.
     * <p>
     * Valores: Local, Federal.
     */
    public String getScope() {
        return scope;
    }

    public UpdateInvoiceParamsIneEntity setScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Claves de contabilidad (IdContabilidad).
     */
    public List<String> getAccountingIds() {
        return accountingIds;
    }

    public UpdateInvoiceParamsIneEntity setAccountingIds(List<String> accountingIds) {
        this.accountingIds = accountingIds;
        return this;
    }
}
