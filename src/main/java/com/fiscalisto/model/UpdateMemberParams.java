// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateMemberParams: los campos de «Cambiar el acceso de un miembro».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateMemberParams {
    /**
     * El rol (id de GET /v1/roles, como admin, contador, facturista o uno suyo). owner es Propietario: solo un propietario da o quita ese rol.
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
     * El rol (id de GET /v1/roles, como admin, contador, facturista o uno suyo). owner es Propietario: solo un propietario da o quita ese rol.
     */
    public String getRole() {
        return role;
    }

    public UpdateMemberParams setRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * true: todos los permisos, incluidos los que se agreguen después (además de los del rol).
     */
    public Boolean getAllPermissions() {
        return allPermissions;
    }

    public UpdateMemberParams setAllPermissions(Boolean allPermissions) {
        this.allPermissions = allPermissions;
        return this;
    }

    /**
     * Permisos además de los del rol (GET /v1/permissions).
     */
    public List<String> getPermissionsAdded() {
        return permissionsAdded;
    }

    public UpdateMemberParams setPermissionsAdded(List<String> permissionsAdded) {
        this.permissionsAdded = permissionsAdded;
        return this;
    }

    /**
     * Permisos del rol que esta persona no tiene.
     */
    public List<String> getPermissionsRemoved() {
        return permissionsRemoved;
    }

    public UpdateMemberParams setPermissionsRemoved(List<String> permissionsRemoved) {
        this.permissionsRemoved = permissionsRemoved;
        return this;
    }

    /**
     * Solo trabaja con estos RFC de la empresa. null: con todos.
     */
    public List<String> getTaxIds() {
        return taxIds;
    }

    public UpdateMemberParams setTaxIds(List<String> taxIds) {
        this.taxIds = taxIds;
        return this;
    }

    /**
     * Solo emite desde estas sucursales (brn_…, o "matriz" para el domicilio fiscal). null: desde todas.
     */
    public List<String> getBranches() {
        return branches;
    }

    public UpdateMemberParams setBranches(List<String> branches) {
        this.branches = branches;
        return this;
    }
}
