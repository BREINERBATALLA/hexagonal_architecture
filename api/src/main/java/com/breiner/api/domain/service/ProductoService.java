package com.breiner.api.domain.service;


import com.breiner.api.domain.dto.Producto;
import com.breiner.api.domain.repository.IProductoRepository;

import java.util.List;
import java.util.Optional;

public class ProductoService {
        private IProductoRepository productoRepository;

        public ProductoService(IProductoRepository productoRepository) {
            this.productoRepository = productoRepository;
        }

        List<Producto> getAll(){
            return productoRepository.getAll();
        }

        Optional<Producto> get(Integer idProducto){
            return productoRepository.get(idProducto);
        }

        Producto save(Producto producto){
            return productoRepository.save(producto);
        }

        public void delete(Integer id){
            productoRepository.delete(id);
        }

        public void update(Producto producto){
            productoRepository.update(producto);
        }
}
