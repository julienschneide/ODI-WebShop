/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.webshop.service;

import ch.hearc.ig.odi.webshop.business.Article;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Julien Schneider <julien.schneider@he-arc.ch>
 */
@SessionScoped
@Stateful
public class Services implements Serializable{
    
    private Map<Integer, Article> articles;
    
    public Services(){
        articles = new LinkedHashMap();
        
        articles.put(1, new Article(1, "Tournevis", (float) 5.5));
        articles.put(2, new Article(2, "Vis", (float) 2));
        articles.put(3, new Article(3, "Marteau", (float) 15));
    }
    
    public Map<Integer, Article> getArticles(){
        return articles;
    }
    
    public List<Article> getArticlesList(){
        return new ArrayList(articles.values());
    }       
}
