package com.gerenciador.carro.repository;

import com.gerenciador.carro.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}