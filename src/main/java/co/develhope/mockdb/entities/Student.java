package co.develhope.mockdb.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Student")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "firstName")
    private String firstName;
    @Column (name = "lastName")
    private String lastName;
    @Column(name = "email", unique = true)
    private String email;

}