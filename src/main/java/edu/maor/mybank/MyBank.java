package edu.maor.mybank;


import edu.maor.mybank.dao.AccountDao;
import edu.maor.mybank.dao.ClientDao;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class MyBank {
    private static final SessionFactory sessionFactory;
    private static final AccountDao accountDao;
    private static final ClientDao clientDao;

    static {
        try {
            sessionFactory = new Configuration().configure(new File("hibernate.cfg.xml")).buildSessionFactory();
            accountDao = new AccountDao();
            clientDao = new ClientDao();
        } catch (Throwable ex) {
            System.err.println("Error en la inicialización.  " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static void initialize() {}

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public static ClientDao getClientDao() {
        return clientDao;
    }
    public static AccountDao getAccountDao() {
        return accountDao;
    }
}
