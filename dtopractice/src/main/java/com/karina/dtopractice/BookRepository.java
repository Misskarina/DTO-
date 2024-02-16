package com.karina.dtopractice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
	Book findById(int id);
	//Book1 mydata(int id);
	//Book2 alldata(int id);
	
	
}
