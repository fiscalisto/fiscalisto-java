// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreatePayrollBatchParams;
import com.fiscalisto.model.ListPayrollBatchesParams;
import com.fiscalisto.model.PayrollBatch;

/**
 * Nómina: client.payrollBatches().
 */
public final class PayrollBatchesService {
    private final ApiClient api;

    PayrollBatchesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Timbrar una nómina completa (lote)
     * <p>
     * Toda una corrida de nómina en una solicitud: hasta 1,000 recibos de un emisor, timbrados en segundo plano uno tras otro, sin el límite de timbres por segundo de una sola solicitud. De una de dos formas, nunca mezcladas: receipts (ids de empleado; Fiscalisto calcula cada recibo con el periodo del lote) o external_receipts (los recibos que calculó su sistema, como en POST /v1/payroll_receipts/external, con reference en lugar de metadata). Todo lo que se puede revisar antes se revisa antes: si algo falla, no se timbra ninguno y el error dice qué recibo (param receipts.3.employee). Lo que solo se sabe al timbrar (un periodo ya pagado, el SAT que rechaza un RFC) queda en ese recibo, con su error. Un recibo por empleado y periodo: mandar la corrida otra vez, aun con otra Idempotency-Key, devuelve los recibos que ya tiene. Responde 202; escuche payroll_batch.completed o consulte el lote.
     * <p>
     * POST /v1/payroll_batches
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/create-payroll-batch
     */
    public PayrollBatch create(CreatePayrollBatchParams params, RequestOptions options) {
        return api.request("POST", "/v1/payroll_batches", params, null, true, PayrollBatch.class, options);
    }

    public PayrollBatch create(CreatePayrollBatchParams params) {
        return create(params, null);
    }

    public PayrollBatch create() {
        return create(null, null);
    }

    /**
     * Listar lotes de nómina
     * <p>
     * Los lotes de nómina, los más recientes primero, con cuántos recibos se timbraron y cuántos no.
     * <p>
     * GET /v1/payroll_batches
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/list-payroll-batches
     */
    public Page<PayrollBatch> list(ListPayrollBatchesParams params, RequestOptions options) {
        return api.list("/v1/payroll_batches", params, PayrollBatch.class, options);
    }

    public Page<PayrollBatch> list(ListPayrollBatchesParams params) {
        return list(params, null);
    }

    public Page<PayrollBatch> list() {
        return list(null, null);
    }

    /** Listar lotes de nómina: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<PayrollBatch> listAutoPaging(ListPayrollBatchesParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<PayrollBatch> listAutoPaging(ListPayrollBatchesParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<PayrollBatch> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un lote de nómina
     * <p>
     * Con el recibo de cada empleado: timbrado (su factura y UUID) o por qué no (error.code y error.message).
     * <p>
     * GET /v1/payroll_batches/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/get-payroll-batch
     */
    public PayrollBatch get(String id, RequestOptions options) {
        return api.request("GET", "/v1/payroll_batches/" + ApiClient.encode(id), null, null, false, PayrollBatch.class, options);
    }

    public PayrollBatch get(String id) {
        return get(id, null);
    }
}
