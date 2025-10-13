package pl.mealdelivery.Service;

import pl.mealdelivery.Model.CompanyDto;
import pl.mealdelivery.Model.CompanyRequest;
import pl.mealdelivery.Model.CompanyStatus;

import java.util.UUID;

public interface CompanyService {

    CompanyDto createCompany(CompanyRequest companyRequest, String name);

    CompanyDto updateCompany(CompanyRequest companyRequest, UUID companyExternalId, String name);

    void deleteCompany(UUID externalId, String name);

    boolean setCompanyStatus(UUID externalId, String name, CompanyStatus companyStatus);


    CompanyDto getCompany(UUID companyRequest, String name);

    boolean isCompanyActive(UUID companyId, String name);

    void openCompanyToGettingOrders(UUID companyId, String name);

    void closeCompanyToGettingOrders(UUID companyId, String name);

}
