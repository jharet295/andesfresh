package com.andesfresh.portal.repositorio;

import com.andesfresh.portal.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
