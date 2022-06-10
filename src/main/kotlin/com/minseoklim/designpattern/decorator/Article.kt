package com.minseoklim.designpattern.decorator

class Article(
    private val content: String
) {
    fun writtenBy(articleService: ArticleService) {
        articleService.writeArticle(content)
    }
}
