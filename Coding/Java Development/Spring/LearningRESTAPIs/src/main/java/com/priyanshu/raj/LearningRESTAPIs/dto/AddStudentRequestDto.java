package com.priyanshu.raj.LearningRESTAPIs.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AddStudentRequestDto {
    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 30, message = "Should be of length 3-30 characters")
    private String name;

    @Email
    @NotBlank(message = "Email is Required")
    private String email;
}
