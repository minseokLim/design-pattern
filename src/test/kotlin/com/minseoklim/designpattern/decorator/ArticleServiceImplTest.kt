package com.minseoklim.designpattern.decorator

import org.junit.jupiter.api.Assertions.assertDoesNotThrow
import org.junit.jupiter.api.Test

internal class ArticleServiceImplTest {

    @Test
    fun writeArticle() {
        assertDoesNotThrow {
            val delegate = ArticleServiceImpl()
            MessageArticleService(TransactionArticleService(delegate)).writeArticle("게시판에 쓰는 글")

            val article = Article("아무렇게나 쓰는 글")
            article.writtenBy(TransactionArticleService(MessageArticleService(delegate)))
        }
    }
}
