package com.co.nexos.innovacion.sensor.repository;


import com.co.nexos.innovacion.entity.Sensor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISensorRepository extends CrudRepository<Sensor, Integer> {

}
