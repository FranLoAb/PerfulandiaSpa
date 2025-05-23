package com.perfulandia.cl.perfulandia_spa.Controller;

import com.perfulandia.cl.perfulandia_spa.model.Perfume;
import com.perfulandia.cl.perfulandia_spa.services.PerfumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/perfumes")

public class InventarioController {

    @Autowired
    private PerfumeService perfumeService;

    @GetMapping
        public ResponseEntity<List<Perfume>> listar(){
        List<Perfume> perfumes = perfumeService.findAll();
        if (perfumes.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(perfumes);
    }
    @PostMapping
    public ResponseEntity<Perfume> guardar(@RequestBody Perfume perfume) {
        if (perfume.getNombre() == null) {
            return ResponseEntity.badRequest().build();
        }
        Perfume perfumeNuevo = perfumeService.save(perfume);
        return ResponseEntity.status(HttpStatus.CREATED).body(perfumeNuevo);
    }
    @GetMapping ("/{id}")
    public ResponseEntity<Perfume> buscarPorId(@PathVariable Integer id){
        try{
            Perfume perfume = perfumeService.findById(id);
            return ResponseEntity.ok(perfume);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Integer id){
        try{
            perfumeService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }


}

