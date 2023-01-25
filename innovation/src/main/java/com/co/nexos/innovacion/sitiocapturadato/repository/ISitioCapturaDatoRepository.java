package com.co.nexos.innovacion.sitiocapturadato.repository;

import com.co.nexos.innovacion.entity.SitioCapturaDato;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISitioCapturaDatoRepository extends CrudRepository<SitioCapturaDato, Integer> {

}
