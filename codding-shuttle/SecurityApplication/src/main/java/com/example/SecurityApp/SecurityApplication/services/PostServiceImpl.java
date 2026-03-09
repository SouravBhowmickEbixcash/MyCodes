package com.example.SecurityApp.SecurityApplication.services;

import com.example.SecurityApp.SecurityApplication.dto.PostDto;
import com.example.SecurityApp.SecurityApplication.entities.PostEntity;
import com.example.SecurityApp.SecurityApplication.exceptions.ResourceNotFoundException;
import com.example.SecurityApp.SecurityApplication.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;
    private final ModelMapper mapper;

    @Override
    public List<PostDto> getAllPosts() {
        return postRepository.findAll().stream()
                .map(post -> mapper.map(post, PostDto.class))
                .toList();
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        PostEntity entity = mapper.map(postDto, PostEntity.class);
        return mapper.map(postRepository.save(entity), PostDto.class);
    }

    @Override
    public PostDto getPostById(Long id) {
        PostEntity entity = postRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Post not found with Id : "+ id));
        return mapper.map(entity, PostDto.class);
    }
}
