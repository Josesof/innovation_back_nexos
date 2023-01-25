package com.co.nexos.innovacion.cliente.dto;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author jdrivera
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idCliente;
    private String nombre;
    private String correo;
    private String contacto;
    private String permiso;
    private List<VariableDTO> variableList;
    private List<UsuarioDTO> usuarioList;
       
}
