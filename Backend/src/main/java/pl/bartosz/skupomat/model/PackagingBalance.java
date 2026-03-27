package pl.bartosz.skupomat.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "packaging_balances")
@Data
public class PackagingBalance {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "supplier_id", nullable = false)
    private User supplier;
    
    @Column(nullable = false)
    private String packagingType;

    @Column(nullable = false)
    private int balance;

}
