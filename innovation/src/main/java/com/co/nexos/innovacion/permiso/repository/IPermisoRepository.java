package com.co.nexos.innovacion.permiso.repository;


import com.co.nexos.innovacion.entity.Permiso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPermisoRepository extends CrudRepository<Permiso, Integer> {

}
