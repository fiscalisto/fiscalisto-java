// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * ListPayoutsParams: los campos de «Listar pagos a proveedores».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListPayoutsParams {
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
     * Solo los que estén en este estado.
     * <p>
     * Valores: draft, pending_approval, approved, sending, paid, partially_paid, failed, canceled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Con fecha de pago desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("pay_on[gte]")
    private String payOnGte;

    /**
     * Con fecha de pago después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("pay_on[gt]")
    private String payOnGt;

    /**
     * Con fecha de pago hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("pay_on[lte]")
    private String payOnLte;

    /**
     * Con fecha de pago antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("pay_on[lt]")
    private String payOnLt;

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
     * Igual que pay_on[gte]; se conserva por compatibilidad.
     */
    @JsonProperty("pay_on_from")
    private String payOnFrom;

    /**
     * Igual que pay_on[lte]; se conserva por compatibilidad.
     */
    @JsonProperty("pay_on_to")
    private String payOnTo;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListPayoutsParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListPayoutsParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListPayoutsParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListPayoutsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Solo los que estén en este estado.
     * <p>
     * Valores: draft, pending_approval, approved, sending, paid, partially_paid, failed, canceled.
     */
    public String getStatus() {
        return status;
    }

    public ListPayoutsParams setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Con fecha de pago desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getPayOnGte() {
        return payOnGte;
    }

    public ListPayoutsParams setPayOnGte(String payOnGte) {
        this.payOnGte = payOnGte;
        return this;
    }

    /**
     * Con fecha de pago después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getPayOnGt() {
        return payOnGt;
    }

    public ListPayoutsParams setPayOnGt(String payOnGt) {
        this.payOnGt = payOnGt;
        return this;
    }

    /**
     * Con fecha de pago hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getPayOnLte() {
        return payOnLte;
    }

    public ListPayoutsParams setPayOnLte(String payOnLte) {
        this.payOnLte = payOnLte;
        return this;
    }

    /**
     * Con fecha de pago antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getPayOnLt() {
        return payOnLt;
    }

    public ListPayoutsParams setPayOnLt(String payOnLt) {
        this.payOnLt = payOnLt;
        return this;
    }

    /**
     * Creados desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedGte() {
        return createdGte;
    }

    public ListPayoutsParams setCreatedGte(String createdGte) {
        this.createdGte = createdGte;
        return this;
    }

    /**
     * Creados después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedGt() {
        return createdGt;
    }

    public ListPayoutsParams setCreatedGt(String createdGt) {
        this.createdGt = createdGt;
        return this;
    }

    /**
     * Creados hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedLte() {
        return createdLte;
    }

    public ListPayoutsParams setCreatedLte(String createdLte) {
        this.createdLte = createdLte;
        return this;
    }

    /**
     * Creados antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getCreatedLt() {
        return createdLt;
    }

    public ListPayoutsParams setCreatedLt(String createdLt) {
        this.createdLt = createdLt;
        return this;
    }

    /**
     * Solo los que tienen este valor en esta llave de su metadata: metadata[pedido]=A-1042. Hasta 10 llaves, todas deben coincidir.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public ListPayoutsParams setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Igual que pay_on[gte]; se conserva por compatibilidad.
     */
    public String getPayOnFrom() {
        return payOnFrom;
    }

    public ListPayoutsParams setPayOnFrom(String payOnFrom) {
        this.payOnFrom = payOnFrom;
        return this;
    }

    /**
     * Igual que pay_on[lte]; se conserva por compatibilidad.
     */
    public String getPayOnTo() {
        return payOnTo;
    }

    public ListPayoutsParams setPayOnTo(String payOnTo) {
        this.payOnTo = payOnTo;
        return this;
    }
}
