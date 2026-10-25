// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.TaxIdValidation;
import com.fiscalisto.model.ValidateTaxIdParams;

/**
 * Clientes: client.taxIds().
 */
public final class TaxIdsService {
    private final ApiClient api;

    TaxIdsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Validar los datos fiscales de un cliente
     * <p>
     * Antes de timbrar: si el RFC, el nombre, el régimen, el código postal y el uso van a pasar. Sin cif_id revisa lo que se puede revisar sin el SAT (formato, régimen para ese tipo de persona, código postal en el catálogo, uso para el régimen, nombre sin «S.A. de C.V.») y las listas del SAT. Con el idCIF de la constancia lee el registro del SAT y compara nombre, código postal y régimen, como hará el PAC. No usa timbres.
     * <p>
     * POST /v1/tax_ids/validate
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/clientes/validate-tax-id
     */
    public TaxIdValidation validate(ValidateTaxIdParams params, RequestOptions options) {
        return api.request("POST", "/v1/tax_ids/validate", params, null, false, TaxIdValidation.class, options);
    }

    public TaxIdValidation validate(ValidateTaxIdParams params) {
        return validate(params, null);
    }
}
