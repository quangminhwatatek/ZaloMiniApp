package com.example.zalominiapp.miniapp.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDTO {
    private String name;
    private String email;
    private String password; // Accept plain password (to be hashed later)
    private String address;
    private String phoneNumber;
}
