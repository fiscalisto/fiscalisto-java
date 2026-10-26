// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SatDeclarationCalendarMonthObligation: SatDeclarationCalendarMonthObligation.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatDeclarationCalendarMonthObligation {
    /**
     * Qué obligación es (las de summary.obligations), o annual_return para la anual.
     * <p>
     * Valores: isr, vat, ieps, isr_salaries, isr_assimilated_salaries, isr_professional_services, isr_rent, vat_withholdings, other.
     */
    @JsonProperty("obligation")
    private String obligation;

    /**
     * filed (presentada), missing (venció y no la encontramos) o due (aún no vence).
     * <p>
     * Valores: filed, missing, due.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Las declaraciones (dcl_…) que la presentaron, la normal y sus complementarias.
     */
    @JsonProperty("declarations")
    private List<String> declarations;

    /**
     * Qué obligación es (las de summary.obligations), o annual_return para la anual.
     * <p>
     * Valores: isr, vat, ieps, isr_salaries, isr_assimilated_salaries, isr_professional_services, isr_rent, vat_withholdings, other.
     */
    public String getObligation() {
        return obligation;
    }

    public SatDeclarationCalendarMonthObligation setObligation(String obligation) {
        this.obligation = obligation;
        return this;
    }

    /**
     * filed (presentada), missing (venció y no la encontramos) o due (aún no vence).
     * <p>
     * Valores: filed, missing, due.
     */
    public String getStatus() {
        return status;
    }

    public SatDeclarationCalendarMonthObligation setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Las declaraciones (dcl_…) que la presentaron, la normal y sus complementarias.
     */
    public List<String> getDeclarations() {
        return declarations;
    }

    public SatDeclarationCalendarMonthObligation setDeclarations(List<String> declarations) {
        this.declarations = declarations;
        return this;
    }
}
