// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * SatDeclarationSummary: Las mismas cifras con nombres fijos, por obligación (ISR, IVA, cada retención), para leerlas igual cada mes sin conocer el formato del SAT. Una cifra que no viene en la declaración o no se pudo leer es null, nunca 0. En Declaraciones y pagos solo trae lo del acuse.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatDeclarationSummary {
    /**
     * Cada obligación de la declaración: isr, vat, ieps, isr_salaries, isr_assimilated_salaries, isr_professional_services, isr_rent, vat_withholdings u other.
     */
    @JsonProperty("obligations")
    private List<SatDeclarationSummaryObligation> obligations;

    /**
     * El total a pagar del acuse; si no hay acuse, la suma de las obligaciones cuando todas se conocen.
     */
    @JsonProperty("total_to_pay")
    private BigDecimal totalToPay;

    /**
     * Cada obligación de la declaración: isr, vat, ieps, isr_salaries, isr_assimilated_salaries, isr_professional_services, isr_rent, vat_withholdings u other.
     */
    public List<SatDeclarationSummaryObligation> getObligations() {
        return obligations;
    }

    public SatDeclarationSummary setObligations(List<SatDeclarationSummaryObligation> obligations) {
        this.obligations = obligations;
        return this;
    }

    /**
     * El total a pagar del acuse; si no hay acuse, la suma de las obligaciones cuando todas se conocen.
     */
    public BigDecimal getTotalToPay() {
        return totalToPay;
    }

    public SatDeclarationSummary setTotalToPay(BigDecimal totalToPay) {
        this.totalToPay = totalToPay;
        return this;
    }

    @JsonIgnore
    public SatDeclarationSummary setTotalToPay(double totalToPay) {
        return setTotalToPay(BigDecimal.valueOf(totalToPay));
    }
}
