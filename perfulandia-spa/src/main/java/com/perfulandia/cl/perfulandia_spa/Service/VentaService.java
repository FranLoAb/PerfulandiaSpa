package com.perfulandia.cl.perfulandia_spa.Service;

import com.perfulandia.cl.perfulandia_spa.Models.Venta;
import com.perfulandia.cl.perfulandia_spa.Repository.VentaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService {

    private final VentaRepository ventaRepository;

    public VentaService(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    public Venta registrarVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    public List<Venta> obtenerVentas() {
        return ventaRepository.findAll();
    }

    public Venta obtenerPorId(Long id) {
        return ventaRepository.findById(id).orElse(null);
    }
}
