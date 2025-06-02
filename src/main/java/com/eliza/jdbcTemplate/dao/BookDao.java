package com.eliza.jdbcTemplate.dao;

import com.eliza.jdbcTemplate.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class BookDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BookDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Book> index() {
        return jdbcTemplate.query("SELECT * FROM book", new BeanPropertyRowMapper<>(Book.class));
    }

    public Book show(int id) {
        return jdbcTemplate.query("SELECT * FROM book where id=?" ,new Object[]{id}, new BeanPropertyRowMapper<>(Book.class)).
                stream().findAny().orElse(null);
    }

    public void save(Book book) {
        jdbcTemplate.update("INSERT INTO book(title, author, isbn, publication_year, status) VALUES(?, ?, ?, ?, ?)", book.getTitle(), book.getAuthor(), book.getIsbn(), book.getPublicationYear(), book.getStatus());
    }

    public void update(int id, Book book) {
        jdbcTemplate.update("UPDATE book SET title=?, author=?, isbn=?, publication_year=?, status=? WHERE id=? ", book.getTitle(), book.getAuthor(), book.getIsbn(), book.getPublicationYear(), book.getStatus(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE FROM book  WHERE id=? ", id);
    }
}
