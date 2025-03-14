package com.example.Vaccination_Booking_System.Dtos.RequestDtos;

import lombok.Data;

@Data
public class AssociateDoctorDto {
    private Integer docId;
    private Integer centerId;

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public Integer getCenterId() {
        return centerId;
    }

    public void setCenterId(Integer centerId) {
        this.centerId = centerId;
    }
}
