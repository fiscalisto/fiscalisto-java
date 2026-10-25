// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * TaxIdValidation: Si los datos fiscales de un cliente van a pasar el SAT.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxIdValidation {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El RFC revisado.
     */
    @JsonProperty("tax_id")
    private String taxId;

    /**
     * company (persona moral, 12 caracteres), person (persona física, 13) o generic (XAXX010101000, XEXX010101000).
     * <p>
     * Valores: company, person, generic.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * true si no hay errores: con lo que mandó, el SAT no debería rechazar la factura por los datos del cliente.
     */
    @JsonProperty("valid")
    private Boolean valid;

    /**
     * true si se comparó con el registro del SAT (mandó cif_id y el SAT contestó).
     */
    @JsonProperty("checked_with_sat")
    private Boolean checkedWithSat;

    /**
     * Lo que haría que el SAT rechace la factura. Cada uno con el campo (param), un código, la explicación y, si se puede, el valor correcto (suggestion).
     */
    @JsonProperty("errors")
    private List<TaxIdValidationError> errors;

    /**
     * Lo que no impide timbrar pero conviene revisar: el dígito verificador, mayúsculas, si el RFC está en las listas del SAT.
     */
    @JsonProperty("warnings")
    private List<TaxIdValidationWarning> warnings;

    /**
     * Lo que tiene el SAT en la constancia (con cif_id): nombre, código postal y regímenes vigentes. null sin cif_id.
     */
    @JsonProperty("sat_record")
    private TaxIdValidationSatRecord satRecord;

    /**
     * Si el SAT no contestó a tiempo (con cif_id): reintente en unos minutos. null si contestó o no se consultó.
     */
    @JsonProperty("sat_error")
    private String satError;

    /**
     * Si el RFC aparece en las listas del SAT. null con un RFC genérico o mal escrito.
     */
    @JsonProperty("sat_lists")
    private SatListCheck satLists;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public TaxIdValidation setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El RFC revisado.
     */
    public String getTaxId() {
        return taxId;
    }

    public TaxIdValidation setTaxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * company (persona moral, 12 caracteres), person (persona física, 13) o generic (XAXX010101000, XEXX010101000).
     * <p>
     * Valores: company, person, generic.
     */
    public String getKind() {
        return kind;
    }

    public TaxIdValidation setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * true si no hay errores: con lo que mandó, el SAT no debería rechazar la factura por los datos del cliente.
     */
    public Boolean getValid() {
        return valid;
    }

    public TaxIdValidation setValid(Boolean valid) {
        this.valid = valid;
        return this;
    }

    /**
     * true si se comparó con el registro del SAT (mandó cif_id y el SAT contestó).
     */
    public Boolean getCheckedWithSat() {
        return checkedWithSat;
    }

    public TaxIdValidation setCheckedWithSat(Boolean checkedWithSat) {
        this.checkedWithSat = checkedWithSat;
        return this;
    }

    /**
     * Lo que haría que el SAT rechace la factura. Cada uno con el campo (param), un código, la explicación y, si se puede, el valor correcto (suggestion).
     */
    public List<TaxIdValidationError> getErrors() {
        return errors;
    }

    public TaxIdValidation setErrors(List<TaxIdValidationError> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Lo que no impide timbrar pero conviene revisar: el dígito verificador, mayúsculas, si el RFC está en las listas del SAT.
     */
    public List<TaxIdValidationWarning> getWarnings() {
        return warnings;
    }

    public TaxIdValidation setWarnings(List<TaxIdValidationWarning> warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     * Lo que tiene el SAT en la constancia (con cif_id): nombre, código postal y regímenes vigentes. null sin cif_id.
     */
    public TaxIdValidationSatRecord getSatRecord() {
        return satRecord;
    }

    public TaxIdValidation setSatRecord(TaxIdValidationSatRecord satRecord) {
        this.satRecord = satRecord;
        return this;
    }

    /**
     * Si el SAT no contestó a tiempo (con cif_id): reintente en unos minutos. null si contestó o no se consultó.
     */
    public String getSatError() {
        return satError;
    }

    public TaxIdValidation setSatError(String satError) {
        this.satError = satError;
        return this;
    }

    /**
     * Si el RFC aparece en las listas del SAT. null con un RFC genérico o mal escrito.
     */
    public SatListCheck getSatLists() {
        return satLists;
    }

    public TaxIdValidation setSatLists(SatListCheck satLists) {
        this.satLists = satLists;
        return this;
    }
}
