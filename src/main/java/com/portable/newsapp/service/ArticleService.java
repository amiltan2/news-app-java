package com.portable.newsapp.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portable.newsapp.api.TheGuardianAPI;
import com.portable.newsapp.dto.Article;
import com.portable.newsapp.dto.ArticleResponse;
import com.portable.newsapp.dto.ItemDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ArticleService {
	
	@Autowired
	private TheGuardianAPI theGuardianAPI;
		
	/**
	 * Request content containing free texts, supports AND, OR and NOT operators,
	 * and exact phrase queries using double quotes.
	 * e.g., technology, "artificial intelligence", generative and AI, generative or AI
	 * 
	 * @param query
	 * @return  List<Item>
	 * @throws ParseException 
	 */
	public List<ItemDto> getAllArticles(String query) {
		
		List<ItemDto> items = new ArrayList<>();
		
		ArticleResponse response =  theGuardianAPI.getContent(query);
		log.debug("Guardian API response: {}", response);
		
		if(Objects.nonNull(response)) {
			for(Article article : response.getResults()) {
				
				ItemDto item = new ItemDto();
				
				//Use publicationDate as unique Id
				String id = article.getWebPublicationDate();
				id = id.replaceAll("[^0-9]", "");  
				
				item.setId(id);
				item.setTitle(article.getWebTitle());
				item.setLink(article.getWebUrl());
				item.setPublicationDate(article.getWebPublicationDate());
				item.setPinned(false);
				
				items.add(item);
			}
			
		}
			
		log.debug("List of items: {}", items);
		
		return items;
	}
	
	
}
