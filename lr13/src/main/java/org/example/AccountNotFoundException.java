package org.example;

public class AccountNotFoundException extends RuntimeException {
    private final String received;
    private final String required;
    public AccountNotFoundException(String message, String received, String required) {
        super(message);
        this.received = received;
        this.required = required;
    }

    public String getReceived() {
        return received;
    }

    public String getRequired() {
        return required;
    }
}
