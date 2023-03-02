package com.example.multitenancy_db.controller;

import com.example.multitenancy_db.dto.request.HolidayRequestDto;
import com.example.multitenancy_db.entity.Holiday;
import com.example.multitenancy_db.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HolidayController {
    @Autowired
    private HolidayService holidayService;

    @PostMapping ("/create")
    Holiday create(@RequestBody HolidayRequestDto holidayRequestDto) {
        return holidayService.create(holidayRequestDto);
    }

    @GetMapping("/fetch/{id}")
    Holiday fetch(@PathVariable Long id) throws Exception {
        return holidayService.fetch(id);
    }
}
