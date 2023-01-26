package com.co.nexos.innovacion.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author jdrivera
 */
@Entity
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_ABSENT)
@Table(name = "umbrales")
public class Umbral implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUmbrales;
    @Column(name = "max")
    private Float max;
    @Column(name = "min")
    private Float min;
    @Column(name = "color")
    private String color;
    @Column(name = "id_variable")
    private Integer idVariable;
    /*@JsonBackReference
    @JoinColumn(name = "id_variable", referencedColumnName = "id_variable" )
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Variable idVariable;*/
    
}
