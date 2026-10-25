// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Map;

/**
 * CreatePayrollReceiptParams: los campos de «Timbrar un recibo de nómina».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatePayrollReceiptParams {
    /**
     * El empleado (emp_…).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Periodo (Periodo): mes inicial, mes final y año.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("period")
    private CreatePayrollReceiptParamsPeriod period;

    /**
     * Días pagados (NumDiasPagados). Por omisión, todos los del periodo que le tocan.
     */
    @JsonProperty("days")
    private BigDecimal days;

    /**
     * true para mandar el PDF y el XML por correo al timbrar, con el diseño de Fiscalisto. Por omisión no se envía.
     */
    @JsonProperty("send_email")
    private Boolean sendEmail;

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * El empleado (emp_…).
     * <p>
     * Obligatorio.
     */
    public String getEmployee() {
        return employee;
    }

    public CreatePayrollReceiptParams setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Periodo (Periodo): mes inicial, mes final y año.
     * <p>
     * Obligatorio.
     */
    public CreatePayrollReceiptParamsPeriod getPeriod() {
        return period;
    }

    public CreatePayrollReceiptParams setPeriod(CreatePayrollReceiptParamsPeriod period) {
        this.period = period;
        return this;
    }

    /**
     * Días pagados (NumDiasPagados). Por omisión, todos los del periodo que le tocan.
     */
    public BigDecimal getDays() {
        return days;
    }

    public CreatePayrollReceiptParams setDays(BigDecimal days) {
        this.days = days;
        return this;
    }

    public CreatePayrollReceiptParams setDays(double days) {
        return setDays(BigDecimal.valueOf(days));
    }

    /**
     * true para mandar el PDF y el XML por correo al timbrar, con el diseño de Fiscalisto. Por omisión no se envía.
     */
    public Boolean getSendEmail() {
        return sendEmail;
    }

    public CreatePayrollReceiptParams setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
        return this;
    }

    /**
     * Sus propios datos: hasta 50 llaves de 40 caracteres con valores de texto de hasta 500. No van al CFDI; vuelven en el objeto y en los webhooks.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public CreatePayrollReceiptParams setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
