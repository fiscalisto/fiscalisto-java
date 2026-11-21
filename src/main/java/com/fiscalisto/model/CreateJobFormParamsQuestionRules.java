// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 * CreateJobFormParamsQuestionRules: Lo que se revisa de la respuesta: largo y formato (any, digits, alnum) de un texto, mínimo, máximo y enteros de un número, qué fechas, y el ejemplo dentro de la caja vacía.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateJobFormParamsQuestionRules {
    /**
     * Texto: cuántos caracteres como mínimo.
     */
    @JsonProperty("min_length")
    private Long minLength;

    /**
     * Texto: cuántos caracteres como máximo.
     */
    @JsonProperty("max_length")
    private Long maxLength;

    /**
     * Texto: any (cualquiera), digits (solo números) o alnum (letras y números).
     * <p>
     * Valores: any, digits, alnum.
     */
    @JsonProperty("format")
    private String format;

    /**
     * Número: el más chico.
     */
    @JsonProperty("min")
    private BigDecimal min;

    /**
     * Número: el más grande.
     */
    @JsonProperty("max")
    private BigDecimal max;

    /**
     * Número: sin decimales.
     */
    @JsonProperty("integer")
    private Boolean integer;

    /**
     * Fecha: any, past (pasada; con days, no más vieja que esos días), future (futura; con days, al menos a esos días) o between (entre from y to).
     * <p>
     * Valores: any, past, future, between.
     */
    @JsonProperty("dates")
    private String dates;

    /**
     * Fecha: los días de past o future.
     */
    @JsonProperty("days")
    private Long days;

    /**
     * Fecha: desde (YYYY-MM-DD), con between.
     */
    @JsonProperty("from")
    private String from;

    /**
     * Fecha: hasta (YYYY-MM-DD), con between.
     */
    @JsonProperty("to")
    private String to;

    /**
     * El ejemplo que se ve dentro de la caja vacía.
     */
    @JsonProperty("example")
    private String example;

    /**
     * Texto: cuántos caracteres como mínimo.
     */
    public Long getMinLength() {
        return minLength;
    }

    public CreateJobFormParamsQuestionRules setMinLength(Long minLength) {
        this.minLength = minLength;
        return this;
    }

    @JsonIgnore
    public CreateJobFormParamsQuestionRules setMinLength(long minLength) {
        return setMinLength(Long.valueOf(minLength));
    }

    /**
     * Texto: cuántos caracteres como máximo.
     */
    public Long getMaxLength() {
        return maxLength;
    }

    public CreateJobFormParamsQuestionRules setMaxLength(Long maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    @JsonIgnore
    public CreateJobFormParamsQuestionRules setMaxLength(long maxLength) {
        return setMaxLength(Long.valueOf(maxLength));
    }

    /**
     * Texto: any (cualquiera), digits (solo números) o alnum (letras y números).
     * <p>
     * Valores: any, digits, alnum.
     */
    public String getFormat() {
        return format;
    }

    public CreateJobFormParamsQuestionRules setFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * Número: el más chico.
     */
    public BigDecimal getMin() {
        return min;
    }

    public CreateJobFormParamsQuestionRules setMin(BigDecimal min) {
        this.min = min;
        return this;
    }

    @JsonIgnore
    public CreateJobFormParamsQuestionRules setMin(double min) {
        return setMin(BigDecimal.valueOf(min));
    }

    /**
     * Número: el más grande.
     */
    public BigDecimal getMax() {
        return max;
    }

    public CreateJobFormParamsQuestionRules setMax(BigDecimal max) {
        this.max = max;
        return this;
    }

    @JsonIgnore
    public CreateJobFormParamsQuestionRules setMax(double max) {
        return setMax(BigDecimal.valueOf(max));
    }

    /**
     * Número: sin decimales.
     */
    public Boolean getInteger() {
        return integer;
    }

    public CreateJobFormParamsQuestionRules setInteger(Boolean integer) {
        this.integer = integer;
        return this;
    }

    /**
     * Fecha: any, past (pasada; con days, no más vieja que esos días), future (futura; con days, al menos a esos días) o between (entre from y to).
     * <p>
     * Valores: any, past, future, between.
     */
    public String getDates() {
        return dates;
    }

    public CreateJobFormParamsQuestionRules setDates(String dates) {
        this.dates = dates;
        return this;
    }

    /**
     * Fecha: los días de past o future.
     */
    public Long getDays() {
        return days;
    }

    public CreateJobFormParamsQuestionRules setDays(Long days) {
        this.days = days;
        return this;
    }

    @JsonIgnore
    public CreateJobFormParamsQuestionRules setDays(long days) {
        return setDays(Long.valueOf(days));
    }

    /**
     * Fecha: desde (YYYY-MM-DD), con between.
     */
    public String getFrom() {
        return from;
    }

    public CreateJobFormParamsQuestionRules setFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * Fecha: hasta (YYYY-MM-DD), con between.
     */
    public String getTo() {
        return to;
    }

    public CreateJobFormParamsQuestionRules setTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * El ejemplo que se ve dentro de la caja vacía.
     */
    public String getExample() {
        return example;
    }

    public CreateJobFormParamsQuestionRules setExample(String example) {
        this.example = example;
        return this;
    }
}
