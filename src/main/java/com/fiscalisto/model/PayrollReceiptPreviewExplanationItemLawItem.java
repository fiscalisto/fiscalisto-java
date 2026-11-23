// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PayrollReceiptPreviewExplanationItemLawItem: PayrollReceiptPreviewExplanationItemLawItem.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayrollReceiptPreviewExplanationItemLawItem {
    /**
     * Ley y artículo: «LISR art. 96», «LSS art. 147».
     */
    @JsonProperty("ref")
    private String ref;

    /**
     * Lo que dice que importa aquí.
     */
    @JsonProperty("says")
    private String says;

    /**
     * Ley y artículo: «LISR art. 96», «LSS art. 147».
     */
    public String getRef() {
        return ref;
    }

    public PayrollReceiptPreviewExplanationItemLawItem setRef(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * Lo que dice que importa aquí.
     */
    public String getSays() {
        return says;
    }

    public PayrollReceiptPreviewExplanationItemLawItem setSays(String says) {
        this.says = says;
        return this;
    }
}
