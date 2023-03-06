package edu.maor.mybank.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Client {
    @Id
    int nid;
    String name;
    String email;
    String country;
    @OneToMany(mappedBy = "client")
    List<Account> accounts;

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Client() {
    }

    public Client(int nid, String name, String email, String country, List<Account> accounts) {
        this.nid = nid;
        this.name = name;
        this.email = email;
        this.country = country;
        this.accounts = accounts;
    }
}
