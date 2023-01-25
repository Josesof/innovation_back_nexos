package com.co.nexos.innovacion.variable.repository;


import com.co.nexos.innovacion.entity.Variable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVariableRepository extends CrudRepository<Variable, Integer> {

}
