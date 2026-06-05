package com.dennerdev.cadastro_clientes.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    private final MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    // GET - Mandar uma requisição para mostrar as missões
    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes(){
        return missoesService.listarMissoes();
    }
    // POST - Mandar uma requisição para criar as missões
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão criada com sucesso!";
    }
    // PUT - Mandar uma requisição para alterar as missões
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missão alterada com sucesso!";
    }

    // Mostrar ninja por ID (READ)
    @GetMapping("/listar/{id}")
    public MissoesModel listarMissoesPorId(@PathVariable Long id){
        return missoesService.listarMissoesPorId(id);
    }

    // DELETE - Mandar uma requisição para deletar as missões
    @DeleteMapping("/deletarMissao")
    public String deletarMissaoPorId() {
        return "Missão deletada com sucesso!";
    }



}
