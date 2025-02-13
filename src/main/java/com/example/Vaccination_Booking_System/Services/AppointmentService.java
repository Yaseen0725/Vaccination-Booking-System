package com.example.Vaccination_Booking_System.Services;

import com.example.Vaccination_Booking_System.Models.Appointment;
import com.example.Vaccination_Booking_System.Repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;
    private void createAppointment(Appointment appointment){
        appointmentRepository.save(appointment);
    }
}
