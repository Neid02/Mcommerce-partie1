package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class ProduitGratuitException extends RuntimeException {

    public ProduitGratuitException() {
    }

    public ProduitGratuitException(String message) {
        super(message);
    }

    public ProduitGratuitException(String message, Throwable cause) {
        super(message, cause);
    }

}