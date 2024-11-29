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
public class PetsDTO {
    private int pet_id;
    private String pet_name;
    private String pet_type;
    private String pet_breed;
    private int pet_age;
    private String pet_gender;
}
