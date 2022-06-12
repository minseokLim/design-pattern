package com.minseoklim.designpattern.adapter

class WebSearchRequestHandler(
    private val searchService: SearchService
) {
    fun search(keyword: String): SearchResult {
        return searchService.search(keyword)
    }
}
