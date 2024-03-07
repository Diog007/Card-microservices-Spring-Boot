package com.diogo.msavaliadorcredito.application;

import com.diogo.msavaliadorcredito.application.ex.DadosClienteNotFoundException;
import com.diogo.msavaliadorcredito.application.ex.ErroComunicacaoMicroservicesException;
import com.diogo.msavaliadorcredito.domain.model.CartaoCliente;
import com.diogo.msavaliadorcredito.domain.model.DadosCliente;
import com.diogo.msavaliadorcredito.domain.model.SituacaoCliente;
import com.diogo.msavaliadorcredito.infra.clients.CartoesResourceClient;
import com.diogo.msavaliadorcredito.infra.clients.ClienteResourceClient;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AvaliadorCreditoService {

    private final ClienteResourceClient clienteClient;
    private final CartoesResourceClient cartoesClient;

    public SituacaoCliente obtersituacaoCliente(String cpf) throws DadosClienteNotFoundException, ErroComunicacaoMicroservicesException {
        try {
            ResponseEntity<DadosCliente> dadosClienteResponse = clienteClient.dadosCliente(cpf);
            ResponseEntity<List<CartaoCliente>> cartoesResponse = cartoesClient.getCartoesByCliente(cpf);

            return SituacaoCliente
                    .builder()
                    .cliente(dadosClienteResponse.getBody())
                    .cartoes(cartoesResponse.getBody())
                    .build();

        }catch (FeignException.FeignClientException e){
            int status = e.status();
            if(HttpStatus.NOT_FOUND.value() == status){
                throw new DadosClienteNotFoundException();
            }
            throw new ErroComunicacaoMicroservicesException(e.getMessage(), status);
        }
    }
}
