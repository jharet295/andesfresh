package com.andesfresh.portal.config;
import com.andesfresh.portal.modelo.Producto;
import com.andesfresh.portal.repositorio.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.util.List;
@Component
public class ProductoDataLoader implements CommandLineRunner {
private final ProductoRepository repo;
public ProductoDataLoader(ProductoRepository repo) {
this.repo = repo;
}
@Override
public void run(String... args) {
repo.saveAll(List.of(
new Producto("Palta Hass", new BigDecimal("8.50")),
new Producto("Mango Kent", new BigDecimal("6.20")),
new Producto("Papa Amarilla", new BigDecimal("3.80")),
new Producto("Tomate Italiano", new BigDecimal("4.10")),
new Producto("Limón Sutil", new BigDecimal("5.30"))));
}
}
