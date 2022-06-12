package com.minseoklim.designpattern.adapter

data class TolrQueryResponse(
    val subject: String,
    val content: String
) {
    fun toSearchResult(): SearchResult {
        return SearchResult(subject, content)
    }
}
