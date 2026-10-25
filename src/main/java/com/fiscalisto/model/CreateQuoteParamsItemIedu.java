// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateQuoteParamsItemIedu: Complemento de instituciones educativas privadas (IEDU): alumno, CURP, nivel y RVOE.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateQuoteParamsItemIedu {
    /**
     * Nombre del alumno (nombreAlumno).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("student_name")
    private String studentName;

    /**
     * CURP, 18 caracteres.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("curp")
    private String curp;

    /**
     * Nivel educativo (nivelEducativo).
     * <p>
     * Valores: Preescolar, Primaria, Secundaria, Profesional técnico, Bachillerato o su equivalente.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("level")
    private String level;

    /**
     * Reconocimiento de validez oficial de estudios (autRVOE).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("rvoe")
    private String rvoe;

    /**
     * RFC de quien paga, si no es el receptor (rfcPago).
     */
    @JsonProperty("payer_tax_id")
    private String payerTaxId;

    /**
     * Nombre del alumno (nombreAlumno).
     * <p>
     * Obligatorio.
     */
    public String getStudentName() {
        return studentName;
    }

    public CreateQuoteParamsItemIedu setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    /**
     * CURP, 18 caracteres.
     * <p>
     * Obligatorio.
     */
    public String getCurp() {
        return curp;
    }

    public CreateQuoteParamsItemIedu setCurp(String curp) {
        this.curp = curp;
        return this;
    }

    /**
     * Nivel educativo (nivelEducativo).
     * <p>
     * Valores: Preescolar, Primaria, Secundaria, Profesional técnico, Bachillerato o su equivalente.
     * <p>
     * Obligatorio.
     */
    public String getLevel() {
        return level;
    }

    public CreateQuoteParamsItemIedu setLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * Reconocimiento de validez oficial de estudios (autRVOE).
     * <p>
     * Obligatorio.
     */
    public String getRvoe() {
        return rvoe;
    }

    public CreateQuoteParamsItemIedu setRvoe(String rvoe) {
        this.rvoe = rvoe;
        return this;
    }

    /**
     * RFC de quien paga, si no es el receptor (rfcPago).
     */
    public String getPayerTaxId() {
        return payerTaxId;
    }

    public CreateQuoteParamsItemIedu setPayerTaxId(String payerTaxId) {
        this.payerTaxId = payerTaxId;
        return this;
    }
}
