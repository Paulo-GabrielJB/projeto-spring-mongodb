package br.com.curso.springbootmongodb.services.impl;

import br.com.curso.springbootmongodb.model.entities.User;
import br.com.curso.springbootmongodb.repositories.UserRepository;
import br.com.curso.springbootmongodb.services.UserService;
import br.com.curso.springbootmongodb.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}