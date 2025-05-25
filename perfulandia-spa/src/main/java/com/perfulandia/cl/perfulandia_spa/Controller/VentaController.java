package com.perfulandia.cl.perfulandia_spa.Controller;

import com.perfulandia.cl.perfulandia_spa.Models.Venta;
import com.perfulandia.cl.perfulandia_spa.Service.VentaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    private final VentaService ventaService;

    public VentaController(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    @PostMapping
    public Venta crear(@RequestBody Venta venta) {
        return ventaService.registrarVenta(venta);
    }

    @GetMapping
    public List<Venta> listar() {
        return ventaService.obtenerVentas();
    }

    @GetMapping("/{id}")
    public Venta buscar(@PathVariable Long id) {
        return ventaService.obtenerPorId(id);
    }
}
