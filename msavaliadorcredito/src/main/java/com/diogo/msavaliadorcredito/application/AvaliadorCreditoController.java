package com.diogo.msavaliadorcredito.application;

import com.diogo.msavaliadorcredito.domain.model.SituacaoCliente;
import jakarta.ws.rs.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes-credito")
@RequiredArgsConstructor
public class AvaliadorCreditoController {
    private final AvaliadorCreditoService avaliadorCreditoService;

    @GetMapping
    public String status(){
        return "ok";
    }

    @GetMapping(value = "situacao-cliente", params = "cpf")
    public ResponseEntity<SituacaoCliente> consultaSituacaoCliente(@PathParam("cpf") String cpf){
        SituacaoCliente situacaoCliente = avaliadorCreditoService.obtersituacaoCliente(cpf);
        return ResponseEntity.ok(situacaoCliente);
    }


}
