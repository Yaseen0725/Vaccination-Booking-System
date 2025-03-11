package com.example.Vaccination_Booking_System.Services;
import com.example.Vaccination_Booking_System.Models.User;
import com.example.Vaccination_Booking_System.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
}
