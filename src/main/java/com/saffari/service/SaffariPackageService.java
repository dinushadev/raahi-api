package com.saffari.service;

import com.saffari.dto.SaffariPackageDto;
import java.util.List;

public interface SaffariPackageService {
    SaffariPackageDto create(SaffariPackageDto saffariPackageDto);
    SaffariPackageDto getById(Long id);
    List<SaffariPackageDto> getAll();
    SaffariPackageDto update(Long id, SaffariPackageDto saffariPackageDto);
    void delete(Long id);
}
