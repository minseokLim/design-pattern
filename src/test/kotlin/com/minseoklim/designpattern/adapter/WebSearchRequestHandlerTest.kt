package com.minseoklim.designpattern.adapter

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebSearchRequestHandlerTest {

    @Test
    fun search() {
        val dbSearchService = DbSearchService()
        val dbSearchHandler = WebSearchRequestHandler(dbSearchService)
        val dbSearchResult = dbSearchHandler.search("keyword")

        val tolrAdapter = SearchServiceTolrAdapter(TolrClient())
        val tolrSearchHandler = WebSearchRequestHandler(tolrAdapter)
        val tolrSearchResult = tolrSearchHandler.search("keyword")
        assertThat(dbSearchResult).isEqualTo(tolrSearchResult)
    }
}
