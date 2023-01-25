/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co.nexos.innovacion.controller;

import com.co.nexos.innovacion.exception.MsjException;
import com.co.nexos.innovacion.umbral.service.IUmbralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author jdrivera
 */
@CrossOrigin
@RestController
@RequestMapping(value = "umbral", produces = {MediaType.APPLICATION_JSON_VALUE})
public class UmbralController  {

	@Autowired
	private IUmbralService umbralService;
	
    @PostMapping
    public ResponseEntity<Object> crearUmbral(@RequestBody String umbral) {
        try {
        	System.out.println();
        	return ResponseEntity.status(HttpStatus.OK).body(umbralService.crearUmbral(umbral));        	
		} catch (Exception e) {
        	System.out.println();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }
    
    @GetMapping("/{idUmbral}")
    public ResponseEntity<Object> consultarUmbralId(@PathVariable("idUmbral") int idUmbral) {
        try {
        	System.out.println();
        	return ResponseEntity.status(HttpStatus.OK).body(umbralService.consultarUmbralId(idUmbral));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }    
    
    @GetMapping()
    public ResponseEntity<Object> consultarUmbral() {
        try {
        	System.out.println();
        	return ResponseEntity.status(HttpStatus.OK).body(umbralService.consultarUmbrals());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }
    
    @DeleteMapping("/{idUmbral}")
    public ResponseEntity<Object> eliminarUmbral(@PathVariable("idUmbral") int idUmbral) {
        try {
        	System.out.println();
        	String respuesta = umbralService.eliminarUmbral(idUmbral);
        	return ResponseEntity.status(HttpStatus.OK).body(respuesta);
		} catch (MsjException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }
}
