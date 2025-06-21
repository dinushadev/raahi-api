package com.saffari.presentation;

import com.saffari.dto.SaffariPackageDto;
import com.saffari.service.SaffariPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/packages")
public class SaffariPackageController {
    private final SaffariPackageService service;

    @Autowired
    public SaffariPackageController(SaffariPackageService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<SaffariPackageDto> create(@RequestBody SaffariPackageDto dto) {
        return ResponseEntity.ok(service.create(dto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<SaffariPackageDto> getById(@PathVariable Long id) {
        SaffariPackageDto dto = service.getById(id);
        return dto != null ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<SaffariPackageDto>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<SaffariPackageDto> update(@PathVariable Long id, @RequestBody SaffariPackageDto dto) {
        SaffariPackageDto updated = service.update(id, dto);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
