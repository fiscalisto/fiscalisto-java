// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ImssMovementImssRejection: ImssMovementImssRejection.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImssMovementImssRejection {
    /**
     * Lo que dijo el IMSS, como en su acuse.
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * Cuándo lo anotó (el acuse que se subió o la llamada que lo mandó en rejected).
     */
    @JsonProperty("rejected_at")
    private String rejectedAt;

    /**
     * Lo que dijo el IMSS, como en su acuse.
     */
    public String getReason() {
        return reason;
    }

    public ImssMovementImssRejection setReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Cuándo lo anotó (el acuse que se subió o la llamada que lo mandó en rejected).
     */
    public String getRejectedAt() {
        return rejectedAt;
    }

    public ImssMovementImssRejection setRejectedAt(String rejectedAt) {
        this.rejectedAt = rejectedAt;
        return this;
    }
}
