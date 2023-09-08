package com.bps.ejercicio.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bps.ejercicio.dao.ClienteDao;
import com.bps.ejercicio.dao.CuentaDao;
import com.bps.ejercicio.models.Cuenta;

@RestController
@RequestMapping(value = "/cuenta")
@CrossOrigin(origins = "http://localhost:4200/") 
public class CuentaController {

    @Autowired
    private CuentaDao cuentaDao;
    
    @Autowired
    private ClienteDao clienteDao;
    
    
    @GetMapping
    public List<Cuenta> getClientes() {    	
    	return cuentaDao.getCuentas();
    }
        
    
    @RequestMapping(value = "/listarMovimientos", method = RequestMethod.GET)
    public List<Cuenta> getMovimientos(@RequestParam int cliente) {
    	return cuentaDao.getMovimientos(cliente);
    }
   
    
}
