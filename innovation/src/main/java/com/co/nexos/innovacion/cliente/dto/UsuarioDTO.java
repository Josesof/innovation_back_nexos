package com.co.nexos.innovacion.cliente.dto;

import com.co.nexos.innovacion.entity.Cliente;
import com.co.nexos.innovacion.entity.Permiso;
import com.co.nexos.innovacion.entity.Rol;
import lombok.*;

import java.io.Serializable;

/**
 *
 * @author jdrivera
 */

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idUsuario;
    private String nombres;
    private String apellidos;
    private String correo;
    private String password;
    private Short estado;
    private String contacto;
    private Cliente idCliente;
    private Permiso idPermiso;
    private Rol idRol;

        
}
