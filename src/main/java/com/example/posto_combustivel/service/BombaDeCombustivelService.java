package com.example.posto_combustivel.service;

import com.example.posto_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.example.posto_combustivel.infrastructure.repositories.BombaDeCombustivelRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BombaDeCombustivelService {

    private final BombaDeCombustivelRepository bombaDeCombustivelRepository;

    public void criar(BombasDeCombustivel bombasDeCombustivel){
        bombaDeCombustivelRepository.save(bombasDeCombustivel);
    }

    public BombasDeCombustivel buscarCombustivelPorId(Integer id){
        return bombaDeCombustivelRepository.findById(id).orElseThrow(()->
                new NullPointerException("Bomba de combustivel não encontrada pelo id" + id));
    }

    public List<BombasDeCombustivel> buscarBombasDeCombustivel(){
        return bombaDeCombustivelRepository.findAll();
    }

    @Transactional
    public void deletarBombaCombustivel(Integer id){
        bombaDeCombustivelRepository.deleteById(id);
    }

    public void alterarBombaCombustivel(Integer id, BombasDeCombustivel bombasDeCombustivel){
        BombasDeCombustivel bomba = buscarCombustivelPorId(id);
        bombasDeCombustivel.setId(bomba.getId());
        bombaDeCombustivelRepository.save(bombasDeCombustivel);
    }
}
