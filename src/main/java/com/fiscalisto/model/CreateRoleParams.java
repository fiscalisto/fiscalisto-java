// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreateRoleParams: los campos de «Crear un rol».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRoleParams {
    /**
     * El emisor (iss_…) de la empresa. Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Como se ve en la app.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Descripción.
     */
    @JsonProperty("description")
    private String description;

    /**
     * true: todos los permisos, incluidos los que se agreguen después.
     */
    @JsonProperty("all_permissions")
    private Boolean allPermissions;

    /**
     * Sus permisos (GET /v1/permissions). Los que otro necesita se agregan solos (timbrar pide ver facturas).
     */
    @JsonProperty("permissions")
    private List<String> permissions;

    /**
     * El emisor (iss_…) de la empresa. Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateRoleParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Como se ve en la app.
     * <p>
     * Obligatorio.
     */
    public String getName() {
        return name;
    }

    public CreateRoleParams setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Descripción.
     */
    public String getDescription() {
        return description;
    }

    public CreateRoleParams setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * true: todos los permisos, incluidos los que se agreguen después.
     */
    public Boolean getAllPermissions() {
        return allPermissions;
    }

    public CreateRoleParams setAllPermissions(Boolean allPermissions) {
        this.allPermissions = allPermissions;
        return this;
    }

    /**
     * Sus permisos (GET /v1/permissions). Los que otro necesita se agregan solos (timbrar pide ver facturas).
     */
    public List<String> getPermissions() {
        return permissions;
    }

    public CreateRoleParams setPermissions(List<String> permissions) {
        this.permissions = permissions;
        return this;
    }
}
