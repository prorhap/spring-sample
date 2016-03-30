package com.woowa.biz.pilot.board.controller;

import com.woowa.biz.pilot.board.domain.Post;
import com.woowa.biz.pilot.board.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class PostController {

    private static final Logger logger = LoggerFactory.getLogger(PostController.class);

    @Autowired
    private PostService postService;

    @RequestMapping(value = "post", method = GET)
    public List<Post> list() {
        logger.info("Get all posts");
        return postService.getPosts();
    }
}
