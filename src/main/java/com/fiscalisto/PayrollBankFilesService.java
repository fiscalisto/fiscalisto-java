// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreatePayrollBankFileParams;
import com.fiscalisto.model.PayrollBankFile;

/**
 * Nómina: client.payrollBankFiles().
 */
public final class PayrollBankFilesService {
    private final ApiClient api;

    PayrollBankFilesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Archivo para pagar la nómina en el banco
     * <p>
     * El archivo de dispersión que paga el neto de cada empleado desde el portal de su banco: BBVA (Net Cash), Banamex (BancaNet, layout D), Banorte (Banorte en su Empresa), Santander (Enlace) o un CSV de SPEI para cualquier banco. Toma los recibos de nómina timbrados (y no cancelados) con esa fecha de pago, los suma por empleado y le paga a la CLABE de su ficha (clabe en el empleado): a la misma institución por cuenta, a otra por SPEI. No cobra ni mueve dinero: usted lo sube al banco y lo autoriza ahí. Quien no se puede pagar (sin CLABE, otro banco en Santander) va en excluded con su razón. Suba el primero como prueba: cada portal lo valida antes de cargar nada.
     * <p>
     * POST /v1/payroll_bank_files
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/create-payroll-bank-file
     */
    public PayrollBankFile create(CreatePayrollBankFileParams params, RequestOptions options) {
        return api.request("POST", "/v1/payroll_bank_files", params, null, true, PayrollBankFile.class, options);
    }

    public PayrollBankFile create(CreatePayrollBankFileParams params) {
        return create(params, null);
    }
}
