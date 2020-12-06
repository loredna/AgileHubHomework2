package com.loredanacostea.homework6.observer.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class BusyObject {

    private Integer id;
    private String name;
    private LocalDate creationDate;
}
