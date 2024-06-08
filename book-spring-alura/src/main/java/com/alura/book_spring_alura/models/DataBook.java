package com.alura.book_spring_alura.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DataBook(
        @JsonAlias ("title") String title,
        @JsonAlias("authors") List<DataAuthor> authors,
        @JsonAlias ("languages") List<String> languages,
        @JsonAlias ("download_count") Integer download_count
) {
    //primer idioma de la lista
    public String getFirstLanguage() {
        return languages != null && !languages.isEmpty() ? languages.get(0) : null;
    }

    public Double numberOfDownloads() {
        return 0.0;
    }
}
