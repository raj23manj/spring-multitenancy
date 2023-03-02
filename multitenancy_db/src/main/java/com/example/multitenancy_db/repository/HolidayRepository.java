package com.example.multitenancy_db.repository;

import com.example.multitenancy_db.entity.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HolidayRepository extends JpaRepository<Holiday, Long> {
}
