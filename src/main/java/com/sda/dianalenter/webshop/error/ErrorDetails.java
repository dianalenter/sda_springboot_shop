package com.sda.dianalenter.webshop.error;

import java.time.Instant;

/**
 * este obiectl care va fi returnat in caz dde eroare
 */
public class ErrorDetails {
    private final Instant timestamp;
    private final String message;
    private final String details;

    public ErrorDetails(Instant timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
