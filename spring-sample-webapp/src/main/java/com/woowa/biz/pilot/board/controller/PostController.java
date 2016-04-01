package com.woowa.biz.pilot.board.controller;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.woowa.biz.pilot.board.domain.Post;
import com.woowa.biz.pilot.board.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class PostController {

    private static final Logger logger = LoggerFactory.getLogger(PostController.class);

    @Autowired
    private PostService postService;

    @RequestMapping(value = "post", method = GET)
    public
    @ResponseBody
    Collection<PostResponse> list() {
        logger.info("Get all posts");

        Collection<Post> posts = postService.getPosts();
        logger.debug("posts = {}", posts.toString());

        Collection<PostResponse> postResponses =
                Collections2.transform(posts, new Function<Post, PostResponse>() {
                    @Override
                    public PostResponse apply(final Post post) {
                        return new PostResponse(post.getId(), post.getContent(), post.getLastModified());
                    }
                });

        return postResponses;
    }
}
