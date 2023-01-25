package com.co.nexos.innovacion.rol.repository;

import com.co.nexos.innovacion.entity.Rol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends CrudRepository<Rol, Integer> {

}
