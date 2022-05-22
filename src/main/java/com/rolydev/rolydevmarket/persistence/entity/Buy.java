package com.rolydev.rolydevmarket.persistence.entity;

import lombok.Cleanup;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "compras")
public class Buy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_compra")
    private Integer idBuy;

    @Column(name = "id_cliente")
    private String idCustomer;

    @Column(name = "fecha")
    private LocalDateTime date;

    @Column(name= "medio_pago")
    private String paymentMethod;

    @Column(name = "comentario")
    private String commentary;

    @Column(name= "estado")
    private String state;

}
