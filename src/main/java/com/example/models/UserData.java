package com.example.models;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserData {
    private String username;
    private String password;
    private String role;
    private String environment;
    private boolean rememberMe;
}
