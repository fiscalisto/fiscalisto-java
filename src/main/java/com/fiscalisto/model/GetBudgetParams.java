// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetBudgetParams: los campos de «Ver el presupuesto de un año contra lo real».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetBudgetParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El centro de costo (ccn_…). Sin él, toda la empresa.
     */
    @JsonProperty("cost_center")
    private String costCenter;

    /**
     * El mes de la comparación, de 1 a 12. Por omisión el actual en el año en curso, 12 en uno pasado.
     */
    @JsonProperty("month")
    private Long month;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetBudgetParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El centro de costo (ccn_…). Sin él, toda la empresa.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public GetBudgetParams setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * El mes de la comparación, de 1 a 12. Por omisión el actual en el año en curso, 12 en uno pasado.
     */
    public Long getMonth() {
        return month;
    }

    public GetBudgetParams setMonth(Long month) {
        this.month = month;
        return this;
    }

    @JsonIgnore
    public GetBudgetParams setMonth(long month) {
        return setMonth(Long.valueOf(month));
    }
}
