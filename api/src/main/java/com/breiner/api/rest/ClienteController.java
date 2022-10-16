package com.breiner.api.rest;

import com.breiner.api.domain.dto.Cliente;
import com.breiner.api.domain.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes/")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping()
    public ResponseEntity<List<Cliente>> getAll(){
        return new ResponseEntity<>(clienteService.getAll(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Cliente> save(@RequestBody Cliente cliente){
        return new ResponseEntity<>(clienteService.save(cliente),HttpStatus.CREATED);
    }

}
