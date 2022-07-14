package guru.springframework.spring5webapp.repo;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Add some description here.
 *
 * @author Ömer Faruk Bitikçioğlu
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
