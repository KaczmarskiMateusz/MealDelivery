package pl.mealdelivery.Model;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "companies", schema = "app",
        uniqueConstraints = @UniqueConstraint(name = "uk_companies_name", columnNames = "name"))
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private UUID externalId;

    private String name;
    private String address;

    private Instant creationDate;
    private Instant modificationDate;

    @Version
    private int version;

    private boolean open;
    private boolean active;

    private String phone;
    private String email;

    @Enumerated(EnumType.STRING)
    private CompanyStatus status;

}
