// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreateRuleParamsAction: CreateRuleParamsAction.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRuleParamsAction {
    /**
     * tag (órdenes): poner la etiqueta `tag`; cost_center (facturas): poner `cost_center` (ccn_…), nunca sobre lo que puso una persona; stage (órdenes): pasar a la etapa `stage`; close (órdenes): cerrarla si ya llegó todo; notify: avisar a `members` (mem_…).
     * <p>
     * Valores: tag, cost_center, stage, close, notify.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * tag: la etiqueta.
     */
    @JsonProperty("tag")
    private Long tag;

    /**
     * tag: quitarla si la orden deja de cumplir.
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
     * notify: a quién (mem_…, GET /v1/members).
     */
    @JsonProperty("members")
    private List<String> members;

    /**
     * notify: lo que dice el aviso.
     */
    @JsonProperty("note")
    private String note;

    /**
     * tag (órdenes): poner la etiqueta `tag`; cost_center (facturas): poner `cost_center` (ccn_…), nunca sobre lo que puso una persona; stage (órdenes): pasar a la etapa `stage`; close (órdenes): cerrarla si ya llegó todo; notify: avisar a `members` (mem_…).
     * <p>
     * Valores: tag, cost_center, stage, close, notify.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public CreateRuleParamsAction setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * tag: la etiqueta.
     */
    public Long getTag() {
        return tag;
    }

    public CreateRuleParamsAction setTag(Long tag) {
        this.tag = tag;
        return this;
    }

    @JsonIgnore
    public CreateRuleParamsAction setTag(long tag) {
        return setTag(Long.valueOf(tag));
    }

    /**
     * tag: quitarla si la orden deja de cumplir.
     */
    public Boolean getRemoveWhenUnmet() {
        return removeWhenUnmet;
    }

    public CreateRuleParamsAction setRemoveWhenUnmet(Boolean removeWhenUnmet) {
        this.removeWhenUnmet = removeWhenUnmet;
        return this;
    }

    /**
     * Su centro de costo (ccn_…): la obra, proyecto, sucursal o área a la que pertenece, para ver ingresos y gastos por centro en Reportes. No cambia el CFDI. Sus notas de crédito lo toman solas.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public CreateRuleParamsAction setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * stage: la etapa.
     */
    public Long getStage() {
        return stage;
    }

    public CreateRuleParamsAction setStage(Long stage) {
        this.stage = stage;
        return this;
    }

    @JsonIgnore
    public CreateRuleParamsAction setStage(long stage) {
        return setStage(Long.valueOf(stage));
    }

    /**
     * notify: a quién (mem_…, GET /v1/members).
     */
    public List<String> getMembers() {
        return members;
    }

    public CreateRuleParamsAction setMembers(List<String> members) {
        this.members = members;
        return this;
    }

    /**
     * notify: lo que dice el aviso.
     */
    public String getNote() {
        return note;
    }

    public CreateRuleParamsAction setNote(String note) {
        this.note = note;
        return this;
    }
}
