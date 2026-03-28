package com.example.posto_combustivel.infrastructure.repositories;

import com.example.posto_combustivel.infrastructure.entities.Abastecimento;
import com.example.posto_combustivel.infrastructure.entities.TiposDeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbastecimentoRepository extends JpaRepository<Abastecimento, Integer> {
}
