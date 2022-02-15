package com.roadmap.javaspringboot.animescrud.repository;

import com.roadmap.javaspringboot.animescrud.model.AnimesModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimesRepository extends JpaRepository<AnimesModel, Long> {
    
}
