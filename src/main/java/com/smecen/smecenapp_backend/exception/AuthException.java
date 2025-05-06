package com.smecen.smecenapp_backend.exception;

public class AuthException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public AuthException(String mensaje) {
        super(mensaje);
    }
}
