package com.andesfresh.portal.excepcion;

public class ProductoNoEncontradoException extends RuntimeException {
    public ProductoNoEncontradoException(Long id) {
        super("No existe el producto con código " + id);
    }
}
