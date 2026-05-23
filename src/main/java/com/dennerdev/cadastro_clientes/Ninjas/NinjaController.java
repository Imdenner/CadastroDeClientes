package com.dennerdev.cadastro_clientes.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

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
    @GetMapping ("/listar")
    public List<NinjaModel> ListarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Mostrar ninja por ID (READ)
    @GetMapping("/listarID")
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
