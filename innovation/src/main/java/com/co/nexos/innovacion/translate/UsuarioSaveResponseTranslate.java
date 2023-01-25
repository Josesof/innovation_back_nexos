package com.co.nexos.innovacion.translate;

import com.co.nexos.innovacion.cliente.dto.UsuarioDTO;
import com.co.nexos.innovacion.entity.Usuario;
import com.co.nexos.innovacion.pattern.Translator;
import com.co.nexos.innovacion.exception.MsjException;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * permite convertir el Document al DocumentDTO
 *
 * @author Lfernandez - Qvision SAS
 * @since 20-01-2022
 */
@Qualifier("usuarioSaveResponseTranslate")
public class UsuarioSaveResponseTranslate implements Translator<Usuario, UsuarioDTO> {

	/** */
	@Override
	public UsuarioDTO translate(Usuario input) throws MsjException {
		return UsuarioDTO.builder()
				.idUsuario(input.getIdUsuario())
				.nombres(input.getNombres())
				.apellidos(input.getApellidos())
				.correo(input.getCorreo())
				.password(input.getPassword())
				.estado(input.getEstado())
				.contacto(input.getContacto())
				.build();
	}
}
