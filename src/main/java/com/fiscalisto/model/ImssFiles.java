// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * ImssFiles: Los archivos para presentar movimientos en IDSE o importarlos en SUA.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImssFiles {
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
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * idse o sua.
     * <p>
     * Valores: idse, sua.
     */
    @JsonProperty("format")
    private String format;

    /**
     * Los archivos: en IDSE uno por tipo de movimiento; en SUA ASEG.TXT y MOVT.TXT.
     */
    @JsonProperty("files")
    private List<ImssFilesFile> files;

    /**
     * Los movimientos que van en los archivos.
     */
    @JsonProperty("movements")
    private List<String> movements;

    /**
     * Los que se quedaron fuera y por qué (un NSS inválido…).
     */
    @JsonProperty("refused")
    private List<ImssFilesRefusedItem> refused;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ImssFiles setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public ImssFiles setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public String getIssuer() {
        return issuer;
    }

    public ImssFiles setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * idse o sua.
     * <p>
     * Valores: idse, sua.
     */
    public String getFormat() {
        return format;
    }

    public ImssFiles setFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * Los archivos: en IDSE uno por tipo de movimiento; en SUA ASEG.TXT y MOVT.TXT.
     */
    public List<ImssFilesFile> getFiles() {
        return files;
    }

    public ImssFiles setFiles(List<ImssFilesFile> files) {
        this.files = files;
        return this;
    }

    /**
     * Los movimientos que van en los archivos.
     */
    public List<String> getMovements() {
        return movements;
    }

    public ImssFiles setMovements(List<String> movements) {
        this.movements = movements;
        return this;
    }

    /**
     * Los que se quedaron fuera y por qué (un NSS inválido…).
     */
    public List<ImssFilesRefusedItem> getRefused() {
        return refused;
    }

    public ImssFiles setRefused(List<ImssFilesRefusedItem> refused) {
        this.refused = refused;
        return this;
    }
}
