// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.util.List;

/**
 * ImssFilesRefusedItem: ImssFilesRefusedItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImssFilesRefusedItem {
    /**
     * El movimiento (imv_…).
     */
    @JsonProperty("movement")
    private StringOr<ImssMovement> movement;

    /**
     * El nombre del empleado.
     */
    @JsonProperty("employee_name")
    private String employeeName;

    /**
     * Lo que el IMSS rechazaría en su renglón.
     */
    @JsonProperty("problems")
    private List<String> problems;

    /**
     * El movimiento (imv_…).
     */
    public StringOr<ImssMovement> getMovement() {
        return movement;
    }

    public ImssFilesRefusedItem setMovement(StringOr<ImssMovement> movement) {
        this.movement = movement;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public ImssFilesRefusedItem setMovement(String id) {
        return setMovement(StringOr.<ImssMovement>id(id));
    }

    @JsonIgnore
    public ImssFilesRefusedItem setMovement(ImssMovement movement) {
        return setMovement(StringOr.of(movement));
    }

    /**
     * El nombre del empleado.
     */
    public String getEmployeeName() {
        return employeeName;
    }

    public ImssFilesRefusedItem setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
        return this;
    }

    /**
     * Lo que el IMSS rechazaría en su renglón.
     */
    public List<String> getProblems() {
        return problems;
    }

    public ImssFilesRefusedItem setProblems(List<String> problems) {
        this.problems = problems;
        return this;
    }
}
