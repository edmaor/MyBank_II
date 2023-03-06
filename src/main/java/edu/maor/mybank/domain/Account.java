package edu.maor.mybank.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor
public class Account {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int aid;

    @ManyToOne @JoinColumn(name = "client_nid")
    Client client;
    double balance;
}
