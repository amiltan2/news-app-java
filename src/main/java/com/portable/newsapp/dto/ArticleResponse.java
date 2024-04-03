package com.portable.newsapp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ArticleResponse {
	
	private String status;
	private String userTier;
	private int total;
	private int startIndex;
	private int pageSize;
	private int currentPage;
	private int pages;
	private String orderBy;
	private Article[] results;

	public ArticleResponse(final String status, final String userTier, final int total, final int startIndex, final int pageSize, final int currentPage, final int pages, final String orderBy, final Article[] results) {
	    this.status = status;
	    this.userTier = userTier;
	    this.total = total;
	    this.startIndex = startIndex;
	    this.pageSize = pageSize;
	    this.currentPage = currentPage;
	    this.pages = pages;
	    this.orderBy = orderBy;
	    this.results = results;
	    
	}
}
