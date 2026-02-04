package model;

import lombok.*;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {

    private Long id;
    private String fullName;
    private LocalDate dateOfBirth;

}
