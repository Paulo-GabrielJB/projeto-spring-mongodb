package br.com.curso.springbootmongodb.repositories;

import br.com.curso.springbootmongodb.model.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
