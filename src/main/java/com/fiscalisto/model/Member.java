// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.util.List;

/**
 * Member: Una persona que entra a la empresa en la app.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Member {
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
     * Correo a donde se envía (varios separados por comas). Solo se usa si se pide enviarlo.
     */
    @JsonProperty("email")
    private String email;

    /**
     * El rol (id de GET /v1/roles).
     */
    @JsonProperty("role")
    private String role;

    /**
     * true: todos los permisos, incluidos los que se agreguen después.
     */
    @JsonProperty("all_permissions")
    private Boolean allPermissions;

    /**
     * Permisos además de los del rol.
     */
    @JsonProperty("permissions_added")
    private List<String> permissionsAdded;

    /**
     * Permisos del rol que esta persona no tiene.
     */
    @JsonProperty("permissions_removed")
    private List<String> permissionsRemoved;

    /**
     * Solo trabaja con estos RFC de la empresa; null: con todos.
     */
    @JsonProperty("tax_ids")
    private List<String> taxIds;

    /**
     * Solo emite desde estas sucursales (brn_…, o "matriz"); null: desde todas.
     */
    @JsonProperty("branches")
    private List<String> branches;

    /**
     * Lo que puede hacer al final: los permisos del rol, más los agregados, menos los quitados.
     */
    @JsonProperty("permissions")
    private List<String> permissions;

    /**
     * Si entra con verificación en dos pasos.
     */
    @JsonProperty("two_factor_enabled")
    private Boolean twoFactorEnabled;

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public Member setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Member setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Member setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public Member setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public Member setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public Member setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * Nombre.
     */
    public String getName() {
        return name;
    }

    public Member setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Correo a donde se envía (varios separados por comas). Solo se usa si se pide enviarlo.
     */
    public String getEmail() {
        return email;
    }

    public Member setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * El rol (id de GET /v1/roles).
     */
    public String getRole() {
        return role;
    }

    public Member setRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * true: todos los permisos, incluidos los que se agreguen después.
     */
    public Boolean getAllPermissions() {
        return allPermissions;
    }

    public Member setAllPermissions(Boolean allPermissions) {
        this.allPermissions = allPermissions;
        return this;
    }

    /**
     * Permisos además de los del rol.
     */
    public List<String> getPermissionsAdded() {
        return permissionsAdded;
    }

    public Member setPermissionsAdded(List<String> permissionsAdded) {
        this.permissionsAdded = permissionsAdded;
        return this;
    }

    /**
     * Permisos del rol que esta persona no tiene.
     */
    public List<String> getPermissionsRemoved() {
        return permissionsRemoved;
    }

    public Member setPermissionsRemoved(List<String> permissionsRemoved) {
        this.permissionsRemoved = permissionsRemoved;
        return this;
    }

    /**
     * Solo trabaja con estos RFC de la empresa; null: con todos.
     */
    public List<String> getTaxIds() {
        return taxIds;
    }

    public Member setTaxIds(List<String> taxIds) {
        this.taxIds = taxIds;
        return this;
    }

    /**
     * Solo emite desde estas sucursales (brn_…, o "matriz"); null: desde todas.
     */
    public List<String> getBranches() {
        return branches;
    }

    public Member setBranches(List<String> branches) {
        this.branches = branches;
        return this;
    }

    /**
     * Lo que puede hacer al final: los permisos del rol, más los agregados, menos los quitados.
     */
    public List<String> getPermissions() {
        return permissions;
    }

    public Member setPermissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Si entra con verificación en dos pasos.
     */
    public Boolean getTwoFactorEnabled() {
        return twoFactorEnabled;
    }

    public Member setTwoFactorEnabled(Boolean twoFactorEnabled) {
        this.twoFactorEnabled = twoFactorEnabled;
        return this;
    }

    /**
     * Cuándo se creó, ISO 8601 con la hora de la Ciudad de México (-06:00).
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public Member setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
