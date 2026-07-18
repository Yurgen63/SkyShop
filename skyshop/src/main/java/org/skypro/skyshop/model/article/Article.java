package org.skypro.skyshop.model.article;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.skypro.skyshop.model.search.Searchable;

import java.util.UUID;

public class Article implements Searchable {
    private final UUID id;
    private final String titleArticle;
    private final String textArticle;

    public Article(UUID id, String titleArticle, String textArticle) {
        this.id = id;
        this.titleArticle = titleArticle;
        this.textArticle = textArticle;
    }

    @Override
    public UUID getId() {
        return id;
    }

    public String getTitleArticle() {
        return titleArticle;
    }

    public String getTextArticle() {
        return textArticle;
    }

    @Override
    @JsonIgnore
    public String getSearchTerm() {

        return titleArticle + " " + textArticle;
    }

    @Override
    @JsonIgnore
    public String getContentType() {
        return "ARTICLE";
    }
}
