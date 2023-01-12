package com.ohy.springboard.service;

import com.ohy.springboard.domain.Article;
import com.ohy.springboard.domain.type.SearchType;
import com.ohy.springboard.dto.ArticleDto;
import com.ohy.springboard.dto.ArticleUpdateDto;
import com.ohy.springboard.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.*;

@DisplayName("비즈니스 로직 - 게시글")
@ExtendWith(MockitoExtension.class)
class ArticleServiceTest {

    @InjectMocks private  ArticleService sut;
    @Mock private  ArticleRepository articleRepository;

    @DisplayName("게시글 검색 - 리스트 반환")
    @Test
    void searchArticlesList() {
        //given

        //when
        Page<ArticleDto> articles = sut.searchArticles(SearchType.TITLE, "search keyword"); // 제목, 본문, ID, 닉네임, 해시태그

        //then
        assertThat(articles).isNotNull();
    }

    @DisplayName("게시글 조회하면 게시글을 반환")
    @Test
    void articleDetail() {
        //given

        //when
        ArticleDto article = sut.searchArticle(1L);

        //then
        assertThat(article).isNotNull();
    }

    @DisplayName("게시글 정보를 입력하면 게시글을 생성")
    @Test
    void createAndSaveArticleTest() {
        //given
        ArticleDto dto = ArticleDto.of(LocalDateTime.now(), "create", "title", "content", "#hashtag");
        given(articleRepository.save(ArgumentMatchers.any(Article.class))).willReturn(null);

        //when
        sut.saveArticle(dto);

        //then
        then(articleRepository).should().save(any(Article.class));
    }

    @DisplayName("게시글의 ID와 수정 정보를 입력하면, 게시글을 수정한다.")
    @Test
    void updateAndSaveArticleTest() {
        //given
        ArticleUpdateDto dto = ArticleUpdateDto.of("title", "content", "#hashtag");
        given(articleRepository.save(ArgumentMatchers.any(Article.class))).willReturn(null);

        //when
        sut.updateArticle(1L, dto);

        //then
        then(articleRepository).should().save(any(Article.class));
    }

    @DisplayName("게시글의 ID를 입력하면, 게시글을 삭제한다.")
    @Test
    void deleteArticleTest() {
        //given
        willDoNothing().given(articleRepository).delete(ArgumentMatchers.any(Article.class));

        //when
        sut.deleteArticle(1L);

        //then
        then(articleRepository).should().delete(any(Article.class));
    }
}