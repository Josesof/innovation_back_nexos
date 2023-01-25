package com.co.nexos.innovacion.dto;

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
public class VariableDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private Integer idVariable;
    private String nombreVariable;
    private Short estado;
    private Integer tiempoMuestreo;
    private List<ClienteDTO> clienteList;
    private List<SensorDTO> sensorList;
    private Integer idUnidadMedida;
    private List<CapturaDatoDTO> capturaDatoList;
    private List<UmbralDTO> umbralList;
    
}
