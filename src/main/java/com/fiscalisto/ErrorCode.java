// Generado por `bun run openapi` desde la lista de errores de la API: no lo edite.

package com.fiscalisto;

/**
 * Los códigos de error de la API, para comparar {@code e.getCode()} sin escribir el texto:
 * {@code if (ErrorCode.INVOICE_REJECTED.equals(e.getCode()))}. Vea https://fiscalisto.com/docs/api/errores.
 */
public final class ErrorCode {
    private ErrorCode() {}

    /** Una factura del lote no pasa la revisión; param dice cuál (invoices.3.items.0.unit_price). Ninguna del lote se timbró. */
    public static final String BATCH_INVALID = "batch_invalid";

    /** El cuerpo pasa de 10 MB. Divida el trabajo en varios lotes. */
    public static final String BODY_TOO_LARGE = "body_too_large";

    /** La API se llama desde su servidor, nunca desde el navegador: la llave secreta quedaría expuesta. */
    public static final String BROWSER_NOT_SUPPORTED = "browser_not_supported";

    /** El SAT no aceptó la solicitud de cancelación; message dice por qué. */
    public static final String CANCELLATION_FAILED = "cancellation_failed";

    /** El catálogo del SAT no respondió (503). Reintente en unos segundos. */
    public static final String CATALOG_UNAVAILABLE = "catalog_unavailable";

    /** El CSD no sirve: no es un certificado de sello (es una e.firma), está vencido, el .key no corresponde o la contraseña no abre la llave. */
    public static final String CERTIFICATE_INVALID = "certificate_invalid";

    /** Suba primero el CSD del emisor; después firme el contrato con su e.firma. */
    public static final String CERTIFICATE_REQUIRED = "certificate_required";

    /** No se pudo conectar con la API (connection_error). */
    public static final String CONNECTION_FAILED = "connection_failed";

    /** Ya hay un cliente con ese RFC en el catálogo del emisor (o un producto con ese SKU). */
    public static final String CUSTOMER_EXISTS = "customer_exists";

    /** Llegó al tope del día de algo que no se paga con timbres: comprobantes en pruebas (1,000), RFC revisados en las listas del SAT o constancias consultadas. Retry-After dice cuántos segundos faltan para la medianoche de la Ciudad de México. */
    public static final String DAILY_LIMIT = "daily_limit";

    /** El cliente ya mandó sus datos con esa liga: una solicitud completada no se cancela. */
    public static final String DATA_REQUEST_COMPLETED = "data_request_completed";

    /** La e.firma no sirve: no es una e.firma (es un CSD), es de otro RFC, está vencida o la contraseña no abre la llave. */
    public static final String EFIRMA_INVALID = "efirma_invalid";

    /** Para pedirle al SAT las facturas de un emisor en producción, guarde antes su e.firma: POST /v1/issuers/{id}/efirma con keep_for_downloads: true. También si la guardada venció. */
    public static final String EFIRMA_REQUIRED = "efirma_required";

    /** No se pudo mandar el correo; el comprobante sí está timbrado. */
    public static final String EMAIL_FAILED = "email_failed";

    /** La cuenta llegó al máximo de webhooks en este modo. */
    public static final String ENDPOINT_LIMIT = "endpoint_limit";

    /** Lo que timbra exige el encabezado Idempotency-Key (8 a 255 caracteres, uno nuevo por comprobante). Así un reintento nunca timbra dos veces. */
    public static final String IDEMPOTENCY_KEY_MISSING = "idempotency_key_missing";

    /** Esa Idempotency-Key ya se usó con otro cuerpo. Use una nueva para un comprobante distinto. */
    public static final String IDEMPOTENCY_KEY_REUSED = "idempotency_key_reused";

    /** La cuenta no tiene timbres de producción. Compre un paquete en Desarrolladores › Timbres. En pruebas nunca pasa. Para enterarse antes, escuche balance.low o active la recarga automática. */
    public static final String INSUFFICIENT_BALANCE = "insufficient_balance";

    /** Algo falló de nuestro lado. Repita la solicitud con la misma Idempotency-Key: nunca se timbra dos veces. Si sigue, escríbanos con el request_id. */
    public static final String INTERNAL_ERROR = "internal_error";

    /** La llave no existe, se revocó o expiró. Cree otra en Desarrolladores › Llaves. */
    public static final String INVALID_API_KEY = "invalid_api_key";

    /** El cuerpo no es un objeto JSON válido. */
    public static final String INVALID_JSON = "invalid_json";

    /** La factura no cumple una regla del SAT que Fiscalisto revisa antes de mandarla al PAC (uso contra régimen, totales, complementos…). No se usó ningún timbre. */
    public static final String INVOICE_INVALID = "invoice_invalid";

    /** La acción es para facturas timbradas (enviar, cancelar, sustituir). */
    public static final String INVOICE_NOT_STAMPED = "invoice_not_stamped";

    /** El PAC o el SAT no la aceptaron. sat_code trae su código (CFDI40xxx) y message qué corregir. La factura queda como rejected; no se usó ningún timbre. */
    public static final String INVOICE_REJECTED = "invoice_rejected";

