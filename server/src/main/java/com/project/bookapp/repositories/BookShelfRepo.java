package com.project.bookapp.repositories;

import com.project.bookapp.domain.BookShelf;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookShelfRepo extends CrudRepository<BookShelf, Long> {

    BookShelf findByBookShelfName(String name);
}
