package com.hospital.hsm.dto;

import lombok.Data;

import java.util.HashSet;

@Data
public class SingUpRequestDto {
    private String username;
    private String password;
    private String name;

   // private Set<RoleType> roles = new HashSet<>();
}
