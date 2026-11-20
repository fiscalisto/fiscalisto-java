// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * ConsolidatedStatementsBalanceSheetLiabilities: El pasivo: su total y sus grupos.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsolidatedStatementsBalanceSheetLiabilities {
    /**
     * Total en la moneda del comprobante (Total).
     */
    @JsonProperty("total")
    private BigDecimal total;

    /**
     * Su monto por el primer nivel del código agrupador.
     */
    @JsonProperty("groups")
    private List<ConsolidatedStatementsBalanceSheetLiabilitiesGroup> groups;

    /**
     * Total en la moneda del comprobante (Total).
     */
    public BigDecimal getTotal() {
        return total;
    }

    public ConsolidatedStatementsBalanceSheetLiabilities setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }

    @JsonIgnore
    public ConsolidatedStatementsBalanceSheetLiabilities setTotal(double total) {
        return setTotal(BigDecimal.valueOf(total));
    }

    /**
     * Su monto por el primer nivel del código agrupador.
     */
    public List<ConsolidatedStatementsBalanceSheetLiabilitiesGroup> getGroups() {
        return groups;
    }

    public ConsolidatedStatementsBalanceSheetLiabilities setGroups(List<ConsolidatedStatementsBalanceSheetLiabilitiesGroup> groups) {
        this.groups = groups;
        return this;
    }
}
