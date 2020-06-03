package br.com.curso.springbootmongodb.services;

import br.com.curso.springbootmongodb.model.entities.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findById(String id);
    User insert(User obj);
    void delete(String id);
    User update(String id, User obj);

}
