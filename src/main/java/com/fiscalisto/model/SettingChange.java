// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

/**
 * SettingChange: Un cambio a un ajuste de la empresa (Ajustes › Cambios): cuál (setting, su id, y name, su nombre en la app), de qué a qué como lo escribe la app (before, after), quién (changed_by: su nombre; null si fue con la API o su cuenta ya no existe) y por dónde (source: app, api o mcp), cuándo, si ya se deshizo (undone) y si todavía se puede deshacer (undoable: es el cambio más reciente de ese ajuste).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SettingChange {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private StringOr<Issuer> issuer;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El ajuste que cambió, por su id (cobranza.dias-credito, horarios.vigencia-cotizaciones…).
     */
    @JsonProperty("setting")
    private String setting;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Lo que tenía antes, como lo escribe la app («30 días», «Encendido»).
     */
    @JsonProperty("before")
    private String before;

    /**
     * Lo que quedó, como lo escribe la app.
     */
    @JsonProperty("after")
    private String after;

    /**
     * Quién lo cambió, por su nombre; «La API» si fue con una llave, null si su cuenta ya no existe.
     */
    @JsonProperty("changed_by")
    private String changedBy;

    /**
     * Por dónde: app (la app), api (la API) o mcp (un asistente como ChatGPT o Claude).
     * <p>
     * Valores: app, api, mcp.
     */
    @JsonProperty("source")
    private String source;

    /**
     * Cuándo se cambió.
     */
    @JsonProperty("created")
    private String created;

    /**
     * Cuándo se deshizo; null si no.
     */
    @JsonProperty("undone")
    private String undone;

    /**
     * Si todavía se puede deshacer (POST /v1/setting_changes/{id}/undo): es el cambio más reciente de ese ajuste y no se ha deshecho.
     */
    @JsonProperty("undoable")
    private Boolean undoable;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public SettingChange setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public SettingChange setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public SettingChange setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public SettingChange setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public SettingChange setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public SettingChange setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El ajuste que cambió, por su id (cobranza.dias-credito, horarios.vigencia-cotizaciones…).
     */
    public String getSetting() {
        return setting;
    }

    public SettingChange setSetting(String setting) {
        this.setting = setting;
        return this;
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public SettingChange setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Lo que tenía antes, como lo escribe la app («30 días», «Encendido»).
     */
    public String getBefore() {
        return before;
    }

    public SettingChange setBefore(String before) {
        this.before = before;
        return this;
    }

    /**
     * Lo que quedó, como lo escribe la app.
     */
    public String getAfter() {
        return after;
    }

    public SettingChange setAfter(String after) {
        this.after = after;
        return this;
    }

    /**
     * Quién lo cambió, por su nombre; «La API» si fue con una llave, null si su cuenta ya no existe.
     */
    public String getChangedBy() {
        return changedBy;
    }

    public SettingChange setChangedBy(String changedBy) {
        this.changedBy = changedBy;
        return this;
    }

    /**
     * Por dónde: app (la app), api (la API) o mcp (un asistente como ChatGPT o Claude).
     * <p>
     * Valores: app, api, mcp.
     */
    public String getSource() {
        return source;
    }

    public SettingChange setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Cuándo se cambió.
     */
    public String getCreated() {
        return created;
    }

    public SettingChange setCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * Cuándo se deshizo; null si no.
     */
    public String getUndone() {
        return undone;
    }

    public SettingChange setUndone(String undone) {
        this.undone = undone;
        return this;
    }

    /**
     * Si todavía se puede deshacer (POST /v1/setting_changes/{id}/undo): es el cambio más reciente de ese ajuste y no se ha deshecho.
     */
    public Boolean getUndoable() {
        return undoable;
    }

    public SettingChange setUndoable(Boolean undoable) {
        this.undoable = undoable;
        return this;
    }
}
