package com.perfulandia.cl.perfulandia.service;

import com.perfulandia.cl.perfulandia.model.TicketSoporte;
import com.perfulandia.cl.perfulandia.repository.TicketRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional


public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<TicketSoporte> findAll(){
        return ticketRepository.findAll();
    }

    public TicketSoporte findById(Long id){
        return ticketRepository.findById(id).get();
    }

    public TicketSoporte save(TicketSoporte ticket){
        return ticketRepository.save(ticket);
    }
    public void delete(long id){
        ticketRepository.deleteById(id);
    }
}
