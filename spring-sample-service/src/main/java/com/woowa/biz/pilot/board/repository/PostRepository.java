package com.woowa.biz.pilot.board.repository;

import com.woowa.biz.pilot.board.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface PostRepository extends JpaRepository<Post, Long>, QueryDslPredicateExecutor<Post> {
}
