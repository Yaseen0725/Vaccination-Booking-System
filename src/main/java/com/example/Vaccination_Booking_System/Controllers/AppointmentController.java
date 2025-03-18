package com.example.Vaccination_Booking_System.Controllers;

import com.example.Vaccination_Booking_System.Dtos.RequestDtos.AppointmentReqDto;
import com.example.Vaccination_Booking_System.Services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/book")
    public String bookAppointment(@RequestBody AppointmentReqDto appointmentReqDto) {

        try {
            String result = appointmentService.bookAppointment(appointmentReqDto);
            return result;
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
