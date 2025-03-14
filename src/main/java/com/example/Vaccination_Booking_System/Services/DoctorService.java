package com.example.Vaccination_Booking_System.Services;

import com.example.Vaccination_Booking_System.Dtos.RequestDtos.AssociateDoctorDto;
import com.example.Vaccination_Booking_System.Exceptions.*;
import com.example.Vaccination_Booking_System.Models.Doctor;
import com.example.Vaccination_Booking_System.Models.VaccinationCenter;
import com.example.Vaccination_Booking_System.Repository.DoctorRepository;
import com.example.Vaccination_Booking_System.Repository.VaccinationCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private VaccinationCenterRepository vaccinationCenterRepository;

    public String addDoctor(Doctor doctor)throws EmailIdEmptyException, DoctorAlreadyExistsException {
        if(doctor.getEmailId() == null){
            throw new EmailIdEmptyException("Email id is mandatory");
        }
        if(doctorRepository.findByEmailId(doctor.getEmailId()) != null){
            throw new DoctorAlreadyExistsException("Doctor with this emailId already exits.");
        }
        doctorRepository.save(doctor);
        return "Doctor has been added to the database";
    }

    public String associateDoctor(AssociateDoctorDto associateDoctorDto) throws DoctorNotFound, CenterNotFound {

        Integer docId = associateDoctorDto.getDocId();
        Optional<Doctor> doctorOptional = doctorRepository.findById(docId);

        if(!doctorOptional.isPresent()){
            throw new DoctorNotFound("Doctor id is wrong");
        }

        Integer centerId = associateDoctorDto.getCenterId();
        Optional<VaccinationCenter> optionalVaccinationCenter = vaccinationCenterRepository.findById(centerId);

        if(!optionalVaccinationCenter.isPresent()){
            throw new CenterNotFound("Center Id entered is incorrect");
        }

        Doctor doctor = doctorOptional.get();
        VaccinationCenter vaccinationCenter = optionalVaccinationCenter.get();
        doctor.setVaccinationCenter(vaccinationCenter);

        vaccinationCenter.getDoctorList().add(doctor);
        vaccinationCenterRepository.save(vaccinationCenter);
        return "Doctor has been associated to center";
    }
}
