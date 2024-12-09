package ru.aa.sov.dto;

import lombok.Data;

@Data
public class Town extends BaseDto {

    protected Boolean isNotSpecified;
    protected Boolean isLead;
    protected Integer regionId;
}
