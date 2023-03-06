package edu.maor.mybank.actions;

import edu.maor.mybank.MyBank;
import edu.maor.mybank.domain.Account;
import edu.maor.mybank.domain.Client;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "ActionMyBankRegister", value = "/ActionMyBankRegister")
public class ActionMyBankRegister extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        int nid = Integer.parseInt(req.getParameter("dni_nie"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String country = req.getParameter("country");
        double balance = Double.parseDouble(req.getParameter("mount"));

        Client client = new Client();
        client.setNid(nid);
        client.setName(name);
        client.setEmail(email);
        client.setCountry(country);

        Account account = new Account();
        account.setClient(client);
        account.setBalance(balance);

        MyBank.getClientDao().save(client);
        MyBank.getAccountDao().save(account);
    }
}