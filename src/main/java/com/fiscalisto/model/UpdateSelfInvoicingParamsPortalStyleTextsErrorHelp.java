// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParamsPortalStyleTextsErrorHelp: UpdateSelfInvoicingParamsPortalStyleTextsErrorHelp.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsPortalStyleTextsErrorHelp {
    /**
     * Lo que dice el portal antes de su correo y teléfono cuando no se pudo facturar («¿Sigue con problemas?») en español.
     */
    @JsonProperty("es")
    private String es;

    /**
     * Lo que dice el portal antes de su correo y teléfono cuando no se pudo facturar («¿Sigue con problemas?») en inglés.
     */
    @JsonProperty("en")
    private String en;

    /**
     * Lo que dice el portal antes de su correo y teléfono cuando no se pudo facturar («¿Sigue con problemas?») en español.
     */
    public String getEs() {
        return es;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsErrorHelp setEs(String es) {
        this.es = es;
        return this;
    }

    /**
     * Lo que dice el portal antes de su correo y teléfono cuando no se pudo facturar («¿Sigue con problemas?») en inglés.
     */
    public String getEn() {
        return en;
    }

    public UpdateSelfInvoicingParamsPortalStyleTextsErrorHelp setEn(String en) {
        this.en = en;
        return this;
    }
}
