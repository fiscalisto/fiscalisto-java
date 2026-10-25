// Generado por `bun run openapi` desde la lista de errores de la API: no lo edite.

package com.fiscalisto;

/**
 * Los códigos de error de la API, para comparar {@code e.getCode()} sin escribir el texto:
 * {@code if (ErrorCode.INVOICE_REJECTED.equals(e.getCode()))}. Vea https://fiscalisto.com/docs/api/errores.
 */
public final class ErrorCode {
    private ErrorCode() {}

    /** El depósito no se puede conciliar, clasificar o reabrir así (ya está conciliado, las facturas son de otro cliente o una está cancelada…). El mensaje dice por qué. */
    public static final String BANK_TRANSACTION_INVALID = "bank_transaction_invalid";

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

    /** El mes no tiene pagos a proveedores: esa DIOT se presenta sin operaciones desde el portal del SAT. */
    public static final String DIOT_EMPTY = "diot_empty";

    /** La e.firma no sirve: no es una e.firma (es un CSD), es de otro RFC, está vencida o la contraseña no abre la llave. */
    public static final String EFIRMA_INVALID = "efirma_invalid";

    /** Para pedirle al SAT las facturas de un emisor en producción, guarde antes su e.firma: POST /v1/issuers/{id}/efirma con keep_for_downloads: true. También si la guardada venció. */
    public static final String EFIRMA_REQUIRED = "efirma_required";

    /** No se pudo mandar el correo; el comprobante sí está timbrado. */
    public static final String EMAIL_FAILED = "email_failed";

    /** La cuenta llegó al máximo de webhooks en este modo. */
    public static final String ENDPOINT_LIMIT = "endpoint_limit";

    /** Idempotency-Key es de 1 a 255 caracteres ASCII, sin acentos ni ñ: el id de su pedido o un UUID. */
    public static final String IDEMPOTENCY_KEY_INVALID = "idempotency_key_invalid";

    /** Lo que timbra exige el encabezado Idempotency-Key (8 a 255 caracteres, uno nuevo por comprobante). Así un reintento nunca timbra dos veces. */
    public static final String IDEMPOTENCY_KEY_MISSING = "idempotency_key_missing";

    /** Esa Idempotency-Key ya se usó en las últimas 24 horas con otra solicitud (otra ruta u otro cuerpo). Use una nueva para cada operación distinta. */
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

    /** Solo una factura de ingreso PUE vigente se marca pagada o por cobrar; una PPD se paga con su complemento de pago (type P). */
    public static final String INVOICE_NOT_MARKABLE = "invoice_not_markable";

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

    /** La llave es de un entorno de prueba y la solicitud es de toda la cuenta (como crear o borrar entornos): use una llave de pruebas de la cuenta. */
    public static final String KEY_IN_SANDBOX = "key_in_sandbox";

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

    /** La cotización no tiene los datos fiscales del cliente: agrégueselos con POST /v1/quotes/{id} (customer) o mándela con auto_invoice para que los dé al aceptarla. */
    public static final String QUOTE_CUSTOMER_MISSING = "quote_customer_missing";

    /** La cotización no se pudo guardar o ya no cambia (aceptada, rechazada o facturada), o no se puede mandar así. El mensaje dice por qué. */
    public static final String QUOTE_INVALID = "quote_invalid";

    /** Solo se borra una cotización que nunca se envió. */
    public static final String QUOTE_NOT_DRAFT = "quote_not_draft";

    /** La cotización se rechazó o venció: no se factura. Si venció, cámbiele valid_until (es una versión nueva). */
    public static final String QUOTE_NOT_INVOICEABLE = "quote_not_invoiceable";

    /** Demasiadas solicitudes con la llave. Espere lo que dice Retry-After y reintente. */
    public static final String RATE_LIMIT = "rate_limit";

