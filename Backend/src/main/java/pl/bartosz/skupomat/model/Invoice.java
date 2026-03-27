package pl.bartosz.skupomat.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "invoices")
@Data
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne
    @JoinColumn(name = "delivery_id", nullable = false)
    private Delivery delivery;

    @ManyToOne
    @JoinColumn(name = "supplier_id", nullable = false)
    private User supplier;

    @Column(unique = true, nullable = false)
    private String invoiceNumber;

    @Column(nullable = false)
    private BigDecimal totalNetto;

    @Column(nullable = false)
    private BigDecimal totalBrutto;

    private String ksefReferenceNumber;

    private boolean isPaid = false;

    private LocalDateTime createdAt = LocalDateTime.now();

    private String storageUrl;
}