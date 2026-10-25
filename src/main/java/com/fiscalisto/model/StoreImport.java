// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * StoreImport: Los pedidos pagados que se trajeron.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StoreImport {
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
     * La conexión (stc_…).
     */
    @JsonProperty("store_connection")
    private String storeConnection;

    /**
     * Desde qué día se buscaron pedidos.
     */
    @JsonProperty("since")
    private String since;

    /**
     * Pedidos que son tickets (los que ya lo eran cuentan otra vez).
     */
    @JsonProperty("tickets")
    private Long tickets;

    /**
     * De ellos, los que se facturaron al momento con los datos del comprador.
     */
    @JsonProperty("invoiced")
    private Long invoiced;

    /**
     * Los que no se volvieron ticket, con el motivo.
     */
    @JsonProperty("skipped")
    private List<StoreImportSkippedItem> skipped;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public StoreImport setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public StoreImport setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * La conexión (stc_…).
     */
    public String getStoreConnection() {
        return storeConnection;
    }

    public StoreImport setStoreConnection(String storeConnection) {
        this.storeConnection = storeConnection;
        return this;
    }

    /**
     * Desde qué día se buscaron pedidos.
     */
    public String getSince() {
        return since;
    }

    public StoreImport setSince(String since) {
        this.since = since;
        return this;
    }

    /**
     * Pedidos que son tickets (los que ya lo eran cuentan otra vez).
     */
    public Long getTickets() {
        return tickets;
    }

    public StoreImport setTickets(Long tickets) {
        this.tickets = tickets;
        return this;
    }

    public StoreImport setTickets(long tickets) {
        return setTickets(Long.valueOf(tickets));
    }

    /**
     * De ellos, los que se facturaron al momento con los datos del comprador.
     */
    public Long getInvoiced() {
        return invoiced;
    }

    public StoreImport setInvoiced(Long invoiced) {
        this.invoiced = invoiced;
        return this;
    }

    public StoreImport setInvoiced(long invoiced) {
        return setInvoiced(Long.valueOf(invoiced));
    }

    /**
     * Los que no se volvieron ticket, con el motivo.
     */
    public List<StoreImportSkippedItem> getSkipped() {
        return skipped;
    }

    public StoreImport setSkipped(List<StoreImportSkippedItem> skipped) {
        this.skipped = skipped;
        return this;
    }
}
