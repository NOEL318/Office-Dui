package com.officedui.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> allArticles(){
        return articleRepository.findAll();
    }

    public Optional<Article> singleArticle(String id){
        return articleRepository.findArticleById(id);
    }
}
