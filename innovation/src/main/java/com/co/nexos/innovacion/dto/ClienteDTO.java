package com.co.nexos.innovacion.dto;

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
public class ClienteDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idCliente;
    private String nombre;
    private String correo;
    private String contacto;
    private String Permiso;
    private Integer idVariable;
    private String nombreVariable;
    private String estado;
    private Integer tiempoMuestreo;
    private Integer idUnidadMedida;
    private String nombreMedida;
       
}
