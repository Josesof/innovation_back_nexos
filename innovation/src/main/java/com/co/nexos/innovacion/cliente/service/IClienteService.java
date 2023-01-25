package com.co.nexos.innovacion.cliente.service;


import com.co.nexos.innovacion.dto.ClienteInterface;
import com.co.nexos.innovacion.entity.Cliente;
import com.co.nexos.innovacion.exception.MsjException;

import java.util.List;

public interface IClienteService {
	
	public Cliente crearCliente(Cliente cliente);
	
	public List<ClienteInterface> consultarClienteId(int idCliente) throws MsjException;
	
	public List<Cliente> consultarClientes() throws MsjException;

	public String eliminarCliente(int idCliente) throws MsjException;

}
