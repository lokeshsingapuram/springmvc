package com.tcs.entities;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookEntityRepo extends JpaRepository<BookEntity, Serializable> {

}
