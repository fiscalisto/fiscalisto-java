// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PayeeAccount: Una cuenta de un proveedor a la que se le paga (Pagos › Cuentas de proveedores), verificada con el banco. Solo lectura: una CLABE se agrega o se cambia en la app.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PayeeAccount {
    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    @JsonProperty("id")
    private String id;

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    @JsonProperty("livemode")
    private Boolean livemode;

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    @JsonProperty("object")
    private String object;

    /**
     * El emisor (iss_…) que paga.
     */
    @JsonProperty("issuer")
    private String issuer;

    /**
     * El RFC del proveedor.
     */
    @JsonProperty("supplier_tax_id")
    private String supplierTaxId;

    /**
     * El nombre del proveedor, o null.
     */
    @JsonProperty("supplier_name")
    private String supplierName;

    /**
     * La CLABE de 18 dígitos.
     */
    @JsonProperty("clabe")
    private String clabe;

    /**
     * El banco, o null.
     */
    @JsonProperty("bank")
    private String bank;

    /**
     * El RFC del titular que confirmó el banco, o null.
     */
    @JsonProperty("holder_tax_id")
    private String holderTaxId;

    /**
     * El nombre del titular que confirmó el banco, o null.
     */
    @JsonProperty("holder_name")
    private String holderName;

    /**
     * true si es de un tercero que la empresa autorizó.
     */
    @JsonProperty("third_party")
    private Boolean thirdParty;

    /**
     * Cómo se confió en la cuenta: bank (el banco confirmó el RFC del proveedor), by_name (el banco no dio el RFC y el nombre del titular es el del proveedor según el SAT, cuando la empresa lo permite), by_hand (alguien la verificó a mano porque el RFC del banco solo cambiaba la homoclave o no venía), third_party (se autorizó como de un tercero), o null si aún no está aprobada.
     * <p>
     * Valores: bank, by_name, by_hand, third_party.
     */
    @JsonProperty("verification")
    private String verification;

    /**
     * Cómo la verificó a mano quien la aprobó, o null.
     */
    @JsonProperty("verified_by_hand_reason")
    private String verifiedByHandReason;

    /**
     * Su número de cuenta, si se anotó junto a la CLABE (solo de referencia: la transferencia usa la CLABE), o null.
     */
    @JsonProperty("account_number")
    private String accountNumber;

    /**
     * true si es la cuenta predeterminada del proveedor: la que usa un pago cuando no se elige otra.
     */
    @JsonProperty("is_default")
    private Boolean isDefault;

    /**
     * verifying (verificando con el banco), pending_approval (verificada, por aprobar), holder_mismatch (es de otra persona), failed (no existe o no recibe), approved, rejected o replaced (la sustituyó otra).
     * <p>
     * Valores: verifying, pending_approval, holder_mismatch, failed, approved, rejected, replaced.
     */
    @JsonProperty("status")
    private String status;

    /**
     * true si ya se le puede pagar (aprobada y pasó la espera de la empresa).
     */
    @JsonProperty("usable")
    private Boolean usable;

    /**
     * Desde cuándo se le puede pagar, o null.
     */
    @JsonProperty("usable_from")
    private String usableFrom;

    /**
     * Cuándo la confirmó el banco, o null.
     */
    @JsonProperty("verified_at")
    private String verifiedAt;

    /**
     * Cuándo se agregó.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * Identificador del objeto, con su prefijo (iss_, inv_, ret_, cus_, prd_, emp_, bat_, brn_, whs_, stm_, adj_, evt_, whe_).
     */
    public String getId() {
        return id;
    }

    public PayeeAccount setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * true en producción (llaves fk_live_), false en pruebas (fk_test_). Lo de pruebas no vale ante el SAT.
     */
    public Boolean getLivemode() {
        return livemode;
    }

    public PayeeAccount setLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    /**
     * Qué tipo de objeto es («invoice», «customer»…).
     */
    public String getObject() {
        return object;
    }

    public PayeeAccount setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * El emisor (iss_…) que paga.
     */
    public String getIssuer() {
        return issuer;
    }

    public PayeeAccount setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * El RFC del proveedor.
     */
    public String getSupplierTaxId() {
        return supplierTaxId;
    }

    public PayeeAccount setSupplierTaxId(String supplierTaxId) {
        this.supplierTaxId = supplierTaxId;
        return this;
    }

    /**
     * El nombre del proveedor, o null.
     */
    public String getSupplierName() {
        return supplierName;
    }

    public PayeeAccount setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }

    /**
     * La CLABE de 18 dígitos.
     */
    public String getClabe() {
        return clabe;
    }

    public PayeeAccount setClabe(String clabe) {
        this.clabe = clabe;
        return this;
    }

    /**
     * El banco, o null.
     */
    public String getBank() {
        return bank;
    }

    public PayeeAccount setBank(String bank) {
        this.bank = bank;
        return this;
    }

    /**
     * El RFC del titular que confirmó el banco, o null.
     */
    public String getHolderTaxId() {
        return holderTaxId;
    }

    public PayeeAccount setHolderTaxId(String holderTaxId) {
        this.holderTaxId = holderTaxId;
        return this;
    }

    /**
     * El nombre del titular que confirmó el banco, o null.
     */
    public String getHolderName() {
        return holderName;
    }

    public PayeeAccount setHolderName(String holderName) {
        this.holderName = holderName;
        return this;
    }

    /**
     * true si es de un tercero que la empresa autorizó.
     */
    public Boolean getThirdParty() {
        return thirdParty;
    }

    public PayeeAccount setThirdParty(Boolean thirdParty) {
        this.thirdParty = thirdParty;
        return this;
    }

    /**
     * Cómo se confió en la cuenta: bank (el banco confirmó el RFC del proveedor), by_name (el banco no dio el RFC y el nombre del titular es el del proveedor según el SAT, cuando la empresa lo permite), by_hand (alguien la verificó a mano porque el RFC del banco solo cambiaba la homoclave o no venía), third_party (se autorizó como de un tercero), o null si aún no está aprobada.
     * <p>
     * Valores: bank, by_name, by_hand, third_party.
     */
    public String getVerification() {
        return verification;
    }

    public PayeeAccount setVerification(String verification) {
        this.verification = verification;
        return this;
    }

    /**
     * Cómo la verificó a mano quien la aprobó, o null.
     */
    public String getVerifiedByHandReason() {
        return verifiedByHandReason;
    }

    public PayeeAccount setVerifiedByHandReason(String verifiedByHandReason) {
        this.verifiedByHandReason = verifiedByHandReason;
        return this;
    }

    /**
     * Su número de cuenta, si se anotó junto a la CLABE (solo de referencia: la transferencia usa la CLABE), o null.
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    public PayeeAccount setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    /**
     * true si es la cuenta predeterminada del proveedor: la que usa un pago cuando no se elige otra.
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    public PayeeAccount setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * verifying (verificando con el banco), pending_approval (verificada, por aprobar), holder_mismatch (es de otra persona), failed (no existe o no recibe), approved, rejected o replaced (la sustituyó otra).
     * <p>
     * Valores: verifying, pending_approval, holder_mismatch, failed, approved, rejected, replaced.
     */
    public String getStatus() {
        return status;
    }

    public PayeeAccount setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * true si ya se le puede pagar (aprobada y pasó la espera de la empresa).
     */
    public Boolean getUsable() {
        return usable;
    }

    public PayeeAccount setUsable(Boolean usable) {
        this.usable = usable;
        return this;
    }

    /**
     * Desde cuándo se le puede pagar, o null.
     */
    public String getUsableFrom() {
        return usableFrom;
    }

    public PayeeAccount setUsableFrom(String usableFrom) {
        this.usableFrom = usableFrom;
        return this;
    }

    /**
     * Cuándo la confirmó el banco, o null.
     */
    public String getVerifiedAt() {
        return verifiedAt;
    }

    public PayeeAccount setVerifiedAt(String verifiedAt) {
        this.verifiedAt = verifiedAt;
        return this;
    }

    /**
     * Cuándo se agregó.
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public PayeeAccount setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
}
