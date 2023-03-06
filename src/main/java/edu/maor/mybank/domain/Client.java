package edu.maor.mybank.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data @NoArgsConstructor
public class Client {
    @Id
    int nid;
    String name;
    String email;
    String country;
    @OneToMany(mappedBy = "client")
    List<Account> accounts;
}
