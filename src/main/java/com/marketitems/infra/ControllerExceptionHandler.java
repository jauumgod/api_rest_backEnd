package com.marketitems.infra;


import com.marketitems.dtos.ExceptionsDTO;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity threadDuplicateEntry(DataIntegrityViolationException exception){
        ExceptionsDTO exceptionsDTO = new ExceptionsDTO("Usuario já cadastrado", "400");
        return ResponseEntity.badRequest().body(exceptionsDTO);
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity thread404(EntityNotFoundException exception){
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity threadGeneralException(EntityNotFoundException exception){
        ExceptionsDTO exceptionsDTO = new ExceptionsDTO(exception.getMessage(), "500");
        return ResponseEntity.internalServerError().body(exceptionsDTO);
    }

}
