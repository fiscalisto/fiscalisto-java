// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * EntryTemplateLinesLine: EntryTemplateLinesLine.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntryTemplateLinesLine {
    /**
     * El número de cuenta.
     */
    @JsonProperty("account")
    private String account;

    /**
     * El cargo, en pesos.
     */
    @JsonProperty("debit")
    private BigDecimal debit;

    /**
     * El abono, en pesos.
     */
    @JsonProperty("credit")
    private BigDecimal credit;

    /**
     * Su centro de costo (ccn_…): la obra, proyecto, sucursal o área a la que pertenece, para ver ingresos y gastos por centro en Reportes. No cambia el CFDI. Sus notas de crédito lo toman solas.
     */
    @JsonProperty("cost_center")
    private String costCenter;

    /**
     * El número de cuenta.
     */
    public String getAccount() {
        return account;
    }

    public EntryTemplateLinesLine setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * El cargo, en pesos.
     */
    public BigDecimal getDebit() {
        return debit;
    }

    public EntryTemplateLinesLine setDebit(BigDecimal debit) {
        this.debit = debit;
        return this;
    }

    @JsonIgnore
    public EntryTemplateLinesLine setDebit(double debit) {
        return setDebit(BigDecimal.valueOf(debit));
    }

    /**
     * El abono, en pesos.
     */
    public BigDecimal getCredit() {
        return credit;
    }

    public EntryTemplateLinesLine setCredit(BigDecimal credit) {
        this.credit = credit;
        return this;
    }

    @JsonIgnore
    public EntryTemplateLinesLine setCredit(double credit) {
        return setCredit(BigDecimal.valueOf(credit));
    }

    /**
     * Su centro de costo (ccn_…): la obra, proyecto, sucursal o área a la que pertenece, para ver ingresos y gastos por centro en Reportes. No cambia el CFDI. Sus notas de crédito lo toman solas.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public EntryTemplateLinesLine setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }
}
