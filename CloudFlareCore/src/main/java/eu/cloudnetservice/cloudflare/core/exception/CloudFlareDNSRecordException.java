/*
 * Copyright (c) Tarek Hosni El Alaoui 2017
 */

package eu.cloudnetservice.cloudflare.core.exception;

/**
 * Thrown when errors regarding DNS records occur.
 */
public class CloudFlareDNSRecordException extends RuntimeException {

    /**
     * Constructs a new exception with {@code message} as its detailed message.
     *
     * @param message the detailed message of this exception.
     */
    public CloudFlareDNSRecordException(String message) {
        super(message);
    }

    public CloudFlareDNSRecordException(String message, Throwable cause) {
        super(message, cause);
    }
}
