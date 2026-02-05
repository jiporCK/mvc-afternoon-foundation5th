package model.entities;

import lombok.*;

import java.time.LocalDate;
import java.util.Random;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {

    private Long id;
    private String fullName;
    private LocalDate dateOfBirth;

    public Student(String fullName, LocalDate dateOfBirth) {
        this.id = new Random().nextLong(9999);
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

}
