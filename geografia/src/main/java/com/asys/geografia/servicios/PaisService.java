package com.asys.geografia.servicios;

import com.asys.geografia.persistencia.entidades.PaisEntity;
import com.asys.geografia.persistencia.repositorios.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService {

    private final PaisRepository paisRepository;

    @Autowired
    public PaisService(PaisRepository paisRepository) {
        this.paisRepository = paisRepository;
    }

    public PaisEntity save(PaisEntity pais) {
        return paisRepository.save(pais);
    }

    public List<PaisEntity> findAll() {
        return paisRepository.findAll();
    }

}
