package com.example.multitenancy_db.service;

import com.example.multitenancy_db.dto.request.HolidayRequestDto;
import com.example.multitenancy_db.entity.Holiday;
import com.example.multitenancy_db.enums.HolidayType;
import com.example.multitenancy_db.repository.HolidayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class HolidayService {

    private HolidayRepository holidayRepository;

    @Autowired
    public HolidayService(HolidayRepository holidayRepository) {
        this.holidayRepository = holidayRepository;
    }

    public Holiday create(HolidayRequestDto holidayRequestDtoDto) {
        Holiday holiday = new Holiday();
        holiday.setActive(true);
        holiday.setType(HolidayType.MARKET);
        holiday.setName(holidayRequestDtoDto.getName());
        holiday.setDate(LocalDate.now());
        return this.holidayRepository.save(holiday);
    }

    public Holiday fetch(Long id) throws Exception {
        return this.holidayRepository.findById(id).orElseThrow(() -> new Exception("Holiday not found"));
    }
}
