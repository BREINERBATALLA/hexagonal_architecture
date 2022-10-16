package com.breiner.api.domain.service;

import com.breiner.api.domain.dto.Compra;
import com.breiner.api.domain.repository.ICompraRepository;

import java.util.List;
import java.util.Optional;

public class CompraService {
    private ICompraRepository compraRepository;

    public CompraService(ICompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }

    List<Compra> getAll(){
        return compraRepository.getAll();
    }

    Optional<Compra> get(Integer idCompra){
        return compraRepository.get(idCompra);
    }

    Compra save(Compra compra){
        return compraRepository.save(compra);
    }

    public void delete(Integer idCompra){
        compraRepository.delete(idCompra);
    }

    public void update(Compra compra){
        compraRepository.update(compra);
    }
}
