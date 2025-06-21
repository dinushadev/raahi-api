package com.saffari.mapper;

import com.saffari.domain.SaffariPackage;
import com.saffari.dto.SaffariPackageDto;

public class SaffariPackageMapper {
    public static SaffariPackageDto toDto(SaffariPackage entity) {
        SaffariPackageDto dto = new SaffariPackageDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        dto.setPrice(entity.getPrice());
        return dto;
    }

    public static SaffariPackage toEntity(SaffariPackageDto dto) {
        SaffariPackage entity = new SaffariPackage();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        entity.setPrice(dto.getPrice());
        return entity;
    }
}
