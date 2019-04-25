package com.giraudev.riskmachine.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "error.can.not.found.tax")
public class TaxNotFoundException extends RuntimeException {
}
