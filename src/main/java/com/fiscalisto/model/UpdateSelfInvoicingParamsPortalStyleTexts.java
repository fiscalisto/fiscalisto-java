// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateSelfInvoicingParamsPortalStyleTexts: Los textos, cada uno con `es` y `en`, combinados por llave con lo guardado. El título, el mensaje y dónde viene el código en español son `portal_title`, `portal_message` y `code_hint`; aquí van en inglés.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateSelfInvoicingParamsPortalStyleTexts {
    /**
     * El título (en español es `portal_title`); `null` vuelve al de Fiscalisto.
     */
    @JsonProperty("title")
    private UpdateSelfInvoicingParamsPortalStyleTextsTitle title;

    /**
     * El mensaje bajo el título (en español es `portal_message`); `null` vuelve al de Fiscalisto.
     */
    @JsonProperty("message")
    private UpdateSelfInvoicingParamsPortalStyleTextsMessage message;

    /**
     * Dónde viene el código (en español es `code_hint`); `null` vuelve al de Fiscalisto.
     */
    @JsonProperty("code_hint")
    private UpdateSelfInvoicingParamsPortalStyleTextsCodeHint codeHint;

    /**
     * El nombre del paso 1; `null` vuelve al de Fiscalisto.
     */
    @JsonProperty("step_ticket")
    private UpdateSelfInvoicingParamsPortalStyleTextsStepTicket stepTicket;

    /**
     * El nombre del paso 2; `null` vuelve al de Fiscalisto.
     */
    @JsonProperty("step_data")
    private UpdateSelfInvoicingParamsPortalStyleTextsStepData stepData;

    /**
     * El nombre del paso 3; `null` vuelve al de Fiscalisto.
     */
    @JsonProperty("step_invoice")
    private UpdateSelfInvoicingParamsPortalStyleTextsStepInvoice stepInvoice;

    /**
     * El botón para buscar el ticket; `null` vuelve al de Fiscalisto.
     */
    @JsonProperty("find_button")
    private UpdateSelfInvoicingParamsPortalStyleTextsFindButton findButton;

    /**
     * La pregunta de cómo dar los datos; `null` vuelve al de Fiscalisto.
     */
    @JsonProperty("how_question")
    private UpdateSelfInvoicingParamsPortalStyleTextsHowQuestion howQuestion;

    /**
     * El botón para facturar; `null` vuelve al de Fiscalisto.
     */
    @JsonProperty("submit")
    private UpdateSelfInvoicingParamsPortalStyleTextsSubmit submit;

    /**
     * El título al terminar; `null` vuelve al de Fiscalisto.
     */
    @JsonProperty("success_title")
    private UpdateSelfInvoicingParamsPortalStyleTextsSuccessTitle successTitle;

    /**
     * El mensaje al terminar; `null` vuelve al de Fiscalisto.
     */
    @JsonProperty("success_message")
    private UpdateSelfInvoicingParamsPortalStyleTextsSuccessMessage successMessage;

    /**
     * El título de la elección de conceptos («Conceptos en su factura»; ver `invoice_concepts`); `null` vuelve al de Fiscalisto.
     */
    @JsonProperty("concepts_title")
    private UpdateSelfInvoicingParamsPortalStyleTextsConceptsTitle conceptsTitle;

    /**
     * La opción de conceptos desglosados («Desglosados»); `null` vuelve al de Fiscalisto.
     */
    @JsonProperty("concepts_itemized")
    private UpdateSelfInvoicingParamsPortalStyleTextsConceptsItemized conceptsItemized;

    /**
     * La opción de un solo concepto («Un solo concepto»); `null` vuelve al de Fiscalisto.
     */
    @JsonProperty("concepts_single")
    private UpdateSelfInvoicingParamsPortalStyleTextsConceptsSingle conceptsSingle;

    /**
     * La opción de conceptos por categoría («Por categoría»); `null` vuelve al de Fiscalisto.
     */
    @JsonProperty("concepts_grouped")
    private UpdateSelfInvoicingParamsPortalStyleTextsConceptsGrouped conceptsGrouped;

    /**
     * El título (en español es `portal_title`); `null` vuelve al de Fiscalisto.
     */
    public UpdateSelfInvoicingParamsPortalStyleTextsTitle getTitle() {
        return title;
    }

    public UpdateSelfInvoicingParamsPortalStyleTexts setTitle(UpdateSelfInvoicingParamsPortalStyleTextsTitle title) {
        this.title = title;
        return this;
    }

    /**
     * El mensaje bajo el título (en español es `portal_message`); `null` vuelve al de Fiscalisto.
     */
    public UpdateSelfInvoicingParamsPortalStyleTextsMessage getMessage() {
        return message;
    }

    public UpdateSelfInvoicingParamsPortalStyleTexts setMessage(UpdateSelfInvoicingParamsPortalStyleTextsMessage message) {
        this.message = message;
        return this;
    }

    /**
     * Dónde viene el código (en español es `code_hint`); `null` vuelve al de Fiscalisto.
     */
    public UpdateSelfInvoicingParamsPortalStyleTextsCodeHint getCodeHint() {
        return codeHint;
    }

    public UpdateSelfInvoicingParamsPortalStyleTexts setCodeHint(UpdateSelfInvoicingParamsPortalStyleTextsCodeHint codeHint) {
        this.codeHint = codeHint;
        return this;
    }

    /**
     * El nombre del paso 1; `null` vuelve al de Fiscalisto.
     */
    public UpdateSelfInvoicingParamsPortalStyleTextsStepTicket getStepTicket() {
        return stepTicket;
    }

    public UpdateSelfInvoicingParamsPortalStyleTexts setStepTicket(UpdateSelfInvoicingParamsPortalStyleTextsStepTicket stepTicket) {
        this.stepTicket = stepTicket;
        return this;
    }

    /**
     * El nombre del paso 2; `null` vuelve al de Fiscalisto.
     */
    public UpdateSelfInvoicingParamsPortalStyleTextsStepData getStepData() {
        return stepData;
    }

    public UpdateSelfInvoicingParamsPortalStyleTexts setStepData(UpdateSelfInvoicingParamsPortalStyleTextsStepData stepData) {
        this.stepData = stepData;
        return this;
    }

    /**
     * El nombre del paso 3; `null` vuelve al de Fiscalisto.
     */
    public UpdateSelfInvoicingParamsPortalStyleTextsStepInvoice getStepInvoice() {
        return stepInvoice;
    }

    public UpdateSelfInvoicingParamsPortalStyleTexts setStepInvoice(UpdateSelfInvoicingParamsPortalStyleTextsStepInvoice stepInvoice) {
        this.stepInvoice = stepInvoice;
        return this;
    }

    /**
     * El botón para buscar el ticket; `null` vuelve al de Fiscalisto.
     */
    public UpdateSelfInvoicingParamsPortalStyleTextsFindButton getFindButton() {
        return findButton;
    }

    public UpdateSelfInvoicingParamsPortalStyleTexts setFindButton(UpdateSelfInvoicingParamsPortalStyleTextsFindButton findButton) {
        this.findButton = findButton;
        return this;
    }

    /**
     * La pregunta de cómo dar los datos; `null` vuelve al de Fiscalisto.
     */
    public UpdateSelfInvoicingParamsPortalStyleTextsHowQuestion getHowQuestion() {
        return howQuestion;
    }

    public UpdateSelfInvoicingParamsPortalStyleTexts setHowQuestion(UpdateSelfInvoicingParamsPortalStyleTextsHowQuestion howQuestion) {
        this.howQuestion = howQuestion;
        return this;
    }

    /**
     * El botón para facturar; `null` vuelve al de Fiscalisto.
     */
    public UpdateSelfInvoicingParamsPortalStyleTextsSubmit getSubmit() {
        return submit;
    }

    public UpdateSelfInvoicingParamsPortalStyleTexts setSubmit(UpdateSelfInvoicingParamsPortalStyleTextsSubmit submit) {
        this.submit = submit;
        return this;
    }

    /**
     * El título al terminar; `null` vuelve al de Fiscalisto.
     */
    public UpdateSelfInvoicingParamsPortalStyleTextsSuccessTitle getSuccessTitle() {
        return successTitle;
    }

    public UpdateSelfInvoicingParamsPortalStyleTexts setSuccessTitle(UpdateSelfInvoicingParamsPortalStyleTextsSuccessTitle successTitle) {
        this.successTitle = successTitle;
        return this;
    }

    /**
     * El mensaje al terminar; `null` vuelve al de Fiscalisto.
     */
    public UpdateSelfInvoicingParamsPortalStyleTextsSuccessMessage getSuccessMessage() {
        return successMessage;
    }

    public UpdateSelfInvoicingParamsPortalStyleTexts setSuccessMessage(UpdateSelfInvoicingParamsPortalStyleTextsSuccessMessage successMessage) {
        this.successMessage = successMessage;
        return this;
    }

    /**
     * El título de la elección de conceptos («Conceptos en su factura»; ver `invoice_concepts`); `null` vuelve al de Fiscalisto.
     */
    public UpdateSelfInvoicingParamsPortalStyleTextsConceptsTitle getConceptsTitle() {
        return conceptsTitle;
    }

    public UpdateSelfInvoicingParamsPortalStyleTexts setConceptsTitle(UpdateSelfInvoicingParamsPortalStyleTextsConceptsTitle conceptsTitle) {
        this.conceptsTitle = conceptsTitle;
        return this;
    }

    /**
     * La opción de conceptos desglosados («Desglosados»); `null` vuelve al de Fiscalisto.
     */
    public UpdateSelfInvoicingParamsPortalStyleTextsConceptsItemized getConceptsItemized() {
        return conceptsItemized;
    }

    public UpdateSelfInvoicingParamsPortalStyleTexts setConceptsItemized(UpdateSelfInvoicingParamsPortalStyleTextsConceptsItemized conceptsItemized) {
        this.conceptsItemized = conceptsItemized;
        return this;
    }

    /**
     * La opción de un solo concepto («Un solo concepto»); `null` vuelve al de Fiscalisto.
     */
    public UpdateSelfInvoicingParamsPortalStyleTextsConceptsSingle getConceptsSingle() {
        return conceptsSingle;
    }

    public UpdateSelfInvoicingParamsPortalStyleTexts setConceptsSingle(UpdateSelfInvoicingParamsPortalStyleTextsConceptsSingle conceptsSingle) {
        this.conceptsSingle = conceptsSingle;
        return this;
    }

    /**
     * La opción de conceptos por categoría («Por categoría»); `null` vuelve al de Fiscalisto.
     */
    public UpdateSelfInvoicingParamsPortalStyleTextsConceptsGrouped getConceptsGrouped() {
        return conceptsGrouped;
    }

    public UpdateSelfInvoicingParamsPortalStyleTexts setConceptsGrouped(UpdateSelfInvoicingParamsPortalStyleTextsConceptsGrouped conceptsGrouped) {
        this.conceptsGrouped = conceptsGrouped;
        return this;
    }
}
