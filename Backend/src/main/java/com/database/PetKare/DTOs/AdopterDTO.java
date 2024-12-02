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
public class AdopterDTO {
    private int adopterId;
    private String adopterName;
    private String adopterAddress;
    private int adopterContact;
}
