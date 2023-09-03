package com.java.adapter;

import com.java.adapter.security.LoginHandler;
import com.java.adapter.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("chanseok", "chanseok");
        System.out.println("login = " + login);
    }
}
