package com.ohy.springboard.repository;

import com.ohy.springboard.domain.Article;
import com.ohy.springboard.domain.QArticle;
import com.querydsl.core.types.dsl.DateTimeExpression;
import com.querydsl.core.types.dsl.StringExpression;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ArticleRepository extends
        JpaRepository<Article, Long>,
        QuerydslPredicateExecutor<Article>,   // Article 모든 필드에 대한 기본 검색기능 추가
        QuerydslBinderCustomizer<QArticle> {

    Page<Article> findByTitleContaining(String title, Pageable pageable);
    Page<Article> findByContentContaining(String content, Pageable pageable);
    Page<Article> findByUserAccount_UserIdContaining(String userId, Pageable pageable);
    Page<Article> findByUserAccount_NicknameContaining(String nickname, Pageable pageable);
    Page<Article> findByHashtag(String hashtag, Pageable pageable);
    @Override //검색 세부구현
    default void customize(QuerydslBindings bindings, QArticle root) {

        bindings.excludeUnlistedProperties(true); // 모든 필드 검색 허용하지 않을 때. 기본값 false
        bindings.including(root.title, root.content, root.hashtag, root.createdAt, root.createdBy);
        //bindings.bind(root.title).first(StringExpression::likeIgnoreCase); // like '${v}'
        bindings.bind(root.title).first(StringExpression::containsIgnoreCase);  // like '%${v}%'
        bindings.bind(root.content).first(StringExpression::containsIgnoreCase);
        bindings.bind(root.hashtag).first(StringExpression::containsIgnoreCase);
        bindings.bind(root.createdBy).first(StringExpression::containsIgnoreCase);
        bindings.bind(root.createdAt).first(DateTimeExpression::eq);
    }

}