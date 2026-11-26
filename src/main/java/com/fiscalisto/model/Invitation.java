// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.util.List;

/**
 * Invitation: Una invitación a la empresa que aún no se acepta.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Invitation {
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
     * pending: su enlace sirve. canceled: se canceló.
     * <p>
     * Valores: pending, canceled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Hasta cuándo sirve su enlace (7 días).
     */
    @JsonProperty("expires_at")
    private String expiresAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public Invitation setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Invitation setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Invitation setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public Invitation setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public Invitation setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public Invitation setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * Correo a donde se envía (varios separados por comas). Solo se usa si se pide enviarlo.
     */
    public String getEmail() {
        return email;
    }

    public Invitation setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * El rol (id de GET /v1/roles).
     */
    public String getRole() {
        return role;
    }

    public Invitation setRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * true: todos los permisos, incluidos los que se agreguen después.
     */
    public Boolean getAllPermissions() {
        return allPermissions;
    }

    public Invitation setAllPermissions(Boolean allPermissions) {
        this.allPermissions = allPermissions;
        return this;
    }

    /**
     * Permisos además de los del rol.
     */
    public List<String> getPermissionsAdded() {
        return permissionsAdded;
    }

    public Invitation setPermissionsAdded(List<String> permissionsAdded) {
        this.permissionsAdded = permissionsAdded;
        return this;
    }

    /**
     * Permisos del rol que esta persona no tiene.
     */
    public List<String> getPermissionsRemoved() {
        return permissionsRemoved;
    }

    public Invitation setPermissionsRemoved(List<String> permissionsRemoved) {
        this.permissionsRemoved = permissionsRemoved;
        return this;
    }

    /**
     * Solo trabaja con estos RFC de la empresa; null: con todos.
     */
    public List<String> getTaxIds() {
        return taxIds;
    }

    public Invitation setTaxIds(List<String> taxIds) {
        this.taxIds = taxIds;
        return this;
    }

    /**
     * Solo emite desde estas sucursales (brn_…, o "matriz"); null: desde todas.
     */
    public List<String> getBranches() {
        return branches;
    }

    public Invitation setBranches(List<String> branches) {
        this.branches = branches;
        return this;
    }

    /**
     * pending: su enlace sirve. canceled: se canceló.
     * <p>
     * Valores: pending, canceled.
     */
    public String getStatus() {
        return status;
    }

    public Invitation setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Hasta cuándo sirve su enlace (7 días).
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    public Invitation setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
}
