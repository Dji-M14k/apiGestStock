package com.designcode.apiGestStock.model;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long ref;
    String nom;
    int prix;
    int quantite;

    public Produit() {
    }

    public Produit(String nom, int prix, int quantite) {
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    public Long getRef() {
        return ref;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produit produit)) return false;
        return Objects.equals(getRef(), produit.getRef());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRef());
    }
}
