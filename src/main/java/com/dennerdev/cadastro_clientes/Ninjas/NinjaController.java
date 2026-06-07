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
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {
        return ninjaService.criarNinja(ninja);
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping ("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Mostrar ninja por ID (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id) {
        return ninjaService.listarNinjasporId(id);
    }

    // alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarPorId(){
        return "Alterar ninja por ID";
    }

    // DeletarNinja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarPorId(@PathVariable Long id) {
        ninjaService.deletarPorId(id);
    }



}
