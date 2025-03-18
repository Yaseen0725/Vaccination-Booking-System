package com.example.Vaccination_Booking_System.Dtos.RequestDtos;

import lombok.Data;

@Data
public class UpdateEmailDto {
    private int userId;
    private String newEmailId;
}
