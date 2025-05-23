package com.perfulandia.cl.perfulandia_spa.Repository;

import com.perfulandia.cl.perfulandia_spa.model.Perfume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository

public interface PerfumeRepository extends JpaRepository<Perfume, Integer> {
}

