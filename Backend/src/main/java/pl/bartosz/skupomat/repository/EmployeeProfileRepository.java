package pl.bartosz.skupomat.repository;

import org.springframework.stereotype.Repository;
import pl.bartosz.skupomat.model.EmployeeProfile;

import java.util.Optional;

@Repository
public interface EmployeeProfileRepository {
    Optional<EmployeeProfile> findByEmployeeNumber(String employeeNumber);
    Optional<EmployeeProfile> findByPosition(String position);

}
