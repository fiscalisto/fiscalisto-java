# Fiscalisto para Java

El SDK de la [API de facturación de Fiscalisto](https://fiscalisto.com/docs/api): timbre CFDI 4.0 (facturas, pagos, notas de crédito, nómina, retenciones y lotes) desde Java 17 o más reciente (también Kotlin).

- Una clase para lo que manda y para lo que recibe, con la descripción de cada campo y su nombre en el XML del SAT, y setters encadenados: `new InvoiceCreate().setPaymentForm("03")`.
- `Idempotency-Key` automática en cada `POST`: un reintento nunca timbra, crea ni manda nada dos veces.
- Reintentos solo de lo que es seguro repetir; respeta `Retry-After`.
- Listas que se recorren solas con `for`.
- `FiscalistoException` con el código estable (`ErrorCode.INVOICE_REJECTED`), el del SAT y el id de la solicitud.
- Webhooks verificados en una línea.
- Una sola dependencia: Jackson. El HTTP es el `java.net.http` del JDK.

```xml
<dependency>
  <groupId>com.fiscalisto</groupId>
  <artifactId>fiscalisto</artifactId>
  <version>0.1.9</version>
</dependency>
```

```java
import com.fiscalisto.*;
import com.fiscalisto.model.*;
import java.util.List;

var fiscalisto = new FiscalistoClient(); // la llave viene de FISCALISTO_API_KEY

try {
    Invoice invoice = fiscalisto.invoices().create(new InvoiceCreate()
            .setCustomer(new InvoiceCreateCustomer()
                    .setTaxId("ICV060329BY0").setLegalName("INMOBILIARIA CVA").setTaxSystem("601").setZip("33826"))
            .setPaymentForm("03")
            .setItems(List.of(new InvoiceCreateItem()
                    .setDescription("Mensualidad").setProductKey("86121700").setQuantity(2).setUnitPrice(2500))),
            RequestOptions.idempotencyKey("pedido-A-1042"));
    System.out.println(invoice.getUuid() + " " + invoice.getTotal());
} catch (FiscalistoException e) {
    if (ErrorCode.INVOICE_REJECTED.equals(e.getCode())) System.err.println(e.getSatCode() + ": " + e.getMessage());
    else throw e;
}

for (Invoice inv : fiscalisto.invoices().listAutoPaging(new ListInvoicesParams().setStatus("valid"))) {
    System.out.println(inv.getId());
}
```

Un webhook (Spring):

```java
@PostMapping("/webhooks/fiscalisto")
ResponseEntity<Void> webhook(@RequestBody byte[] body, @RequestHeader Map<String, String> headers) {
    Event event = Webhooks.verify(body, headers, System.getenv("FISCALISTO_WEBHOOK_SECRET"));
    if (event.getType().equals("invoice.stamped")) {
        Invoice invoice = event.dataObject(Invoice.class);
    }
    return ResponseEntity.ok().build();
}
```

`Webhooks.verify` lanza `Webhooks.VerificationException` si no es de Fiscalisto. La guía completa está en [fiscalisto.com/docs/api/sdk](https://fiscalisto.com/docs/api/sdk).

## Con agentes de IA

Para que Claude Code, Cursor, Codex u otro agente integre Fiscalisto, conecte el servidor MCP de la documentación (sin llave) y pídale que empiece con `get_started`:

```bash
claude mcp add --transport http fiscalisto-docs https://fiscalisto.com/docs/api/mcp
```

La guía de integración en una página está en [fiscalisto.com/docs/api/SKILL.md](https://fiscalisto.com/docs/api/SKILL.md) y el índice de la documentación para agentes en [llms.txt](https://fiscalisto.com/docs/api/llms.txt). Otros clientes y más: [fiscalisto.com/docs/api/agentes](https://fiscalisto.com/docs/api/agentes).

## Desarrollo

`com/fiscalisto/model/`, los `*Service.java`, `FiscalistoClient.java` y `ErrorCode.java` se generan desde la especificación OpenAPI con `bun run openapi` en la raíz del repositorio; no los edite. Lo demás se escribe a mano.

```bash
mvn test
mvn package
```
