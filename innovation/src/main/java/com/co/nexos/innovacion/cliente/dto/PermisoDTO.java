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
public class PermisoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idPermiso;
    private String nombrePermiso;
    private List<UsuarioDTO> usuarioList;
    
}
