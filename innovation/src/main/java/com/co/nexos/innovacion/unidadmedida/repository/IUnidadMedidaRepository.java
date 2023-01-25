package com.co.nexos.innovacion.unidadmedida.repository;


import com.co.nexos.innovacion.entity.UnidadMedida;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUnidadMedidaRepository extends CrudRepository<UnidadMedida, Integer> {

}
