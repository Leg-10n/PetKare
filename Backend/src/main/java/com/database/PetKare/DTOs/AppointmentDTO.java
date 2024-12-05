package com.database.PetKare.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AppointmentDTO {
    private int appointmentId;
    private int petId;
    private int branchId;
    private int adopterId;
    private LocalDateTime appointmentDate;
    private String appointmentStatus;
}
