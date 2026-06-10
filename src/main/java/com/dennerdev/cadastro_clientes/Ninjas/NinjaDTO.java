package com.dennerdev.cadastro_clientes.Ninjas;
import com.dennerdev.cadastro_clientes.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {

    private Long id;
    private String nome;
    private String email;
    private int idade;
    private String imgUrl;
    private String rank;
    private MissoesModel missoes;

}
