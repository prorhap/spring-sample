package com.woowa.biz.pilot.board.service;

import com.woowa.biz.pilot.board.domain.Post;
import com.woowa.biz.pilot.board.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DefaultBoardService implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getPosts() {
        return postRepository.findAll();
    }
}
