package com.roadmap.javaspringboot.animescrud.mapper;

import java.util.List;

import com.roadmap.javaspringboot.animescrud.dto.AnimesDTO;
import com.roadmap.javaspringboot.animescrud.model.AnimesModel;

public class AnimesMapper {
    public static AnimesDTO toDTO(AnimesModel animesModel) {
        return new AnimesDTO();        
    }

    public static List<AnimesDTO> toDTO(List<AnimesModel> animesModelList) {
        List<AnimesDTO> animesDTOList = List.of();
        return animesDTOList;
    }

    public static AnimesModel toModel(AnimesDTO animesDTO) {
        return new AnimesModel();
    }

    public static List<AnimesModel> toModel(List<AnimesDTO> animesDTOList) {
        List<AnimesModel> animesModelList = List.of();
        return animesModelList;
    }

}
