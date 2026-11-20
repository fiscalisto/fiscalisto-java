// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreatePayrollApprovalParamsReceiptIncidentsDisabilityPay: Si la empresa paga los disability_days del recibo: percepción 014 con su nodo Incapacidad. Exenta como previsión social con el límite de 7 UMA al año (art. 93 de la LISR); la de un riesgo de trabajo, toda.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePayrollApprovalParamsReceiptIncidentsDisabilityPay {
    /**
     * Tipo de incapacidad (c_TipoIncapacidad): 01 riesgo de trabajo, 02 enfermedad general, 03 maternidad, 04 licencia por cuidados médicos de hijos con cáncer.
     * <p>
     * Valores: 01, 02, 03, 04.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Lo que paga la empresa de cada día de incapacidad, como fracción del salario diario: 1 todo; 0.4 lo que completa el 60% que paga el IMSS.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("rate")
    private BigDecimal rate;

    /**
     * Tipo de incapacidad (c_TipoIncapacidad): 01 riesgo de trabajo, 02 enfermedad general, 03 maternidad, 04 licencia por cuidados médicos de hijos con cáncer.
     * <p>
     * Valores: 01, 02, 03, 04.
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public CreatePayrollApprovalParamsReceiptIncidentsDisabilityPay setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Lo que paga la empresa de cada día de incapacidad, como fracción del salario diario: 1 todo; 0.4 lo que completa el 60% que paga el IMSS.
     * <p>
     * Obligatorio.
     */
    public BigDecimal getRate() {
        return rate;
    }

    public CreatePayrollApprovalParamsReceiptIncidentsDisabilityPay setRate(BigDecimal rate) {
        this.rate = rate;
        return this;
    }

    @JsonIgnore
    public CreatePayrollApprovalParamsReceiptIncidentsDisabilityPay setRate(double rate) {
        return setRate(BigDecimal.valueOf(rate));
    }
}
