package edu.maor.bank_ii.domain;

import org.hibernate.annotations.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@ @Data @NoArgsConstructor
public class Account {
    int id;
    int nid;
    double balance;

    public Account(int nid, double balance) {
        this.nid = nid;
        this.balance = balance;
    }
}
