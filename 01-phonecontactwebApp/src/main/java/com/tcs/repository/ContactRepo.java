package com.tcs.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.entity.ContactEntity;

public interface ContactRepo extends JpaRepository<ContactEntity, Serializable>{

}
