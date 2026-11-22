// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PostBankMovementParams: los campos de «Registrar un movimiento de banco».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostBankMovementParams {
    /**
     * El número de la cuenta del catálogo que va contra Bancos (GET /v1/accounting/accounts).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("account")
    private String account;

    /**
     * El concepto de la póliza. Sin él, el texto del banco.
     */
    @JsonProperty("description")
    private String description;

    /**
     * Crear (o cambiar) la regla de bank.movement que registra en esta cuenta los movimientos con el mismo texto del banco al importar el siguiente estado de cuenta (Ajustes › Reglas).
     */
    @JsonProperty("remember")
    private Boolean remember;

    /**
     * El número de la cuenta del catálogo que va contra Bancos (GET /v1/accounting/accounts).
     * <p>
     * Obligatorio.
     */
    public String getAccount() {
        return account;
    }

    public PostBankMovementParams setAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * El concepto de la póliza. Sin él, el texto del banco.
     */
    public String getDescription() {
        return description;
    }

    public PostBankMovementParams setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Crear (o cambiar) la regla de bank.movement que registra en esta cuenta los movimientos con el mismo texto del banco al importar el siguiente estado de cuenta (Ajustes › Reglas).
     */
    public Boolean getRemember() {
        return remember;
    }

    public PostBankMovementParams setRemember(Boolean remember) {
        this.remember = remember;
        return this;
    }
}
