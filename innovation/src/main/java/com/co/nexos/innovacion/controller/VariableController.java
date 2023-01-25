package com.co.nexos.innovacion.controller;


import com.co.nexos.innovacion.exception.MsjException;
import com.co.nexos.innovacion.variable.service.IVariableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 *
 * @author jdrivera
 */
@CrossOrigin
@RestController
@RequestMapping(value = "variable", produces = {MediaType.APPLICATION_JSON_VALUE})
public class VariableController{

	@Autowired
	private IVariableService variableService;


    @PostMapping()
    public ResponseEntity<Object> crearVariable(@RequestBody String variable) {
        try {
        	System.out.println();
        	return ResponseEntity.status(HttpStatus.OK).body(variableService.crearVariable(variable));
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }
    
    @GetMapping("/{idVariable}")
    public ResponseEntity<Object> consultarVariableId(@PathVariable("idVariable") int idVariable) {
        try {
        	System.out.println();
        	return ResponseEntity.status(HttpStatus.OK).body(variableService.consultarVariableId(idVariable));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }    
    
    @GetMapping()
    public ResponseEntity<Object> consultarVariablees() {
        try {
        	System.out.println();
        	return ResponseEntity.status(HttpStatus.OK).body(variableService.consultarVariables());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }
    
    @DeleteMapping("/{idVariable}")
    public ResponseEntity<Object> eliminarVariable(@PathVariable("idVariable") int idVariable) throws SQLIntegrityConstraintViolationException {
        try {
        	System.out.println();
        	String respuesta = variableService.eliminarVariable(idVariable);
        	return ResponseEntity.status(HttpStatus.OK).body(respuesta);
		} catch (MsjException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
        
    }
}
