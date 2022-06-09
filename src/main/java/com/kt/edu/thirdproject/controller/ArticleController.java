package com.kt.edu.thirdproject.controller;

import com.kt.edu.thirdproject.domain.Article;
import com.kt.edu.thirdproject.service.ArticleService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "posts", description = "게시물 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleService articleService;

    @Cacheable(cacheNames = "articles")
    @PostMapping
    @Operation(summary ="게시물 전체 조회",description="제목과 내용 전체를 조회 합니다.")
    public List<Article> findAll(@RequestBody Article article) {
        return this.articleService.retvByPage(article.getPageSize(),article.getPageNo());
    }

    /*@Operation(summary ="게시물 단건 조회",description="특정 게시물 단건에 대해서 제목과 내용을 조회 합니다.")
    @GetMapping("/{id}")
    public Article findById(@PathVariable Long id) {
        return articleService.findById(id);
    }*/

/*
    @PostMapping
    @Operation(summary ="게시물 등록",description="게시물을 등록합니다.")
    public Article create(@RequestBody Article article) {
        return this.articleService.create(article);
    }
*/
}