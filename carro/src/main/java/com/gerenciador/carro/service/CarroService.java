package com.gerenciador.carro.service;

import com.gerenciador.carro.entity.Carro;
import com.gerenciador.carro.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {
    @Autowired // Instância da classe
    private CarroRepository carroRepository;


    public String save(Carro carro) {
        this.carroRepository.save(carro);
        return "Carro salvo com sucesso!";
    }

    public String update(Carro carro, Long id) {
        carro.setId(id);
        this.carroRepository.save(carro);
        return "Carro foi atualizado com sucesso!";

    }

    public String delete(long id) {
        this.carroRepository.deleteById(id);
        return "Carro deletado com sucesso!";
    }

    public List<Carro> findAll() {
        List<Carro> lista = this.carroRepository.findAll();
        return lista;
    }

    public Carro findById(Long id) {

        Carro carro = this.carroRepository.findById(id).get();
        return carro;
    }

}