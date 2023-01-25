package com.co.nexos.innovacion.sitiocapturadato.service;


import com.co.nexos.innovacion.entity.SitioCapturaDato;
import com.co.nexos.innovacion.exception.MsjException;

import java.util.List;

public interface ISitioCapturaDatoService {
	
	public SitioCapturaDato crearSitioCapturaDato(SitioCapturaDato sitioCapturaDato);
	
	public SitioCapturaDato consultarSitioCapturaDatoId(int idSitioCapturaDato) throws MsjException;
	
	public List<SitioCapturaDato> consultarSitioCapturaDatos() throws MsjException;

	public String eliminarSitioCapturaDato(int idSitioCapturaDato) throws MsjException;	

}
