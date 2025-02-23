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
//                ...
                .build();
    }

    public static Category map(final CategoryDTO categoryDTO) {
        final var parentCategoryDto = Optional.ofNullable(categoryDTO.getParentCategoryDTO()).orElseGet(() -> new CategoryDTO());

        return Category.builder()
                .categoryId(categoryDTO.getCategoryId())
                .categoryName(categoryDTO.getCategoryName())
                .categoryImageUrl(categoryDTO.getCategoryImageUrl())
                .parentCategory(
                        Category.builder()
                                .categoryId(parentCategoryDto.getCategoryId())
                                .categoryName(parentCategoryDto.getCategoryName())
                                .categoryImageUrl(parentCategoryDto.getCategoryImageUrl())
                                .build())
                .build();
    }
}
