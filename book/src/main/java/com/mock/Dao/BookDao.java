package com.mock.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mock.entity.Book;
@Repository
public interface BookDao extends JpaRepository<Book, Integer> {

}
