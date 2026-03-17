package co.istad.hbl.a01a1webmvc.dto;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record CreateProductRequest(
        @NotBlank
        @Size(min = 1, max = 100)
        String name,

        @NotNull
        @Positive
        @Max(10000)
        BigDecimal price,

        @NotNull
        @Positive
        @Max(999999)
        Integer categoryId
) {
}