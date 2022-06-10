package com.minseoklim.designpattern.decorator

import org.slf4j.LoggerFactory

class TransactionArticleService(
    delegate: ArticleService
) : ArticleServiceDecorator(delegate) {
    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun writeArticle(article: String) {
        logger.info("transaction started")
        super.doDelegate(article)
        logger.info("transaction ended")
    }
}
