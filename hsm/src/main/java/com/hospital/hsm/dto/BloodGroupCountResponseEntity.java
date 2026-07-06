package com.hospital.hsm.dto;

import com.hospital.hsm.entity.type.bloodgrouptype;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BloodGroupCountResponseEntity {

    private bloodgrouptype  bloodgrouptype;
    private Long count;
}
