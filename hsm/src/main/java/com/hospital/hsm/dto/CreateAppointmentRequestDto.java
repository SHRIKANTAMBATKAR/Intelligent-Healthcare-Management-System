package com.hospital.hsm.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CreateAppointmentRequestDto {
    private Long doctor;
    private Long patientId;
    private LocalDateTime appointmentTime;
    private String reason;

    public Long getDoctorId() {
        return 0L;
    }
}
