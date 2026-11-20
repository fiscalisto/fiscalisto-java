// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateEmployeePortalParams: los campos de «Activar, cambiar o apagar el portal».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateEmployeePortalParams {
    /**
     * enable: crea el enlace (o deja el que tiene); renew: uno nuevo (el anterior deja de funcionar y sus celulares se desligan); disable: lo apaga (lo firmado se queda).
     * <p>
     * Valores: enable, renew, disable.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("action")
    private String action;

    /**
     * Con enable o renew, le manda el enlace al correo del empleado. Falla si el empleado no tiene correo.
     */
    @JsonProperty("send_email")
    private Boolean sendEmail;

    /**
     * enable: crea el enlace (o deja el que tiene); renew: uno nuevo (el anterior deja de funcionar y sus celulares se desligan); disable: lo apaga (lo firmado se queda).
     * <p>
     * Valores: enable, renew, disable.
     * <p>
     * Obligatorio.
     */
    public String getAction() {
        return action;
    }

    public UpdateEmployeePortalParams setAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Con enable o renew, le manda el enlace al correo del empleado. Falla si el empleado no tiene correo.
     */
    public Boolean getSendEmail() {
        return sendEmail;
    }

    public UpdateEmployeePortalParams setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
        return this;
    }
}
