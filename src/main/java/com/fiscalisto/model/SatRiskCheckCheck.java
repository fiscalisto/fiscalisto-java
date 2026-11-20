// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SatRiskCheckCheck: SatRiskCheckCheck.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatRiskCheckCheck {
    /**
     * Qué revisa: revisiones, buzon, cruces, omisiones, opinion, listas, efos, materialidad, depositos, discrepancia o efirma.
     */
    @JsonProperty("key")
    private String key;

    /**
     * ok, warning (revisar), critical (atender ya) o unknown (Fiscalisto aún no lo lee).
     * <p>
     * Valores: ok, warning, critical, unknown.
     */
    @JsonProperty("result")
    private String result;

    /**
     * Lo que encontró, en una línea.
     */
    @JsonProperty("title")
    private String title;

    /**
     * El detalle, con cifras.
     */
    @JsonProperty("detail")
    private String detail;

    /**
     * Por qué le importa al SAT.
     */
    @JsonProperty("why")
    private String why;

    /**
     * Qué revisa: revisiones, buzon, cruces, omisiones, opinion, listas, efos, materialidad, depositos, discrepancia o efirma.
     */
    public String getKey() {
        return key;
    }

    public SatRiskCheckCheck setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * ok, warning (revisar), critical (atender ya) o unknown (Fiscalisto aún no lo lee).
     * <p>
     * Valores: ok, warning, critical, unknown.
     */
    public String getResult() {
        return result;
    }

    public SatRiskCheckCheck setResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * Lo que encontró, en una línea.
     */
    public String getTitle() {
        return title;
    }

    public SatRiskCheckCheck setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * El detalle, con cifras.
     */
    public String getDetail() {
        return detail;
    }

    public SatRiskCheckCheck setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * Por qué le importa al SAT.
     */
    public String getWhy() {
        return why;
    }

    public SatRiskCheckCheck setWhy(String why) {
        this.why = why;
        return this;
    }
}
