package com.java.adapter;

import com.java.adapter.security.UserDetails;
import com.java.adapter.security.UserDetailsService;

public class AccountUserDetailService implements UserDetailsService {
    AccountService accountService;

    public AccountUserDetailService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
