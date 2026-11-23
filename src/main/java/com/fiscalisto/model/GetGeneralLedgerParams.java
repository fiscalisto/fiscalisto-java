// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetGeneralLedgerParams: los campos de «Ver el auxiliar de cuentas».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetGeneralLedgerParams {
    /**
     * El primer mes (AAAA-MM).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("from_month")
    private String fromMonth;

    /**
     * El último mes (AAAA-MM), hasta 12 meses después; por omisión, from_month.
     */
    @JsonProperty("to_month")
    private String toMonth;

    /**
     * Solo esta cuenta, por su número en el catálogo.
     */
    @JsonProperty("account")
    private String account;

    /**
     * Solo las cuentas de este código agrupador del SAT (102 trae 102.01, 102.02…), como el renglón de un estado financiero. Con account no se usa.
     */
    @JsonProperty("grouping_code")
    private String groupingCode;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El primer mes (AAAA-MM).
     * <p>
     * Obligatorio.
     */
    public String getFromMonth() {
        return fromMonth;
    }

    public GetGeneralLedgerParams setFromMonth(String fromMonth) {
        this.fromMonth = fromMonth;
        return this;
    }

    /**
     * El último mes (AAAA-MM), hasta 12 meses después; por omisión, from_month.
     */
    public String getToMonth() {
        return toMonth;
    }

    public GetGeneralLedgerParams setToMonth(String toMonth) {
        this.toMonth = toMonth;
        return this;
    }

    /**
     * Solo esta cuenta, por su número en el catálogo.
     */
    public String getAccount() {
        return account;
    }

    public GetGeneralLedgerParams setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * Solo las cuentas de este código agrupador del SAT (102 trae 102.01, 102.02…), como el renglón de un estado financiero. Con account no se usa.
     */
    public String getGroupingCode() {
        return groupingCode;
    }

    public GetGeneralLedgerParams setGroupingCode(String groupingCode) {
        this.groupingCode = groupingCode;
        return this;
    }

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetGeneralLedgerParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
