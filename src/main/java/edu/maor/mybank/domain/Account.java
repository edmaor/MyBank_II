package edu.maor.mybank.domain;

import jakarta.persistence.*;

@Entity
public class Account {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int aid;

    @ManyToOne @JoinColumn(name = "client_nid")
    Client client;
    double balance;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(int aid, Client client, double balance) {
        this.aid = aid;
        this.client = client;
        this.balance = balance;
    }

    public Account() {
    }
}
