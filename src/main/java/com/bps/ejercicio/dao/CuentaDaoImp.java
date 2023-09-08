package com.bps.ejercicio.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bps.ejercicio.models.Cuenta;

@Repository
@Transactional
public class CuentaDaoImp implements CuentaDao {

    @PersistenceContext
    EntityManager entityManager;

    @SuppressWarnings("unchecked")
	@Override
    @Transactional
    public List<Cuenta> getCuentas() {
        String query = "FROM Cuenta where ";
        return entityManager.createQuery(query).getResultList();
    }
    
    @SuppressWarnings("unchecked")
	@Override
    @Transactional
    public Cuenta getCuentaNumero(Integer numero) {
 
        String query = "FROM Cuenta where numero = :numero";
        List<Cuenta> lista = entityManager.createQuery(query)
                .setParameter("numero", numero)
                .getResultList();
        if (lista.isEmpty()) {
            return null;
        }
        return lista.get(0);
        
    }

	

	@Override
	@Transactional
	public Cuenta registrar(Cuenta cuenta) throws Exception {
		try {
			return entityManager.merge(cuenta);
		} catch (Exception e) {
			System.out.println("Error registrando clientes: " + e.getMessage());
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cuenta> getMovimientos(Integer clienteId) {
		// TODO Auto-generated method stub
		 String query = "FROM Cuenta where clienteid = :clienteId";
	        List<Cuenta> lista = entityManager.createQuery(query)
	                .setParameter("clienteId", clienteId)
	                .getResultList();
	        if (lista.isEmpty()) {
	            return null;
	        }
	        return lista;
	}
    
}
