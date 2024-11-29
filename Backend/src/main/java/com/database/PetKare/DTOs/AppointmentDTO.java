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
    private int appointment_id;
    private int pet_id;
    private int branch_id;
    private int adopter_id;
    private String appointment_date;
    private String appointment_status;
}
