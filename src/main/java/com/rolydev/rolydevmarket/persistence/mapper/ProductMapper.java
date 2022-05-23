package com.rolydev.rolydevmarket.persistence.mapper;

import com.rolydev.rolydevmarket.domain.Category;
import com.rolydev.rolydevmarket.domain.Product;
import com.rolydev.rolydevmarket.persistence.entity.Categoria;
import com.rolydev.rolydevmarket.persistence.entity.Producto;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@MapperConfig(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProducto", target = "productId" ),
            @Mapping(source = "nombre", target = "name" ),
            @Mapping(source = "idCategoria", target = "categoryId" ),
            @Mapping(source = "precioVenta", target = "price" ),
            @Mapping(source = "cantidadStock", target = "stock" ),
            @Mapping(source = "estado", target = "active" ),
            @Mapping(source = "categoria", target = "category" ),
    })
    Product toProduct(Producto producto);

    List<Product> toProducts(List<Producto> productos);

    @InheritConfiguration
    @Mapping(target = "codigoBarras", ignore = true)
    Producto toProducto(Product product);
}
