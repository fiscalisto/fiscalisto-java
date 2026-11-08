// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExpenseItemIssue: ExpenseItemIssue.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExpenseItemIssue {
    /**
     * error (impide enviarla), warning, policy (pasa la política) o info.
     * <p>
     * Valores: error, warning, policy, info.
     */
    @JsonProperty("level")
    private String level;

    /**
     * Qué es, como código estable.
     */
    @JsonProperty("code")
    private String code;

    /**
     * Qué es, en palabras.
     */
    @JsonProperty("message")
    private String message;

    /**
     * error (impide enviarla), warning, policy (pasa la política) o info.
     * <p>
     * Valores: error, warning, policy, info.
     */
    public String getLevel() {
        return level;
    }

    public ExpenseItemIssue setLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * Qué es, como código estable.
     */
    public String getCode() {
        return code;
    }

    public ExpenseItemIssue setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Qué es, en palabras.
     */
    public String getMessage() {
        return message;
    }

    public ExpenseItemIssue setMessage(String message) {
        this.message = message;
        return this;
    }
}
