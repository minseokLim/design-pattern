package com.minseoklim.designpattern.decorator

abstract class ArticleServiceDecorator(
    private val delegate: ArticleService
) : ArticleService {
    protected fun doDelegate(article: String) {
        delegate.writeArticle(article)
    }
}
