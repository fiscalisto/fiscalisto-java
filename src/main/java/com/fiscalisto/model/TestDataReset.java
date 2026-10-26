// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TestDataReset: Lo que se borró (y se creó) al reiniciar los datos de prueba.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestDataReset {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Cuántos emisores de pruebas se vaciaron (archivados incluidos).
     */
    @JsonProperty("issuers")
    private Long issuers;

    /**
     * Cuántos registros se borraron: facturas, clientes, productos, lotes, ligas, descargas…
     */
    @JsonProperty("deleted_rows")
    private Long deletedRows;

    /**
     * Cuántos eventos de pruebas se borraron (con sus entregas).
     */
    @JsonProperty("deleted_events")
    private Long deletedEvents;

    /**
     * Clientes de ejemplo creados (con seed).
     */
    @JsonProperty("customers_created")
    private Long customersCreated;

    /**
     * Productos de ejemplo creados (con seed).
     */
    @JsonProperty("products_created")
    private Long productsCreated;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public TestDataReset setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public TestDataReset setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Cuántos emisores de pruebas se vaciaron (archivados incluidos).
     */
    public Long getIssuers() {
        return issuers;
    }

    public TestDataReset setIssuers(Long issuers) {
        this.issuers = issuers;
        return this;
    }

    @JsonIgnore
    public TestDataReset setIssuers(long issuers) {
        return setIssuers(Long.valueOf(issuers));
    }

    /**
     * Cuántos registros se borraron: facturas, clientes, productos, lotes, ligas, descargas…
     */
    public Long getDeletedRows() {
        return deletedRows;
    }

    public TestDataReset setDeletedRows(Long deletedRows) {
        this.deletedRows = deletedRows;
        return this;
    }

    @JsonIgnore
    public TestDataReset setDeletedRows(long deletedRows) {
        return setDeletedRows(Long.valueOf(deletedRows));
    }

    /**
     * Cuántos eventos de pruebas se borraron (con sus entregas).
     */
    public Long getDeletedEvents() {
        return deletedEvents;
    }

    public TestDataReset setDeletedEvents(Long deletedEvents) {
        this.deletedEvents = deletedEvents;
        return this;
    }

    @JsonIgnore
    public TestDataReset setDeletedEvents(long deletedEvents) {
        return setDeletedEvents(Long.valueOf(deletedEvents));
    }

    /**
     * Clientes de ejemplo creados (con seed).
     */
    public Long getCustomersCreated() {
        return customersCreated;
    }

    public TestDataReset setCustomersCreated(Long customersCreated) {
        this.customersCreated = customersCreated;
        return this;
    }

    @JsonIgnore
    public TestDataReset setCustomersCreated(long customersCreated) {
        return setCustomersCreated(Long.valueOf(customersCreated));
    }

    /**
     * Productos de ejemplo creados (con seed).
     */
    public Long getProductsCreated() {
        return productsCreated;
    }

    public TestDataReset setProductsCreated(Long productsCreated) {
        this.productsCreated = productsCreated;
        return this;
    }

    @JsonIgnore
    public TestDataReset setProductsCreated(long productsCreated) {
        return setProductsCreated(Long.valueOf(productsCreated));
    }
}
