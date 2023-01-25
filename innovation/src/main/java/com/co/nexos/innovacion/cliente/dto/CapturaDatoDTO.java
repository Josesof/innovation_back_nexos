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
public class CapturaDatoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idCapturaDato;
    private String nombre;
    private Float longitud;
    private Float latitud;
    private Short estado;
    private List<SensorDTO> sensorList;
    private SitioCapturaDatoDTO idSitioCaptura;
    private Integer idVariable; 
}
