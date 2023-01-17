package com.ohy.springboard.dto.request;

import com.ohy.springboard.dto.ArticleCommentDto;
import com.ohy.springboard.dto.UserAccountDto;

import java.io.Serializable;

public record ArticleCommentRequest(Long articleId, String content) {

    public static ArticleCommentRequest of(Long articleId, String content) {
        return new ArticleCommentRequest(articleId, content);
    }

    public ArticleCommentDto toDto(UserAccountDto userAccountDto) {
        return ArticleCommentDto.of(
                articleId,
                userAccountDto,
                content
        );
    }

}
