package com.portable.newsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portable.newsapp.entity.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
	
}
