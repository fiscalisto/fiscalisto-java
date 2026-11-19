// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateFixedAssetParams;
import com.fiscalisto.model.Deleted;
import com.fiscalisto.model.DisposeFixedAssetParams;
import com.fiscalisto.model.FixedAsset;
import com.fiscalisto.model.FixedAssetList;
import com.fiscalisto.model.ListFixedAssetsParams;

/**
 * Contabilidad: client.fixedAssets().
 */
public final class FixedAssetsService {
    private final ApiClient api;

    FixedAssetsService(ApiClient api) {
        this.api = api;
    }

    /**
     * Listar los activos fijos
     * <p>
     * Los activos fijos del emisor al cierre de un mes: los que llegaron con una factura recibida de uso I01 a I08 (fxc_…) y los capturados sin ella (fxa_…), con su depreciación mensual y acumulada y su valor en libros.
     * <p>
     * GET /v1/accounting/fixed_assets
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/list-fixed-assets
     */
    public FixedAssetList list(ListFixedAssetsParams params, RequestOptions options) {
        return api.request("GET", "/v1/accounting/fixed_assets", null, params, false, FixedAssetList.class, options);
    }

    public FixedAssetList list(ListFixedAssetsParams params) {
        return list(params, null);
    }

    public FixedAssetList list() {
        return list(null, null);
    }

    /**
     * Agregar un activo fijo sin factura
     * <p>
     * Uno que compró antes de usar Fiscalisto o cuya factura no está aquí. Se deprecia cada mes desde el siguiente a in_use_since, en la contabilidad y en el cálculo del ISR. Su costo no entra solo a los libros: va en los saldos iniciales o en una póliza (POST /v1/accounting/manual_entries).
     * <p>
     * POST /v1/accounting/fixed_assets
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/create-fixed-asset
     */
    public FixedAsset create(CreateFixedAssetParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/fixed_assets", params, null, true, FixedAsset.class, options);
    }

    public FixedAsset create(CreateFixedAssetParams params) {
        return create(params, null);
    }

    /**
     * Ver un activo fijo
     * <p>
     * Un activo fijo, con sus cifras al cierre del mes actual.
     * <p>
     * GET /v1/accounting/fixed_assets/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/get-fixed-asset
     */
    public FixedAsset get(String id, RequestOptions options) {
        return api.request("GET", "/v1/accounting/fixed_assets/" + ApiClient.encode(id), null, null, false, FixedAsset.class, options);
    }

    public FixedAsset get(String id) {
        return get(id, null);
    }

    /**
     * Borrar un activo fijo capturado
     * <p>
     * Solo uno capturado sin factura (fxa_…); uno con CFDI contesta asset_from_cfdi: véndalo o dele de baja.
     * <p>
     * DELETE /v1/accounting/fixed_assets/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/delete-fixed-asset
     */
    public Deleted delete(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/accounting/fixed_assets/" + ApiClient.encode(id), null, null, false, Deleted.class, options);
    }

    public Deleted delete(String id) {
        return delete(id, null);
    }

    /**
     * Vender o dar de baja un activo fijo
     * <p>
     * Deja de depreciarse el mes de date, y ese día una póliza (asset_disposal) cancela el activo y su depreciación acumulada; su valor en libros va a pérdida en venta o baja (703). El ingreso de una venta entra con la factura que emita. Uno ya dado de baja contesta asset_already_disposed.
     * <p>
     * POST /v1/accounting/fixed_assets/{id}/dispose
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/dispose-fixed-asset
     */
    public FixedAsset dispose(String id, DisposeFixedAssetParams params, RequestOptions options) {
        return api.request("POST", "/v1/accounting/fixed_assets/" + ApiClient.encode(id) + "/dispose", params, null, true, FixedAsset.class, options);
    }

    public FixedAsset dispose(String id, DisposeFixedAssetParams params) {
        return dispose(id, params, null);
    }

    /**
     * Deshacer la baja de un activo fijo
     * <p>
     * El activo vuelve a depreciarse como si nunca se hubiera dado de baja.
     * <p>
     * DELETE /v1/accounting/fixed_assets/{id}/disposal
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/contabilidad/undispose-fixed-asset
     */
    public FixedAsset undispose(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/accounting/fixed_assets/" + ApiClient.encode(id) + "/disposal", null, null, false, FixedAsset.class, options);
    }

    public FixedAsset undispose(String id) {
        return undispose(id, null);
    }
}
