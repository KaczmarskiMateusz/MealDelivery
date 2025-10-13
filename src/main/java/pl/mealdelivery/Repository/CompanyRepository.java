package pl.mealdelivery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mealdelivery.Model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
