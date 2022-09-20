package com.epicmerch.fgm.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.epicmerch.fgm.models.PostModel;

@Repository
public interface PostRepository  extends CrudRepository<PostModel, Long>{

}
