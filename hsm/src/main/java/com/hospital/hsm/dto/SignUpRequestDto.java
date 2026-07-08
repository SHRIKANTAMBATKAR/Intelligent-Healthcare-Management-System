package com.hospital.hsm.dto;

import lombok.Data;

@Data
public class SignUpRequestDto {
    private String username;
    private String password;
    private String name;

   //  private Set<RoleType> roles = new HashSet<>();
}
