package edu.maor.mybank;


import edu.maor.mybank.dao.AccountDao;
import edu.maor.mybank.dao.ClientDao;
import org.hibernate.Session;

public class MyBank {
    private static final Session session;
    private static final AccountDao accountDao;
    private static final ClientDao clientDao;

    static {
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            accountDao = new AccountDao();
            clientDao = new ClientDao();
        } catch (Throwable ex) {
            System.err.println("Error en la inicialización.  " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static void initialize() {}

    public static Session getSession() {
        return session;
    }
    public static ClientDao getClientDao() {
        return clientDao;
    }
    public static AccountDao getAccountDao() {
        return accountDao;
    }
}