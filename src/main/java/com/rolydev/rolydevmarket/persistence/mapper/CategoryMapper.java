package com.rolydev.rolydevmarket.persistence.mapper;

import com.rolydev.rolydevmarket.domain.Category;
import com.rolydev.rolydevmarket.persistence.entity.Categoria;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@MapperConfig(componentModel = "spring")
public interface CategoryMapper {

    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId" ),
            @Mapping(source = "descripcion", target = "category" ),
            @Mapping(source = "estado", target = "active" ),
    })
    Category toCategory(Categoria categoria);

    @InheritConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);
}
