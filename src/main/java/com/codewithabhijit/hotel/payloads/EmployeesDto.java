package com.codewithabhijit.hotel.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter

@ToString
public class EmployeesDto {

    private int id;

    @NotEmpty
    @Size(min = 4, message = "Username must be at least 4 characters long")
    private String name;

    @Min(value = 18, message = "Age must be at least 18")
    private Integer age;

    @NotEmpty
    private String gender;

    
    private String job;

    @NotNull
    private Double salary;

    @Pattern(regexp = "[0-9]{10}", message = "Phone number must be 10 digits long")
    private String phone;

    
    private String aadharNo;

    @Email(message = "Email address is not valid")
    private String email;

    private String password;
    
    private String roles;
}
