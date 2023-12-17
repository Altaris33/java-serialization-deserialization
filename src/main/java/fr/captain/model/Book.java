package fr.captain.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Book implements Serializable {

    private String title;
    private String author;
    private List<String> parts;
    private LiteratureGenre genre;
    private LocalDate releaseDate;

    public Book() {
    }

    public Book(String title, String author, List<String> parts, LiteratureGenre genre, LocalDate releaseDate) {
        this.title = title;
        this.author = author;
        this.parts = parts;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getParts() {
        return parts;
    }

    public LiteratureGenre getGenre() {
        return genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }
}
