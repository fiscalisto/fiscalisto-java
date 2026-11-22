// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateEmployeeTrainingParams: los campos de «Ocupación y estudios de un empleado».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateEmployeeTrainingParams {
    /**
     * Su clave del Catálogo Nacional de Ocupaciones cuando no es la de su puesto; null usa la de su puesto.
     */
    @JsonProperty("occupation")
    private String occupation;

    /**
     * Su grado de estudios terminados, que pide el aviso a la STPS: primaria, secundaria, bachillerato, tecnico, licenciatura, especialidad, maestria o doctorado.
     * <p>
     * Valores: primaria, secundaria, bachillerato, tecnico, licenciatura, especialidad, maestria, doctorado.
     */
    @JsonProperty("education")
    private String education;

    /**
     * Su clave del Catálogo Nacional de Ocupaciones cuando no es la de su puesto; null usa la de su puesto.
     */
    public String getOccupation() {
        return occupation;
    }

    public UpdateEmployeeTrainingParams setOccupation(String occupation) {
        this.occupation = occupation;
        return this;
    }

    /**
     * Su grado de estudios terminados, que pide el aviso a la STPS: primaria, secundaria, bachillerato, tecnico, licenciatura, especialidad, maestria o doctorado.
     * <p>
     * Valores: primaria, secundaria, bachillerato, tecnico, licenciatura, especialidad, maestria, doctorado.
     */
    public String getEducation() {
        return education;
    }

    public UpdateEmployeeTrainingParams setEducation(String education) {
        this.education = education;
        return this;
    }
}
