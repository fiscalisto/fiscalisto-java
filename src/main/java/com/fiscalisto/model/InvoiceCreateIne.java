// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * InvoiceCreateIne: Complemento INE (procesos electorales).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvoiceCreateIne {
    /**
     * Tipo de proceso (TipoProceso): Ordinario, Precampaña o Campaña.
     * <p>
     * Valores: Ordinario, Precampaña, Campaña.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("process")
    private String process;

    /**
     * Tipo de comité (TipoComite), con el proceso Ordinario.
     * <p>
     * Valores: Ejecutivo Nacional, Ejecutivo Estatal, Directivo Estatal.
     */
    @JsonProperty("committee")
    private String committee;

    /**
     * Clave de contabilidad (IdContabilidad), hasta 6 dígitos.
     */
    @JsonProperty("accounting_id")
    private String accountingId;

    /**
     * Entidades (Entidad): clave del estado, ámbito y claves de contabilidad.
     */
    @JsonProperty("entities")
    private List<InvoiceCreateIneEntity> entities;

    /**
     * Tipo de proceso (TipoProceso): Ordinario, Precampaña o Campaña.
     * <p>
     * Valores: Ordinario, Precampaña, Campaña.
     * <p>
     * Obligatorio.
     */
    public String getProcess() {
        return process;
    }

    public InvoiceCreateIne setProcess(String process) {
        this.process = process;
        return this;
    }

    /**
     * Tipo de comité (TipoComite), con el proceso Ordinario.
     * <p>
     * Valores: Ejecutivo Nacional, Ejecutivo Estatal, Directivo Estatal.
     */
    public String getCommittee() {
        return committee;
    }

    public InvoiceCreateIne setCommittee(String committee) {
        this.committee = committee;
        return this;
    }

    /**
     * Clave de contabilidad (IdContabilidad), hasta 6 dígitos.
     */
    public String getAccountingId() {
        return accountingId;
    }

    public InvoiceCreateIne setAccountingId(String accountingId) {
        this.accountingId = accountingId;
        return this;
    }

    /**
     * Entidades (Entidad): clave del estado, ámbito y claves de contabilidad.
     */
    public List<InvoiceCreateIneEntity> getEntities() {
        return entities;
    }

    public InvoiceCreateIne setEntities(List<InvoiceCreateIneEntity> entities) {
        this.entities = entities;
        return this;
    }
}
