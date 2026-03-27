package pl.bartosz.skupomat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.bartosz.skupomat.model.SupplierProfile;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface SupplierProfileRepository extends JpaRepository<SupplierProfile, UUID> {
    Optional<SupplierProfile> findBySupplierNumber(String supplierNumber);
    Optional<SupplierProfile> findByLastNameContainingIgnoreCase(String lastName);
}


