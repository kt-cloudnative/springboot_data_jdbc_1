package com.kt.edu.thirdproject.service;

import com.kt.edu.thirdproject.domain.Article;
import com.kt.edu.thirdproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Slf4j
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    /*public Article create(Article article) {
        log.info("Request to create Article : " +  article);
        //articleRepository.insert(article);
        return article;
    }*/

    public List<Article> retvByPage(int pageSize , int pageNo) {
        PageRequest pageRequest = PageRequest.of((pageNo -1),pageSize);
        log.info("Request to get all Articles");
        return articleRepository.retvByPage(pageRequest.getPageSize(),pageRequest.getOffset()+1 );
    }

    /*@Transactional(readOnly = true)
    public Article findById(Long id) {
        log.debug("Request to get Article : {}", id);
        return articleRepository.findById(id).get();
    }*/

}
