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
    private int adoptionId;
    private int petId;
    private int adopterId;
    private String adoptionDate;
    private String adoptionStatus;
}
