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
public class RolDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer idRol;
    private String nombreRol;
    
}
