package ru.aa.sov.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Magnet extends BaseDto {
    private Form form;
    private Type type;
    private Local local;
    private Boolean isActive;
}
