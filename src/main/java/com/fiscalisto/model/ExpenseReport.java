// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * ExpenseReport: Una comprobación de viáticos (un viaje) o de gastos de un periodo: sus gastos revisados contra la ley y la política, y el dinero dado o devuelto. Al aprobarla sus facturas se deducen y entra en las pólizas por 107.01.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExpenseReport {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El emisor.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * Su número, consecutivo por emisor.
     */
    @JsonProperty("number")
    private Long number;

    /**
     * Cómo se muestra, por ejemplo «VIA-0012».
     */
    @JsonProperty("label")
    private String label;

    /**
     * Quién la comprueba (exp_…).
     */
    @JsonProperty("person")
    private String person;

    /**
     * El nombre de esa persona.
     */
    @JsonProperty("person_name")
    private String personName;

    /**
     * viaje o gastos (de oficina, de un periodo).
     * <p>
     * Valores: viaje, gastos.
     */
    @JsonProperty("kind")
    private String kind;

    /**
     * Su nombre.
     */
    @JsonProperty("title")
    private String title;

    /**
     * Para qué fue, o null.
     */
    @JsonProperty("purpose")
    private String purpose;

    /**
     * A dónde, o null.
     */
    @JsonProperty("destination")
    private String destination;

    /**
     * true si fue al extranjero.
     */
    @JsonProperty("abroad")
    private Boolean abroad;

    /**
     * true si fue a más de 50 km de donde trabaja la persona.
     */
    @JsonProperty("far")
    private Boolean far;

    /**
     * La salida o el inicio del periodo (AAAA-MM-DD), o null.
     */
    @JsonProperty("start_date")
    private String startDate;

    /**
     * El regreso o el fin del periodo (AAAA-MM-DD), o null.
     */
    @JsonProperty("end_date")
    private String endDate;

    /**
     * draft (abierta), submitted (por aprobar), rejected (devuelta para corregir), approved (por liquidar) o closed (cerrada, con el saldo en cero).
     * <p>
     * Valores: draft, submitted, rejected, approved, closed.
     */
    @JsonProperty("status")
    private String status;

    /**
     * Hasta cuándo hay para comprobarla (la política), o null.
     */
    @JsonProperty("due_date")
    private String dueDate;

    /**
     * Cuándo se envió a aprobar, o null.
     */
    @JsonProperty("submitted_at")
    private String submittedAt;

    /**
     * Cuándo se aprobó o se devolvió, o null.
     */
    @JsonProperty("decided_at")
    private String decidedAt;

    /**
     * La nota de quien la aprobó o la devolvió, o null.
     */
    @JsonProperty("decision_note")
    private String decisionNote;

    /**
     * Cuándo se cerró, o null.
     */
    @JsonProperty("closed_at")
    private String closedAt;

    /**
     * true si ya se reportó en un recibo de nómina (viáticos 050 y 081).
     */
    @JsonProperty("in_payroll")
    private Boolean inPayroll;

    /**
     * Lo gastado, sin los gastos rechazados.
     */
    @JsonProperty("spent")
    private BigDecimal spent;

    /**
     * Lo de los gastos rechazados.
     */
    @JsonProperty("rejected")
    private BigDecimal rejected;

    /**
     * Lo comprobado con factura o comprobante del extranjero.
     */
    @JsonProperty("proven")
    private BigDecimal proven;

    /**
     * Lo que se deduce, con los topes de la ley.
     */
    @JsonProperty("deductible")
    private BigDecimal deductible;

    /**
     * Lo que no se deduce (pasa los topes o no tiene comprobante).
     */
    @JsonProperty("non_deductible")
    private BigDecimal nonDeductible;

    /**
     * Lo que se le dio en anticipos.
     */
    @JsonProperty("advances")
    private BigDecimal advances;

    /**
     * Lo que se le reembolsó.
     */
    @JsonProperty("reimbursed")
    private BigDecimal reimbursed;

    /**
     * Lo que devolvió.
     */
    @JsonProperty("returned")
    private BigDecimal returned;

    /**
     * Positivo, lo que la persona debe devolver; negativo, lo que la empresa le debe reembolsar; 0, liquidada. Lo pagado con la tarjeta de la empresa no cuenta.
     */
    @JsonProperty("balance")
    private BigDecimal balance;

    /**
     * true si se puede enviar o aprobar: ningún gasto tiene errores.
     */
    @JsonProperty("ready")
    private Boolean ready;

    /**
     * Avisos de la comprobación entera.
     */
    @JsonProperty("issues")
    private List<ExpenseReportIssue> issues;

    /**
     * Para un empleado, cómo irá en su recibo de nómina (o null).
     */
    @JsonProperty("payroll")
    private ExpenseReportPayroll payroll;

    /**
     * Sus gastos.
     */
    @JsonProperty("items")
    private List<ExpenseItem> items;

    /**
     * El dinero que se le dio o devolvió.
     */
    @JsonProperty("movements")
    private List<ExpenseMovement> movements;

    /**
     * Cuándo se abrió.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Cuándo cambió por última vez.
     */
    @JsonProperty("updated_at")
    private String updatedAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public ExpenseReport setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public ExpenseReport setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public ExpenseReport setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor.
     */
    public String getIssuer() {
        return issuer;
    }

    public ExpenseReport setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Su número, consecutivo por emisor.
     */
    public Long getNumber() {
        return number;
    }

    public ExpenseReport setNumber(Long number) {
        this.number = number;
        return this;
    }

    @JsonIgnore
    public ExpenseReport setNumber(long number) {
        return setNumber(Long.valueOf(number));
    }

    /**
     * Cómo se muestra, por ejemplo «VIA-0012».
     */
    public String getLabel() {
        return label;
    }

    public ExpenseReport setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Quién la comprueba (exp_…).
     */
    public String getPerson() {
        return person;
    }

    public ExpenseReport setPerson(String person) {
        this.person = person;
        return this;
    }

    /**
     * El nombre de esa persona.
     */
    public String getPersonName() {
        return personName;
    }

    public ExpenseReport setPersonName(String personName) {
        this.personName = personName;
        return this;
    }

    /**
     * viaje o gastos (de oficina, de un periodo).
     * <p>
     * Valores: viaje, gastos.
     */
    public String getKind() {
        return kind;
    }

    public ExpenseReport setKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Su nombre.
     */
    public String getTitle() {
        return title;
    }

    public ExpenseReport setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Para qué fue, o null.
     */
    public String getPurpose() {
        return purpose;
    }

    public ExpenseReport setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }

    /**
     * A dónde, o null.
     */
    public String getDestination() {
        return destination;
    }

    public ExpenseReport setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * true si fue al extranjero.
     */
    public Boolean getAbroad() {
        return abroad;
    }

    public ExpenseReport setAbroad(Boolean abroad) {
        this.abroad = abroad;
        return this;
    }

    /**
     * true si fue a más de 50 km de donde trabaja la persona.
     */
    public Boolean getFar() {
        return far;
    }

    public ExpenseReport setFar(Boolean far) {
        this.far = far;
        return this;
    }

    /**
     * La salida o el inicio del periodo (AAAA-MM-DD), o null.
     */
    public String getStartDate() {
        return startDate;
    }

    public ExpenseReport setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * El regreso o el fin del periodo (AAAA-MM-DD), o null.
     */
    public String getEndDate() {
        return endDate;
    }

    public ExpenseReport setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * draft (abierta), submitted (por aprobar), rejected (devuelta para corregir), approved (por liquidar) o closed (cerrada, con el saldo en cero).
     * <p>
     * Valores: draft, submitted, rejected, approved, closed.
     */
    public String getStatus() {
        return status;
    }

    public ExpenseReport setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Hasta cuándo hay para comprobarla (la política), o null.
     */
    public String getDueDate() {
        return dueDate;
    }

    public ExpenseReport setDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Cuándo se envió a aprobar, o null.
     */
    public String getSubmittedAt() {
        return submittedAt;
    }

    public ExpenseReport setSubmittedAt(String submittedAt) {
        this.submittedAt = submittedAt;
        return this;
    }

    /**
     * Cuándo se aprobó o se devolvió, o null.
     */
    public String getDecidedAt() {
        return decidedAt;
    }

    public ExpenseReport setDecidedAt(String decidedAt) {
        this.decidedAt = decidedAt;
        return this;
    }

    /**
     * La nota de quien la aprobó o la devolvió, o null.
     */
    public String getDecisionNote() {
        return decisionNote;
    }

    public ExpenseReport setDecisionNote(String decisionNote) {
        this.decisionNote = decisionNote;
        return this;
    }

    /**
     * Cuándo se cerró, o null.
     */
    public String getClosedAt() {
        return closedAt;
    }

    public ExpenseReport setClosedAt(String closedAt) {
        this.closedAt = closedAt;
        return this;
    }

    /**
     * true si ya se reportó en un recibo de nómina (viáticos 050 y 081).
     */
    public Boolean getInPayroll() {
        return inPayroll;
    }

    public ExpenseReport setInPayroll(Boolean inPayroll) {
        this.inPayroll = inPayroll;
        return this;
    }

    /**
     * Lo gastado, sin los gastos rechazados.
     */
    public BigDecimal getSpent() {
        return spent;
    }

    public ExpenseReport setSpent(BigDecimal spent) {
        this.spent = spent;
        return this;
    }

    @JsonIgnore
    public ExpenseReport setSpent(double spent) {
        return setSpent(BigDecimal.valueOf(spent));
    }

    /**
     * Lo de los gastos rechazados.
     */
    public BigDecimal getRejected() {
        return rejected;
    }

    public ExpenseReport setRejected(BigDecimal rejected) {
        this.rejected = rejected;
        return this;
    }

    @JsonIgnore
    public ExpenseReport setRejected(double rejected) {
        return setRejected(BigDecimal.valueOf(rejected));
    }

    /**
     * Lo comprobado con factura o comprobante del extranjero.
     */
    public BigDecimal getProven() {
        return proven;
    }

    public ExpenseReport setProven(BigDecimal proven) {
        this.proven = proven;
        return this;
    }

    @JsonIgnore
    public ExpenseReport setProven(double proven) {
        return setProven(BigDecimal.valueOf(proven));
    }

    /**
     * Lo que se deduce, con los topes de la ley.
     */
    public BigDecimal getDeductible() {
        return deductible;
    }

    public ExpenseReport setDeductible(BigDecimal deductible) {
        this.deductible = deductible;
        return this;
    }

    @JsonIgnore
    public ExpenseReport setDeductible(double deductible) {
        return setDeductible(BigDecimal.valueOf(deductible));
    }

    /**
     * Lo que no se deduce (pasa los topes o no tiene comprobante).
     */
    public BigDecimal getNonDeductible() {
        return nonDeductible;
    }

    public ExpenseReport setNonDeductible(BigDecimal nonDeductible) {
        this.nonDeductible = nonDeductible;
        return this;
    }

    @JsonIgnore
    public ExpenseReport setNonDeductible(double nonDeductible) {
        return setNonDeductible(BigDecimal.valueOf(nonDeductible));
    }

    /**
     * Lo que se le dio en anticipos.
     */
    public BigDecimal getAdvances() {
        return advances;
    }

    public ExpenseReport setAdvances(BigDecimal advances) {
        this.advances = advances;
        return this;
    }

    @JsonIgnore
    public ExpenseReport setAdvances(double advances) {
        return setAdvances(BigDecimal.valueOf(advances));
    }

    /**
     * Lo que se le reembolsó.
     */
    public BigDecimal getReimbursed() {
        return reimbursed;
    }

    public ExpenseReport setReimbursed(BigDecimal reimbursed) {
        this.reimbursed = reimbursed;
        return this;
    }

    @JsonIgnore
    public ExpenseReport setReimbursed(double reimbursed) {
        return setReimbursed(BigDecimal.valueOf(reimbursed));
    }

    /**
     * Lo que devolvió.
     */
    public BigDecimal getReturned() {
        return returned;
    }

    public ExpenseReport setReturned(BigDecimal returned) {
        this.returned = returned;
        return this;
    }

    @JsonIgnore
    public ExpenseReport setReturned(double returned) {
        return setReturned(BigDecimal.valueOf(returned));
    }

    /**
     * Positivo, lo que la persona debe devolver; negativo, lo que la empresa le debe reembolsar; 0, liquidada. Lo pagado con la tarjeta de la empresa no cuenta.
     */
    public BigDecimal getBalance() {
        return balance;
    }

    public ExpenseReport setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    @JsonIgnore
    public ExpenseReport setBalance(double balance) {
        return setBalance(BigDecimal.valueOf(balance));
    }

    /**
     * true si se puede enviar o aprobar: ningún gasto tiene errores.
     */
    public Boolean getReady() {
        return ready;
    }

    public ExpenseReport setReady(Boolean ready) {
        this.ready = ready;
        return this;
    }

    /**
     * Avisos de la comprobación entera.
     */
    public List<ExpenseReportIssue> getIssues() {
        return issues;
    }

    public ExpenseReport setIssues(List<ExpenseReportIssue> issues) {
        this.issues = issues;
        return this;
    }

    /**
     * Para un empleado, cómo irá en su recibo de nómina (o null).
     */
    public ExpenseReportPayroll getPayroll() {
        return payroll;
    }

    public ExpenseReport setPayroll(ExpenseReportPayroll payroll) {
        this.payroll = payroll;
        return this;
    }

    /**
     * Sus gastos.
     */
    public List<ExpenseItem> getItems() {
        return items;
    }

    public ExpenseReport setItems(List<ExpenseItem> items) {
        this.items = items;
        return this;
    }

    /**
     * El dinero que se le dio o devolvió.
     */
    public List<ExpenseMovement> getMovements() {
        return movements;
    }

    public ExpenseReport setMovements(List<ExpenseMovement> movements) {
        this.movements = movements;
        return this;
    }

    /**
     * Cuándo se abrió.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public ExpenseReport setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo cambió por última vez.
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public ExpenseReport setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
