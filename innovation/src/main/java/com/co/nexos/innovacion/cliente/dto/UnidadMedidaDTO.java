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
public class UnidadMedidaDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer idUnidadMedida;
    private String nombreMedida;
    private List<VariableDTO> variableList;
}
