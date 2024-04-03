package com.portable.newsapp.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import com.portable.newsapp.dto.ArticleResponse;
import com.portable.newsapp.dto.wrapper.ResponseWrapper;
import com.portable.newsapp.util.APIHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class TheGuardianAPI {
	
	@Autowired 
	private APIHandler apiHandler;
	
	public TheGuardianAPI(APIHandler apiHandler) {
		this.apiHandler = apiHandler;
	}
	
 	private final static String TARGET_URL = "https://content.guardianapis.com/search";
 	private final static String apiKey="a350effb-aa60-4b4b-9c6b-8f98d907add5";
 	private final static String QUERY_STRING = "q";
 	private final static String API_KEY_STRING= "api-key";
 	private final static String QUERY_PARAM = "query";
 	
 	public ArticleResponse getContent(String query) {
 		
		String url = UriComponentsBuilder.fromHttpUrl(TARGET_URL)
				.queryParam(QUERY_STRING, "{query}")
 				.queryParam(API_KEY_STRING, apiKey)
 				.encode()
 		        .toUriString();
 		
		Map<String, String> params = new HashMap<>();
		params.put(QUERY_PARAM, query);
		
		log.info("Processing request: {}", url);
 		ResponseEntity<ResponseWrapper> response = apiHandler.callAPI(
 				url,
 				HttpMethod.GET,
 				null,
 				null,
 				ResponseWrapper.class,
 				params);
 		
 		return response.getBody().getResponse();
 		
 	}
}
