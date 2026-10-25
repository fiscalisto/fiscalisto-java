// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateQuoteParamsItemUsedVehicleCustom: CreateQuoteParamsItemUsedVehicleCustom.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateQuoteParamsItemUsedVehicleCustom {
    /**
     * Número del documento de importación (numero).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("number")
    private String number;

    /**
     * Fecha del documento (fecha), AAAA-MM-DD.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("date")
    private String date;

    /**
     * Aduana (aduana).
     */
    @JsonProperty("office")
    private String office;

    /**
     * Número del documento de importación (numero).
     * <p>
     * Obligatorio.
     */
    public String getNumber() {
        return number;
    }

    public CreateQuoteParamsItemUsedVehicleCustom setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Fecha del documento (fecha), AAAA-MM-DD.
     * <p>
     * Obligatorio.
     */
    public String getDate() {
        return date;
    }

    public CreateQuoteParamsItemUsedVehicleCustom setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Aduana (aduana).
     */
    public String getOffice() {
        return office;
    }

    public CreateQuoteParamsItemUsedVehicleCustom setOffice(String office) {
        this.office = office;
        return this;
    }
}
