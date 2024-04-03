package com.portable.newsapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="item")
@Entity
@Setter
@Getter
@NoArgsConstructor
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String link;
	private String publicationDate;
	private boolean pinned;
	
	
	public Item(Long id, String title, String link, String publicationDate, boolean pinned) {
		super();
		this.id = id;
		this.title = title;
		this.link = link;
		this.publicationDate = publicationDate;
		this.pinned = pinned;
	}
}
