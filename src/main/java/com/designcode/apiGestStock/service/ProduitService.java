package com.designcode.apiGestStock.service;

import com.designcode.apiGestStock.model.Produit;
import com.designcode.apiGestStock.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {
    @Autowired
    private ProduitRepository produitRepository;

    private List<Produit> produits;

    public List<Produit> getProduits(){
        return produitRepository.findAll();
    }

    public Produit addProduit(Produit produit){
        return produitRepository.save(produit);
    }

    public void updateProduit(String id, Produit produit){
        this.produitRepository.findById(id);
        this.produitRepository.save(produit);
    };

    public void deleteProduit(String id){
        produitRepository.deleteById(id);
    };




}
