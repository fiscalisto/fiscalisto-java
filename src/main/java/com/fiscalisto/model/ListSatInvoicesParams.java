// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListSatInvoicesParams: los campos de «Listar facturas del SAT».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListSatInvoicesParams {
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
     * received (por omisión) o issued.
     * <p>
     * Valores: received, issued.
     */
    @JsonProperty("direction")
    private String direction;

    /**
     * I, E, P, T o N.
     * <p>
     * Valores: I, E, P, T, N.
     */
    @JsonProperty("type")
    private String type;

    /**
     * El RFC de quien la emitió (recibidas) o de quien la recibió (emitidas).
     */
    @JsonProperty("counterparty_tax_id")
    private String counterpartyTaxId;

    /**
     * Con fecha desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[gte]")
    private String dateGte;

    /**
     * Con fecha después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[gt]")
    private String dateGt;

    /**
     * Con fecha hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[lte]")
    private String dateLte;

    /**
     * Con fecha antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    @JsonProperty("date[lt]")
    private String dateLt;

    /**
     * Solo las de este centro de costo (ccn_…), o none para las que no tienen.
     */
    @JsonProperty("cost_center")
    private String costCenter;

    /**
     * Solo las que llevan esta etiqueta (tag_…).
     */
    @JsonProperty("tag")
    private String tag;

    /**
     * Solo las PUE recibidas en efectivo que la empresa pide confirmar: pending (nadie ha anotado de dónde salió el dinero) o confirmed.
     * <p>
     * Valores: pending, confirmed.
     */
    @JsonProperty("cash_confirmation")
    private String cashConfirmation;

    /**
     * Igual que date[gte]; se conserva por compatibilidad.
     */
    @JsonProperty("date_gte")
    private String dateGteValue;

    /**
     * Igual que date[lte]; se conserva por compatibilidad.
     */
    @JsonProperty("date_lte")
    private String dateLteValue;

    /**
     * Cuántos por página, de 1 a 100. Por omisión 10.
     */
    public Long getLimit() {
        return limit;
    }

    public ListSatInvoicesParams setLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    @JsonIgnore
    public ListSatInvoicesParams setLimit(long limit) {
        return setLimit(Long.valueOf(limit));
    }

    /**
     * El id del último de la página anterior, para la siguiente.
     */
    public String getStartingAfter() {
        return startingAfter;
    }

    public ListSatInvoicesParams setStartingAfter(String startingAfter) {
        this.startingAfter = startingAfter;
        return this;
    }

    /**
     * Solo los de este emisor (iss_…). Sin él, los de todos los emisores que la llave puede usar, emisor por emisor (cada objeto dice el suyo en issuer); con más de 25, mándelo.
     */
    public String getIssuer() {
        return issuer;
    }

    public ListSatInvoicesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * received (por omisión) o issued.
     * <p>
     * Valores: received, issued.
     */
    public String getDirection() {
        return direction;
    }

    public ListSatInvoicesParams setDirection(String direction) {
        this.direction = direction;
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

    public ListSatInvoicesParams setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * El RFC de quien la emitió (recibidas) o de quien la recibió (emitidas).
     */
    public String getCounterpartyTaxId() {
        return counterpartyTaxId;
    }

    public ListSatInvoicesParams setCounterpartyTaxId(String counterpartyTaxId) {
        this.counterpartyTaxId = counterpartyTaxId;
        return this;
    }

    /**
     * Con fecha desde, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateGte() {
        return dateGte;
    }

    public ListSatInvoicesParams setDateGte(String dateGte) {
        this.dateGte = dateGte;
        return this;
    }

    /**
     * Con fecha después de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateGt() {
        return dateGt;
    }

    public ListSatInvoicesParams setDateGt(String dateGt) {
        this.dateGt = dateGt;
        return this;
    }

    /**
     * Con fecha hasta, incluido. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateLte() {
        return dateLte;
    }

    public ListSatInvoicesParams setDateLte(String dateLte) {
        this.dateLte = dateLte;
        return this;
    }

    /**
     * Con fecha antes de, sin incluirlo. Una fecha ISO 8601: un día (2026-10-01) es ese día en hora de la Ciudad de México; con hora (2026-10-01T09:00:00-06:00), ese segundo.
     */
    public String getDateLt() {
        return dateLt;
    }

    public ListSatInvoicesParams setDateLt(String dateLt) {
        this.dateLt = dateLt;
        return this;
    }

    /**
     * Solo las de este centro de costo (ccn_…), o none para las que no tienen.
     */
    public String getCostCenter() {
        return costCenter;
    }

    public ListSatInvoicesParams setCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * Solo las que llevan esta etiqueta (tag_…).
     */
    public String getTag() {
        return tag;
    }

    public ListSatInvoicesParams setTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Solo las PUE recibidas en efectivo que la empresa pide confirmar: pending (nadie ha anotado de dónde salió el dinero) o confirmed.
     * <p>
     * Valores: pending, confirmed.
     */
    public String getCashConfirmation() {
        return cashConfirmation;
    }

    public ListSatInvoicesParams setCashConfirmation(String cashConfirmation) {
        this.cashConfirmation = cashConfirmation;
        return this;
    }

    /**
     * Igual que date[gte]; se conserva por compatibilidad.
     */
    public String getDateGteValue() {
        return dateGteValue;
    }

    public ListSatInvoicesParams setDateGteValue(String dateGteValue) {
        this.dateGteValue = dateGteValue;
        return this;
    }

    /**
     * Igual que date[lte]; se conserva por compatibilidad.
     */
    public String getDateLteValue() {
        return dateLteValue;
    }

    public ListSatInvoicesParams setDateLteValue(String dateLteValue) {
        this.dateLteValue = dateLteValue;
        return this;
    }
}
