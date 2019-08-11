package org.teracode.exam.controllers.advices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.teracode.exam.exceptions.BadRequestException;
import org.teracode.exam.responses.dtos.ErrorDTO;

@RestControllerAdvice
public class SchoolControllerAdvice {
    @ExceptionHandler({BadRequestException.class})
    public ResponseEntity handleRuntimeException(final BadRequestException exception) {
        return new ResponseEntity<>(new ErrorDTO("Invalid last name initial"), HttpStatus.BAD_REQUEST);
    }
}
