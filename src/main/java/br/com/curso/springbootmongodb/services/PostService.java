package br.com.curso.springbootmongodb.services;

import br.com.curso.springbootmongodb.model.entities.Post;

public interface PostService {

    Post findById(String id);

}
