package com.dennerdev.cadastro_clientes.Ninjas;
import com.dennerdev.cadastro_clientes.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

// Entity ele tranforma uma classe em uma entidade do banco de dados
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name ="id")
    private Long id;

    @Column (name ="nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column (name = "img_url")
    private String imgUrl;

    @Column (name ="idade")
    private int idade;

    @Column (name = "rank")
    private String rank;

    // @ManyToOne - Várias missões pertencem a um NINJA
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing key ou chave estrangeira
    private MissoesModel missoes;



}
