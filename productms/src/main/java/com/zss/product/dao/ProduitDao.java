package com.zss.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zss.product.entity.Produit;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Long>{

}
