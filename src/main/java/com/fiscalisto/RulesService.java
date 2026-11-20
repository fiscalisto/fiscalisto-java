// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateRuleParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.ListRuleRunsParams;
import com.fiscalisto.model.ListRulesParams;
import com.fiscalisto.model.OrderRulesParams;
import com.fiscalisto.model.Rule;
import com.fiscalisto.model.RuleList;
import com.fiscalisto.model.RuleRun;
import com.fiscalisto.model.RuleTestList;
import com.fiscalisto.model.TestRuleParams;
import com.fiscalisto.model.UpdateRuleParams;

/**
 * Reglas: client.rules().
 */
public final class RulesService {
    private final ApiClient api;

    RulesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Crear una regla
     * <p>
     * Cuando pasa trigger, si se cumplen conditions, hace actions. Corre desde ese momento con lo que llegue; no cambia lo que ya existe. Va al final del orden de su empresa. Lo que no se puede guardar contesta rule_invalid con el porqué (una acción que no va con su trigger, una etiqueta o centro de costo que no existe).
     * <p>
     * POST /v1/rules
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/reglas/create-rule
     */
    public Rule create(CreateRuleParams params, RequestOptions options) {
        return api.request("POST", "/v1/rules", params, null, true, Rule.class, options);
    }

    public Rule create(CreateRuleParams params) {
        return create(params, null);
    }

    /**
     * Listar reglas
     * <p>
     * En el orden en que corren, también las que están en pausa (enabled: false).
     * <p>
     * GET /v1/rules
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/reglas/list-rules
     */
    public Page<Rule> list(ListRulesParams params, RequestOptions options) {
        return api.list("/v1/rules", params, Rule.class, options);
    }

    public Page<Rule> list(ListRulesParams params) {
        return list(params, null);
    }

    public Page<Rule> list() {
        return list(null, null);
    }

    /** Listar reglas: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<Rule> listAutoPaging(ListRulesParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<Rule> listAutoPaging(ListRulesParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<Rule> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ordenar las reglas
     * <p>
     * rules de la primera a la última; las que no mande siguen después, en su orden. Importa cuando una tiene stop_after o dos ponen cosas distintas: corren de arriba abajo.
     * <p>
     * POST /v1/rules/order
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/reglas/order-rules
     */
    public RuleList order(OrderRulesParams params, RequestOptions options) {
        return api.request("POST", "/v1/rules/order", params, null, true, RuleList.class, options);
    }

    public RuleList order(OrderRulesParams params) {
        return order(params, null);
    }

    /**
     * Ver una regla
     * <p>
     * Una regla de la empresa del emisor.
     * <p>
     * GET /v1/rules/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/reglas/get-rule
     */
    public Rule get(String id, RequestOptions options) {
        return api.request("GET", "/v1/rules/" + ApiClient.encode(id), null, null, false, Rule.class, options);
    }

    public Rule get(String id) {
        return get(id, null);
    }

    /**
     * Cambiar una regla
     * <p>
     * Solo lo que mande cambia; conditions y actions se reemplazan completos. enabled: false la pone en pausa. Lo que ya hizo se queda.
     * <p>
     * POST /v1/rules/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/reglas/update-rule
     */
    public Rule update(String id, UpdateRuleParams params, RequestOptions options) {
        return api.request("POST", "/v1/rules/" + ApiClient.encode(id), params, null, true, Rule.class, options);
    }

    public Rule update(String id, UpdateRuleParams params) {
        return update(id, params, null);
    }

    public Rule update(String id) {
        return update(id, null, null);
    }

    /**
     * Borrar una regla
     * <p>
     * Deja de correr. Lo que ya puso (centros de costo, etiquetas, etapas) se queda; para dejarla de usar un tiempo, mejor enabled: false.
     * <p>
     * DELETE /v1/rules/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/reglas/delete-rule
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/rules/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }

    /**
     * Probar una regla
     * <p>
     * Lo que haría con una factura (uuid) o con las más recientes de su trigger, sin cambiar nada: cada condición con lo que tiene el registro y si se cumple.
     * <p>
     * POST /v1/rules/{id}/test
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/reglas/test-rule
     */
    public RuleTestList test(String id, TestRuleParams params, RequestOptions options) {
        return api.request("POST", "/v1/rules/" + ApiClient.encode(id) + "/test", params, null, true, RuleTestList.class, options);
    }

    public RuleTestList test(String id, TestRuleParams params) {
        return test(id, params, null);
    }

    public RuleTestList test(String id) {
        return test(id, null, null);
    }

    /**
     * Historial de una regla
     * <p>
     * Cada vez que corrió, la más reciente primero: sobre qué factura u orden, qué hizo (did) o por qué no pudo (error). Se guardan 180 días.
     * <p>
     * GET /v1/rules/{id}/runs
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/reglas/list-rule-runs
     */
    public Page<RuleRun> listRuns(String id, ListRuleRunsParams params, RequestOptions options) {
        return api.list("/v1/rules/" + ApiClient.encode(id) + "/runs", params, RuleRun.class, options);
    }

    public Page<RuleRun> listRuns(String id, ListRuleRunsParams params) {
        return listRuns(id, params, null);
    }

    public Page<RuleRun> listRuns(String id) {
        return listRuns(id, null, null);
    }

    /** Historial de una regla: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<RuleRun> listRunsAutoPaging(String id, ListRuleRunsParams params, RequestOptions options) {
        return listRuns(id, params, options).autoPagingIterable();
    }

    public Iterable<RuleRun> listRunsAutoPaging(String id, ListRuleRunsParams params) {
        return listRunsAutoPaging(id, params, null);
    }

    public Iterable<RuleRun> listRunsAutoPaging() {
        return listRunsAutoPaging(null, null);
    }
}
