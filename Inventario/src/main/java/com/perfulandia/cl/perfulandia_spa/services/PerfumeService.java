package com.perfulandia.cl.perfulandia_spa.services;

import com.perfulandia.cl.perfulandia_spa.model.Perfume;
import com.perfulandia.cl.perfulandia_spa.Repository.PerfumeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Transactional

public class PerfumeService {
    @Autowired
    private PerfumeRepository perfumeRepository;

    public List<Perfume> findAll(){
        return perfumeRepository.findAll();
    }

    public Perfume findById(Integer id){
        return perfumeRepository.findById(id).get();
    }

    public Perfume save(Perfume perfume){
        return perfumeRepository.save(perfume);
    }

    public void delete(Integer id){
        perfumeRepository.deleteById(id);
    }

}

