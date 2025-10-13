package pl.mealdelivery.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CompanyDto {

    private UUID externalId;

    private String name;
    private String address;

    private int version;

    private String phone;
    private String email;

    private CompanyStatus status;

}
