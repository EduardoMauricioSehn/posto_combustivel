package com.example.posto_combustivel.infrastructure.repositories;

import com.example.posto_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.example.posto_combustivel.infrastructure.entities.TiposDeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BombaDeCombustivelRepository extends JpaRepository<BombasDeCombustivel, Integer> {
}
