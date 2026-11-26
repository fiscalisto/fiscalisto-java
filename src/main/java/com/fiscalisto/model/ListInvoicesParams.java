// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * ListInvoicesParams: los campos de «Listar facturas».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListInvoicesParams {
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
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * valid, pending, canceled, rejected o processing; draft lista solo los borradores (sin él no salen). Con draft no van payment_status ni cost_center.
     * <p>
     * Valores: valid, pending, canceled, rejected, processing, draft.
     */
    @JsonProperty("status")
    private String status;

    /**
     * I, E, P, T o N.
     * <p>
     * Valores: I, E, P, T, N.
     */
    @JsonProperty("type")
    private String type;

    /**
     * RFC del cliente o su id (cus_…).
     */
    @JsonProperty("customer")
    private String customer;

    /**
     * Facturas de ingreso por lo que deben: unpaid, partial, open (unpaid o partial) o paid.
     * <p>
     * Valores: unpaid, partial, open, paid.
     */
    @JsonProperty("payment_status")
    private String paymentStatus;

    /**
     * Con fecha del CFDI desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[gte]")
    private String dateGte;

    /**
     * Con fecha del CFDI después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[gt]")
    private String dateGt;

    /**
     * Con fecha del CFDI hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[lte]")
    private String dateLte;

    /**
     * Con fecha del CFDI antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[lt]")
    private String dateLt;

    /**
     * Solo las de este centro de costo (ccn_…), o none para las que no tienen.
     */
    @JsonProperty("cost_center")
    private String costCenter;

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
     * Solo los que tienen este valor en esta llave de su metadata: metadata[pedido]=A-1042. Hasta 10 llaves, todas deben coincidir.
     */
    @JsonProperty("metadata")
    private Map<String, String> metadata;

    /**
     * Igual que created[gte]; se conserva por compatibilidad.
     */
    @JsonProperty("created_gte")
    private String createdGteValue;

    /**
     * Igual que created[lte]; se conserva por compatibilidad.
     */
    @JsonProperty("created_lte")
    private String createdLteValue;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListInvoicesParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListInvoicesParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListInvoicesParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListInvoicesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * valid, pending, canceled, rejected o processing; draft lista solo los borradores (sin él no salen). Con draft no van payment_status ni cost_center.
     * <p>
     * Valores: valid, pending, canceled, rejected, processing, draft.
     */
    public String getStatus() {
        return status;
    }

    public ListInvoicesParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * I, E, P, T o N.
     * <p>
     * Valores: I, E, P, T, N.
     */
    public String getType() {
        return type;
    }

    public ListInvoicesParams setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * RFC del cliente o su id (cus_…).
     */
    public String getCustomer() {
        return customer;
    }

    public ListInvoicesParams setCustomer(String customer) {
        this.customer = customer;
        return this;
    }

    /**
     * Facturas de ingreso por lo que deben: unpaid, partial, open (unpaid o partial) o paid.
     * <p>
     * Valores: unpaid, partial, open, paid.
     */
    public String getPaymentStatus() {
        return paymentStatus;
    }

    public ListInvoicesParams setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    /**
     * Con fecha del CFDI desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateGte() {
        return dateGte;
    }

    public ListInvoicesParams setDateGte(String dateGte) {
        this.dateGte = dateGte;
        return this;
    }

    /**
     * Con fecha del CFDI después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateGt() {
        return dateGt;
    }

    public ListInvoicesParams setDateGt(String dateGt) {
        this.dateGt = dateGt;
        return this;
    }

    /**
     * Con fecha del CFDI hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateLte() {
        return dateLte;
    }

    public ListInvoicesParams setDateLte(String dateLte) {
        this.dateLte = dateLte;
        return this;
    }

    /**
     * Con fecha del CFDI antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateLt() {
        return dateLt;
    }

    public ListInvoicesParams setDateLt(String dateLt) {
        this.dateLt = dateLt;
        return this;
    }

    /**
     * Solo las de este centro de costo (ccn_…), o none para las que no tienen.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public ListInvoicesParams setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * Creados desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedGte() {
        return createdGte;
    }

    public ListInvoicesParams setCreatedGte(String createdGte) {
        this.createdGte = createdGte;
        return this;
    }

    /**
     * Creados después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedGt() {
        return createdGt;
    }

    public ListInvoicesParams setCreatedGt(String createdGt) {
        this.createdGt = createdGt;
        return this;
    }

    /**
     * Creados hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedLte() {
        return createdLte;
    }

    public ListInvoicesParams setCreatedLte(String createdLte) {
        this.createdLte = createdLte;
        return this;
    }

    /**
     * Creados antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedLt() {
        return createdLt;
    }

    public ListInvoicesParams setCreatedLt(String createdLt) {
        this.createdLt = createdLt;
        return this;
    }

    /**
     * Solo los que tienen este valor en esta llave de su metadata: metadata[pedido]=A-1042. Hasta 10 llaves, todas deben coincidir.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public ListInvoicesParams setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Igual que created[gte]; se conserva por compatibilidad.
     */
    public String getCreatedGteValue() {
        return createdGteValue;
    }

    public ListInvoicesParams setCreatedGteValue(String createdGteValue) {
        this.createdGteValue = createdGteValue;
        return this;
    }

    /**
     * Igual que created[lte]; se conserva por compatibilidad.
     */
    public String getCreatedLteValue() {
        return createdLteValue;
    }

    public ListInvoicesParams setCreatedLteValue(String createdLteValue) {
        this.createdLteValue = createdLteValue;
        return this;
    }
}
