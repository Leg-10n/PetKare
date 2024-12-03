package com.database.PetKare.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity 
@Table(name = "Branches")

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Branches { 

    @Id
    @Column(name = "branch_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int branchId;

    @Column(name = "branch_name")
    private String branchName;

    @Column(name = "branch_address")
    private String branchAddress;

    @Column(name = "branch_contact")
    private String branchContact;
 
}


