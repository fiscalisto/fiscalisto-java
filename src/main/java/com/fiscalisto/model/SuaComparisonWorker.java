// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * SuaComparisonWorker: SuaComparisonWorker.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SuaComparisonWorker {
    /**
     * El NSS, 11 dígitos.
     */
    @JsonProperty("nss")
    private String nss;

    /**
     * El nombre en Fiscalisto, o null si solo está en el SUA.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Lo que dice el SUA, o null si no está en la cédula.
     */
    @JsonProperty("sua")
    private SuaComparisonWorkerSua sua;

    /**
     * Lo que calculó Fiscalisto, o null si no tiene recibos timbrados del mes.
     */
    @JsonProperty("calculated")
    private SuaComparisonWorkerCalculated calculated;

    /**
     * En qué difieren: days, sbc, amount (más de un peso), o missing si está solo en uno de los dos. Vacío si coinciden.
     */
    @JsonProperty("differs")
    private List<String> differs;

    /**
     * El NSS, 11 dígitos.
     */
    public String getNss() {
        return nss;
    }

    public SuaComparisonWorker setNss(String nss) {
        this.nss = nss;
        return this;
    }

    /**
     * El nombre en Fiscalisto, o null si solo está en el SUA.
     */
    public String getName() {
        return name;
    }

    public SuaComparisonWorker setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Lo que dice el SUA, o null si no está en la cédula.
     */
    public SuaComparisonWorkerSua getSua() {
        return sua;
    }

    public SuaComparisonWorker setSua(SuaComparisonWorkerSua sua) {
        this.sua = sua;
        return this;
    }

    /**
     * Lo que calculó Fiscalisto, o null si no tiene recibos timbrados del mes.
     */
    public SuaComparisonWorkerCalculated getCalculated() {
        return calculated;
    }

    public SuaComparisonWorker setCalculated(SuaComparisonWorkerCalculated calculated) {
        this.calculated = calculated;
        return this;
    }

    /**
     * En qué difieren: days, sbc, amount (más de un peso), o missing si está solo en uno de los dos. Vacío si coinciden.
     */
    public List<String> getDiffers() {
        return differs;
    }

    public SuaComparisonWorker setDiffers(List<String> differs) {
        this.differs = differs;
        return this;
    }
}
