package org.skypro.skyshop.model.search;

public class SearchResult {
    private final String name;
    private final String id;
    private final String contentType;

    public SearchResult(String name, String id, String contentType) {
        this.name = name;
        this.id = id;
        this.contentType = contentType;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getContentType() {
        return contentType;
    }

    public static SearchResult fromSearchable(Searchable searchable) {
        return new SearchResult(
                searchable.getId().toString(),
                searchable.getSearchTerm(),
                searchable.getContentType()
        );
    }
}
