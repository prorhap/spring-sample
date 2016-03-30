package com.woowa.biz.pilot.board.service;

import com.woowa.biz.pilot.board.domain.Post;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class DefaultBoardService implements PostService {
    @Override
    public List<Post> getPosts() {
        return Collections.emptyList();
    }
}
