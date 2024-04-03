package com.portable.newsapp.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Article {
	
	private String id;
	private String type;
	private String sectionId;
	private String sectionName;
	private String webPublicationDate;
	private String webTitle;
	private String webUrl;
	private String apiUrl;
	private boolean isHosted;

  public Article(final String id, final String type, final String sectionId, final String sectionName, final String webPublicationDate, final String webTitle, final String webUrl, final String apiUrl, final boolean isHosted) {
    this.id = id;
    this.type = type;
    this.sectionId = sectionId;
    this.sectionName = sectionName;
    this.webPublicationDate = webPublicationDate;
    this.webTitle = webTitle;
    this.webUrl = webUrl;
    this.apiUrl = apiUrl;
    this.isHosted = isHosted;
  }

  @Override
  public String toString() {
    return "Article{" +
        "id='" + id + '\'' +
        ", type='" + type + '\'' +
        ", sectionId='" + sectionId + '\'' +
        ", sectionName='" + sectionName + '\'' +
        ", webPublicationDate='" + webPublicationDate + '\'' +
        ", webTitle='" + webTitle + '\'' +
        ", webUrl='" + webUrl + '\'' +
        ", apiUrl='" + apiUrl + '\'' +
        ", isHosted='" + isHosted + '\'' +
        '}';
  }
}