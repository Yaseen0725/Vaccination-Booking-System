package com.example.Vaccination_Booking_System.Services;

import com.example.Vaccination_Booking_System.Exceptions.VaccinationAddressNotFound;
import com.example.Vaccination_Booking_System.Models.VaccinationCenter;
import com.example.Vaccination_Booking_System.Repository.VaccinationCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccinationService {
    @Autowired
    VaccinationCenterRepository vaccinationCenterRepository;
    public String addVaccinationCenter(VaccinationCenter vaccinationCenter) throws VaccinationAddressNotFound {

        if(vaccinationCenter.getAddress() == null){
            throw new VaccinationAddressNotFound("Vaccination Address is Empty");
        }

        vaccinationCenterRepository.save(vaccinationCenter);
        return "Vaccination center added at a location "+vaccinationCenter.getAddress();
    }
}
