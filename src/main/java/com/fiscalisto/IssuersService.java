// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.CreateIssuerOnboardingLinkParams;
import com.fiscalisto.model.CreateIssuerParams;
import com.fiscalisto.model.Issuer;
import com.fiscalisto.model.IssuerOnboardingLink;
import com.fiscalisto.model.ListIssuersParams;
import com.fiscalisto.model.SignEfirmaParams;
import com.fiscalisto.model.UpdateIssuerParams;
import com.fiscalisto.model.UploadCertificateParams;

/**
 * Emisores: client.issuers().
 */
public final class IssuersService {
    private final ApiClient api;

    IssuersService(ApiClient api) {
        this.api = api;
    }

    /**
     * Crear un emisor
     * <p>
     * Agrega un RFC que va a timbrar. Después suba su CSD (POST /v1/issuers/{id}/certificates) y, solo en producción, firme una vez el contrato con el PAC con su e.firma (POST /v1/issuers/{id}/efirma).
     * <p>
     * POST /v1/issuers
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/emisores/create-issuer
     */
    public Issuer create(CreateIssuerParams params, RequestOptions options) {
        return api.request("POST", "/v1/issuers", params, null, false, Issuer.class, options);
    }

    public Issuer create(CreateIssuerParams params) {
        return create(params, null);
    }

    /**
     * Listar emisores
     * <p>
     * GET /v1/issuers
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/emisores/list-issuers
     */
    public Page<Issuer> list(ListIssuersParams params, RequestOptions options) {
        return api.list("/v1/issuers", params, Issuer.class, options);
    }

    public Page<Issuer> list(ListIssuersParams params) {
        return list(params, null);
    }

    public Page<Issuer> list() {
        return list(null, null);
    }

    /** Listar emisores: todos, página por página ({@code for (var x : …AutoPaging(…))}). */
    public Iterable<Issuer> listAutoPaging(ListIssuersParams params, RequestOptions options) {
        return list(params, options).autoPagingIterable();
    }

    public Iterable<Issuer> listAutoPaging(ListIssuersParams params) {
        return listAutoPaging(params, null);
    }

    public Iterable<Issuer> listAutoPaging() {
        return listAutoPaging(null, null);
    }

    /**
     * Ver un emisor
     * <p>
     * GET /v1/issuers/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/emisores/get-issuer
     */
    public Issuer get(String id, RequestOptions options) {
        return api.request("GET", "/v1/issuers/" + ApiClient.encode(id), null, null, false, Issuer.class, options);
    }

    public Issuer get(String id) {
        return get(id, null);
    }

    /**
     * Actualizar un emisor
     * <p>
     * Solo cambia lo que mande. El RFC no cambia: cree otro emisor.
     * <p>
     * POST /v1/issuers/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/emisores/update-issuer
     */
    public Issuer update(String id, UpdateIssuerParams params, RequestOptions options) {
        return api.request("POST", "/v1/issuers/" + ApiClient.encode(id), params, null, false, Issuer.class, options);
    }

    public Issuer update(String id, UpdateIssuerParams params) {
        return update(id, params, null);
    }

    public Issuer update(String id) {
        return update(id, null, null);
    }

    /**
     * Archivar un emisor
     * <p>
     * Deja de timbrar; sus comprobantes se quedan.
     * <p>
     * DELETE /v1/issuers/{id}
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/emisores/archive-issuer
     */
    public Issuer archive(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/issuers/" + ApiClient.encode(id), null, null, false, Issuer.class, options);
    }

    public Issuer archive(String id) {
        return archive(id, null);
    }

    /**
     * Subir el CSD
     * <p>
     * El certificado de sello digital (.cer y .key en base64) y la contraseña de la llave. Se guarda cifrado y solo se usa para sellar. En pruebas se revisa pero se timbra con el CSD de pruebas del SAT.
     * <p>
     * POST /v1/issuers/{id}/certificates
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/emisores/upload-certificate
     */
    public Issuer uploadCertificate(String id, UploadCertificateParams params, RequestOptions options) {
        return api.request("POST", "/v1/issuers/" + ApiClient.encode(id) + "/certificates", params, null, false, Issuer.class, options);
    }

    public Issuer uploadCertificate(String id, UploadCertificateParams params) {
        return uploadCertificate(id, params, null);
    }

    /**
     * Firmar el contrato con el PAC
     * <p>
     * Una sola vez por RFC antes de timbrar en producción: firma el contrato de servicio del PAC (Finkok) con la e.firma del emisor. La e.firma se usa en memoria para esa firma y no se guarda, salvo que mande keep_for_downloads: true para pedirle al SAT las facturas del emisor (POST /v1/sat_downloads); entonces se guarda cifrada y puede borrarla con DELETE.
     * <p>
     * POST /v1/issuers/{id}/efirma
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/emisores/sign-efirma
     */
    public Issuer signEfirma(String id, SignEfirmaParams params, RequestOptions options) {
        return api.request("POST", "/v1/issuers/" + ApiClient.encode(id) + "/efirma", params, null, false, Issuer.class, options);
    }

    public Issuer signEfirma(String id, SignEfirmaParams params) {
        return signEfirma(id, params, null);
    }

    /**
     * Borrar la e.firma guardada
     * <p>
     * Borra la e.firma que guardó con keep_for_downloads. El emisor sigue timbrando; ya no puede pedir descargas al SAT hasta que la mande de nuevo.
     * <p>
     * DELETE /v1/issuers/{id}/efirma
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/emisores/delete-efirma
     */
    public Issuer deleteEfirma(String id, RequestOptions options) {
        return api.request("DELETE", "/v1/issuers/" + ApiClient.encode(id) + "/efirma", null, null, false, Issuer.class, options);
    }

    public Issuer deleteEfirma(String id) {
        return deleteEfirma(id, null);
    }

    /**
     * Crear una liga de alta
     * <p>
     * Una página en fiscalisto.com donde el dueño del emisor sube su CSD y firma el contrato con el PAC con su e.firma, sin que esos archivos ni sus contraseñas pasen por su plataforma. Mande a su cliente a url; al terminar vuelve a return_url y llega issuer.ready. Cada liga sirve para un emisor, hasta que vence.
     * <p>
     * POST /v1/issuers/{id}/onboarding_links
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/emisores/create-issuer-onboarding-link
     */
    public IssuerOnboardingLink createOnboardingLink(String id, CreateIssuerOnboardingLinkParams params, RequestOptions options) {
        return api.request("POST", "/v1/issuers/" + ApiClient.encode(id) + "/onboarding_links", params, null, false, IssuerOnboardingLink.class, options);
    }

    public IssuerOnboardingLink createOnboardingLink(String id, CreateIssuerOnboardingLinkParams params) {
        return createOnboardingLink(id, params, null);
    }

    public IssuerOnboardingLink createOnboardingLink(String id) {
        return createOnboardingLink(id, null, null);
    }
}
