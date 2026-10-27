// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto;

import com.fiscalisto.model.ComplianceOpinion;
import com.fiscalisto.model.CreateIssuerOnboardingLinkParams;
import com.fiscalisto.model.CreateIssuerParams;
import com.fiscalisto.model.Issuer;
import com.fiscalisto.model.IssuerOnboardingLink;
import com.fiscalisto.model.ListIssuersParams;
import com.fiscalisto.model.SatRefresh;
import com.fiscalisto.model.SelfInvoicing;
import com.fiscalisto.model.SignEfirmaParams;
import com.fiscalisto.model.TaxStatusCertificate;
import com.fiscalisto.model.UpdateIssuerParams;
import com.fiscalisto.model.UpdateSelfInvoicingParams;
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
        return api.request("POST", "/v1/issuers", params, null, true, Issuer.class, options);
    }

    public Issuer create(CreateIssuerParams params) {
        return create(params, null);
    }

    /**
     * Listar emisores
     * <p>
     * Los emisores de la cuenta en el modo de la llave, los más recientes primero. Una llave limitada a algunos emisores solo ve los suyos.
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
     * Un emisor: sus datos fiscales, si ya puede timbrar (status, CSD y contrato con el PAC) y su registro patronal.
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
        return api.request("POST", "/v1/issuers/" + ApiClient.encode(id), params, null, true, Issuer.class, options);
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
        return api.request("POST", "/v1/issuers/" + ApiClient.encode(id) + "/certificates", params, null, true, Issuer.class, options);
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
        return api.request("POST", "/v1/issuers/" + ApiClient.encode(id) + "/efirma", params, null, true, Issuer.class, options);
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
        return api.request("POST", "/v1/issuers/" + ApiClient.encode(id) + "/onboarding_links", params, null, true, IssuerOnboardingLink.class, options);
    }

    public IssuerOnboardingLink createOnboardingLink(String id, CreateIssuerOnboardingLinkParams params) {
        return createOnboardingLink(id, params, null);
    }

    public IssuerOnboardingLink createOnboardingLink(String id) {
        return createOnboardingLink(id, null, null);
    }

    /**
     * Ver la opinión de cumplimiento (32-D)
     * <p>
     * La última opinión que trajo del SAT: positiva, negativa (con sus motivos), sin obligaciones o en suspensión. result es null hasta la primera consulta. No usa timbres.
     * <p>
     * GET /v1/issuers/{id}/compliance_opinion
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/get-compliance-opinion
     */
    public ComplianceOpinion complianceOpinion(String id, RequestOptions options) {
        return api.request("GET", "/v1/issuers/" + ApiClient.encode(id) + "/compliance_opinion", null, null, false, ComplianceOpinion.class, options);
    }

    public ComplianceOpinion complianceOpinion(String id) {
        return complianceOpinion(id, null);
    }

    /**
     * Pedir la opinión de cumplimiento al SAT
     * <p>
     * La pide al SAT ahora con la e.firma guardada del emisor (POST /v1/issuers/{id}/efirma con keep_for_downloads: true). 1 timbre en producción, una vez cada 10 minutos; regresa si el SAT no contesta. Si el SAT tarda, contesta status processing y el resultado llega a GET /v1/issuers/{id}/compliance_opinion. En pruebas da una positiva de ejemplo.
     * <p>
     * POST /v1/issuers/{id}/compliance_opinion/refresh
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/refresh-compliance-opinion
     */
    public SatRefresh refreshComplianceOpinion(String id, RequestOptions options) {
        return api.request("POST", "/v1/issuers/" + ApiClient.encode(id) + "/compliance_opinion/refresh", null, null, true, SatRefresh.class, options);
    }

    public SatRefresh refreshComplianceOpinion(String id) {
        return refreshComplianceOpinion(id, null);
    }

    /**
     * Descargar el PDF de la opinión de cumplimiento
     * <p>
     * El PDF de la última opinión, como lo da el SAT. No usa timbres.
     * <p>
     * GET /v1/issuers/{id}/compliance_opinion/pdf
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/get-compliance-opinion-pdf
     */
    public byte[] complianceOpinionPdf(String id, RequestOptions options) {
        return api.bytes("GET", "/v1/issuers/" + ApiClient.encode(id) + "/compliance_opinion/pdf", null, null, false, options);
    }

    public byte[] complianceOpinionPdf(String id) {
        return complianceOpinionPdf(id, null);
    }

    /**
     * Ver la constancia de situación fiscal
     * <p>
     * Lo que dice la última constancia generada: razón social, regímenes, código postal, estatus en el padrón e idCIF. No usa timbres.
     * <p>
     * GET /v1/issuers/{id}/tax_status_certificate
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/get-tax-status-certificate
     */
    public TaxStatusCertificate taxStatusCertificate(String id, RequestOptions options) {
        return api.request("GET", "/v1/issuers/" + ApiClient.encode(id) + "/tax_status_certificate", null, null, false, TaxStatusCertificate.class, options);
    }

    public TaxStatusCertificate taxStatusCertificate(String id) {
        return taxStatusCertificate(id, null);
    }

    /**
     * Generar la constancia de situación fiscal en el SAT
     * <p>
     * Genera una constancia nueva con la e.firma guardada del emisor. 1 timbre en producción, una vez cada 10 minutos; regresa si el SAT no contesta. En pruebas hace una con los datos del emisor.
     * <p>
     * POST /v1/issuers/{id}/tax_status_certificate/refresh
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/refresh-tax-status-certificate
     */
    public SatRefresh refreshTaxStatusCertificate(String id, RequestOptions options) {
        return api.request("POST", "/v1/issuers/" + ApiClient.encode(id) + "/tax_status_certificate/refresh", null, null, true, SatRefresh.class, options);
    }

    public SatRefresh refreshTaxStatusCertificate(String id) {
        return refreshTaxStatusCertificate(id, null);
    }

    /**
     * Descargar el PDF de la constancia
     * <p>
     * El PDF de la última constancia, como lo da el SAT. No usa timbres.
     * <p>
     * GET /v1/issuers/{id}/tax_status_certificate/pdf
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/get-tax-status-certificate-pdf
     */
    public byte[] taxStatusCertificatePdf(String id, RequestOptions options) {
        return api.bytes("GET", "/v1/issuers/" + ApiClient.encode(id) + "/tax_status_certificate/pdf", null, null, false, options);
    }

    public byte[] taxStatusCertificatePdf(String id) {
        return taxStatusCertificatePdf(id, null);
    }

    /**
     * Revisar el buzón tributario en el SAT
     * <p>
     * Lee los avisos del buzón tributario del emisor ahora, con su e.firma guardada; nunca abre notificaciones (abrirlas firma el acuse y corren los plazos). 1 timbre en producción, una vez cada 10 minutos. En pruebas deja dos avisos de ejemplo.
     * <p>
     * POST /v1/issuers/{id}/sat_mailbox/refresh
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/cumplimiento-sat/refresh-sat-mailbox
     */
    public SatRefresh refreshSatMailbox(String id, RequestOptions options) {
        return api.request("POST", "/v1/issuers/" + ApiClient.encode(id) + "/sat_mailbox/refresh", null, null, true, SatRefresh.class, options);
    }

    public SatRefresh refreshSatMailbox(String id) {
        return refreshSatMailbox(id, null);
    }

    /**
     * Ver el portal de autofactura de un emisor
     * <p>
     * El portal de autofactura del emisor: su dirección, hasta cuándo se puede facturar un ticket y cómo se arma la factura global.
     * <p>
     * GET /v1/issuers/{id}/self_invoicing
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/autofactura/get-self-invoicing
     */
    public SelfInvoicing getSelfInvoicing(String id, RequestOptions options) {
        return api.request("GET", "/v1/issuers/" + ApiClient.encode(id) + "/self_invoicing", null, null, false, SelfInvoicing.class, options);
    }

    public SelfInvoicing getSelfInvoicing(String id) {
        return getSelfInvoicing(id, null);
    }

    /**
     * Cambiar las reglas de autofactura
     * <p>
     * Hasta cuándo se puede facturar un ticket y cada cuánto se timbra la factura global.
     * <p>
     * POST /v1/issuers/{id}/self_invoicing
     * <p>
     * Vea https://fiscalisto.com/docs/api/referencia/autofactura/update-self-invoicing
     */
    public SelfInvoicing updateSelfInvoicing(String id, UpdateSelfInvoicingParams params, RequestOptions options) {
        return api.request("POST", "/v1/issuers/" + ApiClient.encode(id) + "/self_invoicing", params, null, true, SelfInvoicing.class, options);
    }

    public SelfInvoicing updateSelfInvoicing(String id, UpdateSelfInvoicingParams params) {
        return updateSelfInvoicing(id, params, null);
    }

    public SelfInvoicing updateSelfInvoicing(String id) {
        return updateSelfInvoicing(id, null, null);
    }
}
