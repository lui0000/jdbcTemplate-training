package com.eliza.jdbcTemplate.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class BookDto {

    @NotEmpty(message = "Title should not be empty")
    @Size(max = 100, message = "Title should not exceed 100 characters")
    private String title;

    @NotEmpty(message = "Title should not be empty")
    @Size(max = 100, message = "Title should not exceed 100 characters")
    private String author;

    private long isbn;

    private LocalDate publicationYear;

    @Pattern(regexp = "available|in_use", message = "Status must be 'available' or 'in_use'")
    private String status;

    public BookDto() {
    }

    public BookDto(String title, String author, long isbn, LocalDate publicationYear, String status) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.status = status;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public LocalDate getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(LocalDate publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
