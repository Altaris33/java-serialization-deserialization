package fr.captain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import fr.captain.model.Book;
import fr.captain.model.LiteratureGenre;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class JavaToJsonMain {

    public static void main(String[] args) throws JsonProcessingException {
        System.out.println(" ====== Serialization/Deserialization : Java to JSON & Back ====== ");

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        List<String> bookParts = Arrays.asList("Part 1", "Part 2", "Part 3");
        LiteratureGenre bookGenre = new LiteratureGenre("Fantasy", "High Fantasy");
        Book book = new Book(
                "The Hobbits", "J.R.R. Tolkien",
                bookParts, bookGenre, LocalDate.of(1937, Month.SEPTEMBER, 21)
        );

        String json = objectMapper.writeValueAsString(book);

        Book deserializedBook = objectMapper.readValue(json, Book.class);
        if (deserializedBook != null) {
            System.out.println("Deserialized Book : ");
            System.out.println(deserializedBook.getTitle());
            System.out.println(deserializedBook.getAuthor());
            for (String str: deserializedBook.getParts()) {
                System.out.print(str + " ");
            }
            System.out.println();
            System.out.println(deserializedBook.getGenre().getGenreName());
            System.out.println(deserializedBook.getGenre().getSubGenre());
            System.out.println(deserializedBook.getReleaseDate());
        }
    }
}
