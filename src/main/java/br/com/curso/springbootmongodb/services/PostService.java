package br.com.curso.springbootmongodb.services;

import br.com.curso.springbootmongodb.model.entities.Post;

import java.util.Date;
import java.util.List;

public interface PostService {

    Post findById(String id);
    List<Post> findByTitle(String text);
    List<Post> fullSearch(String text, Date minDate, Date maxDate);

}
