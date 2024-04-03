package com.portable.newsapp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ItemDto {
	
	private String id;
	private String title;
	private String link;
	private String publicationDate;
	private boolean pinned;

}
