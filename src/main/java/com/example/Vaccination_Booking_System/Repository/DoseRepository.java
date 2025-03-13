package com.example.Vaccination_Booking_System.Repository;

import com.example.Vaccination_Booking_System.Models.Dose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoseRepository extends JpaRepository<Dose, Integer> {
}
