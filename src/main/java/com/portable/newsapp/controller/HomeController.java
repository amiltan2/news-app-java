package com.portable.newsapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.portable.newsapp.dto.ItemDto;
import com.portable.newsapp.service.ArticleService;

@Controller
public class HomeController {

	@Autowired
	private ArticleService articleService;
	
	@RequestMapping(path = {"/", "/search"})
	public String homePage(ItemDto item, Model model, String keyword) {
		
		if (keyword != null) {
			List<ItemDto> itemList =  articleService.getAllArticles(keyword);
            model.addAttribute("list", itemList);
        } 
        return "index";
        
	}
}
