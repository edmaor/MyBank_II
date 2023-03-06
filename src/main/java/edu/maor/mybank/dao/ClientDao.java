package edu.maor.mybank.dao;

import edu.maor.mybank.domain.Client;

public class ClientDao extends MyBankDao<Client, Integer>{
    public ClientDao() {
        super(Client.class);
    }
}
