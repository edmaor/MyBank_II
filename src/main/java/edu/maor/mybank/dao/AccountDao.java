package edu.maor.mybank.dao;

import edu.maor.mybank.domain.Account;

public class AccountDao extends MyBankDao<Account, Integer>{
    public AccountDao() {
        super(Account.class);
    }
}
