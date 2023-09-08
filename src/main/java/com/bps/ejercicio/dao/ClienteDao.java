package com.bps.ejercicio.dao;

import java.util.List;

import com.bps.ejercicio.models.Cliente;

public interface ClienteDao {

    List<Cliente> getClientes();
    
    Cliente getClienteId(String cliente);
    
    
    void registrar(Cliente cliente) throws Exception ;
    

}
