package com.example.Vaccination_Booking_System.Repository;

import com.example.Vaccination_Booking_System.Models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    public Doctor findByEmailId(String emailId);
}
