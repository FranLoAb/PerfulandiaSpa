package com.perfulandia.cl.perfulandia_spa.controller;

import com.perfulandia.cl.perfulandia_spa.model.Perfume;
import com.perfulandia.cl.perfulandia_spa.services.PerfumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/perfumes")

public class InventarioController {

    @Autowired
    private PerfumeService perfumeService;

    @GetMapping
    public List<Perfume> listaPerfumes(){
        return perfumeService.getPerfumes();
    }

    @PostMapping
    public Perfume agregarPerfume (@RequestBody Perfume perfume){
        return perfumeService.savePerfume(perfume);
    }

    @GetMapping("{id}")
    public Perfume buscarPerfume (@PathVariable int id){
        return perfumeService.getPerfumeId(id);
    }

    @PutMapping("{id}")
    public Perfume actualizarPerfume(@PathVariable int id, @RequestBody Perfume perfume){
        return perfumeService.updatePerfume(perfume);
    }
    
    @DeleteMapping("{id}")
    public  String eliminarPerfume(@PathVariable int id){
        return perfumeService.deletePerfume(id);
    }

    @GetMapping("/total")
    public int totalPerfumesv2(){
        return perfumeService.totalPerfumesv2();
    }

}
