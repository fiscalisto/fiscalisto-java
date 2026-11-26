// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetElectronicAccountingParams: los campos de «Descargar la contabilidad electrónica».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GetElectronicAccountingParams {
    /**
     * El mes (AAAA-MM), o AAAA-13 para la balanza de cierre de un ejercicio ya terminado.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("month")
    private String month;

    /**
     * Solo con AAAA-13: true (por omisión) incluye la póliza de cierre, que cancela ingresos, costos y gastos contra el resultado del ejercicio (305.01 utilidad o 305.02 pérdida); false manda los saldos de diciembre sin movimientos.
     * <p>
     * Valores: true, false.
     */
    @JsonProperty("closing_entry")
    private String closingEntry;

    /**
     * normal (BN, por omisión) o complementary (BC, con modified_on).
     * <p>
     * Valores: normal, complementary.
     */
    @JsonProperty("type")
    private String type;

    /**
     * complementary: el día en que se modificó (AAAA-MM-DD).
     */
    @JsonProperty("modified_on")
    private String modifiedOn;

    /**
     * Para incluir las pólizas: AF acto de fiscalización, FC fiscalización compulsa (con order_number), DE devolución o CO compensación (con procedure_number).
     * <p>
     * Valores: AF, FC, DE, CO.
     */
    @JsonProperty("journal_request")
    private String journalRequest;

    /**
     * AF y FC: el número de orden (ABC1234567/26).
     */
    @JsonProperty("order_number")
    private String orderNumber;

    /**
     * DE y CO: el número de trámite (AB123456789012).
     */
    @JsonProperty("procedure_number")
    private String procedureNumber;

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El mes (AAAA-MM), o AAAA-13 para la balanza de cierre de un ejercicio ya terminado.
     * <p>
     * Obligatorio.
     */
    public String getMonth() {
        return month;
    }

    public GetElectronicAccountingParams setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Solo con AAAA-13: true (por omisión) incluye la póliza de cierre, que cancela ingresos, costos y gastos contra el resultado del ejercicio (305.01 utilidad o 305.02 pérdida); false manda los saldos de diciembre sin movimientos.
     * <p>
     * Valores: true, false.
     */
    public String getClosingEntry() {
        return closingEntry;
    }

    public GetElectronicAccountingParams setClosingEntry(String closingEntry) {
        this.closingEntry = closingEntry;
        return this;
    }

    /**
     * normal (BN, por omisión) o complementary (BC, con modified_on).
     * <p>
     * Valores: normal, complementary.
     */
    public String getType() {
        return type;
    }

    public GetElectronicAccountingParams setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * complementary: el día en que se modificó (AAAA-MM-DD).
     */
    public String getModifiedOn() {
        return modifiedOn;
    }

    public GetElectronicAccountingParams setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn;
        return this;
    }

    /**
     * Para incluir las pólizas: AF acto de fiscalización, FC fiscalización compulsa (con order_number), DE devolución o CO compensación (con procedure_number).
     * <p>
     * Valores: AF, FC, DE, CO.
     */
    public String getJournalRequest() {
        return journalRequest;
    }

    public GetElectronicAccountingParams setJournalRequest(String journalRequest) {
        this.journalRequest = journalRequest;
        return this;
    }

    /**
     * AF y FC: el número de orden (ABC1234567/26).
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    public GetElectronicAccountingParams setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     * DE y CO: el número de trámite (AB123456789012).
     */
    public String getProcedureNumber() {
        return procedureNumber;
    }

    public GetElectronicAccountingParams setProcedureNumber(String procedureNumber) {
        this.procedureNumber = procedureNumber;
        return this;
    }

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public GetElectronicAccountingParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
}
