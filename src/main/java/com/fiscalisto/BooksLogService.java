// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.BooksLogEntry;
import com.fiscalisto.model.ListBooksLogParams;

/**
 * Contabilidad: client.booksLog().
 */
public final class BooksLogService {
    private final ApiClient api;

    BooksLogService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar la bitácora de la contabilidad
     * <p>
     * Cada cambio a la contabilidad del RFC del emisor, del más reciente al más antiguo: pólizas a mano (también las que hacen el cierre del mes, la revaluación y los bancos), saldos iniciales, cuentas y el catálogo (que comparten los RFC del espacio), cierres y reaperturas de mes, eliminaciones de consolidación, pólizas modelo y bajas de activos. Cada uno dice quién lo hizo (un usuario, una llave de la API o un asistente) y cómo estaba antes y después. Guardar algo sin cambios no deja registro.
     * <p>
     * GET /v1/accounting/books_log
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/list-books-log
     */
    public Page<BooksLogEntry> list(ListBooksLogParams params, RequestOptions options) {
        return api.list("/v1/accounting/books_log", params, BooksLogEntry.class, options);
    }

    public Page<BooksLogEntry> list(ListBooksLogParams params) {
        return list(params, null);
    }

    public Page<BooksLogEntry> list() {
        return list(null, null);
    }

    /** Listar la bitácora de la contabilidad: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<BooksLogEntry> listAutoPaging(ListBooksLogParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<BooksLogEntry> listAutoPaging(ListBooksLogParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<BooksLogEntry> listAutoPaging() {
        return listAutoPaging(null, null);
    }
}
