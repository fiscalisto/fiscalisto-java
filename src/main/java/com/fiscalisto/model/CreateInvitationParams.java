// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreateInvitationParams: los campos de «Invitar a alguien a la empresa».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateInvitationParams {
    /**
     * El emisor (iss_…) de la empresa. Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El correo de la persona: le llega la invitación, válida 7 días.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("email")
    private String email;

    /**
     * El rol (id de GET /v1/roles, como admin, contador, facturista o uno suyo). owner es Propietario: solo un propietario da o quita ese rol.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("role")
    private String role;

    /**
     * true: todos los permisos, incluidos los que se agreguen después (además de los del rol).
     */
    @JsonProperty("all_permissions")
    private Boolean allPermissions;

    /**
     * Permisos además de los del rol (GET /v1/permissions).
     */
    @JsonProperty("permissions_added")
    private List<String> permissionsAdded;

    /**
     * Permisos del rol que esta persona no tiene.
     */
    @JsonProperty("permissions_removed")
    private List<String> permissionsRemoved;

    /**
     * Solo trabaja con estos RFC de la empresa. null: con todos.
     */
    @JsonProperty("tax_ids")
    private List<String> taxIds;

    /**
     * Solo emite desde estas sucursales (brn_…, o "matriz" para el domicilio fiscal). null: desde todas.
     */
    @JsonProperty("branches")
    private List<String> branches;

    /**
     * El emisor (iss_…) de la empresa. Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateInvitationParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El correo de la persona: le llega la invitación, válida 7 días.
     * <p>
     * Obligatorio.
     */
    public String getEmail() {
        return email;
    }

    public CreateInvitationParams setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * El rol (id de GET /v1/roles, como admin, contador, facturista o uno suyo). owner es Propietario: solo un propietario da o quita ese rol.
     * <p>
     * Obligatorio.
     */
    public String getRole() {
        return role;
    }

    public CreateInvitationParams setRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * true: todos los permisos, incluidos los que se agreguen después (además de los del rol).
     */
    public Boolean getAllPermissions() {
        return allPermissions;
    }

    public CreateInvitationParams setAllPermissions(Boolean allPermissions) {
        this.allPermissions = allPermissions;
        return this;
    }

    /**
     * Permisos además de los del rol (GET /v1/permissions).
     */
    public List<String> getPermissionsAdded() {
        return permissionsAdded;
    }

    public CreateInvitationParams setPermissionsAdded(List<String> permissionsAdded) {
        this.permissionsAdded = permissionsAdded;
        return this;
    }

    /**
     * Permisos del rol que esta persona no tiene.
     */
    public List<String> getPermissionsRemoved() {
        return permissionsRemoved;
    }

    public CreateInvitationParams setPermissionsRemoved(List<String> permissionsRemoved) {
        this.permissionsRemoved = permissionsRemoved;
        return this;
    }

    /**
     * Solo trabaja con estos RFC de la empresa. null: con todos.
     */
    public List<String> getTaxIds() {
        return taxIds;
    }

    public CreateInvitationParams setTaxIds(List<String> taxIds) {
        this.taxIds = taxIds;
        return this;
    }

    /**
     * Solo emite desde estas sucursales (brn_…, o "matriz" para el domicilio fiscal). null: desde todas.
     */
    public List<String> getBranches() {
        return branches;
    }

    public CreateInvitationParams setBranches(List<String> branches) {
        this.branches = branches;
        return this;
    }
}
