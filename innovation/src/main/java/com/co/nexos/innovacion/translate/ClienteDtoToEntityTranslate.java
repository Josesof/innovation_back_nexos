package com.co.nexos.innovacion.translate;

import com.co.nexos.innovacion.dto.ClienteDTO;
import com.co.nexos.innovacion.dto.VariableDTO;
import com.co.nexos.innovacion.entity.Cliente;
import com.co.nexos.innovacion.entity.Variable;
import com.co.nexos.innovacion.exception.MsjException;
import com.co.nexos.innovacion.pattern.Translator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * permite convertir el ActionRulesDTO al ActionRules
 *
 * @author czambrano
 * @since 23-02-2022
 */

@Qualifier("clienteDtoToEntityTranslate")
public class ClienteDtoToEntityTranslate implements Translator<ClienteDTO, Cliente> {

	@Autowired
	@Qualifier("variableDtoToEntityTranslate")
	private Translator<VariableDTO, Variable> variableDtoToEntityTranslate;
	
	@Override
	public Cliente translate(ClienteDTO input) throws MsjException {
		
		  /* List<Variable> VariableDTOs = new ArrayList<>();
		    input.getVariableList().stream()
		        .forEach(
		            obj -> {
		            });*/

		return  Cliente.builder()
				.idCliente(input.getIdCliente())
				.nombre(input.getNombre())
				.correo(input.getCorreo())
				.contacto(input.getContacto())
				.permiso(input.getPermiso())
				//.variableList(VariableDTOs)
				//.usuarioList(null)
				.build();
	}

}
