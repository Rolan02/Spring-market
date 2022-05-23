package com.rolydev.rolydevmarket.persistence.entity;

import jdk.jfr.Category;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProduct;

    @Column(name = "nombre")
    private String name;

    @Column(name = "id_categoria")
    private Integer idCategory;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    @Column(name = "estado")
    private Boolean estado;

    //Con estas anotaciones le estamos diciendo que desde esta clase no podremos insetar ni modificar el atributo categoria
    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;
}
