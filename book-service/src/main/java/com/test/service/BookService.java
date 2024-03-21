package com.test.service;

import com.test.entity.Book;

public interface BookService {
    Book getBookById(int bid);
    public boolean setRemain(int bid, int count);
    public int getRemain(int bid);
}
