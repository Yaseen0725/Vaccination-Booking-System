package com.example.Vaccination_Booking_System.Controllers;
import com.example.Vaccination_Booking_System.Dtos.RequestDtos.UpdateEmailDto;
import com.example.Vaccination_Booking_System.Models.User;
import com.example.Vaccination_Booking_System.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }


    @GetMapping("/getVaccinationDate")
    public Date getVaccinationDate(@RequestParam("userId") Integer userId){
        return userService.getVaccDate(userId);
    }

    @PutMapping("updateEmail")
    public String updateEmail(@RequestBody UpdateEmailDto updateEmailDto){
        return userService.updateEmail(updateEmailDto);
    }

    @GetMapping("/getByEmail/{emailId}")
    public User getUserByEmail(@PathVariable ("emailId") String emailId){
        return userService.getUserByEmail(emailId);
    }
}




















