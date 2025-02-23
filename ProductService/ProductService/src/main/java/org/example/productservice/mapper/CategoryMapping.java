package org.example.productservice.mapper;

import org.example.productservice.domain.entity.Category;
import org.example.productservice.domain.dto.CategoryDTO;

import java.util.Optional;

public interface CategoryMapping {

    public static CategoryDTO map(final Category category) {
        final var parentCategory = Optional.ofNullable(category
                .getParentCategory()).orElseGet(() -> new Category());

        return CategoryDTO.builder()
                .categoryId(category.getCategoryId())
                .categoryName(category.getCategoryName())
                .categoryImageUrl(category.getCategoryImageUrl())
                .parentCategoryDTO(
                        CategoryDTO.builder()
                                .categoryId(parentCategory.getCategoryId())
                                .categoryName(parentCategory.getCategoryName())
                                .categoryImageUrl(parentCategory.getCategoryImageUrl())
                                .build())
                .build();
    }
}
