package com.breiner.api.domain.service;

import com.breiner.api.domain.dto.DetallesCompra;
import com.breiner.api.domain.repository.IDetallesCompraRepository;

import java.util.List;
import java.util.Optional;

public class DetallesCompraService {

    private IDetallesCompraRepository detallesCompraRepository;

    public DetallesCompraService(IDetallesCompraRepository detallesCompraRepository) {
        this.detallesCompraRepository = detallesCompraRepository;
    }

    List<DetallesCompra> getAll(){
        return detallesCompraRepository.getAll();
    }

    Optional<DetallesCompra> get(Integer idDetallesCompra){
        return detallesCompraRepository.get(idDetallesCompra);
    }

    DetallesCompra save(DetallesCompra detallesCompra){
        return detallesCompraRepository.save(detallesCompra);
    }

    public void delete(Integer idDetallesCompra){
        detallesCompraRepository.delete(idDetallesCompra);
    }

    public void update(DetallesCompra detallesCompra){
        detallesCompraRepository.update(detallesCompra);
    }
}
