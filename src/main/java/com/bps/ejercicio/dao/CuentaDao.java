package com.bps.ejercicio.dao;

import java.util.List;

import com.bps.ejercicio.models.Cliente;
import com.bps.ejercicio.models.Cuenta;

public interface CuentaDao {

    List<Cuenta> getCuentas();
    
    List<Cuenta> getMovimientos(Integer clienteId); 
    
    Cuenta getCuentaNumero(Integer numero);
    
    
    Cuenta registrar(Cuenta cuenta) throws Exception ;
    

}
