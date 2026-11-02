// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreateImssFilesParams: los campos de «Archivos para IDSE o SUA».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateImssFilesParams {
    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * idse: los archivos de IDSE (uno por tipo: reingresos, modificaciones, bajas); sua: ASEG.TXT (altas) y MOVT.TXT (los demás) para importar en SUA.
     * <p>
     * Valores: idse, sua.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("format")
    private String format;

    /**
     * Los movimientos (imv_…) pendientes que van en los archivos. Por omisión, todos los pendientes.
     */
    @JsonProperty("movements")
    private List<String> movements;

    /**
     * IDSE: la guía de 5 dígitos de su subdelegación. Por omisión, la que se guardó en la app.
     */
    @JsonProperty("guide")
    private String guide;

    /**
     * Emisor (iss_…). Si la llave tiene un solo emisor o la cuenta tiene uno solo, puede omitirse.
     */
    public String getIssuer() {
        return issuer;
    }

    public CreateImssFilesParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * idse: los archivos de IDSE (uno por tipo: reingresos, modificaciones, bajas); sua: ASEG.TXT (altas) y MOVT.TXT (los demás) para importar en SUA.
     * <p>
     * Valores: idse, sua.
     * <p>
     * Obligatorio.
     */
    public String getFormat() {
        return format;
    }

    public CreateImssFilesParams setFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * Los movimientos (imv_…) pendientes que van en los archivos. Por omisión, todos los pendientes.
     */
    public List<String> getMovements() {
        return movements;
    }

    public CreateImssFilesParams setMovements(List<String> movements) {
        this.movements = movements;
        return this;
    }

    /**
     * IDSE: la guía de 5 dígitos de su subdelegación. Por omisión, la que se guardó en la app.
     */
    public String getGuide() {
        return guide;
    }

    public CreateImssFilesParams setGuide(String guide) {
        this.guide = guide;
        return this;
    }
}
