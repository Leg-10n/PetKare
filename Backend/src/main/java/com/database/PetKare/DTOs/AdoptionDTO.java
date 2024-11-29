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
public class AdoptionDTO {
    private int adoption_id;
    private int pet_id;
    private int adopter_id;
    private String adoption_date;
    private String adoption_status;
}
