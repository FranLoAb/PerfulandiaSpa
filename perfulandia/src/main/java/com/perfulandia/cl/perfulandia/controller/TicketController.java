package com.perfulandia.cl.perfulandia.controller;

import com.perfulandia.cl.perfulandia.model.TicketSoporte;
import com.perfulandia.cl.perfulandia.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/tickets")

public class TicketController {
    @Autowired
    private TicketService ticketService;

    @GetMapping
    public ResponseEntity<List<TicketSoporte>> listar(){
        List<TicketSoporte> tickets = ticketService.findAll();
        if (tickets.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(tickets);
    }
}

