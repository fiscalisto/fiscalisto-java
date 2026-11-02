// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * CreateRetentionParamsPlatform: Complemento de servicios de plataformas tecnológicas (ServiciosPlataformasTecnologicas 1.0), obligatorio con code 26: una constancia por mes, receptor y tipo de servicio. totals y taxes se calculan de services con las tasas del SAT (ISR de LISR 113-A y LIF 2026 art. 25; IVA 50% o 100%; IEPS en apuestas); si los manda, deben coincidir.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRetentionParamsPlatform {
    /**
     * Tipo de servicio (TipoDeServ), c_TipoDeServ: 01 transporte de pasajeros, 02 entrega de alimentos, 03 entrega de bienes, 04 hospedaje, 05 comercio de bienes, 06 otros servicios, 07 a 09 servicios digitales de extranjeros, 11 apuestas y sorteos (desde 2026).
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Cada cuánto paga la plataforma (Periodicidad): 01 semanal, 02 mensual (por omisión), 03 diaria, 04 quincenal, 05 otra.
     */
    @JsonProperty("periodicity")
    private String periodicity;

    /**
     * true si la persona física optó por que el ISR retenido sea pago definitivo (LISR 113-B): TipoPagoRet 03 en lugar de 04.
     */
    @JsonProperty("isr_definitive")
    private Boolean isrDefinitive;

    /**
     * true si se le deposita en una cuenta en el extranjero: se retiene el 100% del IVA (LIF 2026 art. 25-IX-c).
     */
    @JsonProperty("foreign_account")
    private Boolean foreignAccount;

    /**
     * Cada operación (DetallesDelServicio), hasta 5,000. Lo pagado en efectivo (payment_form 01) va en la constancia pero no en las bases.
     * <p>
     * Obligatorio.
     */
    @JsonProperty("services")
    private List<CreateRetentionParamsPlatformService> services;

    /**
     * Tipo de servicio (TipoDeServ), c_TipoDeServ: 01 transporte de pasajeros, 02 entrega de alimentos, 03 entrega de bienes, 04 hospedaje, 05 comercio de bienes, 06 otros servicios, 07 a 09 servicios digitales de extranjeros, 11 apuestas y sorteos (desde 2026).
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public CreateRetentionParamsPlatform setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Cada cuánto paga la plataforma (Periodicidad): 01 semanal, 02 mensual (por omisión), 03 diaria, 04 quincenal, 05 otra.
     */
    public String getPeriodicity() {
        return periodicity;
    }

    public CreateRetentionParamsPlatform setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
        return this;
    }

    /**
     * true si la persona física optó por que el ISR retenido sea pago definitivo (LISR 113-B): TipoPagoRet 03 en lugar de 04.
     */
    public Boolean getIsrDefinitive() {
        return isrDefinitive;
    }

    public CreateRetentionParamsPlatform setIsrDefinitive(Boolean isrDefinitive) {
        this.isrDefinitive = isrDefinitive;
        return this;
    }

    /**
     * true si se le deposita en una cuenta en el extranjero: se retiene el 100% del IVA (LIF 2026 art. 25-IX-c).
     */
    public Boolean getForeignAccount() {
        return foreignAccount;
    }

    public CreateRetentionParamsPlatform setForeignAccount(Boolean foreignAccount) {
        this.foreignAccount = foreignAccount;
        return this;
    }

    /**
     * Cada operación (DetallesDelServicio), hasta 5,000. Lo pagado en efectivo (payment_form 01) va en la constancia pero no en las bases.
     * <p>
     * Obligatorio.
     */
    public List<CreateRetentionParamsPlatformService> getServices() {
        return services;
    }

    public CreateRetentionParamsPlatform setServices(List<CreateRetentionParamsPlatformService> services) {
        this.services = services;
        return this;
    }
}
