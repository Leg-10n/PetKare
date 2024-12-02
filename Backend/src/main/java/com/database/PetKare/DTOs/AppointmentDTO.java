package com.database.PetKare.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
    private String appointmentDate;
    private String appointmentStatus;
}
