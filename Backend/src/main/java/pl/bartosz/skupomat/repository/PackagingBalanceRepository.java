package pl.bartosz.skupomat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.bartosz.skupomat.model.PackagingBalance;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PackagingBalanceRepository extends JpaRepository<PackagingBalance, UUID> {
    Optional<PackagingBalance> findBySupplierId(UUID supplierId);
    Optional<PackagingBalance> findBySupplierIdAndPackagingType(UUID supplierId, String packagingType);
}
