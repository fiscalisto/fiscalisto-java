// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListFindingsParams: los campos de «Listar hallazgos».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListFindingsParams {
    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    @JsonProperty("limit")
    private Long limit;

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    @JsonProperty("starting_after")
    private String startingAfter;

    /**
     * Solo los de un área: purchase_orders, payouts, suppliers, accounting, bank, expense_reports, purchase_receipts, inventory, customers o payroll.
     * <p>
     * Valores: purchase_orders, payouts, suppliers, accounting, bank, expense_reports, purchase_receipts, inventory, customers, payroll.
     */
    @JsonProperty("area")
    private String area;

    /**
     * open (por omisión: sin revisar), reviewed (revisados), resolved (ya no aplican) o all.
     * <p>
     * Valores: open, reviewed, resolved, all.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Solo los de esta gravedad: critical, warning o info.
     * <p>
     * Valores: critical, warning, info.
     */
    @JsonProperty("severity")
    private String severity;

    /**
     * Solo este tipo de hallazgo (oc_factura_distinta…).
     */
    @JsonProperty("code")
    private String code;

    /**
     * Solo los de este proveedor (su RFC).
     */
    @JsonProperty("counterparty_tax_id")
    private String counterpartyTaxId;

    /**
     * Creados desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("created[gte]")
    private String createdGte;

    /**
     * Creados después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("created[gt]")
    private String createdGt;

    /**
     * Creados hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("created[lte]")
    private String createdLte;

    /**
     * Creados antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("created[lt]")
    private String createdLt;

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListFindingsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListFindingsParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListFindingsParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListFindingsParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * Solo los de un área: purchase_orders, payouts, suppliers, accounting, bank, expense_reports, purchase_receipts, inventory, customers o payroll.
     * <p>
     * Valores: purchase_orders, payouts, suppliers, accounting, bank, expense_reports, purchase_receipts, inventory, customers, payroll.
     */
    public String getArea() {
        return area;
    }

    public ListFindingsParams setArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * open (por omisión: sin revisar), reviewed (revisados), resolved (ya no aplican) o all.
     * <p>
     * Valores: open, reviewed, resolved, all.
     */
    public String getStatus() {
        return status;
    }

    public ListFindingsParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Solo los de esta gravedad: critical, warning o info.
     * <p>
     * Valores: critical, warning, info.
     */
    public String getSeverity() {
        return severity;
    }

    public ListFindingsParams setSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Solo este tipo de hallazgo (oc_factura_distinta…).
     */
    public String getCode() {
        return code;
    }

    public ListFindingsParams setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Solo los de este proveedor (su RFC).
     */
    public String getCounterpartyTaxId() {
        return counterpartyTaxId;
    }

    public ListFindingsParams setCounterpartyTaxId(String counterpartyTaxId) {
        this.counterpartyTaxId = counterpartyTaxId;
        return this;
    }

    /**
     * Creados desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedGte() {
        return createdGte;
    }

    public ListFindingsParams setCreatedGte(String createdGte) {
        this.createdGte = createdGte;
        return this;
    }

    /**
     * Creados después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedGt() {
        return createdGt;
    }

    public ListFindingsParams setCreatedGt(String createdGt) {
        this.createdGt = createdGt;
        return this;
    }

    /**
     * Creados hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedLte() {
        return createdLte;
    }

    public ListFindingsParams setCreatedLte(String createdLte) {
        this.createdLte = createdLte;
        return this;
    }

    /**
     * Creados antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedLt() {
        return createdLt;
    }

    public ListFindingsParams setCreatedLt(String createdLt) {
        this.createdLt = createdLt;
        return this;
    }
}
