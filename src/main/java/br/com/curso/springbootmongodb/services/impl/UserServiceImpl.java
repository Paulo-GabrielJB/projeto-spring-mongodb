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

    @Override
    public User insert(User obj) {
        return userRepository.insert(obj);
    }

    @Override
    public void delete(String id) {
        findById(id);
        userRepository.deleteById(id);
    }

    @Override
    public User update(String id, User obj) {
        User newObj = findById(id);
        updateDate(newObj, obj);
        return null;
    }

    private void updateDate(User newObj, User obj) {
        newObj.setEmail(obj.getEmail());
        newObj.setName(obj.getName());
    }

}
