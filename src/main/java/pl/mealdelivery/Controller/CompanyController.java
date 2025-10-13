package pl.mealdelivery.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.mealdelivery.Model.CompanyDto;
import pl.mealdelivery.Model.CompanyRequest;
import pl.mealdelivery.Model.CompanyStatus;
import pl.mealdelivery.Service.CompanyService;

import javax.validation.Valid;
import java.net.URI;
import java.security.Principal;
import java.util.UUID;

@RestController
@RequestMapping("app/companies")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @PostMapping
    public ResponseEntity<CompanyDto> create(@RequestBody @Valid CompanyRequest request,
                                             Principal principal) {
        CompanyDto dto = companyService.createCompany(request, principal.getName());
        URI location = URI.create("/app/companies/" + dto.getExternalId());
        return ResponseEntity.created(location).body(dto);
    }

    @GetMapping("/{externalId}")
    public ResponseEntity<CompanyDto> getBasicInfo(@PathVariable UUID externalId,
                                                   Principal principal) {
        CompanyDto dto = companyService.getCompany(externalId, principal.getName());
        return ResponseEntity.ok(dto);
    }

    @PostMapping("/{externalId}")
    public ResponseEntity<CompanyDto> updateCompany(@PathVariable UUID externalId,
                                                    @RequestBody @Valid CompanyRequest request,
                                                    Principal principal) {
        CompanyDto dto = companyService.updateCompany(request, externalId, principal.getName());
        return ResponseEntity.ok(dto);
    }

    @DeleteMapping("/{externalId}")
    public ResponseEntity<Void> deleteCompany(@PathVariable UUID externalId,
                                              Principal principal) {
        companyService.deleteCompany(externalId, principal.getName());
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{externalId}/status")
    public ResponseEntity<Void> changeStatus(@PathVariable UUID externalId,
                                             @RequestBody @Valid CompanyStatus status,
                                             Principal principal) {
        companyService.setCompanyStatus(externalId, principal.getName(), status);
        return ResponseEntity.noContent().build();
    }

}
