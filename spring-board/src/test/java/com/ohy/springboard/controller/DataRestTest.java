package com.ohy.springboard.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Disabled("Spring Data Rest 통합테스트는 불필요하므로 제외")
@DisplayName("Data Rest - API 테스트")
@Transactional
@AutoConfigureMockMvc
@SpringBootTest
public class DataRestTest {

    private final MockMvc mvc;

    public DataRestTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }

    @DisplayName("게시글 리스트 조회")
    @Test
    void RequestArticles() throws Exception {
        //given

        //when & then
        mvc.perform((get("/api/articles")))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));
    }

    @DisplayName("게시글 단건 조회")
    @Test
    void RequestArticle() throws Exception {
        //given

        //when & then
        mvc.perform((get("/api/articles/1")))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));
    }

    @DisplayName("게시글 댓글 리스트 조회")
    @Test
    void RequestArticleArticleComments() throws Exception {
        //given

        //when & then
        mvc.perform((get("/api/articles/1/articleComments")))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));
    }

    @DisplayName("댓글 리스트 조회")
    @Test
    void RequestArticleComments() throws Exception {
        //given

        //when & then
        mvc.perform((get("/api/articleComments/1")))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));
    }

    @DisplayName("댓글 단건 조회")
    @Test
    void RequestArticleComment() throws Exception {
        //given

        //when & then
        mvc.perform((get("/api/articleComments")))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.valueOf("application/hal+json")));
    }

    @DisplayName("회원 관련 API는 일체 제공하지 않는다.")
    @Test
    void RequestUserAccountsThrowsException() throws Exception {
        //given

        //when & then
        mvc.perform(get("/api/userAccounts")).andExpect(status().isUnauthorized());
        mvc.perform(post("/api/userAccounts")).andExpect(status().isForbidden());
        mvc.perform(put("/api/userAccounts")).andExpect(status().isForbidden());
        mvc.perform(patch("/api/userAccounts")).andExpect(status().isForbidden());
        mvc.perform(delete("/api/userAccounts")).andExpect(status().isForbidden());
        mvc.perform(head("/api/userAccounts")).andExpect(status().isUnauthorized());
    }
}