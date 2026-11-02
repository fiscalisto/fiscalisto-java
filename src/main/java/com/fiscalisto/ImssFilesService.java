// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateImssFilesParams;
import com.fiscalisto.model.ImssFiles;

/**
 * Nómina: client.imssFiles().
 */
public final class ImssFilesService {
    private final ApiClient api;

    ImssFilesService(ApiClient api) {
        this.api = api;
    }

    /**
     * Archivos para IDSE o SUA
     * <p>
     * Los archivos de los movimientos pendientes: para IDSE (formato de 168 posiciones, un archivo por tipo: reingresos, modificaciones de salario y bajas; necesita la guía de su subdelegación) o para importar en SUA (ASEG.TXT con las altas y MOVT.TXT con los demás). El salario se declara topado a 25 UMA y nunca abajo del mínimo. El emisor necesita employer_registration. Los que el IMSS rechazaría van en refused con su razón. No los marca como presentados: hágalo con POST /v1/imss_movements/report cuando el IMSS los reciba.
     * <p>
     * POST /v1/imss_files
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/nomina/create-imss-files
     */
    public ImssFiles create(CreateImssFilesParams params, RequestOptions options) {
        return api.request("POST", "/v1/imss_files", params, null, true, ImssFiles.class, options);
    }

    public ImssFiles create(CreateImssFilesParams params) {
        return create(params, null);
    }
}
