package com.perfulandia.cl.perfulandia.controller;

import com.perfulandia.cl.perfulandia.model.TicketSoporte;
import com.perfulandia.cl.perfulandia.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<TicketSoporte> guardar(@RequestBody TicketSoporte ticket) {
        if (ticket.getNumeroTicket() == null) {
            return ResponseEntity.badRequest().build();
        }
        TicketSoporte ticketNuevo = ticketService.save(ticket);
        return ResponseEntity.status(HttpStatus.CREATED).body(ticketNuevo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TicketSoporte> buscarPorId(@PathVariable Long id){
        try{
            TicketSoporte ticket = ticketService.findById(id);
            return ResponseEntity.ok(ticket);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id){
        try{
            ticketService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

}