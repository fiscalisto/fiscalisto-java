// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdatePrepaidExpenseParams: los campos de «Amortizar una factura pagada por anticipado».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdatePrepaidExpenseParams {
    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Qué pagó: insurance (109.01 Seguros y fianzas), rent (109.05 Rentas) u other (109.23 Otros pagos anticipados). Sin él, el que tiene, o el que sugiere su categoría.
     * <p>
     * Valores: insurance, rent, other.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Meses que cubre, de 1 a 120: una póliza igual cada mes. Va esto o start_date y end_date.
     */
    @JsonProperty("months")
    private Long months;

    /**
     * Primer mes que cubre, AAAA-MM: el de la factura o después. Sin él, el que tiene, o el de la factura.
     */
    @JsonProperty("start_month")
    private String startMonth;

    /**
     * Por fechas: el primer día que cubre, AAAA-MM-DD (en el mes de la factura o después). Con end_date, cada mes se lleva lo de los días que cubre; start_month y months salen de las fechas.
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * Por fechas: el último día que cubre, AAAA-MM-DD, incluido (una póliza del 15 de marzo al 14 de marzo del año siguiente). Hasta 120 meses.
     */
    @JsonProperty("end_date")
    private String endDate;

    /**
     * Número de la cuenta de costos o gastos (500, 600 o 700) a la que se amortiza. Sin él, la que tiene, o la de su categoría.
     */
    @JsonProperty("expense_account")
    private String expenseAccount;

    /**
     * El emisor (iss_…). Por omisión, su único emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public UpdatePrepaidExpenseParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Qué pagó: insurance (109.01 Seguros y fianzas), rent (109.05 Rentas) u other (109.23 Otros pagos anticipados). Sin él, el que tiene, o el que sugiere su categoría.
     * <p>
     * Valores: insurance, rent, other.
     */
    public String getKind() {
        return kind;
    }

    public UpdatePrepaidExpenseParams setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Meses que cubre, de 1 a 120: una póliza igual cada mes. Va esto o start_date y end_date.
     */
    public Long getMonths() {
        return months;
    }

    public UpdatePrepaidExpenseParams setMonths(Long months) {
        this.months = months;
        return this;
    }

    @JsonIgnore
    public UpdatePrepaidExpenseParams setMonths(long months) {
        return setMonths(Long.valueOf(months));
    }

    /**
     * Primer mes que cubre, AAAA-MM: el de la factura o después. Sin él, el que tiene, o el de la factura.
     */
    public String getStartMonth() {
        return startMonth;
    }

    public UpdatePrepaidExpenseParams setStartMonth(String startMonth) {
        this.startMonth = startMonth;
        return this;
    }

    /**
     * Por fechas: el primer día que cubre, AAAA-MM-DD (en el mes de la factura o después). Con end_date, cada mes se lleva lo de los días que cubre; start_month y months salen de las fechas.
     */
    public String getStartDate() {
        return startDate;
    }

    public UpdatePrepaidExpenseParams setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Por fechas: el último día que cubre, AAAA-MM-DD, incluido (una póliza del 15 de marzo al 14 de marzo del año siguiente). Hasta 120 meses.
     */
    public String getEndDate() {
        return endDate;
    }

    public UpdatePrepaidExpenseParams setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Número de la cuenta de costos o gastos (500, 600 o 700) a la que se amortiza. Sin él, la que tiene, o la de su categoría.
     */
    public String getExpenseAccount() {
        return expenseAccount;
    }

    public UpdatePrepaidExpenseParams setExpenseAccount(String expenseAccount) {
        this.expenseAccount = expenseAccount;
        return this;
    }
}
