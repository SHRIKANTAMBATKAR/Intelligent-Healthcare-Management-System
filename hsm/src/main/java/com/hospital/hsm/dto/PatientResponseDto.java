package com.hospital.hsm.dto;

import com.hospital.hsm.entity.type.bloodgrouptype;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PatientResponseDto {
    private Long id;
    private String name;
    private String gender;
    private LocalDate birthday;
    private bloodgrouptype bloodgroup;

}
