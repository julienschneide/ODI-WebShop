/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.webshop.presentation.beans;

import ch.hearc.ig.odi.webshop.business.Article;
import ch.hearc.ig.odi.webshop.service.Services;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Julien Schneider <julien.schneider@he-arc.ch>
 */
@Named("articleBean")
@SessionScoped
public class ArticleBean implements Serializable{
    
    @Inject 
    Services services;
    
    public ArticleBean(){
        
    }
    
    public List<Article> getArticles(){
        return services.getArticlesList();
    }
}
