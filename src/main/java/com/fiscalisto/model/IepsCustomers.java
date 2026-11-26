// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.util.List;

/**
 * IepsCustomers: Los clientes a los que se les trasladó el IEPS por separado, por trimestre (artículo 19, fracción II de la Ley del IEPS).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IepsCustomers {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * false en modo de prueba.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private StringOr<Issuer> issuer;

    /**
     * El año.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * Cada trimestre pedido, también los que no tienen clientes.
     */
    @JsonProperty("quarters")
    private List<IepsCustomersQuarter> quarters;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public IepsCustomers setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * false en modo de prueba.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public IepsCustomers setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public IepsCustomers setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public IepsCustomers setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public IepsCustomers setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * El año.
     */
    public Long getYear() {
        return year;
    }

    public IepsCustomers setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public IepsCustomers setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * Cada trimestre pedido, también los que no tienen clientes.
     */
    public List<IepsCustomersQuarter> getQuarters() {
        return quarters;
    }

    public IepsCustomers setQuarters(List<IepsCustomersQuarter> quarters) {
        this.quarters = quarters;
        return this;
    }
}
