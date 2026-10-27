// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateRetentionParamsTrust: Complemento de fideicomisos que no realizan actividades empresariales (Fideicomisonoempresarial 1.0), obligatorio con code 21.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsTrust {
    /**
     * Ingresos o entradas del fideicomiso en el periodo (IngresosOEntradas) y la parte del receptor.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("income")
    private CreateRetentionParamsTrustIncome income;

    /**
     * Deducciones o salidas del fideicomiso en el periodo (DeduccOSalidas) y la parte del receptor.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("deductions")
    private CreateRetentionParamsTrustDeductions deductions;

    /**
     * Retención efectuada al fideicomiso (RetEfectFideicomiso).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("withholding")
    private CreateRetentionParamsTrustWithholding withholding;

    /**
     * Ingresos o entradas del fideicomiso en el periodo (IngresosOEntradas) y la parte del receptor.
     * <p>
     * Obligatorio.
     */
    public CreateRetentionParamsTrustIncome getIncome() {
        return income;
    }

    public CreateRetentionParamsTrust setIncome(CreateRetentionParamsTrustIncome income) {
        this.income = income;
        return this;
    }

    /**
     * Deducciones o salidas del fideicomiso en el periodo (DeduccOSalidas) y la parte del receptor.
     * <p>
     * Obligatorio.
     */
    public CreateRetentionParamsTrustDeductions getDeductions() {
        return deductions;
    }

    public CreateRetentionParamsTrust setDeductions(CreateRetentionParamsTrustDeductions deductions) {
        this.deductions = deductions;
        return this;
    }

    /**
     * Retención efectuada al fideicomiso (RetEfectFideicomiso).
     * <p>
     * Obligatorio.
     */
    public CreateRetentionParamsTrustWithholding getWithholding() {
        return withholding;
    }

    public CreateRetentionParamsTrust setWithholding(CreateRetentionParamsTrustWithholding withholding) {
        this.withholding = withholding;
        return this;
    }
}
