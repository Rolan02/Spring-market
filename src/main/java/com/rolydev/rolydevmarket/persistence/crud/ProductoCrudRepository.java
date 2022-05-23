package com.rolydev.rolydevmarket.persistence.crud;

import com.rolydev.rolydevmarket.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {


    //QUERY DE MANERA NATIVA
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)

    //QUERY METHODS
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);


    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
