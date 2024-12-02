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
@Table(name = "admin")

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    
    @Id
    @Column(name = "admin_id", length=45)
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int adminId;
    @Column(name = "admin_name", length=45)
    private String adminName;
    @Column(name = "password", length=45)
    private String password;
}
