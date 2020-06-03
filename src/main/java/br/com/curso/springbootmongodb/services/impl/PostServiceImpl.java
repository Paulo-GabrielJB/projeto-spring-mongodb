package br.com.curso.springbootmongodb.services.impl;

import br.com.curso.springbootmongodb.model.entities.Post;
import br.com.curso.springbootmongodb.repositories.PostRepository;
import br.com.curso.springbootmongodb.services.PostService;
import br.com.curso.springbootmongodb.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public Post findById(String id) {
        return postRepository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    @Override
    public List<Post> findByTitle(String text) {
        return postRepository.findByTitle(text);
    }

    @Override
    public List<Post> fullSearch(String text, Date minDate, Date maxDate) {

        maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);

        return postRepository.fullSearch(text, minDate, maxDate);
    }
}
