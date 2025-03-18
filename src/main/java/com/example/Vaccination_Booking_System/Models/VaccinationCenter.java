package com.example.Vaccination_Booking_System.Models;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "vaccinationCenter")
@Data
public class VaccinationCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String centreName;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private String address;
    private int doseCapacity;

    @OneToMany(mappedBy = "vaccinationCenter", cascade = CascadeType.ALL)
    private List<Doctor> doctorList = new ArrayList<>();

}
