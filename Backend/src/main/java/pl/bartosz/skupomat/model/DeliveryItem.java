package pl.bartosz.skupomat.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "delivery_items")
public class DeliveryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "delivery_id", nullable = false)
    private Delivery delivery;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(nullable = false)
    private Double actualWeight;

    @Column(nullable = false)
    private Double pricePerUnit;


}
