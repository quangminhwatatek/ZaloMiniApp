package com.example.zalominiapp.miniapp.controller;


import com.example.zalominiapp.miniapp.dto.ResponseObject;
import com.example.zalominiapp.miniapp.dto.request.CategoryRequestDTO;
import com.example.zalominiapp.miniapp.dto.response.CategoryResponseDTO;
import com.example.zalominiapp.miniapp.service.intf.CategoryService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping
    @Operation(summary = "Create a new category")
    public ResponseEntity<ResponseObject<CategoryResponseDTO>> createCategory(@Valid @RequestBody CategoryRequestDTO categoryRequestDTO) {
        CategoryResponseDTO categoryResponseDTO = categoryService.createCategory(categoryRequestDTO);

        return ResponseEntity.status(201).body(
                ResponseObject.<CategoryResponseDTO>builder()
                        .result(true)
                        .message("Successfully created category")
                        .status(201)
                        .data(categoryResponseDTO)
                        .build()
        );
    }
}
