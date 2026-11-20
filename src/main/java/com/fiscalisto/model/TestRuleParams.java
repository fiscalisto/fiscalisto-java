// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TestRuleParams: los campos de «Probar una regla».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestRuleParams {
    /**
     * El folio fiscal (UUID) de una factura; sin él, las más recientes.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * Cuántas de las más recientes (10 por omisión).
     */
    @JsonProperty("limit")
    private Long limit;

    /**
     * El folio fiscal (UUID) de una factura; sin él, las más recientes.
     */
    public String getUuid() {
        return uuid;
    }

    public TestRuleParams setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * Cuántas de las más recientes (10 por omisión).
     */
    public Long getLimit() {
        return limit;
    }

    public TestRuleParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public TestRuleParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }
}
