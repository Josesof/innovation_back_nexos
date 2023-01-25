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
public class UmbralDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idUmbrales;
    private Float max;
    private Float min;
    private String color;
    private Integer idVariable;

}
