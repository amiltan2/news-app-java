package com.portable.newsapp.dto.wrapper;

import com.portable.newsapp.dto.ArticleResponse;

public class ResponseWrapper {

	  private ArticleResponse response;
	
	  public ResponseWrapper() {
	  }
	  
	  public ResponseWrapper(final ArticleResponse response) {
		  this.response = response;
	  }
	  
	  public ArticleResponse getResponse() {
		  return response;
	  }

	  public void setResponse(final ArticleResponse response) {
		  this.response = response;
	  }
	
	  
	
	  
}