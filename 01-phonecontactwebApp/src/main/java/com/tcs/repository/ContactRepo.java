package com.tcs.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<ContactEntity, Serializable>{

}
