package com.minseoklim.designpattern.adapter

class SearchServiceTolrAdapter(
    private val tolrClient: TolrClient
) : SearchService {
    override fun search(keyword: String): SearchResult {
        val tolrQueryResponse = tolrClient.query(keyword)
        return tolrQueryResponse.toSearchResult()
    }
}
