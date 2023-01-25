package com.co.nexos.innovacion.unidadmedida.service;



import com.co.nexos.innovacion.entity.UnidadMedida;
import com.co.nexos.innovacion.exception.MsjException;

import java.util.List;

public interface IUnidadMedidaService {
	
	public UnidadMedida crearUnidadMedida(UnidadMedida unidadMedida);
	
	public UnidadMedida consultarUnidadMedidaId(int idUnidadMedida) throws MsjException;
	
	public List<UnidadMedida> consultarUnidadMedidas() throws MsjException;

	public String eliminarUnidadMedida(int idUnidadMedida) throws MsjException;	

}
