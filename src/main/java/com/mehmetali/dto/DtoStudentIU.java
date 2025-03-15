package com.mehmetali.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudentIU {
@NotEmpty(message = "Firstname alani bos birakilmaz!")
@Min(value = 3)
@Max(value = 20)
    private String firstName;
@Size(min = 2 ,max = 20)
    private String lastName;

    private Date birthOfDate;
}
