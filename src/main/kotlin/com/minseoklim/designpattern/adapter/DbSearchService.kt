package com.minseoklim.designpattern.adapter

class DbSearchService : SearchService {
    override fun search(keyword: String): SearchResult {
        return SearchResult("제목", "내용")
    }
}
