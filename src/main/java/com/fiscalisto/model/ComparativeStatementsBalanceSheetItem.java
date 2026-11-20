// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ComparativeStatementsBalanceSheetItem: ComparativeStatementsBalanceSheetItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ComparativeStatementsBalanceSheetItem {
    /**
     * La sección.
     * <p>
     * Valores: assets, liabilities, equity.
     */
    @JsonProperty("key")
    private String key;

    /**
     * Su nombre.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Cada grupo de cuentas.
     */
    @JsonProperty("lines")
    private List<ComparativeStatementsBalanceSheetItemLine> lines;

    /**
     * El total de la sección.
     */
    @JsonProperty("total")
    private ComparativeStatementsBalanceSheetItemTotal total;

    /**
     * La sección.
     * <p>
     * Valores: assets, liabilities, equity.
     */
    public String getKey() {
        return key;
    }

    public ComparativeStatementsBalanceSheetItem setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getName() {
        return name;
    }

    public ComparativeStatementsBalanceSheetItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Cada grupo de cuentas.
     */
    public List<ComparativeStatementsBalanceSheetItemLine> getLines() {
        return lines;
    }

    public ComparativeStatementsBalanceSheetItem setLines(List<ComparativeStatementsBalanceSheetItemLine> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * El total de la sección.
     */
    public ComparativeStatementsBalanceSheetItemTotal getTotal() {
        return total;
    }

    public ComparativeStatementsBalanceSheetItem setTotal(ComparativeStatementsBalanceSheetItemTotal total) {
        this.total = total;
        return this;
    }
}
