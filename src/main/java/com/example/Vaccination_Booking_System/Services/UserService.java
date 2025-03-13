package com.example.Vaccination_Booking_System.Services;
import com.example.Vaccination_Booking_System.Dtos.RequestDtos.UpdateEmailDto;
import com.example.Vaccination_Booking_System.Models.Dose;
import com.example.Vaccination_Booking_System.Models.User;
import com.example.Vaccination_Booking_System.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class UserService
{
    @Autowired
    UserRepository userRepository;

    public User addUser(User user){

        System.out.println("The user is "+user);
        user = userRepository.save(user);
        return user;
    }

    public Date getVaccDate(Integer userId){
        User user = userRepository.findById(userId).get();
        Dose dose = user.getDose();
        return dose.getVaccinationDate();
    }

    public String updateEmail(UpdateEmailDto updateEmailDto){
        int userId = updateEmailDto.getUserId();
        User user = userRepository.findById(userId).get();

        user.setEmailId(updateEmailDto.getNewEmailId());
        userRepository.save(user);
        return "Old Email has been modified with new one "+updateEmailDto.getNewEmailId();
    }

    public User getUserByEmail(String email){
        User user = userRepository.findByEmailId(email);
        return user;
    }
}
