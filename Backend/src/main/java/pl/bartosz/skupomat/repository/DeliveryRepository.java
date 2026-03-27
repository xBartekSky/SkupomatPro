package pl.bartosz.skupomat.repository;

import org.springframework.stereotype.Repository;
import pl.bartosz.skupomat.enums.DeliveryStatus;
import pl.bartosz.skupomat.model.Delivery;

import java.util.Optional;

@Repository
public interface DeliveryRepository {
    Optional<Delivery> findByStatus(DeliveryStatus status);
}
