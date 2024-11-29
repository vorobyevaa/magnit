package ru.aa.sov.dto;

import lombok.Data;

@Data
public class Town {

    Long id;
    String name;
    protected Boolean isNotSpecified;
    protected Boolean isLead;
    protected Integer regionId;
}
