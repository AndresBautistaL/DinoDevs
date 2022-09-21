package com.epicmerch.fgm.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicmerch.fgm.models.DireccionModel;

@Repository
public interface DireccionRepository extends CrudRepository<DireccionModel, Integer> {

}
