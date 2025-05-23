package com.perfulandia.cl.perfulandia.repository;


import com.perfulandia.cl.perfulandia.model.TicketSoporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<TicketSoporte, Long>{
    List<TicketSoporte> findByRun(String run);

    TicketSoporte findByNumeroTicket(String numeroTicket);

    List<TicketSoporte> findByRunAndNumeroTicket(String run, String numeroTicket);
}
