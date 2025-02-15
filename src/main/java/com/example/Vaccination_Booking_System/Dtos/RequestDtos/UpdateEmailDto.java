package com.example.Vaccination_Booking_System.Dtos.RequestDtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmailDto {

    private int userId;
    private String newEmailId;
}