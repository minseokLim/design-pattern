package com.minseoklim.designpattern.decorator

import org.slf4j.LoggerFactory

class MessageArticleService(
    delegate: ArticleService
) : ArticleServiceDecorator(delegate) {
    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun writeArticle(article: String) {
        super.doDelegate(article)
        logger.info("[$article] is sent by MessageArticleService")
    }
}
