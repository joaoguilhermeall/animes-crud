package com.roadmap.javaspringboot.animescrud.controller;

import java.util.List;

import com.roadmap.javaspringboot.animescrud.constant.Routes;
import com.roadmap.javaspringboot.animescrud.dto.AnimesDTO;
import com.roadmap.javaspringboot.animescrud.service.AnimesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimesController {
 
    @Autowired
    private AnimesService animesService;

    @GetMapping(Routes.ANIMES)
    public List<AnimesDTO> allAnimes() {
         return animesService.allAnimes();
    }


}
