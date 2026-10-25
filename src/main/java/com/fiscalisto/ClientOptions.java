package com.fiscalisto;

import java.net.http.HttpClient;
import java.time.Duration;

/**
 * Cómo se crea un {@link FiscalistoClient}:
 * {@code new FiscalistoClient(ClientOptions.builder().apiKey("fk_test_…").maxRetries(3).build())}.
 */
public final class ClientOptions {
    /** La dirección de la API. */
    public static final String DEFAULT_BASE_URL = "https://api.fiscalisto.com";

    final String apiKey;
    final String baseUrl;
    final String apiVersion;
    final String language;
    final int maxRetries;
    final Duration timeout;
    final HttpClient httpClient;
    final ApiClient.Sleeper sleeper;

    private ClientOptions(Builder b) {
        this.apiKey = b.apiKey;
        this.baseUrl = b.baseUrl.replaceAll("/+$", "");
        this.apiVersion = b.apiVersion;
        this.language = b.language;
        this.maxRetries = b.maxRetries;
        this.timeout = b.timeout;
        this.httpClient = b.httpClient;
        this.sleeper = b.sleeper;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String apiKey;
        private String baseUrl = DEFAULT_BASE_URL;
        private String apiVersion = ApiClient.API_VERSION;
        private String language;
        private int maxRetries = 2;
        private Duration timeout = Duration.ofSeconds(80);
        private HttpClient httpClient;
        private ApiClient.Sleeper sleeper = Thread::sleep;

        private Builder() {}

        /** Su llave fk_test_… o fk_live_…; sin ella, la variable FISCALISTO_API_KEY. */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /** Otra dirección de la API (un proxy, pruebas). */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        /** Otra versión de la API (Fiscalisto-Version); con null, la fijada en la cuenta. */
        public Builder apiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        /** "en": los mensajes de error en inglés (Accept-Language). */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /** Cuántas veces se repite una solicitud segura que falló (2 por omisión). */
        public Builder maxRetries(int maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        /** Cuánto se espera cada respuesta (80 s por omisión: el PAC puede tardar). */
        public Builder timeout(Duration timeout) {
            this.timeout = timeout;
            return this;
        }

        /** Su propio HttpClient (proxy, trazas). */
        public Builder httpClient(HttpClient httpClient) {
            this.httpClient = httpClient;
            return this;
        }

        Builder sleeper(ApiClient.Sleeper sleeper) {
            this.sleeper = sleeper;
            return this;
        }

        public ClientOptions build() {
            return new ClientOptions(this);
        }
    }
}
