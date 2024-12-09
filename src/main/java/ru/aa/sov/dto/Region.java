package ru.aa.sov.dto;

import lombok.Data;

import java.util.List;

@Data
public class Region extends BaseDto {

    private List<Town> towns;
}
