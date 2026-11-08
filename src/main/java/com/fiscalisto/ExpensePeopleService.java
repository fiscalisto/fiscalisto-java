// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateExpensePersonLinkParams;
import com.fiscalisto.model.CreateExpensePersonParams;
import com.fiscalisto.model.ExpensePerson;
import com.fiscalisto.model.ExpensePersonLink;
import com.fiscalisto.model.ListExpensePeopleParams;
import com.fiscalisto.model.UpdateExpensePersonParams;

/**
 * Viáticos y gastos: client.expensePeople().
 */
public final class ExpensePeopleService {
    private final ApiClient api;

    ExpensePeopleService(ApiClient api) {
        this.api = api;
    }

    /**
     * Agregar a una persona
     * <p>
     * Alguien que viaja o gasta por el emisor: un empleado (employee, emp_…: sus anticipos y reembolsos «En la nómina» van en su siguiente recibo) o alguien por honorarios (name y tax_id). Con email, Fiscalisto le puede mandar su enlace.
     * <p>
     * POST /v1/expense_people
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/create-expense-person
     */
    public ExpensePerson create(CreateExpensePersonParams params, RequestOptions options) {
        return api.request("POST", "/v1/expense_people", params, null, true, ExpensePerson.class, options);
    }

    public ExpensePerson create(CreateExpensePersonParams params) {
        return create(params, null);
    }

    /**
     * Listar personas
     * <p>
     * Las personas que comprueban gastos del emisor, las más recientes primero. Las archivadas solo con include_archived=true.
     * <p>
     * GET /v1/expense_people
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/list-expense-people
     */
    public Page<ExpensePerson> list(ListExpensePeopleParams params, RequestOptions options) {
        return api.list("/v1/expense_people", params, ExpensePerson.class, options);
    }

    public Page<ExpensePerson> list(ListExpensePeopleParams params) {
        return list(params, null);
    }

    public Page<ExpensePerson> list() {
        return list(null, null);
    }

    /** Listar personas: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<ExpensePerson> listAutoPaging(ListExpensePeopleParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<ExpensePerson> listAutoPaging(ListExpensePeopleParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<ExpensePerson> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver una persona
     * <p>
     * Una persona que comprueba gastos del emisor.
     * <p>
     * GET /v1/expense_people/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/get-expense-person
     */
    public ExpensePerson get(String id, RequestOptions options) {
        return api.request("GET", "/v1/expense_people/" + ApiClient.encode(id), null, null, false, ExpensePerson.class, options);
    }

    public ExpensePerson get(String id) {
        return get(id, null);
    }

    /**
     * Actualizar una persona
     * <p>
     * Cambia solo lo que manda. archived: true la archiva (ya no se le abren comprobaciones y su enlace deja de funcionar), false la restaura.
     * <p>
     * POST /v1/expense_people/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/update-expense-person
     */
    public ExpensePerson update(String id, UpdateExpensePersonParams params, RequestOptions options) {
        return api.request("POST", "/v1/expense_people/" + ApiClient.encode(id), params, null, true, ExpensePerson.class, options);
    }

    public ExpensePerson update(String id, UpdateExpensePersonParams params) {
        return update(id, params, null);
    }

    public ExpensePerson update(String id) {
        return update(id, null, null);
    }

    /**
     * Dar su enlace a una persona
     * <p>
     * El enlace donde la persona ve solo sus comprobaciones y sube sus facturas desde el teléfono, sin cuenta. Con renew: true le da uno nuevo y el anterior deja de funcionar.
     * <p>
     * POST /v1/expense_people/{id}/link
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/create-expense-person-link
     */
    public ExpensePersonLink createLink(String id, CreateExpensePersonLinkParams params, RequestOptions options) {
        return api.request("POST", "/v1/expense_people/" + ApiClient.encode(id) + "/link", params, null, true, ExpensePersonLink.class, options);
    }

    public ExpensePersonLink createLink(String id, CreateExpensePersonLinkParams params) {
        return createLink(id, params, null);
    }

    public ExpensePersonLink createLink(String id) {
        return createLink(id, null, null);
    }

    /**
     * Apagar el enlace de una persona
     * <p>
     * Su enlace deja de funcionar (url: null). Puede darle uno nuevo después con POST /v1/expense_people/{id}/link.
     * <p>
     * DELETE /v1/expense_people/{id}/link
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/viaticos-y-gastos/delete-expense-person-link
     */
    public ExpensePersonLink deleteLink(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/expense_people/" + ApiClient.encode(id) + "/link", null, null, false, ExpensePersonLink.class, options);
    }

    public ExpensePersonLink deleteLink(String id) {
        return deleteLink(id, null);
    }
}
