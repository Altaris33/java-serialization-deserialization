package fr.captain.model;

import java.io.Serializable;

public class LiteratureGenre implements Serializable {

    private String genreName;
    private String subGenre;

    public LiteratureGenre() {
    }

    public LiteratureGenre(String genreName) {
        this.genreName = genreName;
    }

    public LiteratureGenre(String genreName, String subGenre) {
        this.genreName = genreName;
        this.subGenre = subGenre;
    }

    public String getGenreName() {
        return genreName;
    }

    public String getSubGenre() {
        return subGenre;
    }
}
