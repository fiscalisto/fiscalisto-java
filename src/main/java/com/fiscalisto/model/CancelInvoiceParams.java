// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CancelInvoiceParams: los campos de «Cancelar una factura».
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CancelInvoiceParams {
    /**
     * Motivo de cancelación (c_MotivoCancelacion): 01 con errores con relación (lleva substitution), 02 con errores sin relación (por omisión), 03 no se llevó a cabo, 04 solo en una factura global, cuando una venta incluida se facturó a nombre del cliente.
     * <p>
     * Valores: 01, 02, 03, 04.
     */
    @JsonProperty("motive")
    private String motive;

    /**
     * El comprobante que sustituye a este (su id o su UUID), con el motivo 01.
     */
    @JsonProperty("substitution")
    private String substitution;

    /**
     * true para avisarle al cliente por correo que se canceló, con el diseño de Fiscalisto, a las direcciones a las que se le mandó la factura (con la que la sustituye, si hay). Por omisión no se avisa. Solo si la factura se le mandó por correo; quien se dio de baja de los avisos no lo recibe.
     */
    @JsonProperty("notify_customer")
    private Boolean notifyCustomer;

    /**
     * Motivo de cancelación (c_MotivoCancelacion): 01 con errores con relación (lleva substitution), 02 con errores sin relación (por omisión), 03 no se llevó a cabo, 04 solo en una factura global, cuando una venta incluida se facturó a nombre del cliente.
     * <p>
     * Valores: 01, 02, 03, 04.
     */
    public String getMotive() {
        return motive;
    }

    public CancelInvoiceParams setMotive(String motive) {
        this.motive = motive;
        return this;
    }

    /**
     * El comprobante que sustituye a este (su id o su UUID), con el motivo 01.
     */
    public String getSubstitution() {
        return substitution;
    }

    public CancelInvoiceParams setSubstitution(String substitution) {
        this.substitution = substitution;
        return this;
    }

    /**
     * true para avisarle al cliente por correo que se canceló, con el diseño de Fiscalisto, a las direcciones a las que se le mandó la factura (con la que la sustituye, si hay). Por omisión no se avisa. Solo si la factura se le mandó por correo; quien se dio de baja de los avisos no lo recibe.
     */
    public Boolean getNotifyCustomer() {
        return notifyCustomer;
    }

    public CancelInvoiceParams setNotifyCustomer(Boolean notifyCustomer) {
        this.notifyCustomer = notifyCustomer;
        return this;
    }
}
