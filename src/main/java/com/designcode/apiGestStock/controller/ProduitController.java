package com.designcode.apiGestStock.controller;

import com.designcode.apiGestStock.model.Produit;
import com.designcode.apiGestStock.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produit")
@CrossOrigin
public class ProduitController {
    @Autowired
    private ProduitService produitService;

    @GetMapping
    public List<Produit> getProduits(){
        return produitService.getProduits();
    }

    @PostMapping
    public Produit addProduit(@RequestBody Produit produit){
        return produitService.addProduit(produit);
    }

    @PutMapping("/{ref}")
    public void updateProduit(@PathVariable String ref, @RequestBody Produit produit){
        produitService.updateProduit(ref, produit);
    }

    @DeleteMapping("/{ref}")
    public void deleteProduit(@PathVariable String ref){
        produitService.deleteProduit(ref);
    }
}
