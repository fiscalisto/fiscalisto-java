// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * RuleAction: RuleAction.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleAction {
    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Valores: tag, cost_center, stage, close, notify.
     */
    @JsonProperty("type")
    private String type;

    /**
     * tag: la etiqueta (tag_…, GET /v1/tags).
     */
    @JsonProperty("tag")
    private String tag;

    /**
     * tag: se quita si la orden deja de cumplir.
     */
    @JsonProperty("remove_when_unmet")
    private Boolean removeWhenUnmet;

    /**
     * Su centro de costo (ccn_…): la obra, proyecto, sucursal o área a la que pertenece, para ver ingresos y gastos por centro en Reportes. No cambia el CFDI. Sus notas de crédito lo toman solas.
     */
    @JsonProperty("cost_center")
    private String costCenter;

    /**
     * stage: la etapa.
     */
    @JsonProperty("stage")
    private Long stage;

    /**
     * notify: a quién (mem_…).
     */
    @JsonProperty("members")
    private List<String> members;

    /**
     * notify: lo que dice el aviso.
     */
    @JsonProperty("note")
    private String note;

    /**
     * Tipo de comprobante (TipoDeComprobante): I ingreso, E egreso, P pago, T traslado, N nómina.
     * <p>
     * Valores: tag, cost_center, stage, close, notify.
     */
    public String getType() {
        return type;
    }

    public RuleAction setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * tag: la etiqueta (tag_…, GET /v1/tags).
     */
    public String getTag() {
        return tag;
    }

    public RuleAction setTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * tag: se quita si la orden deja de cumplir.
     */
    public Boolean getRemoveWhenUnmet() {
        return removeWhenUnmet;
    }

    public RuleAction setRemoveWhenUnmet(Boolean removeWhenUnmet) {
        this.removeWhenUnmet = removeWhenUnmet;
        return this;
    }

    /**
     * Su centro de costo (ccn_…): la obra, proyecto, sucursal o área a la que pertenece, para ver ingresos y gastos por centro en Reportes. No cambia el CFDI. Sus notas de crédito lo toman solas.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public RuleAction setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * stage: la etapa.
     */
    public Long getStage() {
        return stage;
    }

    public RuleAction setStage(Long stage) {
        this.stage = stage;
        return this;
    }

    @JsonIgnore
    public RuleAction setStage(long stage) {
        return setStage(Long.valueOf(stage));
    }

    /**
     * notify: a quién (mem_…).
     */
    public List<String> getMembers() {
        return members;
    }

    public RuleAction setMembers(List<String> members) {
        this.members = members;
        return this;
    }

    /**
     * notify: lo que dice el aviso.
     */
    public String getNote() {
        return note;
    }

    public RuleAction setNote(String note) {
        this.note = note;
        return this;
    }
}
