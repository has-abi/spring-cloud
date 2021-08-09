package com.zss.commande.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zss.commande.entity.CommandeItem;

@Repository
public interface CommandeItemDao extends JpaRepository<CommandeItem, Long>{
	List<CommandeItem> findByCommandeRef(String ref);
}
