package com.example.cadastroveiculos.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Entity
public class Veiculo {
    @Id
    private String placa;
    private String modelo;
    private int ano;
    private String cor;


    @ManyToOne
    private Fabricante fabricante;


    @ManyToOne
    private Categoria categoria;
}

}

