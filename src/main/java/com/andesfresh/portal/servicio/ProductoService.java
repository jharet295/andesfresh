package com.andesfresh.portal.servicio;

import com.andesfresh.portal.excepcion.ProductoNoEncontradoException;
import com.andesfresh.portal.modelo.Producto;
import com.andesfresh.portal.repositorio.ProductoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository repo;

    public ProductoService(ProductoRepository repo) {
        this.repo = repo;
    }

    public List<Producto> listar() { return repo.findAll(); }

    public Producto buscar(Long id) {
        return repo.findById(id).orElseThrow(() -> new ProductoNoEncontradoException(id));
    }

    public Producto guardar(Producto p) { return repo.save(p); }

    public void eliminar(Long id) { repo.deleteById(id); }
}
