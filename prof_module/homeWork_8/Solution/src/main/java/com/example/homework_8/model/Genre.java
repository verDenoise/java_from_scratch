package com.example.homework_8.model;

public enum Genre {
    FANTASY("Фантастика"),
    SCIENCE_FICTION("Научная фантастика"),
    DRAMA("Драма"),
    HORROR("Ужасы");

    private final String genreText;

    Genre(String genreText) {
        this.genreText = genreText;
    }

    public String getGenreText() {
        return this.genreText;
    }

}
