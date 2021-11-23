// package com.example.BookCrud.repository;

// import com.example.BookCrud.model.Book;
// // import org.springframework.data.jpa.repository.JpaRepository;
// // import org.springframework.stereotype.Repository;
// import org.springframework.stereotype.Repository;
// import org.springframework.data.jpa.repository.JpaRepository;

// @Repository
// public interface BookRepository extends JpaRepository<Book, String> {
// }

package com.example.BookCrud.repository;

import com.example.BookCrud.model.Book;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookRepository extends JpaRepository<Book,String>{
    
}

