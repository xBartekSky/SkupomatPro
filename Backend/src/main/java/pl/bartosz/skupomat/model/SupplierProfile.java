package pl.bartosz.skupomat.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "suppiler_profiles")
@Data
public class SupplierProfile {
    @Id
    private UUID id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    private String supplierNumber;

    @Column(length = 50)
    private String firstName;

    @Column(length = 50)
    private String lastName;

    @Column(length = 10)
    private String phoneNumber;

    @Column(length = 11)
    private String pesel;

    @Column(length = 28)
    private String ibanNumber;

    private boolean isGlobalgap;
    private boolean isVat;


}
