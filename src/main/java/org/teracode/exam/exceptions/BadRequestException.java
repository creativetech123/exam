package org.teracode.exam.exceptions;

public class BadRequestException extends RuntimeException {
    private final String error;

    public BadRequestException(final String error) {
        super();
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
