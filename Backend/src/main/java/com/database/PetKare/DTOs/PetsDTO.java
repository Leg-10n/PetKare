package com.database.PetKare.DTOs;

import com.database.PetKare.Entities.Branches;
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
public class PetsDTO {
    private int petId;
    private String petName;
    private String petType;
    private String petBreed;
    private int petAge;
    private String petGender;
    private String petImage;
    private Branches branch;
}
