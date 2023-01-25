package com.co.nexos.innovacion.permiso.service;


import com.co.nexos.innovacion.entity.Permiso;
import com.co.nexos.innovacion.exception.MsjException;

import java.util.List;

public interface IPermisoService {
	
	public Permiso crearPermiso(Permiso permiso);
	
	public Permiso consultarPermisoId(int idPermiso) throws MsjException;
	
	public List<Permiso> consultarPermisos() throws MsjException;

	public String eliminarPermiso(int idPermiso) throws MsjException;	

}
