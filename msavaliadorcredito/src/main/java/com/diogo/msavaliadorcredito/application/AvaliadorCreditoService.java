package com.diogo.msavaliadorcredito.application;

import com.diogo.msavaliadorcredito.domain.model.DadosCliente;
import com.diogo.msavaliadorcredito.domain.model.SituacaoCliente;
import com.diogo.msavaliadorcredito.infra.clients.ClienteResourceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AvaliadorCreditoService {

    private final ClienteResourceClient clienteClient;

    public SituacaoCliente obtersituacaoCliente(String cpf){
        // obterDadosCliente -MSCLIENTES
        // obter cartoes do cliente -MSCARTOES

        ResponseEntity<DadosCliente> dadosClienteResponse = clienteClient.dadosCliente(cpf);

        return SituacaoCliente
                .builder()
                .cliente(dadosClienteResponse.getBody())
                .build();
    }
}
