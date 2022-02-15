package com.roadmap.javaspringboot.animescrud.service;

import java.util.List;

import com.roadmap.javaspringboot.animescrud.dto.AnimesDTO;
import com.roadmap.javaspringboot.animescrud.mapper.AnimesMapper;
import com.roadmap.javaspringboot.animescrud.model.AnimesModel;
import com.roadmap.javaspringboot.animescrud.repository.AnimesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This class represent all access to repository
 * 
 * @author João Guilherme <joaoguilhermeall@gmail.com>
 */
@Service
public class AnimesService extends BaseService{
    private AnimesRepository animesRepository;

    @Autowired
    AnimesService (AnimesRepository animesRepository){
        this.animesRepository = animesRepository;
    }

    /**
     * Return a list of all animes
     * 
     * @return List of all animes
     */
    public List<AnimesDTO> allAnimes(){
        List<AnimesModel> animesList =  this.animesRepository.findAll();
    
        return AnimesMapper.toDTO(animesList);
    }
}
