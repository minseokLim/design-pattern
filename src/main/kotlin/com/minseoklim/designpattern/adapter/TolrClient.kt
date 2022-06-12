package com.minseoklim.designpattern.adapter

class TolrClient {
    fun query(query: String): TolrQueryResponse {
        return TolrQueryResponse("제목", "내용")
    }
}
