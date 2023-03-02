package com.example.multitenancy_db.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HolidayRequestDto {
    @NotNull
    private String type;
    @NotNull
    private String date;
    @NotNull
    private String name;
    @NotNull
    private String active;
}
