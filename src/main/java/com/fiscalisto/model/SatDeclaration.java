// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * SatDeclaration: Una declaración que el emisor presentó ante el SAT (provisional o definitiva, anual o del servicio anterior Declaraciones y pagos), con sus cifras y sus archivos.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SatDeclaration {
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
     * El emisor que la presentó.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * monthly (provisional o definitiva, desde 2022), annual (la anual de persona moral) o dyp (el servicio anterior Declaraciones y pagos, 2021 y antes).
     * <p>
     * Valores: monthly, annual, dyp.
     */
    @JsonProperty("source")
    private String source;

    /**
     * El ejercicio.
     */
    @JsonProperty("year")
    private Long year;

    /**
     * El mes (1 a 12), o null en la anual y otros periodos.
     */
    @JsonProperty("month")
    private Long month;

    /**
     * El periodo como lo nombra el SAT: «Enero», «Del Ejercicio»…
     */
    @JsonProperty("period")
    private String period;

    /**
     * normal o complementary (complementaria).
     * <p>
     * Valores: normal, complementary.
     */
    @JsonProperty("type")
    private String type;

    /**
     * El tipo de complementaria como lo dice el SAT («Modificación de obligaciones»…), o null.
     */
    @JsonProperty("complementary_type")
    private String complementaryType;

    /**
     * El número de operación que le dio el SAT.
     */
    @JsonProperty("operation_number")
    private String operationNumber;

    /**
     * La línea de captura, si hubo algo a pagar.
     */
    @JsonProperty("payment_line")
    private String paymentLine;

    /**
     * Cuándo se presentó (AAAA-MM-DD).
     */
    @JsonProperty("filed_on")
    private String filedOn;

    /**
     * El coeficiente de utilidad que aplicó (ISR de personas morales), o null.
     */
    @JsonProperty("profit_coefficient")
    private BigDecimal profitCoefficient;

    /**
     * El ISR a cargo, según el acuse.
     */
    @JsonProperty("isr_due")
    private BigDecimal isrDue;

    /**
     * El IVA a cargo, según el acuse.
     */
    @JsonProperty("vat_due")
    private BigDecimal vatDue;

    /**
     * El total a pagar, según el acuse.
     */
    @JsonProperty("total_due")
    private BigDecimal totalDue;

    /**
     * Las cifras de la declaración por impuesto (tax), cada una con su texto como lo imprime el SAT (label) y su valor. Vacío en las de Declaraciones y pagos (su PDF trae dos columnas que no se leen con certeza) o si el PDF aún no llega.
     */
    @JsonProperty("sections")
    private List<SatDeclarationSection> sections;

    /**
     * Lo que dice el acuse: cada concepto con su cantidad a cargo y a pagar, el total, la línea de captura y su vigencia. null si el acuse aún no llega.
     */
    @JsonProperty("receipt")
    private SatDeclarationReceipt receipt;

    /**
     * Las mismas cifras con nombres fijos, por obligación (ISR, IVA, cada retención), para leerlas igual cada mes sin conocer el formato del SAT. Una cifra que no viene en la declaración o no se pudo leer es null, nunca 0. En Declaraciones y pagos solo trae lo del acuse.
     */
    @JsonProperty("summary")
    private SatDeclarationSummary summary;

    /**
     * Qué archivos ya tiene: pdf (GET …/pdf), receipt (GET …/receipt) y financial_statements (GET …/financial_statements, solo en la anual de persona moral).
     */
    @JsonProperty("files")
    private SatDeclarationFiles files;

    /**
     * Por qué falta un archivo, como lo dijo el SAT (por ejemplo «No se puede generar el archivo»). Se vuelve a pedir en la siguiente consulta.
     */
    @JsonProperty("files_error")
    private String filesError;

    /**
     * Cuándo se trajo por primera vez.
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

    public SatDeclaration setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public SatDeclaration setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public SatDeclaration setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor que la presentó.
     */
    public String getIssuer() {
        return issuer;
    }

    public SatDeclaration setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * monthly (provisional o definitiva, desde 2022), annual (la anual de persona moral) o dyp (el servicio anterior Declaraciones y pagos, 2021 y antes).
     * <p>
     * Valores: monthly, annual, dyp.
     */
    public String getSource() {
        return source;
    }

    public SatDeclaration setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * El ejercicio.
     */
    public Long getYear() {
        return year;
    }

    public SatDeclaration setYear(Long year) {
        this.year = year;
        return this;
    }

    @JsonIgnore
    public SatDeclaration setYear(long year) {
        return setYear(Long.valueOf(year));
    }

    /**
     * El mes (1 a 12), o null en la anual y otros periodos.
     */
    public Long getMonth() {
        return month;
    }

    public SatDeclaration setMonth(Long month) {
        this.month = month;
        return this;
    }

    @JsonIgnore
    public SatDeclaration setMonth(long month) {
        return setMonth(Long.valueOf(month));
    }

    /**
     * El periodo como lo nombra el SAT: «Enero», «Del Ejercicio»…
     */
    public String getPeriod() {
        return period;
    }

    public SatDeclaration setPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * normal o complementary (complementaria).
     * <p>
     * Valores: normal, complementary.
     */
    public String getType() {
        return type;
    }

    public SatDeclaration setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * El tipo de complementaria como lo dice el SAT («Modificación de obligaciones»…), o null.
     */
    public String getComplementaryType() {
        return complementaryType;
    }

    public SatDeclaration setComplementaryType(String complementaryType) {
        this.complementaryType = complementaryType;
        return this;
    }

    /**
     * El número de operación que le dio el SAT.
     */
    public String getOperationNumber() {
        return operationNumber;
    }

    public SatDeclaration setOperationNumber(String operationNumber) {
        this.operationNumber = operationNumber;
        return this;
    }

    /**
     * La línea de captura, si hubo algo a pagar.
     */
    public String getPaymentLine() {
        return paymentLine;
    }

    public SatDeclaration setPaymentLine(String paymentLine) {
        this.paymentLine = paymentLine;
        return this;
    }

    /**
     * Cuándo se presentó (AAAA-MM-DD).
     */
    public String getFiledOn() {
        return filedOn;
    }

    public SatDeclaration setFiledOn(String filedOn) {
        this.filedOn = filedOn;
        return this;
    }

    /**
     * El coeficiente de utilidad que aplicó (ISR de personas morales), o null.
     */
    public BigDecimal getProfitCoefficient() {
        return profitCoefficient;
    }

    public SatDeclaration setProfitCoefficient(BigDecimal profitCoefficient) {
        this.profitCoefficient = profitCoefficient;
        return this;
    }

    @JsonIgnore
    public SatDeclaration setProfitCoefficient(double profitCoefficient) {
        return setProfitCoefficient(BigDecimal.valueOf(profitCoefficient));
    }

    /**
     * El ISR a cargo, según el acuse.
     */
    public BigDecimal getIsrDue() {
        return isrDue;
    }

    public SatDeclaration setIsrDue(BigDecimal isrDue) {
        this.isrDue = isrDue;
        return this;
    }

    @JsonIgnore
    public SatDeclaration setIsrDue(double isrDue) {
        return setIsrDue(BigDecimal.valueOf(isrDue));
    }

    /**
     * El IVA a cargo, según el acuse.
     */
    public BigDecimal getVatDue() {
        return vatDue;
    }

    public SatDeclaration setVatDue(BigDecimal vatDue) {
        this.vatDue = vatDue;
        return this;
    }

    @JsonIgnore
    public SatDeclaration setVatDue(double vatDue) {
        return setVatDue(BigDecimal.valueOf(vatDue));
    }

    /**
     * El total a pagar, según el acuse.
     */
    public BigDecimal getTotalDue() {
        return totalDue;
    }

    public SatDeclaration setTotalDue(BigDecimal totalDue) {
        this.totalDue = totalDue;
        return this;
    }

    @JsonIgnore
    public SatDeclaration setTotalDue(double totalDue) {
        return setTotalDue(BigDecimal.valueOf(totalDue));
    }

    /**
     * Las cifras de la declaración por impuesto (tax), cada una con su texto como lo imprime el SAT (label) y su valor. Vacío en las de Declaraciones y pagos (su PDF trae dos columnas que no se leen con certeza) o si el PDF aún no llega.
     */
    public List<SatDeclarationSection> getSections() {
        return sections;
    }

    public SatDeclaration setSections(List<SatDeclarationSection> sections) {
        this.sections = sections;
        return this;
    }

    /**
     * Lo que dice el acuse: cada concepto con su cantidad a cargo y a pagar, el total, la línea de captura y su vigencia. null si el acuse aún no llega.
     */
    public SatDeclarationReceipt getReceipt() {
        return receipt;
    }

    public SatDeclaration setReceipt(SatDeclarationReceipt receipt) {
        this.receipt = receipt;
        return this;
    }

    /**
     * Las mismas cifras con nombres fijos, por obligación (ISR, IVA, cada retención), para leerlas igual cada mes sin conocer el formato del SAT. Una cifra que no viene en la declaración o no se pudo leer es null, nunca 0. En Declaraciones y pagos solo trae lo del acuse.
     */
    public SatDeclarationSummary getSummary() {
        return summary;
    }

    public SatDeclaration setSummary(SatDeclarationSummary summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Qué archivos ya tiene: pdf (GET …/pdf), receipt (GET …/receipt) y financial_statements (GET …/financial_statements, solo en la anual de persona moral).
     */
    public SatDeclarationFiles getFiles() {
        return files;
    }

    public SatDeclaration setFiles(SatDeclarationFiles files) {
        this.files = files;
        return this;
    }

    /**
     * Por qué falta un archivo, como lo dijo el SAT (por ejemplo «No se puede generar el archivo»). Se vuelve a pedir en la siguiente consulta.
     */
    public String getFilesError() {
        return filesError;
    }

    public SatDeclaration setFilesError(String filesError) {
        this.filesError = filesError;
        return this;
    }

    /**
     * Cuándo se trajo por primera vez.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public SatDeclaration setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Cuándo cambió por última vez.
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public SatDeclaration setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
}
