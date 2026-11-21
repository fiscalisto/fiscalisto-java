// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PayrollOrgChartVacancyMonthlyCost: Lo que costaría a la empresa al mes: el sueldo, las cuotas patronales (primer año, prestaciones de ley, la prima de riesgo del emisor) y el impuesto sobre nómina de su estado. null sin sueldo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollOrgChartVacancyMonthlyCost {
    /**
     * Con salary_min.
     */
    @JsonProperty("min")
    private PayrollOrgChartVacancyMonthlyCostMin min;

    /**
     * Con salary_max.
     */
    @JsonProperty("max")
    private PayrollOrgChartVacancyMonthlyCostMax max;

    /**
     * Con salary_min.
     */
    public PayrollOrgChartVacancyMonthlyCostMin getMin() {
        return min;
    }

    public PayrollOrgChartVacancyMonthlyCost setMin(PayrollOrgChartVacancyMonthlyCostMin min) {
        this.min = min;
        return this;
    }

    /**
     * Con salary_max.
     */
    public PayrollOrgChartVacancyMonthlyCostMax getMax() {
        return max;
    }

    public PayrollOrgChartVacancyMonthlyCost setMax(PayrollOrgChartVacancyMonthlyCostMax max) {
        this.max = max;
        return this;
    }
}
