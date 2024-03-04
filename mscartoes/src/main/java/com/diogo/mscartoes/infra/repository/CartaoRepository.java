package com.diogo.mscartoes.infra.repository;

import com.diogo.mscartoes.domain.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaoRepository extends JpaRepository<Cartao, Long> {
}
