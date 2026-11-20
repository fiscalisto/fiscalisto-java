// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * AccountRenumbering: Una renumeración del catálogo: cada cuenta que cambia de número (o no puede) con el de antes y el nuevo.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountRenumbering {
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
     * true si solo dijo qué cambiaría.
     */
    @JsonProperty("dry_run")
    private Boolean dryRun;

    /**
     * Cuántas cuentas cambian de número.
     */
    @JsonProperty("changes")
    private Long changes;

    /**
     * Cuántas no pueden tomar su número nuevo (si hay, no cambia ninguna).
     */
    @JsonProperty("problems")
    private Long problems;

    /**
     * Las cuentas que cambian o no pueden.
     */
    @JsonProperty("accounts")
    private List<AccountRenumberingAccount> accounts;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public AccountRenumbering setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public AccountRenumbering setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * true si solo dijo qué cambiaría.
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public AccountRenumbering setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * Cuántas cuentas cambian de número.
     */
    public Long getChanges() {
        return changes;
    }

    public AccountRenumbering setChanges(Long changes) {
        this.changes = changes;
        return this;
    }

    @JsonIgnore
    public AccountRenumbering setChanges(long changes) {
        return setChanges(Long.valueOf(changes));
    }

    /**
     * Cuántas no pueden tomar su número nuevo (si hay, no cambia ninguna).
     */
    public Long getProblems() {
        return problems;
    }

    public AccountRenumbering setProblems(Long problems) {
        this.problems = problems;
        return this;
    }

    @JsonIgnore
    public AccountRenumbering setProblems(long problems) {
        return setProblems(Long.valueOf(problems));
    }

    /**
     * Las cuentas que cambian o no pueden.
     */
    public List<AccountRenumberingAccount> getAccounts() {
        return accounts;
    }

    public AccountRenumbering setAccounts(List<AccountRenumberingAccount> accounts) {
        this.accounts = accounts;
        return this;
    }
}
