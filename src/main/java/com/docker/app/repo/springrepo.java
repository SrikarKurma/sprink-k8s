package com.docker.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docker.app.model.onepluse;

@Repository
public interface springrepo extends JpaRepository<onepluse,Integer>{

}
