// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * SatListCheckList2: SatListCheckList2.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatListCheckList2 {
    /**
     * 69b: art. 69-B (operaciones simuladas). 69b_bis: art. 69-B Bis (pérdidas fiscales). 69: art. 69 (no localizados, adeudos, cancelados).
     * <p>
     * Valores: 69, 69b, 69b_bis.
     */
    @JsonProperty("list")
    private String list;

    /**
     * El archivo del SAT de donde viene (clave).
     */
    @JsonProperty("source")
    private String source;

    /**
     * El nombre del archivo del SAT, para mostrarlo.
     */
    @JsonProperty("source_name")
    private String sourceName;

    /**
     * Su situación según el SAT: Presunto, Definitivo, Desvirtuado, Sentencia favorable; en el art. 69, el supuesto (null si el archivo no la trae).
     */
    @JsonProperty("situation")
    private String situation;

    /**
     * Fecha de publicación en el SAT o en el DOF (null si no la trae).
     */
    @JsonProperty("published_on")
    private String publishedOn;

    /**
     * Lo demás que publica el SAT para ese RFC (oficios, fechas, montos), tal cual; null si nada.
     */
    @JsonProperty("details")
    private Map<String, String> details;

    /**
     * 69b: art. 69-B (operaciones simuladas). 69b_bis: art. 69-B Bis (pérdidas fiscales). 69: art. 69 (no localizados, adeudos, cancelados).
     * <p>
     * Valores: 69, 69b, 69b_bis.
     */
    public String getList() {
        return list;
    }

    public SatListCheckList2 setList(String list) {
        this.list = list;
        return this;
    }

    /**
     * El archivo del SAT de donde viene (clave).
     */
    public String getSource() {
        return source;
    }

    public SatListCheckList2 setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * El nombre del archivo del SAT, para mostrarlo.
     */
    public String getSourceName() {
        return sourceName;
    }

    public SatListCheckList2 setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }

    /**
     * Su situación según el SAT: Presunto, Definitivo, Desvirtuado, Sentencia favorable; en el art. 69, el supuesto (null si el archivo no la trae).
     */
    public String getSituation() {
        return situation;
    }

    public SatListCheckList2 setSituation(String situation) {
        this.situation = situation;
        return this;
    }

    /**
     * Fecha de publicación en el SAT o en el DOF (null si no la trae).
     */
    public String getPublishedOn() {
        return publishedOn;
    }

    public SatListCheckList2 setPublishedOn(String publishedOn) {
        this.publishedOn = publishedOn;
        return this;
    }

    /**
     * Lo demás que publica el SAT para ese RFC (oficios, fechas, montos), tal cual; null si nada.
     */
    public Map<String, String> getDetails() {
        return details;
    }

    public SatListCheckList2 setDetails(Map<String, String> details) {
        this.details = details;
        return this;
    }
}
