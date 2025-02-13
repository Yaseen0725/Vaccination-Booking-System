package com.example.Vaccination_Booking_System.Repository;

import com.example.Vaccination_Booking_System.Models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}
