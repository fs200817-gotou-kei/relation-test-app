package com.gotoukei.relationtest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
        System.out.println(message);
    }

    // TODO qiiitaの下までやってみる(動かないと書いてある)
}
