package pl.bartosz.skupomat.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "employee_profiles")
@Data
public class EmployeeProfile {

    @Id
    @Column(name = "user_id")
    private UUID id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false, length = 50)
    private String firstName;

    @Column(nullable = false, length = 50)
    private String lastName;

    @Column(unique = true, length = 20)
    private String employeeNumber;

    @Column(length = 15)
    private String phoneNumber;

    private String position;

    private boolean isActive = true;

    private LocalDateTime hiredAt = LocalDateTime.now();
}

