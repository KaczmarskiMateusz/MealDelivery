package pl.mealdelivery.Model;

import javax.persistence.*;
import java.time.Instant;
import java.util.UUID;

public class CompanyRequest {

    private UUID externalId;
    private String name;
    private String address;
    private String phone;
    private String email;

}
