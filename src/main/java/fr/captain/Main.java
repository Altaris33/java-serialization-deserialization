package fr.captain;

import fr.captain.model.Book;
import fr.captain.model.LiteratureGenre;

import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println(" ====== Serialization/Deserialization : Standard ====== ");

        List<String> bookParts = Arrays.asList("Part 1", "Part 2", "Part 3");
        LiteratureGenre bookGenre = new LiteratureGenre("Fantasy", "High Fantasy");
        Book book
                = new Book("The Hobbits", "J.R.R. Tolkien",
                bookParts, bookGenre, LocalDate.of(1937, Month.SEPTEMBER, 21));

        // Serialization
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("book.ser");
            ObjectOutputStream objectInputStream = new ObjectOutputStream(fileOutputStream);
            objectInputStream.writeObject(book);
            objectInputStream.close();
            fileOutputStream.close();
            System.out.println("Book serialized and saved as file: 'book.ser'");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Deserialization
        try {
            FileInputStream fileInputStream = new FileInputStream("book.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Book deserializedBook = (Book) objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();

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
        } catch (FileNotFoundException e) {
            System.out.println("File not found : " + e.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
