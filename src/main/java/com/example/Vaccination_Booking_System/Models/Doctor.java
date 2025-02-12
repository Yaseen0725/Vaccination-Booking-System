package com.example.Vaccination_Booking_System.Models;

import com.example.Vaccination_Booking_System.Enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "doctors")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int docId;

    private String name;

    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(unique = true)
    private String emailId;


    @ManyToOne
    @JoinColumn
    private VaccinationCenter vaccinationCenter;


    @OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)
    private List<Appointment> appointmentList = new ArrayList<>();  //one doctor having list of list
    //appointment to yha doctor and appointment me doctor(parent) hai and appointment(child) hai
    //to doctor parent hai to jo uper ki do line hai wo ye bat rahi hai ki kis tarahse parent
    //and child ko connect karte hai



}