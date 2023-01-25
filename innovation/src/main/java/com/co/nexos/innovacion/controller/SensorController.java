/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.co.nexos.innovacion.controller;


import com.co.nexos.innovacion.entity.Sensor;
import com.co.nexos.innovacion.exception.MsjException;
import com.co.nexos.innovacion.sensor.service.ISensorService;
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
@RequestMapping(value = "sensor", produces = {MediaType.APPLICATION_JSON_VALUE})
public class SensorController {

	@Autowired
	private ISensorService sensorService;


    @PostMapping()
    public ResponseEntity<Object> crearSensor(@RequestBody Sensor sensor) {
        try {
        	System.out.println();
        	return ResponseEntity.status(HttpStatus.OK).body(sensorService.crearSensor(sensor));
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }
    
    @GetMapping("/{idSensor}")
    public ResponseEntity<Object> consultarSensorId(@PathVariable("idSensor") int idSensor) {
        try {
        	System.out.println();
        	return ResponseEntity.status(HttpStatus.OK).body(sensorService.consultarSensorId(idSensor));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }    
    
    @GetMapping()
    public ResponseEntity<Object> consultarSensores() {
        try {
        	System.out.println();
        	return ResponseEntity.status(HttpStatus.OK).body(sensorService.consultarSensors());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
    }
    
    @DeleteMapping("/{idSensor}")
    public ResponseEntity<Object> eliminarSensor(@PathVariable("idSensor") int idSensor) {
        try {
        	System.out.println();
        	String respuesta = sensorService.eliminarSensor(idSensor);
        	return ResponseEntity.status(HttpStatus.OK).body(respuesta);
		} catch (MsjException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
        
    }    
    
}
