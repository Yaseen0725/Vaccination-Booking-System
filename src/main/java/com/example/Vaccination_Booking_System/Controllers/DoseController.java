package com.example.Vaccination_Booking_System.Controllers;

import com.example.Vaccination_Booking_System.Services.DoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dose")
public class DoseController {

    @Autowired
    DoseService doseService;

    @PostMapping("/giveDose1")
    public String giveDose(@RequestParam("doseId")String doseId,@RequestParam("userId")Integer userId) {

        return doseService.giveDose(doseId, userId);
    }
}
