// Generado por `bun run openapi` desde la especificación OpenAPI de la API: no lo edite.

package com.fiscalisto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UpdateInvoiceParamsCartaPorteGoodCustomsDoc: UpdateInvoiceParamsCartaPorteGoodCustomsDoc.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateInvoiceParamsCartaPorteGoodCustomsDoc {
    /**
     * Tipo de documento (TipoDocumento), c_DocumentoAduanero: 01 pedimento…
     * <p>
     * Obligatorio.
     */
    @JsonProperty("type")
    private String type;

    /**
     * Número de pedimento (NumPedimento), con el formato «NN  NN  NNNN  NNNNNNN». Solo con el tipo 01.
     */
    @JsonProperty("pedimento")
    private String pedimento;

    /**
     * Identificador del documento aduanero (IdentDocAduanero), con un tipo distinto de 01.
     */
    @JsonProperty("doc_id")
    private String docId;

    /**
     * RFC del importador (RFCImpo), con un pedimento.
     */
    @JsonProperty("importer_tax_id")
    private String importerTaxId;

    /**
     * Tipo de documento (TipoDocumento), c_DocumentoAduanero: 01 pedimento…
     * <p>
     * Obligatorio.
     */
    public String getType() {
        return type;
    }

    public UpdateInvoiceParamsCartaPorteGoodCustomsDoc setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Número de pedimento (NumPedimento), con el formato «NN  NN  NNNN  NNNNNNN». Solo con el tipo 01.
     */
    public String getPedimento() {
        return pedimento;
    }

    public UpdateInvoiceParamsCartaPorteGoodCustomsDoc setPedimento(String pedimento) {
        this.pedimento = pedimento;
        return this;
    }

    /**
     * Identificador del documento aduanero (IdentDocAduanero), con un tipo distinto de 01.
     */
    public String getDocId() {
        return docId;
    }

    public UpdateInvoiceParamsCartaPorteGoodCustomsDoc setDocId(String docId) {
        this.docId = docId;
        return this;
    }

    /**
     * RFC del importador (RFCImpo), con un pedimento.
     */
    public String getImporterTaxId() {
        return importerTaxId;
    }

    public UpdateInvoiceParamsCartaPorteGoodCustomsDoc setImporterTaxId(String importerTaxId) {
        this.importerTaxId = importerTaxId;
        return this;
    }
}
