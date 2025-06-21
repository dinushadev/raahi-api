package com.saffari.repository;

import com.saffari.domain.SaffariPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaffariPackageRepository extends JpaRepository<SaffariPackage, Long> {
}
