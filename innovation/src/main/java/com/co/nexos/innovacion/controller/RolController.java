package com.co.nexos.innovacion.controller;


import com.co.nexos.innovacion.entity.Rol;
import com.co.nexos.innovacion.exception.MsjException;
import com.co.nexos.innovacion.rol.service.IRolService;
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
@RequestMapping(value = "rol", produces = {MediaType.APPLICATION_JSON_VALUE})
public class RolController {
	
	@Autowired
	private IRolService rolService;


    @PostMapping()
    public ResponseEntity<Object> crearRol(@RequestBody Rol rol) {
        try {
        	System.out.println();
        	return ResponseEntity.status(HttpStatus.OK).body(rolService.crearRol(rol));
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }
    
    @GetMapping("/{idRol}")
    public ResponseEntity<Object> consultarRolId(@PathVariable("idRol") int idRol) {
        try {
        	System.out.println();
        	return ResponseEntity.status(HttpStatus.OK).body(rolService.consultarRolId(idRol));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }    
    
    @GetMapping()
    public ResponseEntity<Object> consultarRoles() {
        try {
        	System.out.println();
        	return ResponseEntity.status(HttpStatus.OK).body(rolService.consultarRoles());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }
    
    @DeleteMapping("/{idRol}")
    public ResponseEntity<Object> eliminarRol(@PathVariable("idRol") int idRol) {
    	
        try {
        	System.out.println();
        	String respuesta = rolService.eliminarRol(idRol);
        	return ResponseEntity.status(HttpStatus.OK).body(respuesta);
		} catch (MsjException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }
    
}
