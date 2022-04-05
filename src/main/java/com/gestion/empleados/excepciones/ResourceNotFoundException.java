package com.gestion.empleados.excepciones;

//Clase de excepciones personalizada 

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//se llama esta clase si no existe un empleado
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    
    private static final long serrialVersionUID = 1L;
    
    public ResourceNotFoundException(String mensaje){
        super(mensaje);
    }
}
