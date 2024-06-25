package com.medicdefense.backend.profiles.interfaces.rest.resources;

public record CreateMedicResource (
        String firstName,
        String lastName,
        String email,
        String phoneNumber,
        String image_url,
        String DNI){
}
