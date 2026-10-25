// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * Diot: La DIOT de un mes: lo pagado a cada proveedor, por tipo de operación.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Diot {
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
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El mes (AAAA-MM).
     */
    @JsonProperty("month")
    private String month;

    /**
     * La proporción de IVA acreditable del mes para gastos comunes (1 si no la aplica).
     */
    @JsonProperty("proportion")
    private BigDecimal proportion;

    /**
     * Una línea por proveedor y tipo de operación, con lo pagado en el mes.
     */
    @JsonProperty("lines")
    private List<DiotLine> lines;

    /**
     * Lo que conviene revisar antes de presentarla.
     */
    @JsonProperty("warnings")
    private List<String> warnings;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public Diot setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public Diot setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public Diot setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El mes (AAAA-MM).
     */
    public String getMonth() {
        return month;
    }

    public Diot setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * La proporción de IVA acreditable del mes para gastos comunes (1 si no la aplica).
     */
    public BigDecimal getProportion() {
        return proportion;
    }

    public Diot setProportion(BigDecimal proportion) {
        this.proportion = proportion;
        return this;
    }

    public Diot setProportion(double proportion) {
        return setProportion(BigDecimal.valueOf(proportion));
    }

    /**
     * Una línea por proveedor y tipo de operación, con lo pagado en el mes.
     */
    public List<DiotLine> getLines() {
        return lines;
    }

    public Diot setLines(List<DiotLine> lines) {
        this.lines = lines;
        return this;
    }

    /**
     * Lo que conviene revisar antes de presentarla.
     */
    public List<String> getWarnings() {
        return warnings;
    }

    public Diot setWarnings(List<String> warnings) {
        this.warnings = warnings;
        return this;
    }
}
