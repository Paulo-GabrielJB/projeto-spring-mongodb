package br.com.curso.springbootmongodb.repositories;

import br.com.curso.springbootmongodb.model.entities.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
