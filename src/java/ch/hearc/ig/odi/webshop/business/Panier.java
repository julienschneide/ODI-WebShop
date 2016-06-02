/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.webshop.business;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Julien Schneider <julien.schneider@he-arc.ch>
 */
public class Panier {
    private Long id;
    private Map<Article, Integer> articles;
    
    public Panier(){
        this.articles = new HashMap<>();
    }

    public Panier(Map<Article, Integer> articles) {
        this.articles = articles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<Article, Integer> getArticles() {
        return articles;
    }

    public void setArticles(Map<Article, Integer> articles) {
        this.articles = articles;
    }
    
    
    
    
    
}
