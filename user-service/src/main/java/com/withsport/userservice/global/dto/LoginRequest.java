package com.withsport.userservice.global.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String name;
    private String email;
    private String password;
}
