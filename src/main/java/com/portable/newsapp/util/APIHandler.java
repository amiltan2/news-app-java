package com.portable.newsapp.util;

import java.util.Map;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class APIHandler {


	private final RestTemplate restTemplate;
	
	public APIHandler(RestTemplateBuilder restTemplateBuilder) {
	       
		this.restTemplate = restTemplateBuilder.build();
	}

	/**
	 * Defining a utility method to perform API calls
	 * @param <T>
	 * @param <R>
	 * @param apiEndpoint
	 * @param httpMethod
	 * @param httpHeaders
	 * @param requestBody
	 * @param classToConvertBodyTo
	 * @param params
	 * @return
	 */
	public <T, R> ResponseEntity<R> callAPI(String apiEndpoint, HttpMethod httpMethod,
	            HttpHeaders httpHeaders, T requestBody, Class<R> classToConvertBodyTo,
	            Map<String, ?> params) {
	        
		HttpHeaders headers = new HttpHeaders();
		headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
		HttpEntity<T> requestEntity = new HttpEntity<>(headers);
		
	    try {
	    	return restTemplate.exchange(
				apiEndpoint,
				httpMethod,
				requestEntity,
				classToConvertBodyTo,
				params
	         );
	    	
	    } catch (RestClientException e) {
	    	
	    	log.error("Unable to process HTTP request: {}", e.getMessage());
            throw e;
        }
	    
	}
}
