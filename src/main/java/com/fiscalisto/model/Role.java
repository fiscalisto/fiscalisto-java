// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.math.BigDecimal;
import java.util.List;

/**
 * Role: Un rol de la empresa: un nombre y sus permisos.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Role {
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
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private StringOr<Issuer> issuer;

    /**
     * Nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Descripción.
     */
    @JsonProperty("description")
    private String description;

    /**
     * true: el rol tiene todos los permisos, incluidos los futuros.
     */
    @JsonProperty("all_permissions")
    private Boolean allPermissions;

    /**
     * Sus permisos (vacío con all_permissions).
     */
    @JsonProperty("permissions")
    private List<String> permissions;

    /**
     * owner: Propietario. starter: uno de los de Fiscalisto (se puede cambiar, no borrar). custom: uno de la empresa.
     * <p>
     * Valores: owner, starter, custom.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Cuántos miembros lo tienen.
     */
    @JsonProperty("members")
    private BigDecimal members;

    /**
     * Cuántas invitaciones pendientes lo dan.
     */
    @JsonProperty("invitations")
    private BigDecimal invitations;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public Role setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Role setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Role setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public Role setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public Role setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public Role setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public Role setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Descripción.
     */
    public String getDescription() {
        return description;
    }

    public Role setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * true: el rol tiene todos los permisos, incluidos los futuros.
     */
    public Boolean getAllPermissions() {
        return allPermissions;
    }

    public Role setAllPermissions(Boolean allPermissions) {
        this.allPermissions = allPermissions;
        return this;
    }

    /**
     * Sus permisos (vacío con all_permissions).
     */
    public List<String> getPermissions() {
        return permissions;
    }

    public Role setPermissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * owner: Propietario. starter: uno de los de Fiscalisto (se puede cambiar, no borrar). custom: uno de la empresa.
     * <p>
     * Valores: owner, starter, custom.
     */
    public String getType() {
        return type;
    }

    public Role setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Cuántos miembros lo tienen.
     */
    public BigDecimal getMembers() {
        return members;
    }

    public Role setMembers(BigDecimal members) {
        this.members = members;
        return this;
    }

    @JsonIgnore
    public Role setMembers(double members) {
        return setMembers(BigDecimal.valueOf(members));
    }

    /**
     * Cuántas invitaciones pendientes lo dan.
     */
    public BigDecimal getInvitations() {
        return invitations;
    }

    public Role setInvitations(BigDecimal invitations) {
        this.invitations = invitations;
        return this;
    }

    @JsonIgnore
    public Role setInvitations(double invitations) {
        return setInvitations(BigDecimal.valueOf(invitations));
    }
}
