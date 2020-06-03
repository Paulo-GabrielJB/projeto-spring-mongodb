package br.com.curso.springbootmongodb.services;

import br.com.curso.springbootmongodb.model.entities.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findById(String id);

}
