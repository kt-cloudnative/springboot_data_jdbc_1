package com.kt.edu.thirdproject.repository.sql;

public class QueryArticleContSqls {

    public static final String RETV_ARTICLES_PAGE="""
           SELECT  id, title,  content 
           FROM 
             article 
           WHERE id between :offset and (:offset + :pageSize -1 )
                  """;

    public static final String RETV_ARTICLE_PAGE="""
     SELECT * FROM article 
           """;
}
