package com.perfulandia.cl.perfulandia_spa.services;

import com.perfulandia.cl.perfulandia_spa.model.Perfume;
import com.perfulandia.cl.perfulandia_spa.repository.PerfumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class PerfumeService {
    @Autowired
    private PerfumeRepository perfumeRepository;
    
    public List<Perfume> getPerfumes(){
        return perfumeRepository.obtienePerfumes();
    }

    public Perfume savePerfume(Perfume perfume){
        return perfumeRepository.guardar(perfume);
    }

    public Perfume  getPerfumeId(int id){
        return perfumeRepository.buscarPorId(id);
    }

    public Perfume updatePerfume (Perfume perfume){
        return perfumeRepository.actualizar(perfume);
    }

    public String deleteLibro (int id){
        perfumeRepository.eliminar(id);
        return "Perfume Eliminado";
    }

    public int totalPerfumesv1(){
        return perfumeRepository.obtienePerfumes().size();
    }

    public int totalPerfumesv2(){
        return perfumeRepository.totalPerfumes();
    }



}
