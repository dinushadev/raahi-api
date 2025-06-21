package com.saffari.service;

import com.saffari.domain.SaffariPackage;
import com.saffari.dto.SaffariPackageDto;
import com.saffari.mapper.SaffariPackageMapper;
import com.saffari.repository.SaffariPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class SaffariPackageServiceImpl implements SaffariPackageService {
    private final SaffariPackageRepository repository;

    @Autowired
    public SaffariPackageServiceImpl(SaffariPackageRepository repository) {
        this.repository = repository;
    }

    @Override
    public SaffariPackageDto create(SaffariPackageDto dto) {
        SaffariPackage entity = SaffariPackageMapper.toEntity(dto);
        SaffariPackage saved = repository.save(entity);
        return SaffariPackageMapper.toDto(saved);
    }

    @Override
    public SaffariPackageDto getById(Long id) {
        Optional<SaffariPackage> entity = repository.findById(id);
        return entity.map(SaffariPackageMapper::toDto).orElse(null);
    }

    @Override
    public List<SaffariPackageDto> getAll() {
        return repository.findAll().stream()
                .map(SaffariPackageMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public SaffariPackageDto update(Long id, SaffariPackageDto dto) {
        Optional<SaffariPackage> optional = repository.findById(id);
        if (optional.isPresent()) {
            SaffariPackage entity = optional.get();
            entity.setName(dto.getName());
            entity.setDescription(dto.getDescription());
            entity.setPrice(dto.getPrice());
            SaffariPackage updated = repository.save(entity);
            return SaffariPackageMapper.toDto(updated);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
