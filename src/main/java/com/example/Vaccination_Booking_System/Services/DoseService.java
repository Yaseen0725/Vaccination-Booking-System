package com.example.Vaccination_Booking_System.Services;

import com.example.Vaccination_Booking_System.Models.Dose;
import com.example.Vaccination_Booking_System.Models.User;
import com.example.Vaccination_Booking_System.Repository.DoseRepository;
import com.example.Vaccination_Booking_System.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoseService {

    @Autowired
    DoseRepository doseRepository;

    @Autowired
    UserRepository userRepository;

    public String giveDose(String doseId, Integer userId){

        User user = userRepository.findById(userId).get(); //hum ne aik user nikala with the help
        //of userId

        //An Entity of that model has been created
        //This entity will be saved in the database
        Dose dose = new Dose(); //yha hum ne aik dose entity ko craete kiya hai

        //setting its attributes
        dose.setDoseId(doseId);
        dose.setUser(user);

        //Setting the child object in that corresponding
        user.setDose(dose);

        userRepository.save(user);

        //Child will automatically get saved because of cascading effect.

        return "Dose Given to user successfully";
    }


}
