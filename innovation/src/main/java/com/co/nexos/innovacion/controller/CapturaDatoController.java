package com.co.nexos.innovacion.controller;


import com.co.nexos.innovacion.capturadato.service.ICapturaDatoService;
import com.co.nexos.innovacion.entity.CapturaDato;
import com.co.nexos.innovacion.exception.MsjException;
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
@RequestMapping(value = "capturaDato", produces = {MediaType.APPLICATION_JSON_VALUE})
public class CapturaDatoController {

	@Autowired
	private ICapturaDatoService capturaDatoService;


    @PostMapping()
    public ResponseEntity<Object> crearCapturaDato(@RequestBody CapturaDato capturaDato) {
        try {
        	System.out.println();
        	return ResponseEntity.status(HttpStatus.OK).body(capturaDatoService.crearCapturaDato(capturaDato));
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }
    
    @GetMapping("/{idCapturaDato}")
    public ResponseEntity<Object> consultarCapturaDatoId(@PathVariable("idCapturaDato") int idCapturaDato) {
        try {
        	System.out.println();
        	return ResponseEntity.status(HttpStatus.OK).body(capturaDatoService.consultarCapturaDatoId(idCapturaDato));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }    
    
    @GetMapping()
    public ResponseEntity<Object> consultarCapturaDatoes() {
        try {
        	System.out.println();
        	return ResponseEntity.status(HttpStatus.OK).body(capturaDatoService.consultarCapturaDatos());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }
    
    @DeleteMapping("/{idCapturaDato}")
    public ResponseEntity<Object> eliminarCapturaDato(@PathVariable("idCapturaDato") int idCapturaDato) {
        try {
        	System.out.println();
        	String respuesta = capturaDatoService.eliminarCapturaDato(idCapturaDato);
        	return ResponseEntity.status(HttpStatus.OK).body(respuesta);
		} catch (MsjException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
        
    }
    
}
