// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ConsolidationElimination;
import com.fiscalisto.model.ConsolidationEliminationList;
import com.fiscalisto.model.CreateConsolidationEliminationParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.ListConsolidationEliminationsParams;
import com.fiscalisto.model.UpdateConsolidationEliminationParams;

/**
 * Contabilidad: client.consolidationEliminations().
 */
public final class ConsolidationEliminationsService {
    private final ApiClient api;

    ConsolidationEliminationsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar las eliminaciones de consolidación de un mes
     * <p>
     * Las eliminaciones capturadas para el mes: lo que el consolidado resta al cierre de ese mes (ventas, saldos e inversiones entre los RFC).
     * <p>
     * GET /v1/accounting/consolidation_eliminations
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/list-consolidation-eliminations
     */
    public ConsolidationEliminationList list(ListConsolidationEliminationsParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/consolidation_eliminations", null, params, false, ConsolidationEliminationList.class, options);
    }

    public ConsolidationEliminationList list(ListConsolidationEliminationsParams params) {
        return list(params, null);
    }

    /**
     * Capturar una eliminación de consolidación
     * <p>
     * Guarda una eliminación del mes entre los RFC que dice: renglones de cargo y abono que cuadran, sobre cuentas de su catálogo. Cada mes lleva sus eliminaciones completas a esa fecha (las ventas entre ellos del año hasta ese mes y los saldos entre ellos al cierre), como una hoja de consolidación. Solo cambia el consolidado, nunca los libros de un RFC.
     * <p>
     * POST /v1/accounting/consolidation_eliminations
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/create-consolidation-elimination
     */
    public ConsolidationElimination create(CreateConsolidationEliminationParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/consolidation_eliminations", params, null, true, ConsolidationElimination.class, options);
    }

    public ConsolidationElimination create(CreateConsolidationEliminationParams params) {
        return create(params, null);
    }

    /**
     * Cambiar una eliminación de consolidación
     * <p>
     * La reemplaza con lo que manda.
     * <p>
     * POST /v1/accounting/consolidation_eliminations/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/update-consolidation-elimination
     */
    public ConsolidationElimination update(String id, UpdateConsolidationEliminationParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/consolidation_eliminations/" + ApiClient.encode(id), params, null, true, ConsolidationElimination.class, options);
    }

    public ConsolidationElimination update(String id, UpdateConsolidationEliminationParams params) {
        return update(id, params, null);
    }

    /**
     * Borrar una eliminación de consolidación
     * <p>
     * Solo cambia el consolidado: los libros de cada RFC siguen igual.
     * <p>
     * DELETE /v1/accounting/consolidation_eliminations/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/delete-consolidation-elimination
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/accounting/consolidation_eliminations/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }
}
