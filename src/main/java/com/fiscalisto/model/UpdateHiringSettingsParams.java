// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * UpdateHiringSettingsParams: los campos de «Configurar la página de empleos».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateHiringSettingsParams {
    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Si la página de empleos se ve.
     */
    @JsonProperty("enabled")
    private Boolean enabled;

    /**
     * El texto de arriba de la página: quiénes son y por qué trabajar ahí.
     */
    @JsonProperty("intro")
    private String intro;

    /**
     * El correo para dudas de quien se postula y para sus derechos ARCO (aviso de privacidad). Sin él se usa el de Datos fiscales; sin ninguno, las vacantes no reciben solicitudes.
     */
    @JsonProperty("contact_email")
    private String contactEmail;

    /**
     * Las etapas de sus candidatos, en orden. La primera es donde llegan.
     */
    @JsonProperty("stages")
    private List<String> stages;

    /**
     * Qué hacer con quien no cumple un requisito: flag la recibe marcada; warn le dice qué no cumple antes de enviar (puede enviarla igual) y también la marca.
     * <p>
     * Valores: flag, warn.
     */
    @JsonProperty("unmet_requirements")
    private String unmetRequirements;

    /**
     * El formulario (jbf_…) de las vacantes que no eligen uno; null el básico.
     */
    @JsonProperty("default_form")
    private String defaultForm;

    /**
     * El emisor (iss_…). Puede omitirse si la llave o la cuenta tienen uno solo.
     */
    public String getIssuer() {
        return issuer;
    }

    public UpdateHiringSettingsParams setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Si la página de empleos se ve.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public UpdateHiringSettingsParams setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * El texto de arriba de la página: quiénes son y por qué trabajar ahí.
     */
    public String getIntro() {
        return intro;
    }

    public UpdateHiringSettingsParams setIntro(String intro) {
        this.intro = intro;
        return this;
    }

    /**
     * El correo para dudas de quien se postula y para sus derechos ARCO (aviso de privacidad). Sin él se usa el de Datos fiscales; sin ninguno, las vacantes no reciben solicitudes.
     */
    public String getContactEmail() {
        return contactEmail;
    }

    public UpdateHiringSettingsParams setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     * Las etapas de sus candidatos, en orden. La primera es donde llegan.
     */
    public List<String> getStages() {
        return stages;
    }

    public UpdateHiringSettingsParams setStages(List<String> stages) {
        this.stages = stages;
        return this;
    }

    /**
     * Qué hacer con quien no cumple un requisito: flag la recibe marcada; warn le dice qué no cumple antes de enviar (puede enviarla igual) y también la marca.
     * <p>
     * Valores: flag, warn.
     */
    public String getUnmetRequirements() {
        return unmetRequirements;
    }

    public UpdateHiringSettingsParams setUnmetRequirements(String unmetRequirements) {
        this.unmetRequirements = unmetRequirements;
        return this;
    }

    /**
     * El formulario (jbf_…) de las vacantes que no eligen uno; null el básico.
     */
    public String getDefaultForm() {
        return defaultForm;
    }

    public UpdateHiringSettingsParams setDefaultForm(String defaultForm) {
        this.defaultForm = defaultForm;
        return this;
    }
}
