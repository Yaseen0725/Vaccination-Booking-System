package com.example.Vaccination_Booking_System.Repository;

import com.example.Vaccination_Booking_System.Models.VaccinationCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationCenterRepository extends JpaRepository<VaccinationCenter, String> {
}
