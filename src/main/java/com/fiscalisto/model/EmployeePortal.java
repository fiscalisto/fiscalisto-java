// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * EmployeePortal: El portal del empleado: su enlace, los avisos que le llegan y los recibos que firmó de recibido.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmployeePortal {
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
     * El empleado (emp_…).
     */
    @JsonProperty("employee")
    private String employee;

    /**
     * Su enlace personal (sin cuenta) para ver, descargar y firmar de recibido sus recibos y pedir vacaciones; null si está apagado.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Cuándo se hizo el enlace.
     */
    @JsonProperty("enabled_at")
    private String enabledAt;

    /**
     * Los celulares ligados: el primero que lo abre, los que lo abren en la hora siguiente (hasta 3) y la app Mi nómina que instala desde su enlace (hasta 6 en total).
     */
    @JsonProperty("phones")
    private Long phones;

    /**
     * La última vez que lo abrió.
     */
    @JsonProperty("last_seen_at")
    private String lastSeenAt;

    /**
     * Los celulares en que instaló Mi nómina y activó los avisos (recibo nuevo, recibo cancelado, respuesta a sus vacaciones, recibo sin firmar).
     */
    @JsonProperty("push_phones")
    private Long pushPhones;

    /**
     * Sus últimos 10 avisos, los más recientes primero.
     */
    @JsonProperty("notices")
    private List<EmployeePortalNotice> notices;

    /**
     * Los recibos que firmó de recibido desde su enlace (con el día, su celular y su IP guardados), los más recientes primero.
     */
    @JsonProperty("signed_receipts")
    private List<EmployeePortalSignedReceipt> signedReceipts;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public EmployeePortal setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public EmployeePortal setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * El empleado (emp_…).
     */
    public String getEmployee() {
        return employee;
    }

    public EmployeePortal setEmployee(String employee) {
        this.employee = employee;
        return this;
    }

    /**
     * Su enlace personal (sin cuenta) para ver, descargar y firmar de recibido sus recibos y pedir vacaciones; null si está apagado.
     */
    public String getUrl() {
        return url;
    }

    public EmployeePortal setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Cuándo se hizo el enlace.
     */
    public String getEnabledAt() {
        return enabledAt;
    }

    public EmployeePortal setEnabledAt(String enabledAt) {
        this.enabledAt = enabledAt;
        return this;
    }

    /**
     * Los celulares ligados: el primero que lo abre, los que lo abren en la hora siguiente (hasta 3) y la app Mi nómina que instala desde su enlace (hasta 6 en total).
     */
    public Long getPhones() {
        return phones;
    }

    public EmployeePortal setPhones(Long phones) {
        this.phones = phones;
        return this;
    }

    @JsonIgnore
    public EmployeePortal setPhones(long phones) {
        return setPhones(Long.valueOf(phones));
    }

    /**
     * La última vez que lo abrió.
     */
    public String getLastSeenAt() {
        return lastSeenAt;
    }

    public EmployeePortal setLastSeenAt(String lastSeenAt) {
        this.lastSeenAt = lastSeenAt;
        return this;
    }

    /**
     * Los celulares en que instaló Mi nómina y activó los avisos (recibo nuevo, recibo cancelado, respuesta a sus vacaciones, recibo sin firmar).
     */
    public Long getPushPhones() {
        return pushPhones;
    }

    public EmployeePortal setPushPhones(Long pushPhones) {
        this.pushPhones = pushPhones;
        return this;
    }

    @JsonIgnore
    public EmployeePortal setPushPhones(long pushPhones) {
        return setPushPhones(Long.valueOf(pushPhones));
    }

    /**
     * Sus últimos 10 avisos, los más recientes primero.
     */
    public List<EmployeePortalNotice> getNotices() {
        return notices;
    }

    public EmployeePortal setNotices(List<EmployeePortalNotice> notices) {
        this.notices = notices;
        return this;
    }

    /**
     * Los recibos que firmó de recibido desde su enlace (con el día, su celular y su IP guardados), los más recientes primero.
     */
    public List<EmployeePortalSignedReceipt> getSignedReceipts() {
        return signedReceipts;
    }

    public EmployeePortal setSignedReceipts(List<EmployeePortalSignedReceipt> signedReceipts) {
        this.signedReceipts = signedReceipts;
        return this;
    }
}
