package com.example.mybookshopapp.entity.book.links.key;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class KeyBook2Genre implements Serializable {

    private static final int id = 1;
    private int bookId;
    private int genreId;
}