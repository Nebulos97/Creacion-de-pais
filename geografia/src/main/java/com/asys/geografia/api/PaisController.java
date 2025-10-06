package com.asys.geografia.api;

import com.asys.geografia.persistencia.entidades.PaisEntity;
import com.asys.geografia.servicios.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pais")
public class PaisController {

    private final PaisService paisService;

    @Autowired
    public PaisController(PaisService paisService) {
        this.paisService = paisService;
    }

    @GetMapping
    public List<PaisEntity> findAll() {
        return paisService.findAll();
    }

    @PostMapping
    public ResponseEntity<PaisEntity> create(@RequestBody PaisEntity pais) {
        return ResponseEntity.ok(paisService.save(pais));
    }
}
