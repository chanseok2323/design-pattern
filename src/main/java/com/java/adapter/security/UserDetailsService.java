package com.java.adapter.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
