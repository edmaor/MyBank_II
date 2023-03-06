package edu.maor.bank_ii.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class Client {
    int nid;
    String name;
    String email;
    String country;
    public Client(int nid, String name, String email, String country) {
        this.nid = nid;
        this.name = name;
        this.email = email;
        this.country = country;
    }
}
