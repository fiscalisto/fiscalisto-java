// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PayrollReceiptPreviewWarning: PayrollReceiptPreviewWarning.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollReceiptPreviewWarning {
    /**
     * finiquito_not_included: el empleado se fue en el periodo y el recibo no trae su finiquito; absences_over_monthly_limit: con este recibo pasa de 7 faltas en el mes y las de más cotizan como días trabajados (para dejar de cotizar, presente su aviso de baja); payroll_rates_pending: aún no se cargan los valores (ISR, subsidio, salario mínimo, UMA) de una fecha próxima; net_changed_vs_previous: el neto cambia 10% o más (y al menos $100) contra el recibo ordinario anterior del empleado; salary_changed_vs_previous: cambió su salario diario integrado desde ese recibo (presente la modificación al IMSS); low_net: las deducciones le dejan menos del 30% de sus percepciones.
     */
    @JsonProperty("code")
    private String code;

    /**
     * Qué pasó y cómo corregirlo, para una persona.
     */
    @JsonProperty("message")
    private String message;

    /**
     * finiquito_not_included: el empleado se fue en el periodo y el recibo no trae su finiquito; absences_over_monthly_limit: con este recibo pasa de 7 faltas en el mes y las de más cotizan como días trabajados (para dejar de cotizar, presente su aviso de baja); payroll_rates_pending: aún no se cargan los valores (ISR, subsidio, salario mínimo, UMA) de una fecha próxima; net_changed_vs_previous: el neto cambia 10% o más (y al menos $100) contra el recibo ordinario anterior del empleado; salary_changed_vs_previous: cambió su salario diario integrado desde ese recibo (presente la modificación al IMSS); low_net: las deducciones le dejan menos del 30% de sus percepciones.
     */
    public String getCode() {
        return code;
    }

    public PayrollReceiptPreviewWarning setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Qué pasó y cómo corregirlo, para una persona.
     */
    public String getMessage() {
        return message;
    }

    public PayrollReceiptPreviewWarning setMessage(String message) {
        this.message = message;
        return this;
    }
}
