// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fiscalisto.StringOr;

import java.util.List;

/**
 * RepseReturn: El ICSOE (IMSS, LSS art. 15-A) y el SISUB (Infonavit, Ley del Infonavit art. 29 Bis) de un cuatrimestre, hechos de los contratos y los recibos timbrados. No hay forma de mandarlos por API: se suben, firmados con la e.firma, en cada portal.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RepseReturn {
    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * El emisor (iss_…).
     */
    @JsonProperty("issuer")
    private StringOr<Issuer> issuer;

    /**
     * El cuatrimestre: AAAA-1 (enero a abril), AAAA-2 o AAAA-3.
     */
    @JsonProperty("period")
    private String period;

    /**
     * Primer día del cuatrimestre.
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * Último día del cuatrimestre.
     */
    @JsonProperty("end_date")
    private String endDate;

    /**
     * Último día para presentarlos: el 17 de enero, mayo o septiembre, o el siguiente día hábil (CFF art. 12).
     */
    @JsonProperty("due_date")
    private String dueDate;

    /**
     * Los contratos vigentes en el cuatrimestre.
     */
    @JsonProperty("contracts")
    private List<RepseReturnContract> contracts;

    /**
     * Cada trabajador por bimestre (el detalle de trabajadores del SISUB).
     */
    @JsonProperty("workers")
    private List<RepseReturnWorker> workers;

    /**
     * Lo que el archivo del sujeto obligado del SISUB suma.
     */
    @JsonProperty("totals")
    private RepseReturnTotals totals;

    /**
     * Lo que falta o está mal antes de presentarlos; vacío si nada.
     */
    @JsonProperty("problems")
    private List<String> problems;

    /**
     * Los 3 CSV del SISUB (sujeto obligado, contratos, trabajadores) y un CSV de trabajadores del ICSOE por contrato.
     */
    @JsonProperty("files")
    private List<RepseReturnFile> files;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public RepseReturn setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public RepseReturn setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El emisor (iss_…).
     */
    public StringOr<Issuer> getIssuer() {
        return issuer;
    }

    public RepseReturn setIssuer(StringOr<Issuer> issuer) {
        this.issuer = issuer;
        return this;
    }

    /** Solo el id. */
    @JsonIgnore
    public RepseReturn setIssuer(String id) {
        return setIssuer(StringOr.<Issuer>id(id));
    }

    @JsonIgnore
    public RepseReturn setIssuer(Issuer issuer) {
        return setIssuer(StringOr.of(issuer));
    }

    /**
     * El cuatrimestre: AAAA-1 (enero a abril), AAAA-2 o AAAA-3.
     */
    public String getPeriod() {
        return period;
    }

    public RepseReturn setPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * Primer día del cuatrimestre.
     */
    public String getStartDate() {
        return startDate;
    }

    public RepseReturn setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Último día del cuatrimestre.
     */
    public String getEndDate() {
        return endDate;
    }

    public RepseReturn setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Último día para presentarlos: el 17 de enero, mayo o septiembre, o el siguiente día hábil (CFF art. 12).
     */
    public String getDueDate() {
        return dueDate;
    }

    public RepseReturn setDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Los contratos vigentes en el cuatrimestre.
     */
    public List<RepseReturnContract> getContracts() {
        return contracts;
    }

    public RepseReturn setContracts(List<RepseReturnContract> contracts) {
        this.contracts = contracts;
        return this;
    }

    /**
     * Cada trabajador por bimestre (el detalle de trabajadores del SISUB).
     */
    public List<RepseReturnWorker> getWorkers() {
        return workers;
    }

    public RepseReturn setWorkers(List<RepseReturnWorker> workers) {
        this.workers = workers;
        return this;
    }

    /**
     * Lo que el archivo del sujeto obligado del SISUB suma.
     */
    public RepseReturnTotals getTotals() {
        return totals;
    }

    public RepseReturn setTotals(RepseReturnTotals totals) {
        this.totals = totals;
        return this;
    }

    /**
     * Lo que falta o está mal antes de presentarlos; vacío si nada.
     */
    public List<String> getProblems() {
        return problems;
    }

    public RepseReturn setProblems(List<String> problems) {
        this.problems = problems;
        return this;
    }

    /**
     * Los 3 CSV del SISUB (sujeto obligado, contratos, trabajadores) y un CSV de trabajadores del ICSOE por contrato.
     */
    public List<RepseReturnFile> getFiles() {
        return files;
    }

    public RepseReturn setFiles(List<RepseReturnFile> files) {
        this.files = files;
        return this;
    }
}
