package com.kt.edu.thirdproject.repository;

import com.kt.edu.thirdproject.domain.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ArticleMapper {

    public long getId();
    public long insert(Article article);
    public long update(Article article);
    public Optional<Article> findById(Long id);

    //@Select("SELECT * FROM article")
    public List<Article> findAll();

}
