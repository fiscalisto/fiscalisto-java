// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ErrorBodyError: Por qué el SAT o el PAC no lo aceptaron: mensaje, código del SAT y texto original.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorBodyError {
    /**
     * La familia del error: invalid_request_error, authentication_error, permission_error, not_found_error, idempotency_error, rate_limit_error, invoice_error, balance_error o api_error.
     * <p>
     * Valores: invalid_request_error, authentication_error, permission_error, not_found_error, idempotency_error, rate_limit_error, invoice_error, balance_error, api_error.
     */
    @JsonProperty("type")
    private String type;

    /**
     * La razón precisa, estable (ver Errores).
     */
    @JsonProperty("code")
    private String code;

    /**
     * Qué pasó y cómo corregirlo, para una persona.
     */
    @JsonProperty("message")
    private String message;

    /**
     * El campo con el problema (items.0.unit_price).
     */
    @JsonProperty("param")
    private String param;

    /**
     * Código del SAT o del PAC (CFDI40xxx).
     */
    @JsonProperty("sat_code")
    private String satCode;

    /**
     * Con Accept-Language: en, el mensaje original en español cuando message solo dice en inglés qué significa el código.
     */
    @JsonProperty("message_es")
    private String messageEs;

    /**
     * La explicación de este código en la documentación.
     */
    @JsonProperty("doc_url")
    private String docUrl;

    /**
     * El id de la solicitud (req_…). Inclúyalo si nos escribe.
     */
    @JsonProperty("request_id")
    private String requestId;

    /**
     * La familia del error: invalid_request_error, authentication_error, permission_error, not_found_error, idempotency_error, rate_limit_error, invoice_error, balance_error o api_error.
     * <p>
     * Valores: invalid_request_error, authentication_error, permission_error, not_found_error, idempotency_error, rate_limit_error, invoice_error, balance_error, api_error.
     */
    public String getType() {
        return type;
    }

    public ErrorBodyError setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * La razón precisa, estable (ver Errores).
     */
    public String getCode() {
        return code;
    }

    public ErrorBodyError setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Qué pasó y cómo corregirlo, para una persona.
     */
    public String getMessage() {
        return message;
    }

    public ErrorBodyError setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * El campo con el problema (items.0.unit_price).
     */
    public String getParam() {
        return param;
    }

    public ErrorBodyError setParam(String param) {
        this.param = param;
        return this;
    }

    /**
     * Código del SAT o del PAC (CFDI40xxx).
     */
    public String getSatCode() {
        return satCode;
    }

    public ErrorBodyError setSatCode(String satCode) {
        this.satCode = satCode;
        return this;
    }

    /**
     * Con Accept-Language: en, el mensaje original en español cuando message solo dice en inglés qué significa el código.
     */
    public String getMessageEs() {
        return messageEs;
    }

    public ErrorBodyError setMessageEs(String messageEs) {
        this.messageEs = messageEs;
        return this;
    }

    /**
     * La explicación de este código en la documentación.
     */
    public String getDocUrl() {
        return docUrl;
    }

    public ErrorBodyError setDocUrl(String docUrl) {
        this.docUrl = docUrl;
        return this;
    }

    /**
     * El id de la solicitud (req_…). Inclúyalo si nos escribe.
     */
    public String getRequestId() {
        return requestId;
    }

    public ErrorBodyError setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
}
