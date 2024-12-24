package com.example.zalominiapp.miniapp.utility.mapper;

import com.example.zalominiapp.miniapp.dto.request.ShoppingCartRequestDTO;
import com.example.zalominiapp.miniapp.dto.response.ShoppingCartResponseDTO;
import com.example.zalominiapp.miniapp.entity.Product;
import com.example.zalominiapp.miniapp.entity.ShoppingCart;
import com.example.zalominiapp.miniapp.entity.User;

import java.time.LocalDate;

public class ShoppingCartMapper {
    public ShoppingCartResponseDTO mapToResponse(ShoppingCart cart) {
        return new ShoppingCartResponseDTO(
                cart.getCartId(),
                cart.getUser().getUserId(),
                cart.getUser().getName(),
                cart.getProduct().getProductId(),
                cart.getProduct().getName(),
                cart.getProduct().getPrice(),
                cart.getQuantity(),
                cart.getAddedAt()
        );
    }
    public ShoppingCart mapToEntity(ShoppingCartRequestDTO dto, User user, Product product) {
        ShoppingCart cart = new ShoppingCart();
        cart.setUser(user); // Fetched from the database using userId
        cart.setProduct(product); // Fetched from the database using productId
        cart.setQuantity(dto.getQuantity());
        cart.setAddedAt(LocalDate.now());
        return cart;
    }


}
