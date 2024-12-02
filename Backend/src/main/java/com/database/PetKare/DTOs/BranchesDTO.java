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
public class BranchesDTO {
    
    private int branchId;
    private String branchName;
    private String branchAddress;
    private int branchContact;


}
