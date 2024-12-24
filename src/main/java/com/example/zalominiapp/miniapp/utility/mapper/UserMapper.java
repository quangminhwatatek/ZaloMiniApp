//package com.example.zalominiapp.miniapp.utility.mapper;
//
//import com.example.zalominiapp.miniapp.dto.request.UserRequestDTO;
//import com.example.zalominiapp.miniapp.dto.response.UserResponseDTO;
//import com.example.zalominiapp.miniapp.entity.User;
//
//public class UserMapper {
//    public UserResponseDTO mapToResponse(User user) {
//        return new UserResponseDTO(
//                user.getUserId(),
//                user.getName(),
//                user.getEmail(),
//                user.getAddress(),
//                user.getPhoneNumber(),
//                user.getCreatedAt()
//        );
//    }
//    public User mapToEntity(UserRequestDTO dto) {
//        User user = new User();
//        user.setName(dto.getName());
//        user.setEmail(dto.getEmail());
//        user.setPasswordHash(dto.getPassword());
//        user.setAddress(dto.getAddress());
//        user.setPhoneNumber(dto.getPhoneNumber());
//        return user;
//    }
//
//}
