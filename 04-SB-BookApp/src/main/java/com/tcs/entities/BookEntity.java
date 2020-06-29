package com.tcs.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "BOOK_TBL")
public class BookEntity {
	
	@Id
	@SequenceGenerator(name = "bookseq",sequenceName = "BOOK_ID_SEQ")
	@GeneratedValue(generator = "bookseq",strategy = GenerationType.SEQUENCE)
	@Column(name = "BOOK_ID")
	private Integer bookId;
	@Column(name="BOOK_NAME")
	private String bookName;
	@Column(name="BOOK_AUTHOUR")
	private String authour;
	@Column(name="BOOK_PRICE")
	private String price;

}
