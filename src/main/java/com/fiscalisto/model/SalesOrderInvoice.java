// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * SalesOrderInvoice: SalesOrderInvoice.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SalesOrderInvoice {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * stamped, o canceled (lo que llevaba se puede volver a facturar).
     * <p>
     * Valores: stamped, canceled.
     */
    @JsonProperty("status")
    private String status;

    /**
     * El total de la factura.
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Lo que falta por pagar de esa factura, o null si aún no se sabe.
     */
    @JsonProperty("balance")
    private BigDecimal balance;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public SalesOrderInvoice setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * stamped, o canceled (lo que llevaba se puede volver a facturar).
     * <p>
     * Valores: stamped, canceled.
     */
    public String getStatus() {
        return status;
    }

    public SalesOrderInvoice setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * El total de la factura.
     */
    public BigDecimal getTotal() {
        return total;
    }

    public SalesOrderInvoice setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public SalesOrderInvoice setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Lo que falta por pagar de esa factura, o null si aún no se sabe.
     */
    public BigDecimal getBalance() {
        return balance;
    }

    public SalesOrderInvoice setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    @JsonIgnore
    public SalesOrderInvoice setBalance(double balance) {
        return setBalance(BigDecimal.valueOf(balance));
    }
}