    /** La factura recurrente no se pudo guardar: el día, la hora, la zona o la factura no son válidos. El mensaje dice cuál. */
    public static final String RECURRING_INVALID = "recurring_invalid";

    /** El emisor ya tiene el máximo de facturas recurrentes activas (25 en pruebas, 5,000 en producción). Pause o borre las que ya no use. */
    public static final String RECURRING_LIMIT = "recurring_limit";

    /** Aún no toca timbrar la factura recurrente (409): su next_invoice_on es después de hoy. Para una factura antes de tiempo, use POST /v1/invoices. */
    public static final String RECURRING_NOT_DUE = "recurring_not_due";

    /** La factura recurrente está en pausa: reanúdela con active: true para timbrarla. */
    public static final String RECURRING_PAUSED = "recurring_paused";

    /** Otra solicitud con la misma Idempotency-Key sigue en proceso (409, con Retry-After). Repítala en un momento con la misma llave: contestará lo mismo. */
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

    /** No se pudo crear el entorno de prueba: falta su nombre o la cuenta ya tiene 25 (borre uno que ya no use). */
    public static final String SANDBOX_INVALID = "sandbox_invalid";

    /** El SAT rechazó la solicitud de descarga. El mensaje trae su motivo, por ejemplo que ya se pidió el mismo periodo con los mismos filtros demasiadas veces (el SAT pone un límite de por vida). */
    public static final String SAT_REQUEST_REJECTED = "sat_request_rejected";

    /** Demasiados timbres seguidos del mismo emisor. Espere lo que dice Retry-After; para muchas facturas use POST /v1/invoice_batches. */
    public static final String STAMP_RATE_LIMIT = "stamp_rate_limit";

    /** Esa tienda ya está conectada a este emisor. */
    public static final String STORE_ALREADY_CONNECTED = "store_already_connected";

    /** La tienda no aceptó la conexión o no respondió como se esperaba (llaves equivocadas, permisos read_orders/write_orders que faltan, una tienda que no vende en pesos). El mensaje dice qué contestó. */
    public static final String STORE_CONNECTION_FAILED = "store_connection_failed";

    /** La tienda se desconectó: conéctela otra vez con POST /v1/store_connections. */
    public static final String STORE_DISCONNECTED = "store_disconnected";

    /** El vendedor aún no autoriza la conexión en authorize_url. */
    public static final String STORE_NOT_AUTHORIZED = "store_not_authorized";

    /** Esa plataforma aún no está disponible en Fiscalisto. */
    public static final String STORE_PLATFORM_UNAVAILABLE = "store_platform_unavailable";

    /** Los complementos de pago y las notas de crédito no se sustituyen: se cancelan y se emite otro. */
    public static final String SUBSTITUTION_UNSUPPORTED = "substitution_unsupported";

    /** Esto solo existe en pruebas (como reiniciar los datos de prueba): use su llave fk_test_. */
    public static final String TEST_MODE_ONLY = "test_mode_only";

    /** Ese folio ya está registrado para el emisor con otro total o con otra propina (409). Con el mismo total se contesta el ticket que ya existe. */
    public static final String TICKET_FOLIO_TAKEN = "ticket_folio_taken";

    /** El ticket no se pudo registrar: el folio trae caracteres no válidos, la fecha de venta está en el futuro o es de hace más de un año, el producto ya no está en el catálogo… El mensaje dice cuál. */
    public static final String TICKET_INVALID = "ticket_invalid";

    /** El ticket ya se facturó o entró en una factura global: no se puede cancelar. */
    public static final String TICKET_NOT_PENDING = "ticket_not_pending";

    /** La API no contestó a tiempo (connection_error). Con lo que timbra, repita con la misma Idempotency-Key para saber si se timbró. */
    public static final String TIMEOUT = "timeout";

    /** Mande el cuerpo con Content-Type: application/json. */
    public static final String UNSUPPORTED_CONTENT_TYPE = "unsupported_content_type";
}
