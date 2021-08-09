package com.zss.commande.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zss.commande.entity.Commande;

@Repository
public interface CommandeDao extends JpaRepository<Commande, Long>{
	Commande findByRef(String ref);
}
