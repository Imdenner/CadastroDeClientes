package com.dennerdev.cadastro_clientes.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira rota";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Essa é minha primeira rota";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping ("/todos")
    public String mostrarNinja() {
        return "Mostrar ninja";
    }

    // Mostrar ninja por ID (READ)
    @GetMapping("/todosID")
    public String mostrarNinjasPorId() {
        return "Mostrar ninja por ID";
    }

    // alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarPorId(){
        return "Alterar ninja por ID";
    }

    // DeletarNinja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarPorId() {
        return "Ninja deletado por ID";
    }



}
