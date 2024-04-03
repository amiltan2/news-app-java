package com.portable.newsapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.portable.newsapp.dto.ItemDto;
import com.portable.newsapp.service.ArticleService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/article")
public class ArticleApiV1Controller {
	
	@Autowired
	private ArticleService articleService;
	
	@GetMapping("/item")
	public ResponseEntity<List<ItemDto>> getArticle(@Valid @RequestParam("query") String query) {
		
		List<ItemDto> itemList =  articleService.getAllArticles(query);
		
		if(CollectionUtils.isEmpty(itemList)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(itemList, HttpStatus.OK);
		
	}	
}