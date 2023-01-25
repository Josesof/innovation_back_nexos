package com.co.nexos.innovacion.sensor.service;


import com.co.nexos.innovacion.entity.Sensor;
import com.co.nexos.innovacion.exception.MsjException;

import java.util.List;

public interface ISensorService {
	
	public Sensor crearSensor(Sensor sensor) throws MsjException;
	
	public Sensor consultarSensorId(int idSensor) throws MsjException;	
	
	public List<Sensor> consultarSensors() throws MsjException;

	public String eliminarSensor(int idSensor) throws MsjException;	

}
