package com.co.nexos.innovacion.controller;


import com.co.nexos.innovacion.entity.UnidadMedida;
import com.co.nexos.innovacion.exception.MsjException;
import com.co.nexos.innovacion.unidadmedida.service.IUnidadMedidaService;
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
@RequestMapping(value = "unidadMedida", produces = {MediaType.APPLICATION_JSON_VALUE})
public class UnidadMedidaController {

	@Autowired
	private IUnidadMedidaService unidadMedidaService;


    @PostMapping()
    public ResponseEntity<Object> crearUnidadMedida(@RequestBody UnidadMedida unidadMedida) {
        try {
        	System.out.println();
        	return ResponseEntity.status(HttpStatus.OK).body(unidadMedidaService.crearUnidadMedida(unidadMedida));
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }
    
    @GetMapping("/{idUnidadMedida}")
    public ResponseEntity<Object> consultarUnidadMedidaId(@PathVariable("idUnidadMedida") int idUnidadMedida) {
        try {
        	System.out.println();
        	return ResponseEntity.status(HttpStatus.OK).body(unidadMedidaService.consultarUnidadMedidaId(idUnidadMedida));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }    
    
    @GetMapping()
    public ResponseEntity<Object> consultarUnidadMedidaes() {
        try {
        	System.out.println();
        	return ResponseEntity.status(HttpStatus.OK).body(unidadMedidaService.consultarUnidadMedidas());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }
    
    @DeleteMapping("/{idUnidadMedida}")
    public ResponseEntity<Object> eliminarUnidadMedida(@PathVariable("idUnidadMedida") int idUnidadMedida) {

        try {
        	System.out.println();
        	String respuesta = unidadMedidaService.eliminarUnidadMedida(idUnidadMedida);
        	return ResponseEntity.status(HttpStatus.OK).body(respuesta);
		} catch (MsjException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
        
    }
}
