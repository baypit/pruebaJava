package com.bps.ejercicio.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bps.ejercicio.models.Cliente;

@Repository
@Transactional
public class ClienteDaoImp implements ClienteDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Cliente> getClientes() {
        String query = "FROM Cliente";
        return entityManager.createQuery(query).getResultList();
    }
    
    @Override
    @Transactional
    public Cliente getClienteId(String id) {
 
        String query = "FROM Cliente where codigo = :id";
        List<Cliente> lista = entityManager.createQuery(query)
                .setParameter("id", id)
                .getResultList();
        if (lista.isEmpty()) {
            return null;
        }

        return lista.get(0);
        

    }

	

	@Override
	@Transactional
	public void registrar(Cliente cliente) throws Exception {
		try {
			entityManager.merge(cliente);
		} catch (Exception e) {
			System.out.println("Error registrando clientes: " + e.getMessage());
		}
		
	}

}
