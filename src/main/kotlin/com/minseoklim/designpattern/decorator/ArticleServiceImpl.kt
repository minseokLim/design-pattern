package com.minseoklim.designpattern.decorator

import org.slf4j.LoggerFactory

class ArticleServiceImpl : ArticleService {
    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun writeArticle(article: String) {
        logger.info("[$article] is written")
    }
}