    /** El emisor está archivado: ya no timbra. Sus comprobantes se pueden consultar y cancelar. */
    public static final String ISSUER_ARCHIVED = "issuer_archived";

    /** Se crearon 500 emisores en 24 horas. Escríbanos si necesita más. */
    public static final String ISSUER_CREATION_LIMIT = "issuer_creation_limit";

    /** Ese RFC ya es un emisor de la cuenta en este modo. */
    public static final String ISSUER_EXISTS = "issuer_exists";

    /** No existe ese emisor en la cuenta (o es del otro modo). */
    public static final String ISSUER_MISSING = "issuer_missing";

    /** La llave no puede usar ese emisor. */
    public static final String ISSUER_NOT_ALLOWED = "issuer_not_allowed";

    /** La cuenta tiene varios emisores y la solicitud no dice cuál: mande issuer (iss_…). */
    public static final String ISSUER_REQUIRED = "issuer_required";

    /** La llave es de solo lectura: puede hacer GET, validar RFC, revisar listas del SAT y calcular recibos de nómina, pero nada que timbre, cancele, envíe o cambie datos. */
    public static final String KEY_READ_ONLY = "key_read_only";

    /** La llave está limitada a algunos emisores y la solicitud toca otro (o crea uno nuevo, o usa algo de toda la cuenta como webhooks). */
    public static final String KEY_RESTRICTED = "key_restricted";

    /** El objeto es del otro modo: una llave fk_test_ solo ve lo de pruebas y una fk_live_ lo de producción. */
    public static final String LIVEMODE_MISMATCH = "livemode_mismatch";

    /** La ruta existe pero no con ese método (por ejemplo, PUT: la API usa POST para actualizar). */
    public static final String METHOD_NOT_ALLOWED = "method_not_allowed";

    /** Falta el encabezado Authorization: Bearer fk_test_… o fk_live_…. */
    public static final String MISSING_API_KEY = "missing_api_key";

    /** Un campo tiene un valor que no se acepta (formato, catálogo del SAT, rango). param dice cuál y message cómo corregirlo. */
    public static final String PARAMETER_INVALID = "parameter_invalid";

    /** Falta un campo obligatorio. param dice cuál. */
    public static final String PARAMETER_MISSING = "parameter_missing";

    /** Mandó un campo que no existe (casi siempre un nombre mal escrito, como legalName en vez de legal_name). Nunca se ignora en silencio. */
    public static final String PARAMETER_UNKNOWN = "parameter_unknown";

    /** El recibo de nómina no se puede calcular o timbrar con esos datos (periodo, días, registro patronal del emisor…). */
    public static final String PAYROLL_INVALID = "payroll_invalid";

    /** Demasiadas solicitudes con la llave. Espere lo que dice Retry-After y reintente. */
    public static final String RATE_LIMIT = "rate_limit";

    /** Otra solicitud con la misma Idempotency-Key sigue en proceso. Espere un momento y repítala. */
    public static final String REQUEST_IN_PROGRESS = "request_in_progress";

    /** No existe un objeto con ese id (o es de otro emisor o del otro modo). */
    public static final String RESOURCE_MISSING = "resource_missing";

    /** La constancia de retenciones no cumple una regla del SAT. No se usó ningún timbre. */
    public static final String RETENTION_INVALID = "retention_invalid";

    /** La acción es para constancias timbradas. */
    public static final String RETENTION_NOT_STAMPED = "retention_not_stamped";

    /** El PAC o el SAT no aceptaron la constancia; sat_code trae su código. */
    public static final String RETENTION_REJECTED = "retention_rejected";

    /** No existe esa ruta. Revise la dirección y la versión (/v1). */
    public static final String ROUTE_NOT_FOUND = "route_not_found";

    /** El SAT rechazó la solicitud de descarga. El mensaje trae su motivo, por ejemplo que ya se pidió el mismo periodo con los mismos filtros demasiadas veces (el SAT pone un límite de por vida). */
    public static final String SAT_REQUEST_REJECTED = "sat_request_rejected";

    /** Demasiados timbres seguidos del mismo emisor. Espere lo que dice Retry-After; para muchas facturas use POST /v1/invoice_batches. */
    public static final String STAMP_RATE_LIMIT = "stamp_rate_limit";

    /** Los complementos de pago y las notas de crédito no se sustituyen: se cancelan y se emite otro. */
    public static final String SUBSTITUTION_UNSUPPORTED = "substitution_unsupported";

    /** Esto solo existe en pruebas (como reiniciar los datos de prueba): use su llave fk_test_. */
    public static final String TEST_MODE_ONLY = "test_mode_only";

    /** La API no contestó a tiempo (connection_error). Con lo que timbra, repita con la misma Idempotency-Key para saber si se timbró. */
    public static final String TIMEOUT = "timeout";

    /** Mande el cuerpo con Content-Type: application/json. */
    public static final String UNSUPPORTED_CONTENT_TYPE = "unsupported_content_type";
}
