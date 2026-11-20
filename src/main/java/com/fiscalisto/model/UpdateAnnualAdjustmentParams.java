// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateAnnualAdjustmentParams: los campos de «Aplicar el ajuste anual».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateAnnualAdjustmentParams {
    /**
     * El emisor (iss_…); por omisión, el único de la cuenta.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El ejercicio: 2026.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * apply: aplica la diferencia en sus siguientes recibos (desde enero del año siguiente). undo: la quita si ningún recibo timbrado la lleva. files_own_return: avisó por escrito que presentará su declaración anual (artículo 97, c): no se le calcula. no_own_return: lo deshace.
     * <p>
     * Valores: apply, undo, files_own_return, no_own_return.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("action")
    private String action;

    /**
     * Los empleados (emp_…).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employees")
    private List<String> employees;

    /**
     * El emisor (iss_…); por omisión, el único de la cuenta.
     */
    public String getIssuer() {
        return issuer;
    }

    public UpdateAnnualAdjustmentParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El ejercicio: 2026.
     * <p>
     * Obligatorio.
     */
    public Long getYear() {
        return year;
    }

    public UpdateAnnualAdjustmentParams setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public UpdateAnnualAdjustmentParams setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * apply: aplica la diferencia en sus siguientes recibos (desde enero del año siguiente). undo: la quita si ningún recibo timbrado la lleva. files_own_return: avisó por escrito que presentará su declaración anual (artículo 97, c): no se le calcula. no_own_return: lo deshace.
     * <p>
     * Valores: apply, undo, files_own_return, no_own_return.
     * <p>
     * Obligatorio.
     */
    public String getAction() {
        return action;
    }

    public UpdateAnnualAdjustmentParams setAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Los empleados (emp_…).
     * <p>
     * Obligatorio.
     */
    public List<String> getEmployees() {
        return employees;
    }

    public UpdateAnnualAdjustmentParams setEmployees(List<String> employees) {
        this.employees = employees;
        return this;
    }
}
