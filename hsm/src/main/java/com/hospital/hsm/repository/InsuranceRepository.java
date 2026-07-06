package com.hospital.hsm.repository;

import com.hospital.hsm.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;



public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}