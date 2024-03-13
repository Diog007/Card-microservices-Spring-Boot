package com.diogo.mscartoes.application.represestation;

import com.diogo.mscartoes.domain.ClienteCartao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartoesPorClienteResponse {
    private String nome;
    private String bandeira;
    private BigDecimal limiteLiberado;

    public static CartoesPorClienteResponse fromModel(ClienteCartao cartao){
        return new CartoesPorClienteResponse(cartao.getCartao().getNome(),
                cartao.getCartao().getBandeira().toString(),
                cartao.getLimite());
    }
}
