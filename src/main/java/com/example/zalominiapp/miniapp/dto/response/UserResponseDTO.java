package com.example.zalominiapp.miniapp.dto.response;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDTO {
    private Long userId;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private Date createdAt;
}
