package com.co.nexos.innovacion.cliente.dto;

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
public class SensorDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idSensor;
    private String nombreSensor;
    private String color;
    private Short estado;
    private Integer idCapturaDato;
    private Integer idVariable;
}
