package guru.springframework.spring5webapp.repo;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Add some description here.
 *
 * @author Ömer Faruk Bitikçioğlu
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
