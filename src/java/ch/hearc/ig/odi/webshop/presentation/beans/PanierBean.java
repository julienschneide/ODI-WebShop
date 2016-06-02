/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.webshop.presentation.beans;

import ch.hearc.ig.odi.webshop.business.Article;
import ch.hearc.ig.odi.webshop.business.Panier;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Julien Schneider <julien.schneider@he-arc.ch>
 */
@SessionScoped
@Named("panierBean")
public class PanierBean implements Serializable{
    
    private Panier monPanier = new Panier();
    
    public void PanierBean(){
        
    }
    
    public Panier getPanier(){
        return monPanier;
    }
        
    public String ajoutArticle(Article a, int q){
        monPanier.getArticles().put(a, q);
        return "monPanier";
    }
    
}
