package pl.mealdelivery.Service;

import pl.mealdelivery.Model.CompanyDto;
import pl.mealdelivery.Model.CompanyRequest;
import pl.mealdelivery.Model.CompanyStatus;
import pl.mealdelivery.Repository.CompanyRepository;

import java.util.UUID;

public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }


    @Override
    public CompanyDto createCompany(CompanyRequest companyRequest, String name) {
        return null;
    }

    @Override
    public CompanyDto updateCompany(CompanyRequest companyRequest, UUID companyExternalId, String name) {
        return null;
    }

    @Override
    public void deleteCompany(UUID externalId, String name) {

    }

    @Override
    public boolean setCompanyStatus(UUID externalId, String name, CompanyStatus companyStatus) {
        return false;
    }

    @Override
    public CompanyDto getCompany(UUID companyRequest, String name) {
        return null;
    }

    @Override
    public boolean isCompanyActive(UUID companyId, String name) {
        return false;
    }

    @Override
    public void openCompanyToGettingOrders(UUID companyId, String name) {

    }

    @Override
    public void closeCompanyToGettingOrders(UUID companyId, String name) {

    }
}
