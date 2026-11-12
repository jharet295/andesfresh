package com.andesfresh.portal.controlador;

import com.andesfresh.portal.modelo.Producto;
import com.andesfresh.portal.servicio.ProductoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoService service;

    public ProductoController(ProductoService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("productos", service.listar());
        return "productos/lista";
    }

    @GetMapping("/{id}")
    public String detalle(@PathVariable Long id, Model model) {
        model.addAttribute("producto", service.buscar(id));
        return "productos/detalle";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("producto", new Producto());
        return "productos/formulario";
    }

    @PostMapping
    public String guardar(@ModelAttribute Producto producto) {
        service.guardar(producto);
        return "redirect:/productos";
    }

    @PostMapping("/{id}/eliminar")
    public String eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return "redirect:/productos";
    }
}
