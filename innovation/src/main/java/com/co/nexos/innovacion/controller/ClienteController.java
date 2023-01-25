package com.co.nexos.innovacion.controller;

import com.co.nexos.innovacion.cliente.service.IClienteService;
import com.co.nexos.innovacion.entity.Cliente;
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
@RequestMapping(value = "cliente", produces = {MediaType.APPLICATION_JSON_VALUE})
public class ClienteController {

	@Autowired
	private IClienteService clienteService;


    @PostMapping()
    public ResponseEntity<Object> crearCliente(@RequestBody Cliente cliente) {
        try {
        	System.out.println();
        	return ResponseEntity.status(HttpStatus.OK).body(clienteService.crearCliente(cliente));
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }
    
    @GetMapping("/{idCliente}")
    public ResponseEntity<Object> consultarClienteId(@PathVariable("idCliente") int idCliente) {
        try {
        	System.out.println();
        	return ResponseEntity.status(HttpStatus.OK).body(clienteService.consultarClienteId(idCliente));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }    
    
    @GetMapping()
    public ResponseEntity<Object> consultarClientees() {
        try {
        	System.out.println();
        	return ResponseEntity.status(HttpStatus.OK).body(clienteService.consultarClientes());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }
    
    @DeleteMapping("/{idCliente}")
    public ResponseEntity<Object> eliminarCliente(@PathVariable("idCliente") int idCliente) {
        try {
        	System.out.println();
        	String respuesta = clienteService.eliminarCliente(idCliente);
        	return ResponseEntity.status(HttpStatus.OK).body(respuesta);
		} catch (MsjException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }
    
}
