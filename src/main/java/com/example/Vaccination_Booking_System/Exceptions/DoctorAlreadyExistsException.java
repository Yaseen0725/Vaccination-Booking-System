package com.example.Vaccination_Booking_System.Exceptions;

public class DoctorAlreadyExistsException extends Exception{
    public DoctorAlreadyExistsException(String message){
        super(message);
    }
}
