package com.designcode.apiGestStock.repository;

import com.designcode.apiGestStock.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProduitRepository extends JpaRepository<Produit, String> {

}
