package com.co.nexos.innovacion.capturadato.repository;


import com.co.nexos.innovacion.entity.CapturaDato;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICapturaDatoRepository extends CrudRepository<CapturaDato, Integer> {

}
